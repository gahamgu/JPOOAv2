package modelo;

public class Casa extends Financiamento {

    public Casa(double valorImovel, double taxaJurosAnual, int prazoFinanciamento) {
        super(valorImovel, taxaJurosAnual, prazoFinanciamento);
    }

    @Override
    public double gerarPagamentoMensal(double valorImovel, double taxaJurosAnual, int prazoFinanciamento) {
        return super.gerarPagamentoMensal(valorImovel, taxaJurosAnual, prazoFinanciamento) + 80;
    }
}
