import org.example.ColaPrioridad;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class colaPrioridadTest {
    private ColaPrioridad cola;
    @Before
    public void setUp() {
        cola = new ColaPrioridad();
    }
    @Test
    public void testIniciarProcesos() {
        cola.iniciarProcesos(3);
        assertEquals(3, cola.procesos.size());
    }
    @Test
    public void testOrdenarProcesos() {
        cola.iniciarProcesos(3);
        cola.ordenarProcesos();
        assertEquals(3, cola.procesos.size());
    }
    @Test
    public void testEliminarProceso() {
        cola.iniciarProcesos(3);
        cola.ordenarProcesos();
        int initialSize = cola.procesos.size();
        cola.eliminarProceso();
        assertEquals(initialSize - 1, cola.procesos.size());
        // Add more assertions based on your elimination logic
    }
}
