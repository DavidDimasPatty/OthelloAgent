/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tac;

/**
 *
 * @author USER
 */
public interface TacAgentGUI {
  void setAgent(TacAgent a);   
  void show();   
  void hide();   
  void notifyUser(String message);   
  void dispose();
  void activateButton();
  javax.swing.JButton getButton(int btn);
}
