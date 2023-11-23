package modelo;

public class Terreno extends Apartamento {
    public Terreno(double valorImovel, double taxaJurosAnual, int prazoFinanciamento) {
        super(valorImovel, taxaJurosAnual, prazoFinanciamento);
    }

    @Override
    public double gerarPagamentoMensal(double valorImovel, double taxaJurosAnual, int prazoFinanciamento) {
        double pagamentoMensal;

        pagamentoMensal = (valorImovel / prazoFinanciamento) * (1 + (taxaJurosAnual/12));
        return pagamentoMensal * 1.02;
    }
}
