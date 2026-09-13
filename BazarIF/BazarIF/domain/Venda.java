package domain;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Venda {

    private Integer id;

    private Aluno vendedor;
    private Aluno comprador;
    private LocalDate data;
    private FormaPagamentoEnum formaPagamento;
    private SituacaoVendaEnum situacao;

    private List<ItemVenda> itens = new ArrayList<>();

    public Venda(Integer id, Aluno vendedor, Aluno comprador, LocalDate data,
                 FormaPagamentoEnum formaPagamento, SituacaoVendaEnum situacao) {
        this.id = id;
        this.vendedor = vendedor;
        this.comprador = comprador;
        this.data = data;
        this.formaPagamento = formaPagamento;
        this.situacao = situacao;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Aluno getVendedor() {
        return vendedor;
    }

    public void setVendedor(Aluno vendedor) {
        this.vendedor = vendedor;
    }

    public Aluno getComprador() {
        return comprador;
    }

    public void setComprador(Aluno comprador) {
        this.comprador = comprador;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public FormaPagamentoEnum getFormaPagamento() {
        return formaPagamento;
    }

    public void setFormaPagamento(FormaPagamentoEnum formaPagamento) {
        this.formaPagamento = formaPagamento;
    }

    public SituacaoVendaEnum getSituacao() {
        return situacao;
    }

    public void setSituacao(SituacaoVendaEnum situacao) {
        this.situacao = situacao;
    }

    public List<ItemVenda> getItens() {
        return itens;
    }

    public void setItens(List<ItemVenda> itens) {
        this.itens = itens;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Venda{");
        sb.append("id=").append(id);
        sb.append(", vendedor=").append(vendedor);
        sb.append(", comprador=").append(comprador);
        sb.append(", data=").append(data);
        sb.append(", formaPagamento=").append(formaPagamento);
        sb.append(", situacao=").append(situacao);
        sb.append(", itens=").append(itens);
        sb.append('}');
        return sb.toString();
    }
}
