import java.util.Scanner;

public class adivinha {
 
    public static void main(String[] args) {    
        System.out.println("Olá, seja bem-vindo(a)!\n");
        System.out.println("Digite uma letra: \n");
            Scanner scanner = new Scanner(System.in);
            String Letra = scanner.nextLine(); 

            if (Letra == "a") {
                System.out.println("Você digitou a Letra " + Letra + ", ela é uma vogal.");
            } else if (Letra == "e") {
                System.out.println("Você digitou a Letra " + Letra + ", ela é uma vogal.");
            } else if (Letra == "i") {
                System.out.println("Você digitou a Letra " + Letra + ", ela é uma vogal.");
            } else if (Letra == "o") {
                System.out.println("Você digitou a Letra " + Letra + ", ela é uma vogal.");
            } else if (Letra == "u") {
                System.out.println("Você digitou a Letra " + Letra + ", ela é uma vogal.");
            } else {
                System.out.println("Você digitou a Letra " + Letra + ", ela é uma consoante.");
            }    
    }
}
