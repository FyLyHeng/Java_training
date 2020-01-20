package Polymorphisms;

public class Machine extends CarInfo{
    private String hp="1000ph";
    private String engine="4ct";
    private float mixSpeed=227;

    @Override
    public void carInfo(){
        System.out.println(engine);
        System.out.println(hp);
        System.out.println(mixSpeed);
    }

    public String getHp() {
        return hp;
    }

    public void setHp(String hp) {
        this.hp = hp;
    }

    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public float getMixSpeed() {
        return mixSpeed;
    }

    public void setMixSpeed(float mixSpeed) {
        this.mixSpeed = mixSpeed;
    }
}
