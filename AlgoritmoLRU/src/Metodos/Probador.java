/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Metodos;
import javax.swing.JOptionPane;

/**
 *
 * @author REY
 */
public class Probador {
    
     public static void main( String args[] ){
         LRU Nuevodato = new LRU();
         Nuevodato.instanciar();
         
        int op;
        do{
            op = Integer.parseInt( JOptionPane.showInputDialog(
            "\t MENU PRINCIPAL \n"+
            "\t 1. Guardar Informacion \n"+
            "\t 2. Salir\n"+
            "\t Entre su opción: ?"        
            ));
            
            switch( op ){
                case 1:
                    String dato = JOptionPane.showInputDialog("ingrese el dato a guardar");
                    String data = Nuevodato.insertar(dato);
                    System.out.print(data);
                break;
                case 2:
                    JOptionPane.showMessageDialog(null, "Adios!");
                break;
                default:
                    JOptionPane.showMessageDialog(null, "Opción Invalida!!!");
            }            
        }while( op != 2 );
        System.exit(0);
         
     }
    
}
