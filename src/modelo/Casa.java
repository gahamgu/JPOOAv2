// PERTENCE AO PACOTE
package modelo;

// HERDA A SUPER CLASSE ABSTRATA FINANCIAMENTO
public class Casa extends Financiamento {
    // VARIÁVEIS
    private double areaConstruida;
    private double tamanhoTerreno;

    // MÉTODO CONSTRUTOR
    public Casa(double valorImovel, double taxaJurosAnual, int prazoFinanciamento, double areaConstruida, double tamanhoTerreno) {
        super(valorImovel, taxaJurosAnual, prazoFinanciamento);
        this.areaConstruida = areaConstruida;
        this.tamanhoTerreno = tamanhoTerreno;
    }

    // GETTERS
    public double getAreaConstruida() { return areaConstruida; }
    public double getTamanhoTerreno() { return tamanhoTerreno; }

    // DEFINE O MÉTODO ABSTRATO PARA CASA
    @Override
    public double gerarPagamentoMensal(double valorImovel, double taxaJurosAnual, int prazoFinanciamento) {
        return (valorImovel / prazoFinanciamento) * (1 + (taxaJurosAnual/12)) + 80;
    }

    // REDEFINE OS MÉTODOS PARA CASAS
    @Override
    public void mostrarDados() {
        super.mostrarDados();
        System.out.println("Tipo de Financiamento: Casa");
        System.out.println("Tamanho do Terreno: " + tamanhoTerreno);
        System.out.println("Área Construída: " + areaConstruida);
        System.out.println();
    }

    @Override
    public String gerarDados() {
        StringBuilder sb = new StringBuilder();
        sb.append("- DADOS DO FINANCIAMENTO:\r\n");
        sb.append(String.format("Tipo de Financiamento: Casa\r\n"));
        sb.append(String.format("Tamanho do Terreno: %.2f metros quadrados\r\n", tamanhoTerreno));
        sb.append(String.format("Área Construída: %.2f metros quadrados\r\n", areaConstruida));
        sb.append(String.format("Valor do imóvel: R$%.2f\r\n", valorImovel));
        sb.append(String.format("Valor da taxa de juros anual: %.2f\r\n", taxaJurosAnual));
        sb.append(String.format("Valor do pagamento mensal: R$%.2f\r\n", pagamentoMensal));
        sb.append(String.format("Valor do pagamento total: R$%.2f\r\n", pagamentoTotal));
        sb.append(String.format("Prazo de financiamento: %d meses\r\n", prazoFinanciamento));
        sb.append('\n');

        return sb.toString();
    }

}
