package domain;

public class InscricaoCampeonato {

    private Integer id;

    private Campeonato campeonato;
    private Aluno aluno;
    private Equipe equipe;

    public InscricaoCampeonato(Integer id, Campeonato campeonato, Aluno aluno, Equipe equipe) {
        this.id = id;
        this.campeonato = campeonato;
        this.aluno = aluno;
        this.equipe = equipe;
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

    public Aluno getAluno() {
        return aluno;
    }

    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }

    public Equipe getEquipe() {
        return equipe;
    }

    public void setEquipe(Equipe equipe) {
        this.equipe = equipe;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("InscricaoCampeonato{");
        sb.append("id=").append(id);
        sb.append(", aluno=").append(aluno);
        sb.append(", equipe=").append(equipe);
        sb.append('}');
        return sb.toString();
    }
}
