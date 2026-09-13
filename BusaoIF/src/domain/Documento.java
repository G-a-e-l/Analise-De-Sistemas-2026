package domain;

import java.time.LocalDate;

public class Documento {

    private Integer id;

    private String nome;
    private LocalDate dataEnvio;
    private SituacaoDocumentoEnum situacao;

    public Documento(Integer id, String nome, LocalDate dataEnvio, SituacaoDocumentoEnum situacao) {
        this.id = id;
        this.nome = nome;
        this.dataEnvio = dataEnvio;
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

    public LocalDate getDataEnvio() {
        return dataEnvio;
    }

    public void setDataEnvio(LocalDate dataEnvio) {
        this.dataEnvio = dataEnvio;
    }

    public SituacaoDocumentoEnum getSituacao() {
        return situacao;
    }

    public void setSituacao(SituacaoDocumentoEnum situacao) {
        this.situacao = situacao;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Documento{");
        sb.append("id=").append(id);
        sb.append(", nome=").append(nome);
        sb.append(", dataEnvio=").append(dataEnvio);
        sb.append(", situacao=").append(situacao);
        sb.append('}');
        return sb.toString();
    }
}
