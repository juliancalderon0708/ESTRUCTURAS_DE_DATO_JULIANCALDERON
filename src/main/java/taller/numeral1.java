/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taller;
//Para un arreglo de N posiciones de datos enteros, devolver el valor menor en el arreglo.
import  java.util.Scanner ;

 public class numeral1{
    static  int  buscar ( int [] vector , int  N , int  menor ) {
       N=N-1;
       
       if  (N>=0){
           System.out.println( " N: " + N );
           if(vector [ N ] < menor){
               
               menor = vector [ N ];
               return buscar (vector, N , menor);
           }
           else{
               return buscar (vector, N , menor);
           }
       }
        return menor;
    }
    public  static  void  main ( String [] args ) {
        Scanner entradaEscaner = new Scanner (System.in);
        System . out . println ( " ingrese la cantidad de elementos en el vector: " );
        String aux=entradaEscaner.nextLine();
        int n=Integer.parseInt(aux);
        int [] vector= new  int [n];
        for ( int i = 0 ; i < n; i ++ ) {
            vector [i] = ( int ) Math . floor ( Math . random () * 100 + 10 );
            System . out . println (vector [i]);
        }
        int menor = 1000000 ;
        menor = buscar (vector, n, menor);
        System . out . println ( " el número menor en el vector es: " + menor);
    }
    
}