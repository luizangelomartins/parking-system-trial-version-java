


    // [ "CRIADOR: LUIZ ÂNGELO MARTINS" ]:



// PACOTE DA CLASSE:
package parkingsystem;


// IMPORTAÇÃO DE BIBLIOTECAS:
import java.util.InputMismatchException;
import java.util.Scanner;


// MÉTODO PRINCIPAL DA CLASSE:
public class Menu {

    
    // DECLARAÇÃO DE VARIAVEIS E OBJETOS:
    int repetir = 0;
    int escolha_usuario = 0;
    
    
    // FUNÇÃO PARA EXIBIR O MENU:
    public void exibir_menu() {
        
        while(repetir != 1) {
            
            try {
                
                System.out.println("");
                System.out.println("MENU GERAL - CALCULOS:");
                System.out.println("");
                System.out.println("0 - SAIR");
                System.out.println("1 - CARRO");
                System.out.println("2 - MOTO");
                System.out.println("");
                System.out.printf("DIGITE SUA RESPOSTA: ");
                Scanner escolha = new Scanner(System.in);
                escolha_usuario = escolha.nextInt();

                switch( escolha_usuario ) {

                    // CASO "0" - SAIR:
                    case 0:
                        repetir = 1;
                    break;

                    // CASO "1" - CARRO:
                    case 1:
                    break;

                    // CASO "2" - MOTO:
                    case 2:
                    break;

                    default:
                        System.err.println("DIGITE UM VALOR VALIDO!");
                        System.err.println("TENTE NOVAMENTE!");

                }
                
            }catch(InputMismatchException e){
                
                System.err.println("DIGITE UM VALOR VALIDO!");
                System.err.println("TENTE NOVAMENTE!");
                        
            }
            
        }
        
    }
    
    
}




