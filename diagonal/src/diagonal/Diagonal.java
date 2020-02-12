/*
 * To change this license header, choose License Headers in Project Properties.

 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package diagonal;

/**
 *
 * @author Andres
 */
public class Diagonal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int matriz[][]=new int [3][3];
        int dato=1;
        for(int i=0; i<matriz.length;i++){
            for(int j=0;j<matriz[i].length;j++){
                matriz[i][j]=dato;
                dato++;
            }
        }
       for(int i=0; i<matriz.length;i++){
            for(int j=0;j<matriz[i].length;j++){
                System.out.print("\t"+matriz[i][j]);
            }
            System.out.println("");
            }
       int diagonalprincipal[]=new int[matriz.length];
       int diagonalprincipal2[]=new int[matriz.length]; 
       
       for(int i=0; i<matriz.length;i++){
            for(int j=0;j<matriz[i].length;j++){
                if(i==j){
                    diagonalprincipal[i]=matriz[i][j];
                }
                if( (i+j)==matriz.length-1){
                    diagonalprincipal2[i]=matriz[i][j];
                }
                
            }
            }
       int suma=0;
       System.out.println("diagonal principal");
       for(int elemento:diagonalprincipal){
           System.out.print(""+elemento);
           suma=suma+elemento;
       }
       System.out.print("="+suma);
       System.out.println("");
       suma=0;
       System.out.println("diagonal principal");
       for(int elemento:diagonalprincipal2){
           System.out.print(""+elemento);
           suma=suma+elemento;
       }
       System.out.print("="+suma);
       System.out.println("");
       
               
    }
    
}
