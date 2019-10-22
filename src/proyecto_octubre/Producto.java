/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto_octubre;

/**
 *
 * @author Estudiante
 */
public class Producto {
    String codigo;
    String nombre;
    double precioCompra;
    double precioVenta;
    String estado;
    public Producto (){
       
    }
    public Producto(String codigo,String nombre , double precioCompra ,double precioVenta , String estado){
  this.codigo = codigo;
  this.nombre= nombre;
  this.precioCompra = precioCompra;
  this.precioVenta=precioVenta;
  this.estado=estado;
    }
    // Metodo get
    public String getCodigo(){
       return codigo;
    }
      public String getNombre(){
       return nombre;
    }
        public double getprecioCompra(){
            return precioCompra;

    }
              public double getprecioVenta(){
            return precioVenta;

    }
        public String getestado(){
            return estado;
        }
    // Metodos set
        public void setNombre(String valor){
            this.nombre= valor;
        }
       
   
}