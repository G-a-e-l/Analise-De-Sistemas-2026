package domain;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class Agendamento {

    private Integer id;

    private Quadra quadra;
    private ModalidadeEnum modalidade;

    private LocalDate data;
    private LocalTime horarioInicial;
    private LocalTime horarioFinal;
    private SituacaoAgendamentoEnum situacao;

    private List<Aluno> participantes = new ArrayList<>();

    public Agendamento(Integer id, Quadra quadra, ModalidadeEnum modalidade, LocalDate data,
                        LocalTime horarioInicial, LocalTime horarioFinal, SituacaoAgendamentoEnum situacao) {
        this.id = id;
        this.quadra = quadra;
        this.modalidade = modalidade;
        this.data = data;
        this.horarioInicial = horarioInicial;
        this.horarioFinal = horarioFinal;
        this.situacao = situacao;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Quadra getQuadra() {
        return quadra;
    }

    public void setQuadra(Quadra quadra) {
        this.quadra = quadra;
    }

    public ModalidadeEnum getModalidade() {
        return modalidade;
    }

    public void setModalidade(ModalidadeEnum modalidade) {
        this.modalidade = modalidade;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public LocalTime getHorarioInicial() {
        return horarioInicial;
    }

    public void setHorarioInicial(LocalTime horarioInicial) {
        this.horarioInicial = horarioInicial;
    }

    public LocalTime getHorarioFinal() {
        return horarioFinal;
    }

    public void setHorarioFinal(LocalTime horarioFinal) {
        this.horarioFinal = horarioFinal;
    }

    public SituacaoAgendamentoEnum getSituacao() {
        return situacao;
    }

    public void setSituacao(SituacaoAgendamentoEnum situacao) {
        this.situacao = situacao;
    }

    public List<Aluno> getParticipantes() {
        return participantes;
    }

    public void setParticipantes(List<Aluno> participantes) {
        this.participantes = participantes;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Agendamento{");
        sb.append("id=").append(id);
        sb.append(", quadra=").append(quadra);
        sb.append(", modalidade=").append(modalidade);
        sb.append(", data=").append(data);
        sb.append(", horarioInicial=").append(horarioInicial);
        sb.append(", horarioFinal=").append(horarioFinal);
        sb.append(", situacao=").append(situacao);
        sb.append(", participantes=").append(participantes);
        sb.append('}');
        return sb.toString();
    }
}
