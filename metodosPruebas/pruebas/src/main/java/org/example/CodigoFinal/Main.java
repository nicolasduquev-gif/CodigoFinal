package org.example.CodigoFinal;
public class Main {

    public static void main(String[] args) {

        // empresa

        Empresa empresa = new Empresa("UniquindioMantenimientoSAS");

        // tecnico

        Tecnico tecnico1 = new Tecnico(
                "Carlos Perez",
                "123",
                "Electricista Industrial",
                5
        );

        empresa.agregarTecnico(tecnico1);

        // vivienda

        Vivienda vivienda1 = new Vivienda(
                "Calle 10",
                TipoInmueble.CASA,
                4
        );

        empresa.agregarVivienda(vivienda1);

        // servicio

        Servicio servicio1 = new Fontaneria(
                "F1",
                "Reparacion de tuberia principal",
                3.5,
                true,
                TipoMaterial.PVC
        );

        // orden

        OrdenServicio orden1 = new OrdenServicio(
                "OS-001",
                servicio1,
                tecnico1,
                vivienda1
        );

        // materiales

        Material material1 = new Material(
                "Tubo PVC",
                2,
                true
        );

        Material material2 = new Material(
                "Llave de paso",
                1,
                false
        );

        orden1.agregarMaterial(material1);

        orden1.agregarMaterial(material2);

        // agregar una orden a la empresa

        empresa.agregarOrden(orden1);

        //mostrar todo
        empresa.mostrarOrdenes();
    }
}

