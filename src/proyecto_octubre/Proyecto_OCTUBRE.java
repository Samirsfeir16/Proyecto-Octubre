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
public class Proyecto_OCTUBRE {


    public static void main(String[] args) {
        productoCrud prodCrud = new productoCrud();
      Producto prod = new Producto ( " P001 " , " Teclado " , 25000 , 30000 , " Activo");
      prodCrud.registrarProducto(prod);
      prodCrud.listarProductos();
      

    }
   
}
