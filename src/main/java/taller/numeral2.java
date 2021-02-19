/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taller;
//Para un arreglo de N posiciones de datos reales, determinar si un dato determinado existe.

import java.util.Scanner ;



public  class  numeral2 {
    static  double [] llenar (double vector  [], int N ) { 
        N = N - 1 ;
       
       if (N>=0){
           vector [ N ] = ( double ) Math . floor ( Math . random () * 100 + 10 );
           System . out . println (vector [ N ]);
           return llenar (vector, N );
       }
        return vector ;
    }
    static  boolean  buscar (double vector  [], int N , double num , boolean estado ) {   
        N = N - 1 ;
        if (N>=0){
           if (vector[N] != num){
               
               return buscar (vector, N , num, estado);
           }
           else {
               estado = true ;
               return buscar (vector, N , num, estado);
           }
       }
        return estado;
    }
    public  static  void  main ( String [] args ) {
        Scanner entradaEscaner =  new  Scanner ( System . in);
        System . out . println ( " ingrese la cantidad de elementos del vector: " );
        String aux = entradaEscaner . nextLine();
        int n = Integer . parseInt (aux);
        double [] vector = new double [n];
        vector = llenar (vector, n);
        System . out . println ( " ingrese el numero que desea buscar: " );
        String aux2 = entradaEscaner . nextLine();
        double num = Double . parseDouble (aux2);
        boolean estado = false ;
        System . out . println (buscar (vector, n, num, estado));
    }
    
}