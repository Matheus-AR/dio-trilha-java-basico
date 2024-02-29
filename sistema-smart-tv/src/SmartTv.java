

public class SmartTv {
    public boolean ligada = false;
    public int canal = 1;
    public int volume = 25;

    public void ligar() {
        this.ligada = true;
    }
    public void desligar() {
        this.ligada = false;
    }

    public void aumentarVolume() {
        this.volume += 1;
    }
    public void dimimuirVolume() {
        this.volume -= 1;
    }

    public void mudarCanal(int canal) {
        this.canal = canal;
    }
    public void aumentarCanal() {
        this.canal += 1;
    }
    public void diminuirCanal() {
        this.canal -= 1;
    }
}