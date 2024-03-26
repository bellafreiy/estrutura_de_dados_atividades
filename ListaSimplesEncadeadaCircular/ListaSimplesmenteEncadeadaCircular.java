class ListaSimplesmenteEncadeadaCircular {
    No cabeca;

    public ListaSimplesmenteEncadeadaCircular() {
        this.cabeca = null;
    }

    // Método para inserir um novo nó no início da lista
    public void inserirInicio(int dado) {
        No novoNo = new No(dado);

        if (cabeca == null) {
            cabeca = novoNo;
            cabeca.proximo = cabeca; // Fazendo a lista circular
        } else {
            No temp = cabeca;
            while (temp.proximo != cabeca) {
                temp = temp.proximo;
            }
            temp.proximo = novoNo;
            novoNo.proximo = cabeca;
            cabeca = novoNo;
        }
    }

    // Método para inserir um novo nó no final da lista
    public void inserirFinal(int dado) {
        No novoNo = new No(dado);

        if (cabeca == null) {
            cabeca = novoNo;
            cabeca.proximo = cabeca; // Fazendo a lista circular
        } else {
            No temp = cabeca;
            while (temp.proximo != cabeca) {
                temp = temp.proximo;
            }
            temp.proximo = novoNo;
            novoNo.proximo = cabeca;
        }
    }

    // Método para imprimir os elementos da lista
    public void imprimirLista() {
        if (cabeca == null) {
            System.out.println("Lista vazia");
            return;
        }
        No temp = cabeca;
        do {
            System.out.print(temp.dado + " ");
            temp = temp.proximo;
        } while (temp != cabeca);
        System.out.println();
    }
}
