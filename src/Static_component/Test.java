package Static_component;

public class Test {
    String key = "person";
    String value = ":Id name role db salary";

    /**
     * realUser(this) mean this.key , this.value
     */
    Test(){
        ThisWithCon_realUse use = new ThisWithCon_realUse(this);
        use.pintData();
    }

}
