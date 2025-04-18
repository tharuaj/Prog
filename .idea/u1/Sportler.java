public abstract class Sportler extends Person {
    private int groesse;



    private double gewicht;

    public Sportler(String n, int g, int groesse,double gewicht) {
        super(n, g);
        this.groesse = groesse;
        this.gewicht= gewicht;
    }
    public void setGewicht(double gewicht) {
        this.gewicht = gewicht;
    }
    public double getGewicht() {
        return gewicht;
    }
    public abstract String info();

    @Override
    public String toString(){
        return super.toString()+" "+this.groesse+" "+ this.gewicht;
    }


}
