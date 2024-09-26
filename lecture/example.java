package lecture;


class example {
    private String greet = "Hello";

    public void Greet() {
        System.out.println(greet);
        return;
    }

    public static void GreetStatic () {
        example obj = new example();

        obj.Greet();
        return;
    }

    public static void main(String[] args) {
        example.GreetStatic();
        return;
    }
}   