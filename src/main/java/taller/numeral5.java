/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taller;
//Determinar si una palabra es palíndroma
import  java.util.Scanner ;

public  class  numeral5 {
    
    static String palindroma(char []palabra, int tamaño, String aux){
        tamaño=tamaño-1;
        if (tamaño>=0){
            aux=aux+palabra[tamaño];
            return palindroma(palabra,tamaño,aux);
        }
        return aux;
    }
    
    public static void main(String[] args) {
        Scanner entradaEscaner = new Scanner (System.in);
        System.out.println("Escribe la palabra:");
        String palabra1=entradaEscaner.nextLine();
        char[] palabra=palabra1.toCharArray();
        int tamaño=palabra.length;
        String aux="";
        String palabra_volteada = palindroma(palabra,tamaño,aux);
        System.out.println(palabra_volteada);
        if (palabra1 == null ? palabra_volteada != null : !palabra1.equals(palabra_volteada)){
            System.out.println("la palabra no es palindroma");
        }else{
            System.out.println("la palabra es palindroma");
        }
    }
    
}