package modelo;

public class Terreno extends Financiamento {
    private String zona;
    public Terreno(double valorImovel, double taxaJurosAnual, int prazoFinanciamento, String zona) {
        super(valorImovel, taxaJurosAnual, prazoFinanciamento);
        this.zona = zona;
    }

    public double gerarPagamentoMensal(double valorImovel, double taxaJurosAnual, int prazoFinanciamento) {
        double pagamentoMensal;

        pagamentoMensal = (valorImovel / prazoFinanciamento) * (1 + (taxaJurosAnual/12));
        return pagamentoMensal * 1.02;
    }

    @Override
    public void mostrarDados() {
        super.mostrarDados();
        System.out.println("Tipo de financiamento: Terreno");
        System.out.println("Tipo de zona: " + zona);
        System.out.println();
    }
}
