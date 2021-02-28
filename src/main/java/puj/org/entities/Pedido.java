package puj.org.entities;


import java.util.Calendar;
import java.util.UUID;

public class Pedido {

    private UUID numPedido;
    private Calendar fechaRecibido;
    private boolean pagado;
    private String nombreRepartidor;
    private Cliente solicitate;
    private Producto productoSolicitado;

    public UUID getNumPedido() {
        return numPedido;
    }

    public void setNumPedido(UUID numPedido) {
        this.numPedido = numPedido;
    }

    public Calendar getFechaRecibido() {
        return fechaRecibido;
    }

    public void setFechaRecibido(Calendar fechaRecibido) {
        this.fechaRecibido = fechaRecibido;
    }

    public boolean isPagado() {
        return pagado;
    }

    public void setPagado(boolean pagado) {
        this.pagado = pagado;
    }

    public String getNombreRepartidor() {
        return nombreRepartidor;
    }

    public void setNombreRepartidor(String nombreRepartidor) {
        this.nombreRepartidor = nombreRepartidor;
    }
}
