public class Ball {
    private String tip;
    private int diametr;
    private String cvet;

    public  String qetTip(){
        return tip;
    }
    public void setTip(String tip)
    {
        this.tip=tip;
    }

    public int getDiametr() {
        return diametr;
    }

    public void setDiametr(int diametr) {
        this.diametr = diametr;
    }

    public String getCvet() {
        return cvet;
    }

    public void setCvet(String cvet) {
        this.cvet = cvet;
    }
    public String toString()
    {
        return "Мяч типа " +tip+" Диаметр "+ diametr+"Цвет настроения "+cvet;
    }
}
