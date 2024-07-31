/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author felix
 */
public class Empleado extends persona {
    private String codigoempleado;

    public String getCodigoempleado() {
        return codigoempleado;
    }

    public void setCodigoempleado(String codigoempleado) {
        this.codigoempleado = codigoempleado;
    }
    @Override
    public void agregar(){
    System.out.println("Codigo Empleado"+  this.getCodigoempleado());
    System.out.println("Puesto"+  this.getPuesto());
    System.out.println("Nombres"+  this.getNombres());
    System.out.println("Apellidos"+  this.getApellidos());
    System.out.println("Direccion"+  this.getDireccion());
    System.out.println("Telefono"+  this.getTelefono());
    System.out.println("Fecha Nacimiento"+  this.getFecha_nacimiento());
    System.out.println("Calcular Edad"+  this.getCalcular_Edad());
    
    }
    @Override
    public void modificar(){
    System.out.println("Codigo Empleado"+  this.getCodigoempleado());
    System.out.println("Puesto"+  this.getPuesto());
    System.out.println("Nombres"+  this.getNombres());
    System.out.println("Apellidos"+  this.getApellidos());
    System.out.println("Direccion"+  this.getDireccion());
    System.out.println("Telefono"+  this.getTelefono());
    System.out.println("Fecha Nacimiento"+  this.getFecha_nacimiento());
    System.out.println("Calcular Edad"+  this.getCalcular_Edad());
    
    }

    @Override
    public void eliminar(){
    System.out.println("Codigo Empleado"+  this.getCodigoempleado());
    System.out.println("Puesto"+  this.getPuesto());
    System.out.println("Nombres"+  this.getNombres());
    System.out.println("Apellidos"+  this.getApellidos());
    System.out.println("Direccion"+  this.getDireccion());
    System.out.println("Telefono"+  this.getTelefono());
    System.out.println("Fecha Nacimiento"+  this.getFecha_nacimiento());
    System.out.println("Calcular Edad"+  this.getCalcular_Edad());
    }
    
    
}
