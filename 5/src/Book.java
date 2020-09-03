public class Book {
    private  String avtor;
    private String name;
    private int god;
    private String Izdatel;
    private int kolStr;

    public int getGod() {
        return god;
    }

    public void setGod(int god) {
        this.god = god;
    }

    public String getAvtor() {
        return avtor;
    }

    public void setAvtor(String avtor) {
        this.avtor = avtor;
    }

    public String getIzdatel() {
        return Izdatel;
    }

    public void setIzdatel(String Izdatel) {
        this.Izdatel = Izdatel;
    }

    public int getKolStr() {
        return kolStr;
    }

    public void setKolStr(int kolStr) {
        this.kolStr = kolStr;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String toString()
    {
        return "Книгу написал "+ avtor +"И она называется "+ name;
    }
}
