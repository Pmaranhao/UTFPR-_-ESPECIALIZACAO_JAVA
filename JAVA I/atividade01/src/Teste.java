public class Teste {

    public static void main(String[] args) {

       // Veiculo 1 está usando o construtor default da classe
       Veiculo veiculo1 = new Veiculo();
       veiculo1.setPlaca("01F1Z1");
       veiculo1.setMarca("FORD");
       veiculo1.setModelo("Ranger");
       veiculo1.setCor("Preto");
       veiculo1.setVelocMax(210);
       veiculo1.setQtdRodas(4);
       veiculo1.getMotor().setPotencia(100);
       veiculo1.getMotor().setQtdPist(6);

       // Veiculo 2 está usando o construtor com 2 parâmetros da classe
       Veiculo veiculo2 = new Veiculo("02F2Z2", "FIAT", "Palio", "Branco", 120, 4);

       //Veiculo 3 está usando o construtor que recebe os parâmetros do Veiculo e do Motor
       Veiculo veiculo3 = new Veiculo("03F3Z3", "CHEVROLET", "Cobalt", "Vermelho", 150, 4, 111, 5);

       Veiculo veiculo4 = new Veiculo("04F4Z4", "FIAT", "Argo", "Azul", 160, 4, 90, 9);
       Veiculo veiculo5 = new Veiculo("05F5Z5", "HONDA", "160 Start", "Preto", 220, 2, 80, 10);

       System.out.println(veiculo1);
       System.out.println(veiculo2);
       System.out.println(veiculo3);
       System.out.println(veiculo4);
       System.out.println(veiculo5);
    }
}
