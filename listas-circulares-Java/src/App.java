public class App {
    public static void main(String[] args) throws Exception {
        ListaCircular<String> minhaListaCircular = new ListaCircular<>();
        minhaListaCircular.add("c0");
        minhaListaCircular.add("c1");
        minhaListaCircular.add("c2");
        minhaListaCircular.add("c3");
        minhaListaCircular.add("c4");
        System.out.println(minhaListaCircular);

        minhaListaCircular.remove(0);
        System.out.println(minhaListaCircular);

        minhaListaCircular.add("novoNó");
        System.out.println(minhaListaCircular);

        System.out.println(minhaListaCircular.get(5));
        System.out.println(minhaListaCircular.get(6));
    }
}
