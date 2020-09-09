public class Sobaka {
    private int vozrast;
    private String poroda;
    private String cvet;
    public Sobaka(String poroda, String cvet,int vozrast)
    {
        this.vozrast=vozrast;
        this.cvet=cvet;
        this.poroda=poroda;
    }

    public int getVozrast() {
        return vozrast;
    }

    public String getCvet() {
        return cvet;
    }

    public String getPoroda() {
        return poroda;
    }

    public void setCvet(String cvet) {
        this.cvet = cvet;
    }

    public void setPoroda(String poroda) {
        this.poroda = poroda;
    }

    public void setVozrast(int vozrast) {
        this.vozrast = vozrast;
    }
    public String toString()
    {
        return "Nenado";
    }
    public int perLet(int vozrast)
    {
        return vozrast*7;
    }
    public static void main(String [] arr)
    {
        Sobaka ob=new Sobaka("Udon","net",7);
        ob.perLet(7);
        Sobaka [] arrow = new Sobaka[3];
        arrow[0]=new Sobaka("negr","cherny",100);
        arrow[1]=new Sobaka("da","net",7);
        arrow[2]= new Sobaka("JOJO","jelty",3);
    }
}
