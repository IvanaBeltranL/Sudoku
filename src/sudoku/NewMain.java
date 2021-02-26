/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sudoku;

/**
 *
 * @author colla
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println(isValidInt("0"));
    }
    
    public static boolean isValidInt(String casilla) {
        boolean res = false;
        if(casilla.length() == 0 )
            res = true;
        else {
            if(casilla.length() == 1 ) {
                char aux = casilla.charAt(0);
                if(aux >= '1' && aux <= '9')
                    res = true;
            }
        }
        return res;
    }
    
}
