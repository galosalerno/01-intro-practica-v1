package ar.edu.unahur.obj2.ejercicio1;


import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio2 {

   public static void main(String args[]) {
        Scanner ingreso = new Scanner(System.in);
        System.out.println("ingrese un numero entero:");
        int num = 0;
        num = ingreso.nextInt();
        ArrayList mayores = new ArrayList();
        int lista[] = new int[10];

        for(int i=0;i<lista.length;i++){
            System.out.println("ingrese un numeros");
            lista[i] = ingreso.nextInt();
        }
        for(int i=0;i<lista.length;i++){
            if(lista[i]>num){
                mayores.add(lista[i]);
            }
        }
        System.out.println(mayores);


    }
}
