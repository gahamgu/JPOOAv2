// PERTENCE AO PACOTE
package main;

// IMPORTA AS CLASSES
import modelo.Apartamento;
import modelo.Casa;
import modelo.Financiamento;
import modelo.Terreno;
import util.Gerenciador;
import util.InterfaceUsuario;
import util.SalvarFinanciamentos;
import java.io.IOException;
import java.sql.SQLOutput;
import java.util.ArrayList;

// PONTO DE PARTIDA
public class Main {
    public static void main(String[] args) throws IOException {
        // INTERFACE DO USUÁRIO PARA INPUT
        InterfaceUsuario usuario = new InterfaceUsuario();

        System.out.println("- CALCULAR FIANCIAMENTO DE UMA CASA -");
        double valorImovel = usuario.pedirValorImovel();
        double taxa = usuario.pedirTaxa();
        int anos = usuario.pedirPrazo();
        double areaT = usuario.pedirAreaT();
        double areaC = usuario.pedirAreaC();

        // OBJETO "CASA" CRIADO COM AS VARIAVEIS ACIMA
        Financiamento casa = new Casa(valorImovel, taxa, anos, areaT, areaC);
        System.out.println();
        casa.mostrarDados();

        // OBJETO "GERENCIADOR" CRIADO
        Gerenciador gerenciador = new Gerenciador("financiamentos.txt");
        gerenciador.carregarArquivo();

        // OBJETO "ARRAYLIST" CRIADO PARA OS OBJETOS DO FINANCIAMENTO
        ArrayList<Financiamento> financiamentos = gerenciador.getFinanciamentos();

        // CASO NÃO HAJA ARQUIVO:
        if (financiamentos.isEmpty()) {
            // CRIA UM E ADICIONA OS OBJETOS AO ARQUIVO
            gerenciador.adicionarFinanciamento(casa);
            gerenciador.adicionarFinanciamento(new Casa(200000, 0.02, 12, 1000, 1200));
            gerenciador.adicionarFinanciamento(new Casa(300000, 0.03, 24, 500, 1000));
            gerenciador.adicionarFinanciamento(new Apartamento(150000, 0.01, 6, 10, 2));
            gerenciador.adicionarFinanciamento(new Apartamento(250000, 0.025, 18, 2, 1));
            gerenciador.adicionarFinanciamento(new Terreno(150000, 0.01, 6, "rural"));
            gerenciador.adicionarFinanciamento(new Terreno(250000, 0.025, 18, "urbana"));
        }

        // SALVA O ARQUIVO
        gerenciador.salvarArquivo();

        // OBJETO "SALVARFINANCIAMENTOS" CRIADO
        SalvarFinanciamentos salvarFinanciamentos = new SalvarFinanciamentos(financiamentos);

        // MÉTODO "SALVAR" INVOCADO
        salvarFinanciamentos.salvar("financiamentosemtexto.txt");

        // ARMAZENA O VALOR TOTAL DE TODOS OS FINANCIAMENTOS
        double totalMoveis = 0;
        double totalFinanciamentos = 0;

        // ITERA PELA LISTA SOMANDO OS VALORES
        for (Financiamento f : gerenciador.getFinanciamentos()) {
            f.mostrarDados();
            totalMoveis += f.getValorImovel();
            totalFinanciamentos += f.getPagamentoMensal();
        }

        // OUTPUT: DADOS DO TOTAL DE IMÓVEIS
        System.out.printf("Valor total dos imóveis: R$%.2f\r\n", totalMoveis);
        System.out.printf("Valor total dos financiamentos: R$%.2f\r\n", totalFinanciamentos);

    }
}