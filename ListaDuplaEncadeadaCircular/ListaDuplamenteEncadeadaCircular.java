class ListaDuplamenteEncadeadaCircular {
    No cabeca;

    public ListaDuplamenteEncadeadaCircular() {
        this.cabeca = null;
    }

    // Método para inserir um novo nó no início da lista
    public void inserirInicio(int dado) {
        No novoNo = new No(dado);

        if (cabeca == null) {
            cabeca = novoNo;
            cabeca.proximo = cabeca;
            cabeca.anterior = cabeca;
        } else {
            novoNo.proximo = cabeca;
            novoNo.anterior = cabeca.anterior;
            cabeca.anterior.proximo = novoNo;
            cabeca.anterior = novoNo;
            cabeca = novoNo;
        }
    }

    // Método para inserir um novo nó no final da lista
    public void inserirFinal(int dado) {
        No novoNo = new No(dado);

        if (cabeca == null) {
            cabeca = novoNo;
            cabeca.proximo = cabeca;
            cabeca.anterior = cabeca;
        } else {
            novoNo.proximo = cabeca;
            novoNo.anterior = cabeca.anterior;
            cabeca.anterior.proximo = novoNo;
            cabeca.anterior = novoNo;
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

    // Método para imprimir os elementos da lista em ordem reversa
    public void imprimirReverso() {
        if (cabeca == null) {
            System.out.println("Lista vazia");
            return;
        }
        No temp = cabeca.anterior;
        do {
            System.out.print(temp.dado + " ");
            temp = temp.anterior;
        } while (temp != cabeca.anterior);
        System.out.println();
    }
}
