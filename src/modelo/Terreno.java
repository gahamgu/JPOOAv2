// PERTENCE AO PACOTE
package modelo;

// HERDA A SUPER CLASSE ABSTRATA FINANCIAMENTO
public class Terreno extends Financiamento {
    // VARIÁVEIS
    private String zona;

    // MÉTODO CONSTRUTOR
    public Terreno(double valorImovel, double taxaJurosAnual, int prazoFinanciamento, String zona) {
        super(valorImovel, taxaJurosAnual, prazoFinanciamento);
        this.zona = zona;
    }

    // GETTERS
    public String getZona() { return zona; }

    // DEFINE A CLASSE ABSTRATA
    public double gerarPagamentoMensal(double valorImovel, double taxaJurosAnual, int prazoFinanciamento) {
        double pagamentoMensal;

        pagamentoMensal = (valorImovel / prazoFinanciamento) * (1 + (taxaJurosAnual/12));
        return pagamentoMensal * 1.02;
    }

    // REDEFINE OS MÉTODOS DA SUPER CLASSE
    @Override
    public void mostrarDados() {
        super.mostrarDados();
        System.out.println("Tipo de Financiamento: Terreno");
        System.out.println("Tipo de Zona: " + zona);
        System.out.println();
    }

    public String gerarDados() {
        StringBuilder sb = new StringBuilder();
        sb.append("- DADOS DO FINANCIAMENTO:\r\n");
        sb.append("Tipo de Financiamento: Terreno");
        sb.append(String.format("Valor do imóvel: R$%.2f\r\n", valorImovel));
        sb.append(String.format("Valor da taxa de juros anual: %.2f\r\n", taxaJurosAnual));
        sb.append(String.format("Valor do pagamento mensal: R$%.2f\r\n", pagamentoMensal));
        sb.append(String.format("Valor do pagamento total: R$%.2f\r\n", pagamentoTotal));
        sb.append(String.format("Prazo de financiamento: %d meses\r\n", prazoFinanciamento));
        sb.append(String.format("Tipo de Zona: %s\r\n", zona));
        sb.append('\n');

        return sb.toString();
    }
}
