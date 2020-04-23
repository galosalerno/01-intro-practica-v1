package ar.edu.unahur.obj2.ejercicio1;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Arrays;


public class Ejercicio4 {

    public static void main(String args[]) {
        String nombre = "";
        String apellido = "";
        Scanner ingreso = new Scanner(System.in);
        int cantidad;
        int contador = 0;
        String letra1 = "";


        List<Usuarios> usuarios = new ArrayList<Usuarios>();
        System.out.println("cuantos usuarios son:");
        cantidad = ingreso.nextInt();

        while (contador < cantidad) {
             System.out.println("ingrese su nombre");
             if(contador==0){
                 nombre = ingreso.nextLine();
             }
             nombre = ingreso.nextLine();
                System.out.println("ingrese su apellido");
                apellido = ingreso.nextLine();
                usuarios.add(new Usuarios(nombre, apellido));
                contador++;
        }
        while(!(letra1.contains("fin"))){
            System.out.println("ingrese una letra");
            letra1 = ingreso.nextLine();
            Character letra = letra1.charAt(0);

            for (int i = 0; i < usuarios.size(); i++) {
                Usuarios user = usuarios.get(i);
                String nombreDelUser = user.nombre;
                Character primerLetra = nombreDelUser.charAt(0);
                if (letra == primerLetra) {
                    System.out.println(nombreDelUser);
                }
            }
        }
        System.out.println("FIN DEL PROGRAMA");

    }
}


class Usuarios {
     String nombre;
     String apellido;
    Usuarios(String nombre,String apellido){
        this.nombre = nombre;
        this.apellido = apellido;
    }
}

