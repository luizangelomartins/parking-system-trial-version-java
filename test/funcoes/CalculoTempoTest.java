


    // [ "CRIADOR: LUIZ ÂNGELO MARTINS" ]:



// PACOTE DA CLASSE:
package funcoes;


// IMPORTAÇÃO DE BIBLIOTECAS:
import org.junit.Test;
import static org.junit.Assert.*;


// MÉTODO PRINCIPAL DA CLASSE:
public class CalculoTempoTest {
    
    
    public CalculoTempoTest() {
        
    }

    // TESTE DO CALCULO DE TEMPO:
    /**
     * Test of tempo method, of class CalculoTempo.
     */
    @Test
    public void testTempo() {
        
        double valor_hora = 4;
        double hora_inicial = 8;
        double hora_final = 12;
        double hora_resultado1 = 0;
        double hora_resultado2 = 0;
        
        hora_resultado1 = hora_final - hora_inicial;
        assertEquals(4, hora_resultado1, 1);
        
        hora_resultado2 = hora_resultado1 * valor_hora;
        assertEquals(16, hora_resultado2, 1);
        
    }
    
    
}




