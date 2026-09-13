package domain;

import java.time.LocalDate;

public class Partida {

    private Integer id;

    private Campeonato campeonato;
    private InscricaoCampeonato competidor1;
    private InscricaoCampeonato competidor2;

    private LocalDate data;
    private Integer rodada;
    private Integer pontuacaoCompetidor1;
    private Integer pontuacaoCompetidor2;
    private SituacaoPartidaEnum situacao;

    public Partida(Integer id, Campeonato campeonato, InscricaoCampeonato competidor1,
                    InscricaoCampeonato competidor2, LocalDate data, Integer rodada,
                    Integer pontuacaoCompetidor1, Integer pontuacaoCompetidor2,
                    SituacaoPartidaEnum situacao) {
        this.id = id;
        this.campeonato = campeonato;
        this.competidor1 = competidor1;
        this.competidor2 = competidor2;
        this.data = data;
        this.rodada = rodada;
        this.pontuacaoCompetidor1 = pontuacaoCompetidor1;
        this.pontuacaoCompetidor2 = pontuacaoCompetidor2;
        this.situacao = situacao;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Campeonato getCampeonato() {
        return campeonato;
    }

    public void setCampeonato(Campeonato campeonato) {
        this.campeonato = campeonato;
    }

    public InscricaoCampeonato getCompetidor1() {
        return competidor1;
    }

    public void setCompetidor1(InscricaoCampeonato competidor1) {
        this.competidor1 = competidor1;
    }

    public InscricaoCampeonato getCompetidor2() {
        return competidor2;
    }

    public void setCompetidor2(InscricaoCampeonato competidor2) {
        this.competidor2 = competidor2;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public Integer getRodada() {
        return rodada;
    }

    public void setRodada(Integer rodada) {
        this.rodada = rodada;
    }

    public Integer getPontuacaoCompetidor1() {
        return pontuacaoCompetidor1;
    }

    public void setPontuacaoCompetidor1(Integer pontuacaoCompetidor1) {
        this.pontuacaoCompetidor1 = pontuacaoCompetidor1;
    }

    public Integer getPontuacaoCompetidor2() {
        return pontuacaoCompetidor2;
    }

    public void setPontuacaoCompetidor2(Integer pontuacaoCompetidor2) {
        this.pontuacaoCompetidor2 = pontuacaoCompetidor2;
    }

    public SituacaoPartidaEnum getSituacao() {
        return situacao;
    }

    public void setSituacao(SituacaoPartidaEnum situacao) {
        this.situacao = situacao;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Partida{");
        sb.append("id=").append(id);
        sb.append(", competidor1=").append(competidor1);
        sb.append(", competidor2=").append(competidor2);
        sb.append(", data=").append(data);
        sb.append(", rodada=").append(rodada);
        sb.append(", pontuacaoCompetidor1=").append(pontuacaoCompetidor1);
        sb.append(", pontuacaoCompetidor2=").append(pontuacaoCompetidor2);
        sb.append(", situacao=").append(situacao);
        sb.append('}');
        return sb.toString();
    }
}
