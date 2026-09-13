package domain;

public class Estudante {

    private Integer id;

    private String nome;
    private String cpf;
    private String matricula;
    private String curso;
    private String endereco;
    private TurnoEnum turno;

    public Estudante(Integer id, String nome, String cpf, String matricula, String curso,
                      String endereco, TurnoEnum turno) {
        this.id = id;
        this.nome = nome;
        this.cpf = cpf;
        this.matricula = matricula;
        this.curso = curso;
        this.endereco = endereco;
        this.turno = turno;
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

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public TurnoEnum getTurno() {
        return turno;
    }

    public void setTurno(TurnoEnum turno) {
        this.turno = turno;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Estudante{");
        sb.append("id=").append(id);
        sb.append(", nome=").append(nome);
        sb.append(", cpf=").append(cpf);
        sb.append(", matricula=").append(matricula);
        sb.append(", curso=").append(curso);
        sb.append(", endereco=").append(endereco);
        sb.append(", turno=").append(turno);
        sb.append('}');
        return sb.toString();
    }
}
