package org.example.CodigoFinal;

import java.util.ArrayList;

public class OrdenServicio {
    private String numero;
    private Servicio servicio;
    private Tecnico tecnico;
    private Vivienda vivienda;
    private EstadoServicio estado;
    private ArrayList<Material>listaMateriales;

    public OrdenServicio(String numero, Servicio servicio,
                         Tecnico tecnico, Vivienda vivienda
                         ) {
        this.numero = numero;
        this.servicio = servicio;
        this.tecnico = tecnico;
        this.vivienda = vivienda;
        this.listaMateriales = new ArrayList<>();
        estado=EstadoServicio.PENDIENTE;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public Servicio getServicio() {
        return servicio;
    }

    public void setServicio(Servicio servicio) {
        this.servicio = servicio;
    }

    public Tecnico getTecnico() {
        return tecnico;
    }

    public void setTecnico(Tecnico tecnico) {
        this.tecnico = tecnico;
    }

    public Vivienda getVivienda() {
        return vivienda;
    }

    public void setVivienda(Vivienda vivienda) {
        this.vivienda = vivienda;
    }

    public ArrayList<Material> getListaMateriales() {
        return listaMateriales;
    }

    public void setListaMateriales(ArrayList<Material> listaMateriales) {
        this.listaMateriales = listaMateriales;
    }

    public EstadoServicio getEstado() {
        return estado;
    }

    public void setEstado(EstadoServicio estado) {
        this.estado = estado;
    }
    public void actualizarEstado(EstadoServicio nuevoEstado){
        estado=nuevoEstado;

    }

    public void agregarMaterial(Material material) {

        listaMateriales.add(material);
    }

    public double calcularCostoTotal() {

        return servicio.calcularCosto();
    }

    public void mostrarInformacion() {
        System.out.println("ORDEN DE SERVICIO ");
        System.out.println("Numero orden: " + numero);
        System.out.println("Tecnico: " + tecnico.nombre());
        System.out.println("Vivienda: " + vivienda.direccion());
        System.out.println("Servicio: " + servicio.getDescripcion());
        System.out.println("Costo total: " + calcularCostoTotal());
        System.out.println("Cantidad materiales: " + listaMateriales.size());
    }

}
