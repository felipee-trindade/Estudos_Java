public class App {
    public static void main(String[] args) throws Exception {
        int[] lista = new int[5];

        double b = 5.555;

        lista[1] = (int) b;

        for (int i : lista) {
            System.out.println(i);
        }

        System.out.println("Olá mundo!");
    }
}
