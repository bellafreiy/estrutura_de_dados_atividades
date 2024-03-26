public class Main {
    public static void main(String[] args) {
        ListaDuplamenteEncadeada lista = new ListaDuplamenteEncadeada();

        lista.inserirFinal(1);
        lista.inserirFinal(2);
        lista.inserirFinal(3);
        lista.inserirFinal(4);
        lista.inserirInicio(0);

        System.out.println("Lista duplamente encadeada:");
        lista.imprimirLista();

        System.out.println("Lista em ordem reversa:");
        lista.imprimirReverso();
    }
}