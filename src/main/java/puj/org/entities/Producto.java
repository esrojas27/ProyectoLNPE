package puj.org.entities;

import java.util.UUID;

public class Producto {
    private UUID prodid;
    private String nombrecomercial;
    private Double precio;
    private Double iva;
    private String tienda;
    private Pedido pedido;

    public UUID getProdid() {
        return prodid;
    }

    public void setProdid(UUID prodid) {
        this.prodid = prodid;
    }

    public String getNombrecomercial() {
        return nombrecomercial;
    }

    public void setNombrecomercial(String nombrecomercial) {
        this.nombrecomercial = nombrecomercial;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public Double getIva() {
        return iva;
    }

    public void setIva(Double iva) {
        this.iva = iva;
    }

    public String getTienda() {
        return tienda;
    }

    public void setTienda(String tienda) {
        this.tienda = tienda;
    }
}
