package modelo;

public class Financiamento {

    // Variáveis
    private double valorImovel, taxaJurosAnual;
    private int prazoFinanciamento;

    // Getters

    public double getPrazoFinanciamento(int prazoFinanciamento) {
        return prazoFinanciamento;
    }
    public double getValorImovel () {
        return valorImovel;
    }

    public double getTaxaJurosAnual() {
        return taxaJurosAnual;
    }

    // Setters
    public void setPrazoFinanciamento(int prazoFinanciamento) {
        this.prazoFinanciamento = prazoFinanciamento;
    }

    public void setValorImovel(double valorImovel) {
        this.valorImovel = valorImovel;
    }

    public void setTaxaJurosAnual(double taxaJurosAnual) {
        this.taxaJurosAnual = taxaJurosAnual;
    }

    public int getPrazoFinanciamento() {
        return prazoFinanciamento;
    }

    // Método Construtor
    public Financiamento (double valorImovel, double taxaJurosAnual, int prazoFinanciamento) {
        this.valorImovel = valorImovel;
        this.taxaJurosAnual = taxaJurosAnual;
        this.prazoFinanciamento = prazoFinanciamento;
    }

    public double gerarPagamentoMensal(double valorImovel, double taxaJurosAnual, int prazoFinanciamento) {
        double pagamentoMensal;

        pagamentoMensal = (valorImovel / prazoFinanciamento) * (1 + (taxaJurosAnual/12));
        return pagamentoMensal;
    }

    public double gerarPagamentoTotal(double pagamentoMensal, int prazoFinanciamento) {
        double pagamentoTotal;

        pagamentoTotal = pagamentoMensal * prazoFinanciamento;
        return pagamentoTotal;
    }

    public void mostrarDados (double valorImovel, double taxaJurosAnual, int prazoFinanciamento, double pagamentoTotal, double pagamentoMensal) {
        System.out.println("--- DADOS DO FINANCIAMENTO ---");
        System.out.printf("Valor do imóvel:     R$%.2f\r\n", valorImovel);
        System.out.printf("Valor da taxa de juros anual: %.2f\r\n", taxaJurosAnual);
        System.out.printf("Valor do pagamento mensal: R$%.2f\r\n", pagamentoMensal);
        System.out.printf("Valor do pagamento total: R$%.2f\r\n", pagamentoTotal);
        System.out.printf("Prazo de financiamento: %d meses\r\n", prazoFinanciamento);
    }

}
