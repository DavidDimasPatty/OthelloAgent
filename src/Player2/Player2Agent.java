/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Player2;

import jade.core.AID;
import jade.core.Agent;
import jade.core.behaviours.*;
import jade.lang.acl.ACLMessage;  
import java.awt.Color;
public class Player2Agent extends Agent {
    private Player2AgentGUI ticGui; 
    public int [][] tictactoe = new int [8][8];
    boolean turn = true; // turn
    int step = 0;
    int row, column;
   
    protected void setup(){
        System.out.println("Tic-agent "+getAID().getName()+" is ready.");   
        tictactoe[3][3]=1;
        tictactoe[3][4]=-1;
        tictactoe[4][3]=-1;
        tictactoe[4][4]=1;
        // Show the GUI to interact with the user   
        ticGui = new Player2GUIImplementation();   
        ticGui.setAgent(this);   
        ticGui.show();  
        // mengundang tac untuk bermain
        addBehaviour(new invitingBehaviour(this));
        // selanjutnya masuk ke permainan
        addBehaviour(new playingBehaviour(this));
    }
    
    // perilaku tic pada saat mengundang tac untuk bermain
    class invitingBehaviour extends CyclicBehaviour {
        String lastMsg = "";
	ACLMessage msg= receive();

        public invitingBehaviour (Agent a) {
            super(a);
        }
        
        public void action(){
            if (step == 0) {
                ACLMessage msg = new ACLMessage(ACLMessage.INFORM);
                msg.setContent( "Play Othello" );
                msg.addReceiver( new AID( "Player1", AID.ISLOCALNAME) );
                System.out.println("Player1 -> Player2: "+ msg.getContent());
                send(msg);
                block(500);
                // tunggu beberapa saat
                msg= receive();
                //System.out.println(msg.getContent());
                if (msg!=null && msg.getContent().contains("Okay")) {
                    step = 1;
                    ticGui.activateButton();
                }
            }           
        }
    }
    
    // perilaku tic pada saat bermain
    class playingBehaviour extends CyclicBehaviour {
        String lastMsg = "";
	ACLMessage msg= receive();

        public playingBehaviour (Agent a) {
            super(a);
        }
        
        public void action() {
            if (step == 1 && !isTurn()) {
                msg = receive();
                if ((msg != null) && (!msg.getContent().equals((String) lastMsg))){
                    System.out.println(msg.getContent());
                    String tempbt="";
                    for(int i=0;i<msg.getContent().length();i++){
                        if(msg.getContent().charAt(i)==','){
                            System.out.println("masuk");
                            int r = Integer.parseInt(String.valueOf(tempbt.charAt(0)));
                            int c = Integer.parseInt(String.valueOf(tempbt.charAt(1)));
                            tictactoe[c-1][r-1] = 1;
                            String rc=c+""+r;
                            int butCase=Integer.parseInt(rc);
                            javax.swing.JButton btn = ticGui.getButton(butCase);
                            btn.setBackground(Color.red);
                            tempbt="";
                        }
                        else{
                        tempbt=tempbt+msg.getContent().charAt(i);
                        }
                    }
                    
                    ticGui.activateButton();
                    setTurn(true);
                }
            }
        }
    }

    // cek sedang dapat giliran atau tidak
    boolean isTurn(){
        return (turn); 
    }
    
    // set dapat giliran atau tidak 
    void setTurn(boolean b){
        turn = b;
    }
    
    // mencatat perubahan papan permainan
    // method ini dipanggil setiap kali ada tombol yang ditekan oleh pemain
    void updateBoard(String bt){
        setTurn(false);
        String tempBT="";
        for(int i=0;i<bt.length();i++){
              if(bt.charAt(i)==','){
                row = Integer.parseInt(String.valueOf(tempBT.charAt(0)));
                column = Integer.parseInt(String.valueOf(tempBT.charAt(1)));
                System.out.println("player2: "+column+""+row);
                tictactoe[column-1][row-1] = -1;
                  tempBT="";
              }
              else{
                  tempBT=tempBT+bt.charAt(i);
              }
        }
//        row = Integer.parseInt(String.valueOf(bt.charAt(2)))-1;
//        column = Integer.parseInt(String.valueOf(bt.charAt(3)))-1;
//        tictactoe[column][row] = -1;
//        // kirim berita ke tac
        ACLMessage msg = new ACLMessage(ACLMessage.INFORM);
	msg.setContent(""+bt);
     	msg.addReceiver( new AID( "Player1", AID.ISLOCALNAME) );
        System.out.println("Player2 -> Player1: " + msg.getContent());
//        System.out.println("pesan "+ msg.toString());
	send(msg);
    }
 //comment   
}