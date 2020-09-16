class Head
{
private int iq;
private int deametr;
Head(int iq,int deametr)
{
    this.deametr=deametr;
    this.iq=iq;
}

    public int getDeametr() {
        return deametr;
    }

    public int getIq() {
        return iq;
    }

  public void setDeametr(int deametr) {
        this.deametr = deametr;
    }

    public void setIq(int iq) {
        this.iq = iq;
    }
}
class Leg
{
    private double  dlina;
    private String name;
    Leg(double dlina, String name)
    {
        this.dlina=dlina;
        this.name=name;
    }

    public double getDlina() {
        return dlina;
    }

    public String getName() {
        return name;
    }

    public void setDlina(double dlina) {
        this.dlina = dlina;
    }

    public void setName(String name) {
        this.name = name;
    }
}
class Hand
{private double  dlinaH;
    private String nameH;
    Hand(double dlinaH, String nameH)
    {
        this.dlinaH=dlinaH;
        this.nameH=nameH;
    }

    public double getDlina() {
        return dlinaH;
    }

    public String getName() {
        return nameH;
    }

    public void setDlina(double dlinaH) {
        this.dlinaH = dlinaH;
    }

    public void setName(String name) {
        this.nameH = nameH;
    }
}

public class Human
{
    Human(int vozrast,String namet,int rost,int iq,int deametr,String name)
    {
        golova= new Head(iq,deametr);
        noga= new Leg(deametr,namet);
        ruka=new Hand(deametr,namet);
        this.vozrast=vozrast;
    }
    private Leg noga;
    private Head golova;
    private Hand  ruka;
    private int  vozrast;
private void Diplom(int iq)
{
  if(iq>1000)
  {
      System.out.println("Вы гений");
  } else
      {

          System.out.println("ученик миреа");
      }
}
    public  static void main(String [] arr)
    {
        Human ob= new Human(100,"pasha",105,12256,43,"Nikita");
        ob.Diplom(1245);
    }
}


