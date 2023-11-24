// PERTENCE AO PACOTE
package modelo;

// IMPORTA AS CLASSES
import java.io.Serializable;

// SUPER CLASSE ABSTRATA - FINANCIAMENTOS
public abstract class Financiamento implements Serializable {
    // VARIÁVEIS
    protected double valorImovel;
    protected double taxaJurosAnual;
    protected int prazoFinanciamento;
    protected double pagamentoMensal;
    protected double pagamentoTotal;

    // GETTERS
    public double getValorImovel() {
        return valorImovel;
    }
    public double getTaxaJurosAnual() {
        return taxaJurosAnual;
    }
    public int getPrazoFinanciamento() {
        return prazoFinanciamento;
    }
    public double getPagamentoMensal() {
        return pagamentoMensal;
    }
    public double getPagamentoTotal() { return pagamentoTotal; }

    // MÉTODO CONSTRUTOR
    public Financiamento(double valorImovel, double taxaJurosAnual, int prazoFinanciamento) {
        this.valorImovel = valorImovel;
        this.taxaJurosAnual = taxaJurosAnual;
        this.prazoFinanciamento = prazoFinanciamento;
        this.pagamentoMensal = gerarPagamentoMensal(valorImovel, taxaJurosAnual, prazoFinanciamento);
        this.pagamentoTotal = pagamentoMensal * prazoFinanciamento;
    }

    // MÉTODO ABSTRATO
    public abstract double gerarPagamentoMensal(double valorImovel, double taxaJurosAnual, int prazoFinanciamento);

    // MÉTODO CONCRETO (MOSTRAR OS DADOS)
    public void mostrarDados() {
        System.out.println("--- DADOS DO FINANCIAMENTO ---");
        System.out.printf("Valor do imóvel: R$%.2f\r\n", valorImovel);
        System.out.printf("Valor da taxa de juros anual: %.2f\r\n", taxaJurosAnual);
        System.out.printf("Valor do pagamento mensal: R$%.2f\r\n", pagamentoMensal);
        System.out.printf("Valor do pagamento total: R$%.2f\r\n", pagamentoTotal);
        System.out.printf("Prazo de financiamento: %d meses\r\n", prazoFinanciamento);
    }

    // OUTRO MÉTODO CONCRETO (GERAR STRING)
    public String gerarDados() {
        StringBuilder sb = new StringBuilder();
        sb.append("--- DADOS DO FINANCIAMENTO ---\r\n");
        sb.append(String.format("Valor do imóvel:     R$%.2f\r\n", valorImovel));
        sb.append(String.format("Valor da taxa de juros anual: %.2f\r\n", taxaJurosAnual));
        sb.append(String.format("Valor do pagamento mensal: R$%.2f\r\n", pagamentoMensal));
        sb.append(String.format("Valor do pagamento total: R$%.2f\r\n", pagamentoTotal));
        sb.append(String.format("Prazo de financiamento: %d meses\r\n", prazoFinanciamento));
        sb.append('\n');

        return sb.toString();
    }

}
