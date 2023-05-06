public class MinhaClasse {
    public static void main(String [] args) {
        String primeiroNome = "Matheus";
        String segundoNome = "Marchetti";

        String nomecompleto = nomeCompleto(primeiroNome, segundoNome);

        System.out.println(nomecompleto);
    }
    public static String nomeCompleto(String primeiroNome, String segundoNome) {
        return "Resultado do método " + primeiroNome.concat(" ").concat(segundoNome);
    }
}