package org.example.CodigoFinal;
    import java.util.ArrayList;

    public class Empresa {
        private String nombre;
        private ArrayList<OrdenServicio> ordenes;
        private ArrayList<Tecnico> tecnicos;
        private ArrayList<Vivienda> viviendas;
        public Empresa(String nombre) {

            this.nombre = nombre;
            this.ordenes = new ArrayList<>();
            this.tecnicos = new ArrayList<>();
            this.viviendas = new ArrayList<>();
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

        //Registrar tecnico

        public boolean registrarTecnico(String nombre, String identificacion,
                                        String certificacion, int aniosExperiencia) {

            for (Tecnico t : tecnicos) {
                if (t.identificacion().equals(identificacion)) {
                    return false;
                }
            }
            Tecnico nuevoTecnico = new Tecnico(nombre, identificacion, certificacion,
                    aniosExperiencia);
            tecnicos.add(nuevoTecnico);
            return true;
        }
        //Agregar vivienda
        public void agregarVivienda(Vivienda vivienda) {
            viviendas.add(vivienda);
        }
        //Agregar orden

        public void agregarOrden(OrdenServicio orden) {
            ordenes.add(orden);
        }

        //Obtener servicios de una viviedna

        public void obtenerServiciosVivienda(String direccion) {
            for (OrdenServicio orden : ordenes) {
                if (orden.getVivienda().direccion().equalsIgnoreCase(direccion)) {

                    orden.mostrarInformacion();
                }
            }
        }
        //Actualizar estado
        public void actualizarEstadoServicio(String numeroOrden, EstadoServicio nuevoEstado) {
            for (OrdenServicio orden : ordenes) {
                if (orden.getServicio().equals(numeroOrden)) {
                    orden.actualizarEstado(nuevoEstado);
                }
            }
        }
        //Calcular el costo total de una vivienda
        public double calcularCostoTotalVivienda(
                String direccion) {

            double total = 0;
            for (OrdenServicio orden : ordenes) {
                if (orden.getVivienda().direccion().equalsIgnoreCase(direccion)) {
                    total += orden.calcularCostoTotal();
                }
            }

            return total;
        }
        //mostrar todas las ordenes
        public void mostrarOrdenes() {
            for (OrdenServicio orden : ordenes) {
                orden.mostrarInformacion();
                System.out.println();
            }
        }
    }

