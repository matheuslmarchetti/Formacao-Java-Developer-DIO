public class TiposVariaveis {
    
    public static void main(String [] args) {
        //tipos primitivos
        byte idade = 123;
        System.out.println(idade);
        short ano = 2021;
        System.out.println(ano);
        int cep = 21070333; //se começar com zero, talvez tenha que ser outro tipo.
        System.out.println(cep);
        long cpf = 98765432109L;//se começar com zero, talvez tenha que ser outro tipo. tipo long precisa terminar com L no final pode ser l também.
        System.out.println(cpf);
        float pi = 3.14F;//tipo float precisa terminar com F no final pode ser f também.
        System.out.println(pi);
        double salario = 2500.44;
        System.out.println(salario);
        final double VALOR_DE_PI = 3.14;//constantes em Java.
        System.out.println(VALOR_DE_PI);
        String meuNome = "Matheus Marchetti";
        System.out.println(meuNome);
    }
}
