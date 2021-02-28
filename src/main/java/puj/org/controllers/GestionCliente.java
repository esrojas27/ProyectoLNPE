package puj.org.controllers;

import puj.org.entities.Cliente;

import java.util.ArrayList;

public class GestionCliente {
    private ArrayList<Cliente> listaCliente = new ArrayList<Cliente>();

    public ArrayList<Cliente> getListaCliente() {
        return listaCliente;
    }

    public void setListaCliente(ArrayList<Cliente> listaCliente) {
        this.listaCliente = listaCliente;
    }
}
