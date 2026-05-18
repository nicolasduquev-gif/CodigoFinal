package org.example.CodigoFinal;

    public abstract class Servicio {

        protected String id;
        protected String descripcion;
        protected double duracionHoras;

        public Servicio(String id,
                        String descripcion,
                        double duracionEstimada) {

            this.id = id;
            this.descripcion = descripcion;
            this.duracionHoras = duracionEstimada;
        }

        public String getId() {
            return id;
        }

        public String getDescripcion() {
            return descripcion;
        }

        public double getDuracionEstimada() {
            return duracionHoras;
        }

        public abstract double calcularCosto();
    }

