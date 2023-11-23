package util;

import java.util.Scanner;

public class InterfaceUsuario {
    Scanner scanner = new Scanner(System.in);

    double valorDoImovel, taxaDeJuros;
    int prazoDeFinanciamento;

    public double pedirValorImovel() {
        boolean valido = false;

        while (!valido) {
            System.out.print("Digite o valor do imóvel: ");
            if (scanner.hasNextDouble()) {
                valorDoImovel = scanner.nextDouble();
                scanner.nextLine();
                if (valorDoImovel > 0) {
                    valido = true;
                } else {
                    System.out.println("Valor inválido. Digite um número positivo.");
                }
            } else {
                scanner.next();
                System.out.println("Valor inválido. Digite um número.");
            }
        }
        return valorDoImovel;
    }

    public int pedirPrazo () {
        boolean valido = false;

        while (!valido) {
            System.out.print("Digite o valor do prazo: ");
            if (scanner.hasNextInt()) {
                prazoDeFinanciamento = scanner.nextInt();
                if (prazoDeFinanciamento > 0) {
                    valido = true;
                } else {
                    System.out.println("Valor inválido. Prazo deve ser positivo.");
                }
            } else {
                scanner.next();
                System.out.println("Valor inválido. Prazo deve ser um número.");
            }
        }
        return prazoDeFinanciamento;
    }

    public double pedirTaxa () {
        boolean valido = false;

        while (!valido) {
            System.out.print("Digite o valor da taxa: ");
            if (scanner.hasNextDouble()) {
                taxaDeJuros = scanner.nextDouble();
                if (taxaDeJuros > 0) {
                    valido = true;
                } else {
                    System.out.println("Valor inválido. Taxa deve ser um número positivo.");
                }
            } else {
                scanner.next();
                System.out.println("Valor inválido. Taxa deve ser um número.");
            }
        }
        return taxaDeJuros;
    }

}
