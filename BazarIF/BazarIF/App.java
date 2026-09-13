import domain.*;

import java.time.LocalDate;

public class App {
    public static void main(String[] args) {

        Aluno responsavel = new Aluno(1, "Patrícia Gomes", "2023040");
        Aluno comprador = new Aluno(2, "Thiago Barbosa", "2023041");

        Campanha campanha = new Campanha(1, "Rifa da Formatura 2026",
                "Rifa para arrecadar fundos para a formatura",
                "Custear a festa de formatura", LocalDate.of(2026, 9, 1),
                LocalDate.of(2026, 11, 30), 5000.0, TipoCampanhaEnum.RIFA, responsavel);

        Produto produto = new Produto(1, "Número da Rifa", "Rifa de um smartphone",
                10.0, 200, "Rifa");
        campanha.getProdutos().add(produto);

        ItemVenda item = new ItemVenda(1, produto, 2, 10.0);

        Venda venda = new Venda(1, responsavel, comprador, LocalDate.of(2026, 9, 10),
                FormaPagamentoEnum.PIX, SituacaoVendaEnum.PAGA);
        venda.getItens().add(item);

        NumeroRifa numeroRifa = new NumeroRifa(1, campanha, 10.0, comprador, SituacaoNumeroRifaEnum.PAGO);

        System.out.println(campanha);
        System.out.println(produto);
        System.out.println(venda);
        System.out.println(numeroRifa);
    }
}
