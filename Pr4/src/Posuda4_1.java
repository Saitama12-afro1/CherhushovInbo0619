public  abstract class Posuda4_1 {
     public String material;
     public String sozdatel;
     public int god;
     public  String cvet;

    public int getGod() {
        return god;
    }

    public String getMaterial() {
        return material;
    }

    public String getSozdatel() {
        return sozdatel;
    }

    public void setGod(int god) {
        this.god = god;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public void setSozdatel(String sozdatel) {
        this.sozdatel = sozdatel;
    }
    public abstract void Opisanie(String material,String sozdatel,int god,String cvet);
}
