// PERTENCE AO PACOTE
package modelo;

// CLASSE FILHA DE FINANCIAMENTO
public class Apartamento extends Financiamento {
    // VARIÁVEIS
    private int numeroVagas;
    private int andar;

    // MÉTODO CONSTRUTOR
    public Apartamento(double valorImovel, double taxaJurosAnual, int prazoFinanciamento, int numeroVagas, int andar) {
        super(valorImovel, taxaJurosAnual, prazoFinanciamento);
        this.numeroVagas = numeroVagas;
        this.andar = andar;
    }

    // GETTERS
    public int getNumeroVagas() { return numeroVagas; }
    public int getAndar() { return andar; }

    // GERA O PAGAMENTO MENSAL PARA APARTAMENTOS
    // DEFINE O MÉTODO ABSTRATO DA SUPER CLASSE
    public double gerarPagamentoMensal(double valorImovel, double taxaJurosAnual, int prazoFinanciamentoEmAnos) {
        double taxaMensal = taxaJurosAnual/12;
        int meses = prazoFinanciamentoEmAnos * 12;

        return valorImovel * taxaMensal * Math.pow((1 + taxaMensal), meses) / Math.pow((1 + taxaMensal),  meses) - 1;
    }

    // REESCREVE O MÉTODO CONCRETO DA SUPER CLASSE
    @Override
    public void mostrarDados() {
        super.mostrarDados();
        System.out.println("Tipo de financiamento: Apartamento");
        System.out.println("Andar: " + andar);
        System.out.println("Número de Vagas: " + numeroVagas);
        System.out.println();
    }

    // TAMBÉM REESCREVE O MÉTODO CONCRETO DA SUPER CLASSE
    @Override
    public String gerarDados() {
        StringBuilder sb = new StringBuilder();
        sb.append("- DADOS DO FINANCIAMENTO:\r\n");
        sb.append(String.format("Tipo de Financiamento: Apartamento\r\n"));
        sb.append(String.format("Andar: %d\r\n", andar));
        sb.append(String.format("Número de Vagas: %d\r\n", numeroVagas));
        sb.append(String.format("Valor do imóvel: R$%.2f\r\n", valorImovel));
        sb.append(String.format("Valor da taxa de juros anual: %.2f\r\n", taxaJurosAnual));
        sb.append(String.format("Valor do pagamento mensal: R$%.2f\r\n", pagamentoMensal));
        sb.append(String.format("Valor do pagamento total: R$%.2f\r\n", pagamentoTotal));
        sb.append(String.format("Prazo de financiamento: %d meses\r\n", prazoFinanciamento));
        sb.append('\n');

        return sb.toString();
    }
}
