package novoProjetoVeiculo;

public class Caminhao extends Veiculo {

    @Override
    public String toString() {
        return "Caminhao{" +
                "cor='" + cor + '\'' +
                ", modelo='" + modelo + '\'' +
                ", marca='" + marca + '\'' +
                ", quantidadeRodas=" + quantidadeRodas +
                '}';
    }
}
