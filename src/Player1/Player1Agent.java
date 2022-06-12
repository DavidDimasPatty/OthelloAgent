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
    public int [][] tictactoe = {{-1,-1,-1},{-1,-1,-1},{-1,-1,-1}}; 
    boolean turn = false; // turn
    int step = 0;
    int row, column;
    String lastMsg = "";

    protected void setup() {
        // Printout a welcome message   
        System.out.println("Tac-agent "+getAID().getName()+" is ready.");   

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
                    msg.addReceiver( new AID( "tic", AID.ISLOCALNAME) );
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
                    int r = Integer.parseInt(String.valueOf(msg.getContent().charAt(0)))-1;
                    int c = Integer.parseInt(String.valueOf(msg.getContent().charAt(1)))-1;
                    tictactoe[r][c] = 0;
                    javax.swing.JButton btn = tacGui.getButton(r*3+c);
                    btn.setBackground(Color.blue);
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
        row = Integer.parseInt(String.valueOf(bt.charAt(1)))-1;
        column = Integer.parseInt(String.valueOf(bt.charAt(2)))-1;
        tictactoe[row][column] = 1;
        // kirim berita ke tic
        ACLMessage msg = new ACLMessage(ACLMessage.INFORM);
	msg.setContent(""+bt.charAt(1)+bt.charAt(2));
     	msg.addReceiver( new AID( "tic", AID.ISLOCALNAME) );
        System.out.println("Tac -> Tic: " + msg.getContent());
	send(msg);
    }
    
}//end class TacAgent