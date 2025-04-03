package estruturas;

public class ListaDuplamenteEncadeada {

    private class No {
        int valor;
        No anterior;
        No proximo;

        No(int valor) {
            this.valor = valor;
        }
    }

    private No inicio;
    private No fim;
    private int tamanho;

    public ListaDuplamenteEncadeada() {
        this.inicio = null;
        this.fim = null;
        this.tamanho = 0;
    }

    public void inserirNoFinal(int valor) {
        No novoNo = new No(valor);
        if (inicio == null) {
            inicio = fim = novoNo;
        } else {
            fim.proximo = novoNo;
            novoNo.anterior = fim;
            fim = novoNo;
        }
        tamanho++;
    }

    public int getNumeroDeNos() {
        return tamanho;
    }

    public void inserirAposValor(int valorReferencia, int novoValor) {
        No atual = inicio;
        while (atual != null) {
            if (atual.valor == valorReferencia) {
                No novoNo = new No(novoValor);
                novoNo.proximo = atual.proximo;
                novoNo.anterior = atual;
                if (atual.proximo != null) {
                    atual.proximo.anterior = novoNo;
                } else {
                    fim = novoNo;
                }
                atual.proximo = novoNo;
                tamanho++;
                return;
            }
            atual = atual.proximo;
        }
        System.out.println("Valor de referencia nao encontrado.");
    }

    public void mostrarLista() {
        No atual = inicio;
        while (atual != null) {
            System.out.print(atual.valor + " ");
            atual = atual.proximo;
        }
        System.out.println();
    }

    public void inserirAposAtual(No atual, int valor) {
        if (atual == null) return;
        No novoNo = new No(valor);
        novoNo.proximo = atual.proximo;
        novoNo.anterior = atual;
        if (atual.proximo != null) {
            atual.proximo.anterior = novoNo;
        } else {
            fim = novoNo;
        }
        atual.proximo = novoNo;
        tamanho++;
    }

    public void removerAposAtual(No atual) {
        if (atual == null || atual.proximo == null) return;
        No removido = atual.proximo;
        atual.proximo = removido.proximo;
        if (removido.proximo != null) {
            removido.proximo.anterior = atual;
        } else {
            fim = atual;
        }
        tamanho--;
    }

    public void inserirAntesAtual(No atual, int valor) {
        if (atual == null) return;
        No novoNo = new No(valor);
        novoNo.proximo = atual;
        novoNo.anterior = atual.anterior;
        if (atual.anterior != null) {
            atual.anterior.proximo = novoNo;
        } else {
            inicio = novoNo;
        }
        atual.anterior = novoNo;
        tamanho++;
    }

    public void removerAntesAtual(No atual) {
        if (atual == null || atual.anterior == null) return;
        No removido = atual.anterior;
        atual.anterior = removido.anterior;
        if (removido.anterior != null) {
            removido.anterior.proximo = atual;
        } else {
            inicio = atual;
        }
        tamanho--;
    }
}