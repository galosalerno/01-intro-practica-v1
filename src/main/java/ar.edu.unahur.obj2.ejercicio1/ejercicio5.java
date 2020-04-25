package ar.edu.unahur.obj2.ejercicio1;


import java.util.List;
import java.util.Arrays;
import java.util.Scanner;

public class ejercicio5 {



    public static void main(String args[]) {

        Scanner ingreso = new Scanner(System.in);
        System.out.println("ingrese una palabra");
        String palabra = ingreso.nextLine();
        int[] conteo = new int[26];
        int i = 0;
        for(String letra : abecedario()){

            if(palabra.contains(letra)){
                Integer a = conteo[i] ;
                Integer nuevoValor = a + 1;
                conteo[i]=nuevoValor;

            }
            i+=1;
        }
        System.out.println(conteo[0]);
        System.out.println(conteo[1]);
        System.out.println(conteo[2]);
        //lo que me falta solucionar es como detectar si una palabra tiene mas de una letra repetidas veces.
        // ejemplo:CASA tiene 2 A pero con mi algoritmo me devuelve 1.

    }



    public static List<String> abecedario(){
        List<String> abc = Arrays.asList("a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r",
                                          "s","t","u","v","w","x","y","z");
        return abc;
    }
    public static void contarLetras(String palabra){

    }

}









