public class App {
    public static void main(String[] args) throws Exception {
        Fila<String> minhaFila = new Fila<>();
        minhaFila.enqueue("1");
        minhaFila.enqueue("true");
        minhaFila.enqueue("terceiro");
        minhaFila.enqueue("quarto");

        System.out.println(minhaFila);
        System.out.println(minhaFila.dequeue());
        System.out.println(minhaFila);

        minhaFila.enqueue("ultimo");

        System.out.println(minhaFila);
        System.out.println(minhaFila.first());
        System.out.println(minhaFila);
    }
}
