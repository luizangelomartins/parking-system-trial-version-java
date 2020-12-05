


    // [ "CRIADOR: LUIZ ÂNGELO MARTINS" ]:



// PACOTE DA CLASSE:
package funcoes;


// IMPORTAÇÃO DE BIBLIOTECAS:
import java.util.Scanner;


// MÉTODO PRINCIPAL DA CLASSE:
public class CalculoTempo {
    
    // DECLARAÇÃO DE VARIAVEIS:
    double aux1 = 0;
    double valor_hora = 0;
    double hora_inicial = 0;
    double hora_final = 0;
    double hora_resultado1 = 0;
    double hora_resultado2 = 0;
    
    
    // FUNÇÃO QUE IRÁ CALCULAR O TEMPO:
    public void tempo() {
        
        // "ZERANDO VALORES":
        aux1 = 0;
        valor_hora = 0;
        hora_inicial = 0;
        hora_final = 0;
        hora_resultado1 = 0;
        hora_resultado2 = 0;
        
        // ORIENTAÇÃO:
        System.out.println("");
        System.out.println("OBS: SEPARE OS VALORES COM VIRGULA.");
        
        // VALOR DA HORA:
        System.out.println("");
        System.out.printf("DIGITE O VALOR DA HORA: ");
        Scanner valor = new Scanner(System.in);
        valor_hora = valor.nextDouble();
        
        // HORARIO DE ENTRADA:
        System.out.printf("DIGITE O HORARIO DE ENTRADA: ");
        Scanner entrada = new Scanner(System.in);
        hora_inicial = entrada.nextDouble();
        
        // HORARIO DE SAÍDA:
        System.out.printf("DIGITE O HORARIO DE SAÍDA: ");
        Scanner saida = new Scanner(System.in);
        hora_final = saida.nextDouble();
        
        // CALCULO:
        hora_resultado1 = hora_final - hora_inicial;
        hora_resultado2 = hora_resultado1 * valor_hora;
        aux1 = hora_resultado2;
        hora_resultado2 = Math.round(hora_resultado2);
        
        // EXIBIÇÃO:
        System.out.println("");
        System.out.println("TOTAL DE HORAS: " + hora_resultado1);
        System.out.println("VALOR BRUTO: " + aux1);
        System.err.println("TOTAL A PAGAR: R$" + hora_resultado2);
        
        
    }
    
    
}




