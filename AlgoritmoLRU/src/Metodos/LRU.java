/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Metodos;

import javax.swing.JOptionPane;
import java.util.Vector;

/**
 *
 * @author REY
 */
public class LRU {

    String LRU[];
    Vector LRU2;
    int pagina;

    LRU() {
        LRU = new String[5];
        LRU2 = new Vector();
        pagina = 0;

    }

    public void instanciar() {
        int i;
        for (i = 0; i < LRU.length; i++) {
            LRU[i] = "vacio";

        }
    }

    boolean buscar(String pag) {
        int i;
        for (i = 0; i < LRU.length; i++) {
            if (LRU[i].equalsIgnoreCase(pag)) {
                return true;
            }
        }
        return false;
    }

    boolean arrayvacio() {
        int i;
        for (i = 0; i < LRU.length; i++) {
            if (LRU[i].equalsIgnoreCase("vacio")) {
                return true;
            }
        }
        return false;
    }

    String insertar(String dato) {
        int i;
        String data = "";
        LRU2.add(dato);
        if (buscar(dato) == false) {
            if (arrayvacio() == true) {
                for (i = 0; i < LRU.length; i++) {
                    if (LRU[i].equalsIgnoreCase("vacio")) {
                        LRU[i] = dato;
                        break;
                    }
                }
                //error aqui
                //si no esta y si el array esta lleno entonces
            } else {
                for (i = 0; i < LRU.length; i++) {
                    String N = (String) LRU2.get(0);
                    if (LRU[i].equalsIgnoreCase(N)) {
                        LRU[i] = dato;
                        LRU2.remove(0);
                        LRU2.add(dato);
                        break;
                    }
                }
            }
            data += "\t ---nuevo dato---- \n";
            for (i = 0; i < LRU.length; i++) {
                data += "\t " + LRU[i] + ". \n";
            }
            data += "\t Fallo de pagina \n ";

        } else {
            for (i = 0; i < LRU2.size(); i++) {
                if (LRU2.get(i).equals(dato)) {
                    LRU2.remove(i);
                    LRU2.add(dato);
                    break;
                }
            }
            data += "\t ---nuevo dato---- \n";
            for (i = 0; i < LRU.length; i++) {
                data += "\t " + LRU[i] + ". \n";
            }
            data += "\t Sin fallo de pagina \n ";

        }
        return data;
    }
}
