class Person {
    String name;
    private int id;

    Person(int n) {
        id = n;
        name = "No name";
    }

    Person(String s) {
        name = s;
    }

    Person() {
        name = "Unknow";
    }

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
