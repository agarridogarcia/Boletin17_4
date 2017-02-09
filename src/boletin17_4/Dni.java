/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin17_4;

import javax.swing.JOptionPane;

/**
 *
 * @author Ara
 */
public class Dni {
    
    int dni;
    private char letra[] = {'T','R','W','A','G','M','Y','F','P','D','X','B','N','J','Z','S','Q','V','H','L','C','K','E'};
    
    
    
    
    
    //metodo para saber a letra con un array tipo char.
  
    public void calcularDni(){
       
       int dni = (Integer.parseInt(JOptionPane.showInputDialog("Introduce numero DNI sen letra")));
       
       int resultado = dni%23;
      
       System.out.println(resultado+ "---> "+letra[resultado]);
       
   }

    
    
    
    
 
   
}
