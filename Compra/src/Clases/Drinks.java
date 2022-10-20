
package Clases;


public class Drinks {
    
    private String producto = "";
    private String marca = "";
    private int cantidad = 0;
    
    public Drinks (String producto, String marca, int cantidad){
        this.producto = producto;
        this.marca = marca;
        this.cantidad = cantidad;
        
    }

    public String getProducto() {
        return producto;
    }

    public void setProducto(String producto) {
        this.producto = producto;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
    
    
    
}
