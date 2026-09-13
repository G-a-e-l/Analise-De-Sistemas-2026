package domain;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Campanha {

    private Integer id;

    private String titulo;
    private String descricao;
    private String objetivo;
    private LocalDate dataInicio;
    private LocalDate dataFim;
    private Double metaFinanceira;
    private TipoCampanhaEnum tipo;
    private Aluno responsavel;

    private List<Produto> produtos = new ArrayList<>();

    public Campanha(Integer id, String titulo, String descricao, String objetivo, LocalDate dataInicio,
                     LocalDate dataFim, Double metaFinanceira, TipoCampanhaEnum tipo, Aluno responsavel) {
        this.id = id;
        this.titulo = titulo;
        this.descricao = descricao;
        this.objetivo = objetivo;
        this.dataInicio = dataInicio;
        this.dataFim = dataFim;
        this.metaFinanceira = metaFinanceira;
        this.tipo = tipo;
        this.responsavel = responsavel;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getObjetivo() {
        return objetivo;
    }

    public void setObjetivo(String objetivo) {
        this.objetivo = objetivo;
    }

    public LocalDate getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(LocalDate dataInicio) {
        this.dataInicio = dataInicio;
    }

    public LocalDate getDataFim() {
        return dataFim;
    }

    public void setDataFim(LocalDate dataFim) {
        this.dataFim = dataFim;
    }

    public Double getMetaFinanceira() {
        return metaFinanceira;
    }

    public void setMetaFinanceira(Double metaFinanceira) {
        this.metaFinanceira = metaFinanceira;
    }

    public TipoCampanhaEnum getTipo() {
        return tipo;
    }

    public void setTipo(TipoCampanhaEnum tipo) {
        this.tipo = tipo;
    }

    public Aluno getResponsavel() {
        return responsavel;
    }

    public void setResponsavel(Aluno responsavel) {
        this.responsavel = responsavel;
    }

    public List<Produto> getProdutos() {
        return produtos;
    }

    public void setProdutos(List<Produto> produtos) {
        this.produtos = produtos;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Campanha{");
        sb.append("id=").append(id);
        sb.append(", titulo=").append(titulo);
        sb.append(", descricao=").append(descricao);
        sb.append(", objetivo=").append(objetivo);
        sb.append(", dataInicio=").append(dataInicio);
        sb.append(", dataFim=").append(dataFim);
        sb.append(", metaFinanceira=").append(metaFinanceira);
        sb.append(", tipo=").append(tipo);
        sb.append(", responsavel=").append(responsavel);
        sb.append(", produtos=").append(produtos);
        sb.append('}');
        return sb.toString();
    }
}
