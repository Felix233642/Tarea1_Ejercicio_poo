/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author felix
 */
abstract class persona {
    private String codigo_empleado,puesto,nombres,apellidos,direccion,telefono,fecha_nacimiento,Calcular_Edad;

        public String getCodigo_empleado() {
            return codigo_empleado;
        }

        public void setCodigo_empleado(String codigo_empleado) {
            this.codigo_empleado = codigo_empleado;
        }

        public String getPuesto() {
            return puesto;
        }

        public void setPuesto(String puesto) {
            this.puesto = puesto;
        }

        public String getNombres() {
            return nombres;
        }

        public void setNombres(String nombres) {
            this.nombres = nombres;
        }

        public String getApellidos() {
            return apellidos;
        }

        public void setApellidos(String apellidos) {
            this.apellidos = apellidos;
        }

        public String getDireccion() {
            return direccion;
        }

        public void setDireccion(String direccion) {
            this.direccion = direccion;
        }

        public String getTelefono() {
            return telefono;
        }

        public void setTelefono(String telefono) {
            this.telefono = telefono;
        }

        public String getFecha_nacimiento() {
            return fecha_nacimiento;
        }

        public void setFecha_nacimiento(String fecha_nacimiento) {
            this.fecha_nacimiento = fecha_nacimiento;
        }

        public String getCalcular_Edad() {
            return Calcular_Edad;
        }

        public void setCalcular_Edad(String Calcular_Edad) {
            this.Calcular_Edad = Calcular_Edad;
        }

    protected void agregar(){}
    protected void modificar (){}
    protected void eliminar (){}

}
