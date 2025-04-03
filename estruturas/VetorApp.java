package estruturas;

public class VetorApp {
    public static void main(String[] args) {
        Vetor vetor = new Vetor(15);
        int[] valores = {2, 7, 9, 12, 16, 21, 27, 33, 42, 54};
        for (int valor : valores) {
            vetor.adicionar(valor);
        }

        System.out.println("Vetor inicial:");
        vetor.mostrarElementos();

        int indice = vetor.buscaBinaria(21);
        System.out.println("Busca binaria pelo valor 21: " + (indice != -1 ? "Encontrado no indice " + indice : "Nao encontrado"));

        vetor.inserirNoInicio(1);
        System.out.println("Apos inserir no inicio:");
        vetor.mostrarElementos();

        ListaDuplamenteEncadeada lista = new ListaDuplamenteEncadeada();
        for (int valor : valores) {
            lista.inserirNoFinal(valor);
        }

        System.out.println("Lista inicial:");
        lista.mostrarLista();

        lista.inserirAposValor(21, 25);
        System.out.println("Apos inserir 25 apos 21:");
        lista.mostrarLista();

        // Número de nós
        System.out.println("Numero de nos na lista: " + lista.getNumeroDeNos());
    }
}