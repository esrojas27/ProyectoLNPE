package puj.org.controllers;

import puj.org.entities.Producto;

import java.util.ArrayList;

public class GestionProductos {
    private ArrayList<Producto> listaProductos = new ArrayList<Producto>();

    public ArrayList<Producto> getListaProductos() {
        return listaProductos;
    }

    public void setListaProductos(ArrayList<Producto> listaProductos) {
        this.listaProductos = listaProductos;
    }



}
