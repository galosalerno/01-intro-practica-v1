package ar.edu.unahur.obj2.ejercicio1;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Arrays;
import java.util.Random;
public class Ejercicio6 {

    public static void main(String args[]) {


        mostrarMatriz(matriz3x3()); //MATRIZ 3x3 INGRESADA POR USUARIO.
        mostrarMatriz(matriz10x10()); //MATRIZ 10x10 INGRESADA RANDOM.
    }

    public static int[][] matriz3x3() {
        Scanner ingreso = new Scanner(System.in);
        int matriz[][] = new int[3][3];
        for (int i = 0; i < (matriz.length); i++) {
            for (int j = 0; j < (matriz[i].length); j++) {
                System.out.println("ingrese un numero");
                matriz[i][j] = ingreso.nextInt();
            }
        }
        return matriz;
    }
        public static void mostrarMatriz ( int[][] matriz1){
            for (int i = 0; i < (matriz1.length); i++) {
                for (int j = 0; j < (matriz1[i].length); j++) {
                    System.out.println("[" + i + "," + j + "] = " + matriz1[i][j]);

                }
            }
        }

        public static int[][] matriz10x10(){
            Random r = new Random();

            int matriz2[][] = new int[10][10];
            for (int i = 0; i < matriz2.length; i++) {
                for (int j = 0; j < matriz2[i].length; j++) {
                    int aleatorio = r.nextInt(100);
                    matriz2[i][j] = aleatorio;
                }
            }
            return matriz2;
        }


}