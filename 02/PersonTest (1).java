class PersonTest {
    public static void main(String[] args) {
        Person p = new Person(12345);
        // Person p = new Person("Sasaki");
        // Person p = new Person();
        // p.name = "Sasaki";
     
        // p.setId(456);
        p.sayHello();
        System.out.println(p.getId());   
    }
}
