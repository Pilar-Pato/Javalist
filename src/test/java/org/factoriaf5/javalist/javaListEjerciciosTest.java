package org.factoriaf5.javalist;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.List;


public class javaListEjerciciosTest {

        private javaListEjercicios diasSemana = new javaListEjercicios();

    @Test
    public void todosLosDias() {
        List<String> dias = diasSemana.obtenerDias();
        assertEquals(7, dias.size());
        assertTrue(dias.contains("Lunes"));
    }

    @Test
    public void eliminarDia() {
        assertTrue(diasSemana.eliminarDia("Lunes"));
        assertFalse(diasSemana.obtenerDias().contains("Lunes"));
    }

    @Test
    public void eliminarDiaNo() {
        assertFalse(diasSemana.eliminarDia("Domingin"));
    }

    @Test
    public void obtenerDiaId() {
        assertEquals("Martes", diasSemana.obtenerDia(1));
    }

    @Test
    public void diaInvalido() {
        assertThrows(IndexOutOfBoundsException.class, () -> diasSemana.obtenerDia(-1));
    }

    @Test
    public void existeDia() {
        assertTrue(diasSemana.existeDia("Miércoles"));
        assertFalse(diasSemana.existeDia("DiaFalso"));
    }

    @Test
    public void ordenarDias() {
        diasSemana.ordenarDias();
        assertEquals("Viernes", diasSemana.obtenerDias().get(6));
    }
  
}