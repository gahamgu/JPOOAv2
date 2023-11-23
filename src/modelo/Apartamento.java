package modelo;

public class Apartamento extends Financiamento {
    private int numeroVagas;
    private int andar;
    public Apartamento(double valorImovel, double taxaJurosAnual, int prazoFinanciamento, int numeroVagas, int andar) {
        super(valorImovel, taxaJurosAnual, prazoFinanciamento);
        this.numeroVagas = numeroVagas;
        this.andar = andar;
    }

    public double gerarPagamentoMensal(double valorImovel, double taxaJurosAnual, int prazoFinanciamentoEmAnos) {
        double taxaMensal = taxaJurosAnual/12;
        int meses = prazoFinanciamentoEmAnos * 12;

        return valorImovel * taxaMensal * Math.pow((1 + taxaMensal), meses) / Math.pow((1 + taxaMensal),  meses) - 1;
    }

    @Override
    public void mostrarDados() {
        super.mostrarDados();
        System.out.println("Tipo de financiamento: Apartamento");
        System.out.println("Andar: " + andar);
        System.out.println("Número de Vagas: " + numeroVagas);
        System.out.println();
    }
}
