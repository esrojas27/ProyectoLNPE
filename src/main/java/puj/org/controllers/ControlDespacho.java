package puj.org.controllers;

import puj.org.controllers.GestionCliente;
import puj.org.controllers.GestionProductos;
import puj.org.entities.Pedido;

import java.util.ArrayList;

public class ControlDespacho {

    GestionCliente gestionCliente = new GestionCliente();
    GestionProductos gestionProductos = new GestionProductos();
    private ArrayList<Pedido> pedidos = new ArrayList<Pedido>();


}
