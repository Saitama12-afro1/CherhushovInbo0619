public class Auf {
    public static void main(String [] arg)
    {
Ball ob1=new Ball();
ob1.setCvet("Черный");
ob1.setDiametr(123);
ob1.setTip("Баскетбольный");
        System.out.println(ob1.toString());
        Book ob2= new Book();
        ob2.setAvtor("Постернак");
        ob2.setName("Докор Живаго");
        ob2.setIzdatel("Kto-to");
        ob2.setGod(2064);
        ob2.setKolStr(9352);
        System.out.println(ob2.toString());
    }
}
