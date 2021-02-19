/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taller;
//Mostrar N números de la secuencia Tribonacci[1].


import  java.util.Scanner;

public  class  numeral3 {
    static  int  tribo ( int  num ) {
        if(num==0||num==1||num==2){
            return  0 ;
        }
        else if (num == 3 ) {
            return  1 ;
        } else {
            return tribo (num - 1 ) + tribo (num - 2 ) + tribo (num - 3 );
        } 
    }
    public  static  void  main ( String [] args ) {
        Scanner entradaEscaner =  new Scanner ( System . in);
        System . out . println ( " ingrese el numero de la secuencia que desea ver en pantalla: " );
        String aux = entradaEscaner . nextLine();
        int n = Integer . parseInt (aux);
        System . out . println ( " el número de la secuencia es: " + tribo (n));
    }
    
}