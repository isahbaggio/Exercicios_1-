package estruturas;

import java.util.Arrays;

public class Vetor {
    private int[] elementos;
    private int tamanho;

    public Vetor(int capacidade) {
        this.elementos = new int[capacidade];
        this.tamanho = 0;
    }

    public void adicionar(int elemento) {
        if (tamanho < elementos.length) {
            elementos[tamanho++] = elemento;
        } else {
            System.out.println("Vetor cheio!");
        }
    }

    public void inserirNoInicio(int elemento) {
        if (tamanho < elementos.length) {
            for (int i = tamanho; i > 0; i--) {
                elementos[i] = elementos[i - 1];
            }
            elementos[0] = elemento;
            tamanho++;
        } else {
            System.out.println("Vetor cheio!");
        }
    }

    public int buscaBinaria(int valor) {
        int inicio = 0, fim = tamanho - 1;
        while (inicio <= fim) {
            int meio = (inicio + fim) / 2;
            if (elementos[meio] == valor) {
                return meio;
            } else if (elementos[meio] < valor) {
                inicio = meio + 1;
            } else {
                fim = meio - 1;
            }
        }
        return -1;
    }

    public void mostrarElementos() {
        System.out.println(Arrays.toString(Arrays.copyOf(elementos, tamanho)));
    }
}