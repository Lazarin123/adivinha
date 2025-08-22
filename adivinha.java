import java.util.Scanner;

public class adivinha {
 
    public static void main(String[] args) {    
        System.out.println("Olá, seja bem-vindo(a)!\n");
        System.out.println("Digite uma letra: \n");
            Scanner scanner = new Scanner(System.in);
            String Letra = scanner.nextLine(); 

            switch (Letra) {
                case "a": System.out.println("Você digitou a Letra " + Letra + ", ela é uma vogal.");
                break;
                case "e": System.out.println("Você digitou a Letra " + Letra + ", ela é uma vogal.");
                break;
                case "i": System.out.println("Você digitou a Letra " + Letra + ", ela é uma vogal.");
                break;
                case "o": System.out.println("Você digitou a Letra " + Letra + ", ela é uma vogal.");
                break;
                case "u": System.out.println("Você digitou a Letra " + Letra + ", ela é uma vogal.");
                    break;
                default:
                    System.out.println("Você digitou a Letra " + Letra + ", ela é uma consoante.");
                    break;
            }    
    }
}
