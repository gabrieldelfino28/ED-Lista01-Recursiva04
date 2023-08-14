package controller;

public class VetorNegativo {

    public VetorNegativo() {
        super();
    }

    public int FuncVet(int[] Vet, int tamanho, int qtdN) {
        // Condição de parada -> Quando tamanho for menor que zero, ou seja, quando o vetor acabar
        if (tamanho < 0) {
            return qtdN;
        }
        if (Vet[tamanho] < 0) {
            qtdN++;
        }
        return FuncVet(Vet, tamanho - 1, qtdN);

        /*
            A recursiva funciona da seguinte forma, na sua primeira chamada ela recebe o próprio vetor, o seu tamanho e a
            quantidade de Numeros negativos (variável declarada no main) E essa função recursiva começa já fazendo chamadas dela
            mesma, onde o Tamanho do vetor irá reduzindo um a um.

            Dessa forma, a função tem como objetivo percorrer todo o vetor, e irá somente adicionar ao contador de qtdN,
            quando o valor do Vetor na posição atual for menor que zero, ou seja negativo.

            O contador de Negativos, foi declarado na classe principal, pois quando ele é declaro dentro da recursiva, ele é zerado
            a cada chamada, assim passando ele como parametro da própria recursiva, é uma forma simples de evitar isso.

            E a função sempre irá começar do ultimo termo do Vetor, e irá chegar ao primeiro, reduzindo o tamanho do vetor a cada chamada, até
            chegar na condição de parada (Quando o vetor "acabar").

         */

    }
}
