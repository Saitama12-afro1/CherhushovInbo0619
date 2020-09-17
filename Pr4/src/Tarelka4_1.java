public class Tarelka4_1 extends Posuda4_1 {
     public String forma;
     public String volume;
    public void setForma(String forma) {
        this.forma = forma;
    }
    public void setVolume(String volume) {
        this.volume = volume;
    }
    public  String getForma()
    {
        return forma;
    }
    public String getVolume()
    {
        return volume;
    }

    @Override
    public void Opisanie(String material, String sozdatel, int god, String cvet) {
         System.out.println("Сделан из "+material+" cоздал "+ sozdatel+" в "+god +"цвета "+ cvet);
    }
}
