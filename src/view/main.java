package view;

import controller.Ex7;

public class main {
    public static void main(String[] args) {
        int num = 11111112;

        int soma = Ex7.somaDigitos(num);

        System.out.printf("A soma dos digitos de %d é: %d", num, soma);
    }
}
