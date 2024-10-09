package Practice3.Problem1;

class Animal {
    String type;
    String noise;
    
    {
        type = "";
        noise = "";
    }

    Animal () {}

    Animal (String type) {
        this.type = type;
    }

    Animal (String type, String noise) {
        this.type = type;
        this.noise = noise; 
    }

    public void setNoise (String noise) {
        this.noise = noise;
    }

    public void makeNoise () {
        System.out.printf("%s says %s\n", type, noise);
    }

    public void information () {
        System.out.printf(toString());
    }

    @Override
    public String toString () {
        return String.format("Type : %s\n", this.type);
    }
}

class Dog extends Animal {
    String breed;

    {
        breed = "";
    }

    Dog () {
        super("Dog", "Woof!");
    }

    Dog (String breed) {
        super("Dog", "Woof");
        this.breed = breed;
    }

    @Override
    public void makeNoise() {
        System.out.printf("%s %s says %s\n", breed, type, noise);
    }

    public void makeNoise(String additionalNoise) {
        System.out.printf("%s %s says %s and %s\n", breed, type, noise, additionalNoise);
    }

    public void makeNoise(Integer nTimes) {
        for (int i = 0; i < nTimes; i++) {
            makeNoise();
        }
    }

    @Override
    public void information () {
        System.out.printf(toString());
    }

    @Override
    public String toString () {
        return super.toString() + String.format("Breed : %s\n", this.breed);
    }
}

class Main {
    public static void main(String[] args) {
        Animal hippo = new Animal("Hippo", "Honk!");
        hippo.makeNoise();
        hippo.information();

        System.out.println();

        Dog dogge = new Dog("Golden Retriver");
        dogge.makeNoise();
        dogge.information();

        System.out.println();
    }
}