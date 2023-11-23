package main;

import modelo.Apartamento;
import modelo.Casa;
import modelo.Financiamento;
import modelo.Terreno;
import util.InterfaceUsuario;

import java.sql.SQLOutput;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        InterfaceUsuario usuario = new InterfaceUsuario();
        System.out.println("--- GERENCIAR FINANCIAMENTO ---");
        double valorImovel = usuario.pedirValorImovel();
        double taxa = usuario.pedirTaxa();
        int anos = usuario.pedirPrazo();

        Financiamento fin = new Financiamento(valorImovel, taxa, anos);
        System.out.println("Pagamento mensal: R$" + fin.gerarPagamentoMensal(valorImovel, taxa, anos));
        System.out.println("Pagamento total: R$" + fin.gerarPagamentoTotal(fin.gerarPagamentoMensal(valorImovel, taxa, anos), anos));


        ArrayList<Financiamento> listaFinanciamentos = new ArrayList<Financiamento>();

        listaFinanciamentos.add(new Casa(200000, 0.02, 12));
        listaFinanciamentos.add(new Casa(300000, 0.03, 24));
        listaFinanciamentos.add(new Apartamento(150000, 0.01, 6));
        listaFinanciamentos.add(new Apartamento(250000, 0.025, 18));
        listaFinanciamentos.add(new Terreno(150000, 0.01, 6));
        listaFinanciamentos.add(new Terreno(250000, 0.025, 18));

        double totalMoveis = 0;
        double totalFinanciamentos = 0;

        for (Financiamento f : listaFinanciamentos) {
            totalMoveis += f.getValorImovel();
            totalFinanciamentos += f.gerarPagamentoTotal(f.getValorImovel(), f.getPrazoFinanciamento());
        }

        System.out.printf("Valor total dos imóveis: R$%.2f\r\n", totalMoveis);
        System.out.printf("Valor total dos financiamentos: R$%.2f\r\n", totalFinanciamentos);

        }
    }