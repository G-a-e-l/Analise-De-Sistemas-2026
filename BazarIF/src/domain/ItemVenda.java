package domain;

public class ItemVenda {

    private Integer id;

    private Produto produto;
    private Integer quantidade;
    private Double precoUnitarioPraticado;

    public ItemVenda(Integer id, Produto produto, Integer quantidade, Double precoUnitarioPraticado) {
        this.id = id;
        this.produto = produto;
        this.quantidade = quantidade;
        this.precoUnitarioPraticado = precoUnitarioPraticado;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }

    public Double getPrecoUnitarioPraticado() {
        return precoUnitarioPraticado;
    }

    public void setPrecoUnitarioPraticado(Double precoUnitarioPraticado) {
        this.precoUnitarioPraticado = precoUnitarioPraticado;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ItemVenda{");
        sb.append("id=").append(id);
        sb.append(", produto=").append(produto);
        sb.append(", quantidade=").append(quantidade);
        sb.append(", precoUnitarioPraticado=").append(precoUnitarioPraticado);
        sb.append('}');
        return sb.toString();
    }
}
