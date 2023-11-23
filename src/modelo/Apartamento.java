package modelo;

public class Apartamento extends Financiamento {
    public Apartamento(double valorImovel, double taxaJurosAnual, int prazoFinanciamento) {
        super(valorImovel, taxaJurosAnual, prazoFinanciamento);
    }

    @Override
    public double gerarPagamentoMensal(double valorImovel, double taxaJurosAnual, int prazoFinanciamentoEmAnos) {
        double taxaMensal = taxaJurosAnual/12;
        int meses = prazoFinanciamentoEmAnos * 12;

        return valorImovel * taxaMensal * Math.pow((1 + taxaMensal), meses) / Math.pow((1 + taxaMensal),  meses) - 1;
    }
}
