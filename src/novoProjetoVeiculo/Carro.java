package novoProjetoVeiculo;

public class Carro extends Veiculo{

    @Override
    public String toString() {
        return "Carro{" +
                "cor='" + cor + '\'' +
                ", modelo='" + modelo + '\'' +
                ", marca='" + marca + '\'' +
                ", quantidadeRodas=" + quantidadeRodas +
                '}';
    }
}
