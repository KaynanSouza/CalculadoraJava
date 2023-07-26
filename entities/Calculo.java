package entities;

public class Calculo {
    private double n1, n2;

    public Calculo(double n1, double n2) {
        this.n1 = n1;
        this.n2 = n2;
    }

    public double soma(){
        return n1 + n2;
    }

    public double subtracao(){return n1 - n2;}

    public double divisao(){return n1 / n2;}

    public double multiplicacao(){return n1 * n2;}

    public double porcentagem(){return (n1 * n2) / 100; }

    public double exponenciacao(){return Math.pow(n1, n2);}

    public double radiciacao(){return Math.pow(n1, 1 / n2);}
}
