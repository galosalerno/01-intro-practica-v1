package ar.edu.unahur.obj2.ejercicio1;

import java.util.Scanner;

public class Ejercicio1 {

       public static void main(String args[]){

        int lista[] = new int[10];
        Scanner ingreso = new Scanner(System.in);
            for(int i=0;i<lista.length;i++){
                System.out.println("ingrese un numero:");
                lista[i] = ingreso.nextInt();
            }
            int j = lista.length-1;
           System.out.println("este es el orden inverso");
            while (j>=0){
                System.out.println(lista[j]);
                j--;
            }
       }
}
