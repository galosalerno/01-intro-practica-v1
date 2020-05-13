package ar.edu.unahur.obj2.ejercicio1;

public class Empleados_vendedores extends Empleados{
    Integer porcenComision;
    Integer totalVentas;

    public Empleados_vendedores(int dni, int sueldoBase, String nombre, String apellido, String mail, int porcenComision, int totalVentas) {
        super(dni, sueldoBase, nombre, apellido, mail);
        this.porcenComision = porcenComision;
        this.totalVentas = totalVentas;
    }

    @Override
    // Si es vendedor: sueldoBase + (porcenComision*totalVtas/100)
    public double getSueldo() {
        double sueldo = 0;
        sueldo = sueldoBase + (porcenComision*totalVentas/100);

        return sueldo;
    }
}
