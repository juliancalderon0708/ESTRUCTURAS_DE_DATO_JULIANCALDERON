/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taller;
//Para un valor N real y un M entero positivo mayor que cero, calcular N^M.
import  java.util.Scanner ;

public  class  numeral4 {
    
    static double  potencia ( double base  , int indice, double aux){
        if (indice>=1){
            aux = aux * base;
            indice = indice - 1 ;
            return potencia (base,indice,aux);
        }else{
            return aux;
        }
    }
    public  static  void  main ( String [] args ) {
        Scanner entradaEscaner = new Scanner (System.in);
        System . out . println ( " ingresa la base: ");
        String aux1 = entradaEscaner . nextLine();
        double base = Double . parseDouble (aux1);
        System . out . println ( " ingresa la potencia: " );
        String aux2 = entradaEscaner . nextLine();
        int indice = Integer . parseInt (aux2);
        double aux = 1 ;
        System . out . println (potencia (base, indice, aux));        
    }
    
}