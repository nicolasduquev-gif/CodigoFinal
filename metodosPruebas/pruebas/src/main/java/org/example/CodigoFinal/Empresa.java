package org.example.CodigoFinal;
import java.util.ArrayList;

    public class Empresa {
        private String nombre;
        private ArrayList<OrdenServicio> ordenes;
        private ArrayList<Tecnico> tecnicos;
        private ArrayList<Vivienda> viviendas;

        public Empresa(String nombre) {
            this.nombre = nombre;
            this.ordenes = new ArrayList<OrdenServicio>();
            this.tecnicos = new ArrayList<Tecnico>();
            this.viviendas = new ArrayList<Vivienda>();
        }
        public String getNombre() {
            return nombre;
        }
        public ArrayList<OrdenServicio> getOrdenes() {
            return ordenes;
        }
        public ArrayList<Tecnico> getTecnicos() {
            return tecnicos;
        }
        public ArrayList<Vivienda> getViviendas() {
            return viviendas;
        }
        public void agregarTecnico(Tecnico tecnico) {
            tecnicos.add(tecnico);
        }
        public void agregarVivienda(Vivienda vivienda) {
            viviendas.add(vivienda);
        }
        public void agregarOrden(OrdenServicio orden) {
            ordenes.add(orden);
        }
        public void mostrarOrdenes() {
            for (OrdenServicio orden : ordenes) {
                orden.mostrarInformacion();
                System.out.println();
            }
        }
    }
