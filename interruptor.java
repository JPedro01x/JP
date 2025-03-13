 public class Interruptor {
 
    private boolean ligado = false;

    public void pressionar() {
        ligado = !ligado;
    }

    public void verificarLampada() {
        if (ligado) {
            System.out.println("A luz está acesa");
        } else {
            System.out.println("A luz está apagada");
        }
    }

    public static void main(String[] args) {
        
        Interruptor interruptor = new Interruptor();
        
        interruptor.pressionar();
        
        interruptor.verificarLampada();
        
        interruptor.pressionar();
        
        interruptor.verificarLampada();
    }
}
