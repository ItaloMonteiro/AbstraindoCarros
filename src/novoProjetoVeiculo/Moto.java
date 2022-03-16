package novoProjetoVeiculo;

public class Moto extends Veiculo{
    @Override
    public String toString() {
        return "Moto{" +
                "cor='" + cor + '\'' +
                ", modelo='" + modelo + '\'' +
                ", marca='" + marca + '\'' +
                ", quantidadeRodas=" + quantidadeRodas +
                '}';
    }
}
