package Access_level;

class Protected_class {
    protected String name = "Kok";
    protected String email = "Kok@gmail.com";
    protected int age = 30;

    /**
     * this is override toString method of java
     * @return
     */
    @Override
    public String toString() {
        //return super.toString();
        return name + "\t" + email + "\t" + age;
    }

    protected void msg() {
        System.out.println("this is protected msg()");
    }
}
