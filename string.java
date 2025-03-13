// Classe para manipulação de strings
import java.util.Scanner;

class ManipulaString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite uma string: ");
        String entrada = scanner.nextLine();

        int numCaracteres = entrada.length();
        String maiusculo = entrada.toUpperCase();
        int numVogais = entrada.replaceAll("(?i)[^aeiou]", "").length();
        boolean comecaComUni = entrada.toLowerCase().startsWith("uni");
        boolean terminaComRio = entrada.toLowerCase().endsWith("rio");
        int numDigitos = entrada.replaceAll("[^0-9]", "").length();

        System.out.println("Número de caracteres: " + numCaracteres);
        System.out.println("String em maiúsculo: " + maiusculo);
        System.out.println("Número de vogais: " + numVogais);
        System.out.println("Começa com UNI? " + comecaComUni);
        System.out.println("Termina com RIO? " + terminaComRio);
        System.out.println("Número de dígitos: " + numDigitos);

        scanner.close();
    }
}
