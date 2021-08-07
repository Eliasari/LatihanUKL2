/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ukl2;

/**
 *
 * @author Elia Sari
 */
public class soal6A {
    public static void main (String[]args){
        //mendefinisikan
        int matrixA[][]= {{1,3},{2,4}};
        int matrixB[][]= {{4,2},{3,1}};
        int matrixC[][]= new int[2][2];
        
        //pembuatan bentuk matrix
        for (int i = 0; i < 2; i++){
            for (int j = 0; j < 2; j++){
                matrixC[i][j] = matrixA[i][j] + matrixB[i][j];
                System.out.print(matrixC[i][j] + " ");
            }
            System.out.println(" ");
        }
}
}
