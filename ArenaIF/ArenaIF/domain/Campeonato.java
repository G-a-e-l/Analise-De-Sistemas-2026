package domain;

import java.time.LocalDate;

public class Campeonato {

    private Integer id;

    private String nome;
    private String jogo;
    private LocalDate dataInicio;
    private LocalDate dataFim;
    private Integer quantidadeMaximaParticipantes;
    private FormatoCompeticaoEnum formato;
    private SituacaoCampeonatoEnum situacao;

    public Campeonato(Integer id, String nome, String jogo, LocalDate dataInicio, LocalDate dataFim,
                       Integer quantidadeMaximaParticipantes, FormatoCompeticaoEnum formato,
                       SituacaoCampeonatoEnum situacao) {
        this.id = id;
        this.nome = nome;
        this.jogo = jogo;
        this.dataInicio = dataInicio;
        this.dataFim = dataFim;
        this.quantidadeMaximaParticipantes = quantidadeMaximaParticipantes;
        this.formato = formato;
        this.situacao = situacao;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getJogo() {
        return jogo;
    }

    public void setJogo(String jogo) {
        this.jogo = jogo;
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

    public Integer getQuantidadeMaximaParticipantes() {
        return quantidadeMaximaParticipantes;
    }

    public void setQuantidadeMaximaParticipantes(Integer quantidadeMaximaParticipantes) {
        this.quantidadeMaximaParticipantes = quantidadeMaximaParticipantes;
    }

    public FormatoCompeticaoEnum getFormato() {
        return formato;
    }

    public void setFormato(FormatoCompeticaoEnum formato) {
        this.formato = formato;
    }

    public SituacaoCampeonatoEnum getSituacao() {
        return situacao;
    }

    public void setSituacao(SituacaoCampeonatoEnum situacao) {
        this.situacao = situacao;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Campeonato{");
        sb.append("id=").append(id);
        sb.append(", nome=").append(nome);
        sb.append(", jogo=").append(jogo);
        sb.append(", dataInicio=").append(dataInicio);
        sb.append(", dataFim=").append(dataFim);
        sb.append(", quantidadeMaximaParticipantes=").append(quantidadeMaximaParticipantes);
        sb.append(", formato=").append(formato);
        sb.append(", situacao=").append(situacao);
        sb.append('}');
        return sb.toString();
    }
}
