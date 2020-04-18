package ar.edu.unahur.obj2.ejercicio1;

import java.util.Scanner;

public class Ejercicio3 {

    public static void main(String args[]) {

        Scanner ingreso = new Scanner(System.in);
        int lista[] = new int [24];

        for(int i=0;i<lista.length;i++){
            System.out.println("ingrese la temperatura");
            lista[i] = ingreso.nextInt();
        }
        int i, max, min, suma;

        min=max=lista[0];

        for(i = 0; i < lista.length; i++)
        {
            if(min>lista[i])
            {
                min=lista[i];
            }
            if(max<lista[i])
            {
                max=lista[i];
            }
        }
        int sum=0;

        for(int j=0;j<lista.length;j++){
            sum+=j;
        }
        int promedio = sum/24;

        System.out.println("El máximo es " + max + " y el minimo es " + min + " ,el promedio es "
        + promedio);
    }
}
