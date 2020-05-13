package ar.edu.unahur.obj2.ejercicio1;

public class Empleados_administrativos extends Empleados{

    int hsExtra;
    int hsMes;

    public Empleados_administrativos(int dni, int sueldoBase, String nombre, String apellido,
                                     String mail, int hsExtra, int hsMes) {
        super(dni, sueldoBase, nombre, apellido, mail);
        this.hsExtra = hsExtra;
        this.hsMes = hsMes;
    }

    @Override
    // Si es administrativo: sueldoBase * ((hsExtra * 1.5)+hsMes) / hsMes
    public double getSueldo() {
        double sueldo = 0;
        sueldo = sueldoBase * ((hsExtra*1.5)+hsMes) / hsMes;
        return sueldo;
    }


}
