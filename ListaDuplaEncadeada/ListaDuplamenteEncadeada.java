class ListaDuplamenteEncadeada {
    No cabeca;

    public ListaDuplamenteEncadeada() {
        this.cabeca = null;
    }

    // Método para inserir um novo nó no início da lista
    public void inserirInicio(int dado) {
        No novoNo = new No(dado);

        if (cabeca == null) {
            cabeca = novoNo;
        } else {
            novoNo.proximo = cabeca;
            cabeca.anterior = novoNo;
            cabeca = novoNo;
        }
    }

    // Método para inserir um novo nó no final da lista
    public void inserirFinal(int dado) {
        No novoNo = new No(dado);

        if (cabeca == null) {
            cabeca = novoNo;
        } else {
            No temp = cabeca;
            while (temp.proximo != null) {
                temp = temp.proximo;
            }
            temp.proximo = novoNo;
            novoNo.anterior = temp;
        }
    }

    // Método para imprimir os elementos da lista
    public void imprimirLista() {
        No temp = cabeca;
        while (temp != null) {
            System.out.print(temp.dado + " ");
            temp = temp.proximo;
        }
        System.out.println();
    }

    // Método para imprimir os elementos da lista em ordem reversa
    public void imprimirReverso() {
        No temp = cabeca;
        if (temp == null) {
            System.out.println("Lista vazia");
            return;
        }
        while (temp.proximo != null) {
            temp = temp.proximo;
        }
        while (temp != null) {
            System.out.print(temp.dado + " ");
            temp = temp.anterior;
        }
        System.out.println();
    }
}
