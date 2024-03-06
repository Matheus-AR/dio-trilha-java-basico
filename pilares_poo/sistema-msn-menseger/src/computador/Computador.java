package computador;

import sistema.facebook.FacebookMessenger;
import sistema.msn.MSNMessenger;
import sistema.telegram.Telegram;

public class Computador {

	public static void main(String[] args) {
		System.out.println("MSN");
		MSNMessenger msn = new MSNMessenger();
		msn.enviarMensagem();
		msn.receberMensagem();
		
		System.out.println("");
		System.out.println("FACEBOOK");
		FacebookMessenger fcb = new FacebookMessenger();
		fcb.enviarMensagem();
		fcb.receberMensagem();
		
		System.out.println("");
		System.out.println("TELEGRAM");
		Telegram tlg = new Telegram();
		tlg.enviarMensagem();
		tlg.receberMensagem();
		
		
	}

}
