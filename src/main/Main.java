package main;

import modelo.Financiamento;
import util.InterfaceUsuario;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        InterfaceUsuario usuario = new InterfaceUsuario();

        ArrayList<Financiamento> listaFinanciamentos = new ArrayList<Financiamento>();

        listaFinanciamentos.add(new Financiamento(200000, 0.02, 12));
        listaFinanciamentos.add(new Financiamento(300000, 0.03, 24));
        listaFinanciamentos.add(new Financiamento(150000, 0.01, 6));
        listaFinanciamentos.add(new Financiamento(250000, 0.025, 18));

        double totalMoveis = 0;
        double totalFinanciamentos = 0;

        for (Financiamento f : listaFinanciamentos) {
            totalMoveis += f.getValorImovel();
            totalFinanciamentos += f.gerarPagamentoTotal(f.getValorImovel(), f.getPrazoFinanciamento());
        }

        System.out.println("--- GERENCIAR FINANCIAMENTO ---");



        System.out.printf("Valor total dos imóveis: R$%.2f\r\n", totalMoveis);
        System.out.printf("Valor total dos financiamentos: R$%.2f\r\n", totalFinanciamentos);

        }
    }