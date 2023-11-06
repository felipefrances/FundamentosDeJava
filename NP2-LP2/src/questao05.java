public class questao05 {

    public static void PrimeiroMetodo(){
        System.out.println("Inicio da Execução do primeiro método!");
        SegundoMetodo();
        System.out.println("Fim da execução do primeiro método");
    }

    public static void SegundoMetodo() {
        System.out.println("Inicio da execução do segundo método!");
        double[] v = new double[5];

        try {
            for (int i = 0; i <= 10; i++) {
                v[i] = i;
                System.out.println(i);
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Fim da execução do segundo método!");
        }
    }
    public static void main(String[] args) {
        System.out.println("Inicio da main");
        PrimeiroMetodo();
        System.out.println("Fim da main");
    }
}
