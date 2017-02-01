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
    
    public void calculaLetra(){
        dni=Integer.parseInt(JOptionPane.showInputDialog("INtroduce DNI sen letra"));
        int resto=dni%23;
        
        System.out.println(" Número : " +  resto + "\n Mira a letra que corresponde co teu resultado: \nA->3 \nB->11	\nC 20	\nD->9   \nE ->22	\nF ->7	\nG ->4	\nH ->18 \nJ ->13 \nK 21	\nL ->19" +
"\nM ->5	\nN ->12	\nP ->8	\nQ ->16	\nR ->1	\nS ->15	\nT ->0	\nV ->17	\nW ->2	\nX ->10	\nY ->6\nZ ->14");
       
    }
    
    
    
    //metodo para saber a letra con un array tipo char.
  
    public void calcularDni(){
       
       int dni = (Integer.parseInt(JOptionPane.showInputDialog("Introduce numero DNI sen letra")));
       
       int resultado = dni%23;
      
       System.out.println(resultado+ "---> "+letra[resultado]);
       
   }

    
    
    
    
 
   
}
