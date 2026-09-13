package domain;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class Carona {

    private Integer id;

    private Aluno motorista;
    private Veiculo veiculo;

    private String localSaida;
    private String destino;
    private LocalDate data;
    private LocalTime horario;
    private Integer quantidadeVagas;
    private SituacaoCaronaEnum situacao;

    private List<Solicitacao> solicitacoes = new ArrayList<>();

    public Carona(Integer id, Aluno motorista, Veiculo veiculo, String localSaida, String destino,
                  LocalDate data, LocalTime horario, Integer quantidadeVagas, SituacaoCaronaEnum situacao) {
        this.id = id;
        this.motorista = motorista;
        this.veiculo = veiculo;
        this.localSaida = localSaida;
        this.destino = destino;
        this.data = data;
        this.horario = horario;
        this.quantidadeVagas = quantidadeVagas;
        this.situacao = situacao;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Aluno getMotorista() {
        return motorista;
    }

    public void setMotorista(Aluno motorista) {
        this.motorista = motorista;
    }

    public Veiculo getVeiculo() {
        return veiculo;
    }

    public void setVeiculo(Veiculo veiculo) {
        this.veiculo = veiculo;
    }

    public String getLocalSaida() {
        return localSaida;
    }

    public void setLocalSaida(String localSaida) {
        this.localSaida = localSaida;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public LocalTime getHorario() {
        return horario;
    }

    public void setHorario(LocalTime horario) {
        this.horario = horario;
    }

    public Integer getQuantidadeVagas() {
        return quantidadeVagas;
    }

    public void setQuantidadeVagas(Integer quantidadeVagas) {
        this.quantidadeVagas = quantidadeVagas;
    }

    public SituacaoCaronaEnum getSituacao() {
        return situacao;
    }

    public void setSituacao(SituacaoCaronaEnum situacao) {
        this.situacao = situacao;
    }

    public List<Solicitacao> getSolicitacoes() {
        return solicitacoes;
    }

    public void setSolicitacoes(List<Solicitacao> solicitacoes) {
        this.solicitacoes = solicitacoes;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Carona{");
        sb.append("id=").append(id);
        sb.append(", motorista=").append(motorista);
        sb.append(", veiculo=").append(veiculo);
        sb.append(", localSaida=").append(localSaida);
        sb.append(", destino=").append(destino);
        sb.append(", data=").append(data);
        sb.append(", horario=").append(horario);
        sb.append(", quantidadeVagas=").append(quantidadeVagas);
        sb.append(", situacao=").append(situacao);
        sb.append('}');
        return sb.toString();
    }
}
