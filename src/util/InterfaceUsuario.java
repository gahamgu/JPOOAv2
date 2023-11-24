// PERTENCE AO PACOTE
package util;

// IMPORTA A CLASSE
import java.util.Scanner;

public class InterfaceUsuario {
    // CRIA O OBJETO SCANNER
    Scanner scanner = new Scanner(System.in);

    // VARIÁVEIS
    double valorDoImovel;
    double taxaDeJuros;
    int prazoDeFinanciamento;

    // MÉTODOS PARA SOLICITAR OS VALORES DESEJADOS
    public double pedirValorImovel() {
        while (true) {
            try {
                System.out.print("Digite o valor do imóvel: ");
                valorDoImovel = Double.parseDouble(scanner.nextLine());

                if (valorDoImovel > 0) {
                    break;
                } else {
                    System.out.println("Valor inválido. Digite um número positivo.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Valor inválido. Digite um número.");
            }
        }
        return valorDoImovel;
    }

    public int pedirPrazo() {
        while (true) {
            try {
                System.out.print("Digite o valor do prazo: ");
                prazoDeFinanciamento = Integer.parseInt(scanner.nextLine());

                if (prazoDeFinanciamento > 0) {
                    break;
                } else {
                    System.out.println("Valor inválido. Prazo deve ser positivo.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Valor inválido. Prazo deve ser um número.");
            }
        }
        return prazoDeFinanciamento;
    }

    public double pedirTaxa() {
        while (true) {
            try {
                System.out.print("Digite o valor da taxa: ");
                taxaDeJuros = Double.parseDouble(scanner.nextLine());

                if (taxaDeJuros > 0) {
                    break;
                } else {
                    System.out.println("Valor inválido. Taxa deve ser um número positivo.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Valor inválido. Taxa deve ser um número.");
            }
        }
        return taxaDeJuros;
    }

    public double pedirAreaT() {
        double areaT;
        while (true) {
            try {
                System.out.print("Digite a área do terreno: ");
                areaT = Double.parseDouble(scanner.nextLine());

                if (areaT > 0) {
                    break;
                } else {
                    System.out.println("Valor inválido. Digite um número positivo.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Valor inválido. Digite um número.");
            }
        }
        return areaT;
    }

    public double pedirAreaC() {
        double areaC;
        while (true) {
            try {
                System.out.print("Digite a área da casa: ");
                areaC = Double.parseDouble(scanner.nextLine());

                if (areaC > 0) {
                    break;
                } else {
                    System.out.println("Valor inválido. Digite um número positivo.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Valor inválido. Digite um número.");
            }
        }
        return areaC;
    }
}
