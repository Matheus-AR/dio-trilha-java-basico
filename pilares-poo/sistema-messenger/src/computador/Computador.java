package computador;

import app.ServicoMensagemInstantanea;
import app.facebook.FacebookMessenger;
import app.msn.MSNMessenger;
import app.telegram.Telegram;

public class Computador {

    public static void main(String[] args) {

        ServicoMensagemInstantanea smi = null;

        String appEscolhido="fbm";

        switch (appEscolhido) {
            case "msn":
                smi = new MSNMessenger();
                break;
            case "fbm":
                smi = new FacebookMessenger();
                break;
            case "tlg":
                smi = new Telegram();
                break;
        }


        smi.enviarMensagem();
        smi.receberMensagem();
    }

}