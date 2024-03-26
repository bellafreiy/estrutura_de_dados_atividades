public class Main {
    public static void main(String[] args) {
        ListaDuplamenteEncadeadaCircular lista = new ListaDuplamenteEncadeadaCircular();

        lista.inserirFinal(1);
        lista.inserirFinal(2);
        lista.inserirFinal(3);
        lista.inserirInicio(0);

        System.out.println("Lista duplamente encadeada circular:");
        lista.imprimirLista();

        System.out.println("Lista em ordem reversa:");
        lista.imprimirReverso();
    }
}