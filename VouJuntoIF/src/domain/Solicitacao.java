package domain;

import java.time.LocalDate;

public class Solicitacao {

    private Integer id;

    private Carona carona;
    private Aluno passageiro;

    private LocalDate dataSolicitacao;
    private SituacaoSolicitacaoEnum situacao;

    public Solicitacao(Integer id, Carona carona, Aluno passageiro, LocalDate dataSolicitacao,
                        SituacaoSolicitacaoEnum situacao) {
        this.id = id;
        this.carona = carona;
        this.passageiro = passageiro;
        this.dataSolicitacao = dataSolicitacao;
        this.situacao = situacao;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Carona getCarona() {
        return carona;
    }

    public void setCarona(Carona carona) {
        this.carona = carona;
    }

    public Aluno getPassageiro() {
        return passageiro;
    }

    public void setPassageiro(Aluno passageiro) {
        this.passageiro = passageiro;
    }

    public LocalDate getDataSolicitacao() {
        return dataSolicitacao;
    }

    public void setDataSolicitacao(LocalDate dataSolicitacao) {
        this.dataSolicitacao = dataSolicitacao;
    }

    public SituacaoSolicitacaoEnum getSituacao() {
        return situacao;
    }

    public void setSituacao(SituacaoSolicitacaoEnum situacao) {
        this.situacao = situacao;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Solicitacao{");
        sb.append("id=").append(id);
        sb.append(", passageiro=").append(passageiro);
        sb.append(", dataSolicitacao=").append(dataSolicitacao);
        sb.append(", situacao=").append(situacao);
        sb.append('}');
        return sb.toString();
    }
}
