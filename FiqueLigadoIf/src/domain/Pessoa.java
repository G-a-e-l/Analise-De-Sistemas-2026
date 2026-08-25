package domain;

public class Pessoa {

   private Integer id; 
   private String nome; 
   private String linkFoto;
   private String biografia;
   private String email;

    public Pessoa(String biografia, String email, Integer id, String linkFoto, String nome) {
        this.biografia = biografia;
        this.email = email;
        this.id = id;
        this.linkFoto = linkFoto;
        this.nome = nome;
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

    public String getLinkFoto() {
        return linkFoto;
    }

    public void setLinkFoto(String linkFoto) {
        this.linkFoto = linkFoto;
    }

    public String getBiografia() {
        return biografia;
    }

    public void setBiografia(String biografia) {
        this.biografia = biografia;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Pessoa [id=" + id + ", nome=" + nome + ", linkFoto=" + linkFoto + ", biografia=" + biografia
                + ", email=" + email + "]";
    }







}
