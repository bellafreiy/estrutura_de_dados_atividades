public class Main {
    public static void main(String[] args) {
        ListaSimplesmenteEncadeadaCircular lista = new ListaSimplesmenteEncadeadaCircular();

        lista.inserirFinal(1);
        lista.inserirFinal(2);
        lista.inserirFinal(3);
        lista.inserirInicio(0);

        System.out.println("Lista simplesmente encadeada circular:");
        lista.imprimirLista();
    }
}