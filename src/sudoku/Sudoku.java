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
public class Sudoku {
    private int[][] su;
    private String res;
    private boolean validez;
    private Object[] reng;
    private Object[] colu;
    private Object[] cuad;
    
    public Sudoku(int[][] matrix) {
        su = matrix;
        reng = new Object[su.length];
        colu = new Object[su.length];
        cuad = new Object[su.length];
        
        for(int i = 0; i < su.length; i++ ){
            reng[i] = new ArraySet<Integer>();
            colu[i] = new ArraySet<Integer>();
            cuad[i] = new ArraySet<Integer>();
        }
        
        validez = true;
        for(int row=0; row < matrix.length; row++) {
            for(int col=0; col < matrix[row].length; col++) {
                if(su[row][col] != 0 ) {
                    if(!contiene(reng,row,su[row][col]))
                        ((ArraySet<Integer>)(reng[row])).add(su[row][col]);
                    else {
                        validez = false;
                        res = "Error, número repetido en el renglón: " + (row+1);
                    }
                    
                    if(!contiene(colu,col,su[row][col]))
                        ((ArraySet<Integer>)(colu[col])).add(su[row][col]);
                    else {
                        validez = false;
                        res = "Error, número repetido en la columna: " + (col+1);
                    }
                    
                    if(!contiene(cuad,getCuad(row,col),su[row][col]))
                        ((ArraySet<Integer>)(cuad[getCuad(row,col)])).add(su[row][col]);
                    else {
                        validez = false;
                        res = "Error, número repetido en el cuadrante: " + (getCuad(row,col)+1);
                    }
                }
            }
        }
    }
    
    public String getRes() {
        return res;
    }
    
    public boolean getErr() {
        return validez;
    }
    
    private boolean resuelve(int row,int col) {
        if(col == su.length) 
            return resuelve(row+1,0);
        
        if(row == su.length) 
            return true;
        
        if(su[row][col] != 0) 
            return resuelve(row,col+1);
        
        
        int cuadran = getCuad(row,col);
        boolean res = false;
        int i = 1;
        while(i <= su.length && !res) {
            if(!contiene(reng,row,i) && !contiene(colu,col,i) && !contiene(cuad,cuadran,i)) {
                ((ArraySet<Integer>)(reng[row])).add(i);
                ((ArraySet<Integer>)(colu[col])).add(i);
                ((ArraySet<Integer>)(cuad[cuadran])).add(i);
                su[row][col] = i;
                if(!resuelve(row,col+1)) {
                ((ArraySet<Integer>)(reng[row])).remove(i);
                ((ArraySet<Integer>)(colu[col])).remove(i);
                ((ArraySet<Integer>)(cuad[cuadran])).remove(i);
                su[row][col] = 0;
                } 
                else 
                    res = true;
            }
            i++;
        }
        return res;
    }
    
    public boolean resuelveFinal() {
        if(validez) {
            if(resuelve(0,0))
                return true;
            else {
                validez = false;
                res = "El sudoku no tiene solución";
                return false;
            }
        }
        else 
            return false;
    }
    
    private int getCuad(int row, int col) {
        return (row/(int)Math.sqrt(su.length))*(int)Math.sqrt(su.length)+(col/(int)Math.sqrt(su.length));
    } 
    
    private boolean contiene(Object arr[], int index, int num) {
        return ((ArraySet<Integer>)arr[index]).contains(num);
    }

    public int[][] getSu() {
        return su;
    }
    /*
    public String toString() {
      	StringBuilder result = new StringBuilder("\n");
      	for (int row=0; row < su.length; row++) {
         	for (int column=0; column < su[row].length; column++) {
            	result.append(su[row][column]);
            	if (su[row][column] < 10)
            		result.append("   ");
            	else if (su[row][column] < 100)
            		result.append("  ");
            }
         	result.append("\n");
      	}
      	return result.toString();
   	}
    */
}

