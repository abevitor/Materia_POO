package Exercicio2;

public class Casa {
    private boolean porta1;
    private boolean porta2;
    private boolean porta3;


    public boolean isPorta1() {
        return porta1;
    }
    public void setPorta1(boolean porta1) {
        this.porta1 = porta1;
    }
    public boolean isPorta2() {
        return porta2;
    }
    public void setPorta2(boolean porta2) {
        this.porta2 = porta2;
    }
    public boolean isPorta3() {
        return porta3;
    }
    public void setPorta3(boolean porta3) {
        this.porta3 = porta3;
    }

    public int quantasPortasEstaoAbertas() {
    return (porta1 ? 1 : 0)
         + (porta2 ? 1 : 0)
         + (porta3 ? 1 : 0);

         
}

    
}
