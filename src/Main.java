public class Main {
    public static void main(String[] args) {
        Carro carro = new Carro();
        carro.setCor("Preto");
        carro.setModelo("XRL8");
        carro.setCapacidadeTanque(18.30);

        System.out.println(carro.getCor());
        System.out.println(carro.getModelo());
        System.out.println(carro.getCapacidadeTanque());
        System.out.println(carro.calcularCapacidadeTotalTanque(20d));
        System.out.println(carro);
    }
}
