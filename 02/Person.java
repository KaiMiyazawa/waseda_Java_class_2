class Person {
    String name;
    private int id;

    public void setId(int id) {
        this.id = id;
    }
    public int getId() {
        return id;
    }
    public void sayHello() {
        System.out.println("Hello. I am " + name + ".");
    }
}
