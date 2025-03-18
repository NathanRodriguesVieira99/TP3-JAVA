
import java.util.Scanner;

// classe
public class Ninja {
    // atrtibutos da classe
    String nome;
    String sensei;
    String aldeia;
    String melhorTecnica;

    // metodos

    // cria um log do uso da habilidade pelo ninja
    void usarTecnica() {
        System.out.println(nome + " usou a tecnica: " + melhorTecnica);
    }

    // cria um novo ninja
    void cadastrarShinobi() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe o nome do Ninja: ");
        this.nome = scanner.nextLine();

        System.out.println("Informe o nome do Sensei: ");
        this.sensei = scanner.nextLine();

        System.out.println("Informe a aldeia: ");
        this.aldeia = scanner.nextLine();

        System.out.println("Informe a melhor tecnica: ");
        this.melhorTecnica = scanner.nextLine();

    }

}
