package org.example.CodigoFinal;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

    public class EmpresaTest {

        // prueba registrar tecnico
        @Test
        public void registrarTecnicoTest() {
            Empresa empresa = new Empresa("Uniquindio");
            boolean resultado = empresa.registrarTecnico(
                    "Carlos",
                    "123",
                    "Electricista",
                    5
            );
            assertTrue(resultado);
        }

        // prueba calcular costo
        @Test
        public void calcularCostoTest() {
            Servicio servicio = new Fontaneria(
                    "F1",
                    "Reparacion tuberia",
                    3,
                    true,
                    TipoMaterial.PVC
            );
            double costo = servicio.calcularCosto();
            assertEquals(50000, costo);
        }

        // prueba actualizar estado
        @Test
        public void actualizarEstadoTest() {
            Tecnico tecnico = new Tecnico(
                    "Carlos",
                    "123",
                    "Electricista",
                    5
            );
            Vivienda vivienda = new Vivienda(
                    "Calle 10",
                    TipoInmueble.CASA,
                    4
            );
            Servicio servicio = new Electricidad(
                    "E1",
                    "Reparacion",
                    2,
                    true,
                    3
            );
            OrdenServicio orden = new OrdenServicio(
                    "OS-1",
                    servicio,
                    tecnico,
                    vivienda
            );
            orden.actualizarEstado(
                    EstadoServicio.COMPLETADO
            );
            assertEquals(
                    EstadoServicio.COMPLETADO,
                    orden.getEstado()
            );
        }
    }

