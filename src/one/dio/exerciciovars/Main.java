package one.dio.exerciciovars;

/**
 * Classe de exemplo para o exercício da Aula 1 de Variáveis, Tipos de Dados e Operadores Aritimétricos.
 */

public class Main {

    public static void main(String[] args) {

        int i;
        // int i;
        int I;
        // int 1a;
        int _1a;
        int $aq;
        // não são boas práticas

        i = 5;
        I = 10;
        _1a = 20;
        $aq = 7;

        final int j = 10;
        // constante não se alterá valor
        int asrm24678ms = 30;
        // vars não podem ter espaço e.g: arsm 70md;
        // não é uma boa prática usar var com _ e $;
        // vars não podem conter caracteres especiais : %,*@!...;

        int quantidadeProduto = 50;
        // boa prática camelCase;
        // não é uma boa prática PascalCase;
        final int NUMERO_TENTATIVAS = 5;
        // boa prática constante UPPERCASE e separados por _ caso necessário podem ser incluídos números;
        /* int QUANTIDADE_OPCOES = 25 e int qtdProd não boas práticas
          por não colocarem final e padrão correspondente;
         */

        System.out.println(i);
        System.out.println(I);
        System.out.println(_1a);
        System.out.println($aq);

        System.out.println(j);
        System.out.println(asrm24678ms);
        System.out.println(quantidadeProduto);
        System.out.println(NUMERO_TENTATIVAS);




    }

}
