package modelo;

public abstract class Financiamento {
    // Variáveis
    protected double valorImovel;
    protected double taxaJurosAnual;
    protected int prazoFinanciamento;
    protected double pagamentoMensal;
    protected double pagamentoTotal;

    // Getters
    public double getValorImovel() {
        return valorImovel;
    }
    public double getTaxaJurosAnual() {
        return taxaJurosAnual;
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

    public abstract double gerarPagamentoMensal(double valorImovel, double taxaJurosAnual, int prazoFinanciamento);


    public double gerarPagamentoTotal(double pagamentoMensal, int prazoFinanciamento) {
        double pagamentoTotal;

        pagamentoTotal = pagamentoMensal * prazoFinanciamento;
        return pagamentoTotal;
    }

    public void mostrarDados() {
        System.out.println("--- DADOS DO FINANCIAMENTO ---");
        System.out.printf("Valor do imóvel:     R$%.2f\r\n", valorImovel);
        System.out.printf("Valor da taxa de juros anual: %.2f\r\n", taxaJurosAnual);
        System.out.printf("Valor do pagamento mensal: R$%.2f\r\n", pagamentoMensal);
        System.out.printf("Valor do pagamento total: R$%.2f\r\n", pagamentoTotal);
        System.out.printf("Prazo de financiamento: %d meses\r\n", prazoFinanciamento);
    }
}
