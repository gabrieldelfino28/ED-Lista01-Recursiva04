package view;

import controller.VetorNegativo;

import java.util.Random;

public class Principal {

    public static void main(String[] args) {
        VetorNegativo v = new VetorNegativo();
        Random r = new Random();

        //int[] Vet = {1, -3, 4, -5, 0, 10, -1, 5, -2, 4}; exemplo criado na mão
        int[] Vet = new int[10];

        for (int i = 0; i < 10; i++) { //Gerando valores aleatórios dentro do vetor
            Vet[i] = r.nextInt(-10, 10);
        }

        int tamanho = Vet.length - 1;

        int qntNegativo = 0;
        int res = v.FuncVet(Vet, tamanho, qntNegativo);

        System.out.println("Qtd de elementos negativos: " + res);
    }
}
