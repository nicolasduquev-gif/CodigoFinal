package org.example.CodigoFinal;

public class Main {

    public static void main(String[] args) {

        // Crear empresa

        Empresa empresa = new Empresa(
                "UniquindioMantenimientoSAS"
        );

        // Registro tecnico

        Tecnico tecnico1 = new Tecnico(
                "Carlos Hernandez",
                "321",
                "Electricista",
                7
        );
        //Registrar tecnico en la empresa
        empresa.registrarTecnico(
                "Andre Felipe",
                "12346",
                "Mecanico",
                5
        );

        //  Registro de vivienda

        Vivienda vivienda1 = new Vivienda(
                "Calle 17",
                TipoInmueble.DEPARTAMENTO,
                5
        );

        empresa.agregarVivienda(vivienda1);

        // Crear servicio

        Servicio servicio1 = new Fontaneria(
                "C2",
                "Reparacion  tuberia principal",
                3,
                true,
                TipoMaterial.PVC
        );

        // crear un orden de servicio

        OrdenServicio orden1 = new OrdenServicio(
                "ul-091",
                servicio1,
                tecnico1,
                vivienda1
        );

        empresa.agregarOrden(orden1);

        // Registro materiales

        Material material1 = new Material(
                "tubos de PVC",
                2,
                true
        );

        Material material2 = new Material(
                "Llave  paso",
                2,
                false
        );

        orden1.agregarMaterial(material1);

        orden1.agregarMaterial(material2);
        //PRUEBAS DE LOS METODOS

        // mostrar ordenes
        empresa.mostrarOrdenes();

        // obtener servicios vivienda
        empresa.obtenerServiciosVivienda("Calle 17");

        // actualizar estado servicio
        empresa.actualizarEstadoServicio("ul-091", EstadoServicio.COMPLETADO);

        // mostrar estado actualizado
        System.out.println(orden1.getEstado());

        // calcular costo total vivienda
        System.out.println(empresa.calcularCostoTotalVivienda("Calle 17"));
    }
}

