package modelo;

public class Casa extends Financiamento {
    private double areaConstruida;
    private double tamanhoTerreno;
    public Casa(double valorImovel, double taxaJurosAnual, int prazoFinanciamento, double areaConstruida, double tamanhoTerreno) {
        super(valorImovel, taxaJurosAnual, prazoFinanciamento);
        this.areaConstruida = areaConstruida;
        this.tamanhoTerreno = tamanhoTerreno;
    }

    @Override
    public double gerarPagamentoMensal(double valorImovel, double taxaJurosAnual, int prazoFinanciamento) {
        return (valorImovel / prazoFinanciamento) * (1 + (taxaJurosAnual/12)) + 80;
    }

    @Override
    public void mostrarDados() {
        super.mostrarDados();
        System.out.println("Tipo de financiamento: Casa");
        System.out.println("Tamanho do terreno: " + tamanhoTerreno);
        System.out.println("Área Construída: " + areaConstruida);
        System.out.println();
    }

}
