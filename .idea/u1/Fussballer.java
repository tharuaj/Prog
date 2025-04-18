public class Fussballer extends Sportler{

    String verein;
    boolean linksfuss;
    public Fussballer(String n, int g, int groesse,double gewicht,String verein,boolean linksfuss) {
        super(n,g,groesse,gewicht);
        this.verein = verein;
        this.linksfuss= linksfuss;

    }
    public boolean getLinksfuss() {
        return linksfuss;
    }

    public void setLinksfuss(boolean linksfuss) {
        this.linksfuss = linksfuss;
    }

    @Override
    public String info() {
        return verein;
    }
}
