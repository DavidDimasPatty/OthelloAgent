/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Player1;
import jade.core.AID;
import jade.core.Agent;
import jade.core.behaviours.*;
import jade.lang.acl.ACLMessage;
import java.awt.Color;

public class Player1Agent extends Agent 
{
    //comment
    private Player1AgentGUI tacGui; 
    public int [][] tictactoe = new int [8][8]; 
    boolean turn = false; // turn
    int step = 0;
    int row, column;
    String lastMsg = "";

    protected void setup() {
        // Printout a welcome message   
        System.out.println("Tac-agent "+getAID().getName()+" is ready.");   
        tictactoe[3][3]=1;
        tictactoe[3][4]=-1;
        tictactoe[4][3]=-1;
        tictactoe[4][4]=1;
        // Show the GUI to interact with the user   
        tacGui = new Player1AgentGUIImpl();   
        tacGui.setAgent(this);   
        tacGui.show();   

        // menunggu tawaran bermain dari tic
        addBehaviour(new waitingBehaviour(this));
        // bermain
        addBehaviour(new playingBehaviour(this));
    }

    // perilaku tac pada saat menunggu tawaran bermain dari tic
    class waitingBehaviour extends CyclicBehaviour {
	ACLMessage msg= receive();
        
        public waitingBehaviour (Agent a) {
            super(a);
        }
        
        public void action() {
            if (step == 0) {
                msg = receive();
                if (msg != null) {
                    lastMsg = msg.getContent();
                    msg = new ACLMessage(ACLMessage.INFORM);
                    // menjawab tawaran
                    msg.setContent( "Okay!" );
                    msg.addReceiver( new AID( "Player2", AID.ISLOCALNAME) );
                    System.out.println("Player2-> Player1: "+ msg.getContent());
                    send(msg); // masuk ke tahap bermain
                    step = 1; 
                }
            }
        }
    }    
    
    // perilaku tac pada saat bermain
    class playingBehaviour extends CyclicBehaviour {
	ACLMessage msg= receive();
        
        public playingBehaviour (Agent a) {
            super(a);
        }
        
        public void action() {
            if (step == 1 && !isTurn()) {
                msg = receive();
            
                if ((msg != null) && (!msg.getContent().equals((String) lastMsg))){
                    lastMsg = msg.getContent();
                    System.out.println(msg.getContent());
                    String tempbt="";
                    for(int i=0;i<msg.getContent().length();i++){
                        if(msg.getContent().charAt(i)==','){
                            System.out.println("masuk");
                            int r = Integer.parseInt(String.valueOf(tempbt.charAt(0)));
                            int c = Integer.parseInt(String.valueOf(tempbt.charAt(1)));
                            tictactoe[c-1][r-1] = -1;
                            String rc=c+""+r;
                            int butCase=Integer.parseInt(rc);
                            javax.swing.JButton btn = tacGui.getButton(butCase);
                            btn.setBackground(Color.black);
                            tempbt="";
                        }
                        else{
                        tempbt=tempbt+msg.getContent().charAt(i);
                        }
                    }
                    
                    tacGui.activateButton();
                    setTurn(true);
                }
            }
        }    
    }
    
    boolean isTurn(){
        return (turn); 
    }
    
    void setTurn(boolean b){
        turn = b;
    }
    
    void updateBoard(String bt){
        setTurn(false);
          String tempBT="";
          
        for(int i=0;i<bt.length();i++){
              if(bt.charAt(i)==','){
                row = Integer.parseInt(String.valueOf(tempBT.charAt(0)));
                column = Integer.parseInt(String.valueOf(tempBT.charAt(1)));
                System.out.println(column+""+row);
                tictactoe[column-1][row-1] = 1;
                  tempBT="";
              }
              else{
                  tempBT=tempBT+bt.charAt(i);
              }
        }
        // kirim berita ke tic
        ACLMessage msg = new ACLMessage(ACLMessage.INFORM);
	msg.setContent(""+bt);
     	msg.addReceiver( new AID( "Player2", AID.ISLOCALNAME) );
        System.out.println("Player1 -> Player2: " + msg.getContent());
	send(msg);
    }
    
}//end class TacAgent