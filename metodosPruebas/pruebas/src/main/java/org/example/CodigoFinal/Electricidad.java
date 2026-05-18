package org.example.CodigoFinal;

public class Electricidad extends Servicio {

        private boolean trabajoAlturas;
        private int cantidadCircuitos;

        public Electricidad(String id,
                            String descripcion,
                            double duracionEstimada,
                            boolean trabajoAlturas,
                            int cantidadCircuitos) {

            super(id, descripcion, duracionEstimada);

            this.trabajoAlturas = trabajoAlturas;
            this.cantidadCircuitos = cantidadCircuitos;
        }

        public boolean isTrabajoAlturas() {
            return trabajoAlturas;
        }

        public int getCantidadCircuitos() {
            return cantidadCircuitos;
        }

        @Override
        public double calcularCosto() {

            double costo = 50000;

            if (trabajoAlturas) {
                costo += 20000;
            }

            return costo;
        }
    }
