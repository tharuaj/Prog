public class Stud extends Person{

    private static int matNr = 100;

    public Stud(String n, int g) {
        super(n, g);
        this.matNr= matNr++;

    }

    public int getMatNr() {
        return matNr;
    }

    @Override
    public String toString(){
        return  super.name() + " (" + this.getMatNr() + ")";
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true; //vergleicht Speicheraddresse
        if (obj == null || getClass() != obj.getClass()) return false;//anderer Typ
        Stud other = (Stud) obj;
        return this.matNr == other.matNr;
    }
}
