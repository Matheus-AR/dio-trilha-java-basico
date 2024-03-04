import java.util.Scanner;
import java.lang.String;

public class App {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String[] nomes = new String[10];
		
        // Ler 10 nomes sem espaço em branco
		for(int i=0 ; i<10 ; i++)
			nomes[i] = sc.nextLine();


        System.out.println("");
        // Imprima o terceiro nome da lista
        System.out.println(nomes[2]);

        // Imprima o sétimo nome da lista
        System.out.println(nomes[6]);

        // Imprima o nono nome da lista
        System.out.println(nomes[8]);
        sc.close();
	}
}
