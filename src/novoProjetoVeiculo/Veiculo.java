package novoProjetoVeiculo;

public abstract class Veiculo {
    protected String cor;
    protected String modelo;
    protected String marca;
    protected int quantidadeRodas;

    public Veiculo() {
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getQuantidadeRodas() {
        return quantidadeRodas;
    }

    public void setQuantidadeRodas(int quantidadeRodas) {
        this.quantidadeRodas = quantidadeRodas;
    }
}
