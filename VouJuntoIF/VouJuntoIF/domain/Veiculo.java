package domain;

public class Veiculo {

    private Integer id;

    private String placa;
    private String modelo;
    private String cor;
    private Integer quantidadeMaximaPassageiros;

    public Veiculo(Integer id, String placa, String modelo, String cor, Integer quantidadeMaximaPassageiros) {
        this.id = id;
        this.placa = placa;
        this.modelo = modelo;
        this.cor = cor;
        this.quantidadeMaximaPassageiros = quantidadeMaximaPassageiros;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public Integer getQuantidadeMaximaPassageiros() {
        return quantidadeMaximaPassageiros;
    }

    public void setQuantidadeMaximaPassageiros(Integer quantidadeMaximaPassageiros) {
        this.quantidadeMaximaPassageiros = quantidadeMaximaPassageiros;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Veiculo{");
        sb.append("id=").append(id);
        sb.append(", placa=").append(placa);
        sb.append(", modelo=").append(modelo);
        sb.append(", cor=").append(cor);
        sb.append(", quantidadeMaximaPassageiros=").append(quantidadeMaximaPassageiros);
        sb.append('}');
        return sb.toString();
    }
}
