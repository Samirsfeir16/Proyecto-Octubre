/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto_octubre;

import javax.swing.JOptionPane;

/**
 *
 * @author Estudiante
 */
public class productoCrud {
    int numPROD;
    Producto [] vectorProductos;
    int tamanioVector;
    public productoCrud(){
        tamanioVector = 5 ;
        numPROD= -1;
        vectorProductos = new Producto [tamanioVector];
    }
    public void registrarProducto(Producto prod){
        numPROD++;
        vectorProductos[numPROD]= prod;         
    } 
    public void listarProductos(){
        String salida  = " Listado de productos \n" +
        "<html><table border = 1 cellspacing = 0 cellpadding = 2" +                  
        "<tr>"+
        "<td> Codigo </td>"+
        "<td> Nombre </td>"+
        "<td> Precio Compra </td>"+
        "<td> Precio Venta </td>"+
        "<td> Estado </td>" +
        "</tr>";
        for (int i = 0; i <= numPROD ; i++) {
            Producto prod = vectorProductos[i];
            salida += "<tr>"+
                    "<td> " + prod.codigo+ "</td>"+
                    "<td> " + prod.nombre+ "</td>"+
                    "<td> " + prod.precioCompra + "</td>"+
                    "<td> " + prod.precioVenta+ "</td>"+
                    "<td> " + prod.estado+ "</td>"+
                    "</tr>";
                    
        }
        salida += "</table></html>";
        JOptionPane.showMessageDialog(null, salida);
    }
}
 