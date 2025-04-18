public class Boxer extends Sportler{
    public Boxer(String n, int g, int groesse, double gewicht) {
        super(n, g, groesse, gewicht);
    }
    public void setGewicht(double gewicht){
        super.setGewicht(gewicht);
    }
    public String gewichtKlasse(){
        if(super.getGewicht() > 70 && getGewicht() < 90){
            return "Leicht";
        }
        else if(super.getGewicht() > 90){
            return "Schwer";
        }else{
            return "unbekannt";
        }
    }
    @Override
    public String info() {
        return gewichtKlasse();
    }
}
