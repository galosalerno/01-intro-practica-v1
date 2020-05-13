package ar.edu.unahur.obj2.ejercicio1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public abstract class Empleados {

    Integer dni;
    Integer sueldoBase;
    String nombre;
    String apellido;
    String mail;
    List<Empleados> empleados = new ArrayList<Empleados>();
    Scanner ingreso = new Scanner(System.in);

    public Empleados(int dni, int sueldoBase, String nombre, String apellido, String mail) {
        this.dni = dni;
        this.sueldoBase = sueldoBase;
        this.nombre = nombre;
        this.apellido = apellido;
        this.mail = mail;
    }

    public static void main(String args[]) {

        for (int i = 0; i < 1; i++) {   //ingresar 3 empleados
            cargarEmpleado();
        }
        System.out.println(empleados[0]);
    }
    public abstract double getSueldo();

    private void cargarEmpleado(){
       

        System.out.println("ingrese el nombre");
        String nombre = ingreso.nextLine();
        System.out.println("ingrese el apellido");
        String apellido = ingreso.nextLine();
        System.out.println("ingrese el tipo");
        String tipo = ingreso.nextLine();
        System.out.print("ingrese el dni");
        int dni = ingreso.nextInt();
        System.out.print("ingrese el Sueldo Base");
        int sueldoBase = ingreso.nextInt();
        System.out.println("ingrese el mail");
        String mail = ingreso.nextLine();
        if (tipo == "vendedor") {
            System.out.println("ingrese el poprcentaje de comision");
            Integer porcenComision = ingreso.nextInt();
            System.out.println("ingrese el total de ventas");
            Integer totalVentas = ingreso.nextInt();

            Empleados empleado = new Empleados_vendedores(dni = 111, sueldoBase = 1000,nombre = nombre,
                            apellido = apellido, mail = mail, porcenComision = 10, totalVentas = 10);
            empleados.add(empleado);
        }
    }
}
