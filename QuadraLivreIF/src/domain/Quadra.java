package domain;

import java.util.ArrayList;
import java.util.List;

public class Quadra {

    private Integer id;

    private String nome;
    private String localizacao;
    private TipoPisoEnum tipoPiso;

    private List<ModalidadeEnum> modalidadesPermitidas = new ArrayList<>();

    public Quadra(Integer id, String nome, String localizacao, TipoPisoEnum tipoPiso) {
        this.id = id;
        this.nome = nome;
        this.localizacao = localizacao;
        this.tipoPiso = tipoPiso;
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

    public String getLocalizacao() {
        return localizacao;
    }

    public void setLocalizacao(String localizacao) {
        this.localizacao = localizacao;
    }

    public TipoPisoEnum getTipoPiso() {
        return tipoPiso;
    }

    public void setTipoPiso(TipoPisoEnum tipoPiso) {
        this.tipoPiso = tipoPiso;
    }

    public List<ModalidadeEnum> getModalidadesPermitidas() {
        return modalidadesPermitidas;
    }

    public void setModalidadesPermitidas(List<ModalidadeEnum> modalidadesPermitidas) {
        this.modalidadesPermitidas = modalidadesPermitidas;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Quadra{");
        sb.append("id=").append(id);
        sb.append(", nome=").append(nome);
        sb.append(", localizacao=").append(localizacao);
        sb.append(", tipoPiso=").append(tipoPiso);
        sb.append(", modalidadesPermitidas=").append(modalidadesPermitidas);
        sb.append('}');
        return sb.toString();
    }
}
