public class ResultadoEscolar {
    public static void main(String[] args) {
        int nota = 8;

        String resultado = nota >= 7 ? "Aprovado" : (nota >= 5) ? "Prova de recuperação" : "Reprovado";

        System.out.println(resultado);
    }
}
