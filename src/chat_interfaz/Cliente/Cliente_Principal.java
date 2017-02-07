/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chat_interfaz.Cliente;
import java.awt.*;
/**
 *
 * @author pastore
 */
public class Cliente_Principal {
       public String ip;
    public int puerto;
    public  String usuario;
    public void Cliente_Principal(String IP, int PUERTO,String USUARIO,Dimension D,Point L){
        ip = IP;
        puerto = PUERTO;
        usuario = USUARIO;
        Cliente_Ventana Ven = new Cliente_Ventana(IP,PUERTO,USUARIO);
        Ven.setSize(D);
        Ven.setLocation(L);
        Ven.setVisible(true);
        
    }
    
}
