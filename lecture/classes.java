package lecture;

class Animal {
    String type;

    {
        type = "";
    }

    Animal (String type) {
        this.type = type;
    }

    Animal () {}

    void makeNoise () {
        System.out.println("~Some noises~");
    }

    void information () {
        System.out.printf("Type : %s\n", this.type);
    }
}

class Dog extends Animal {
    String breed;

    {
        breed = "";
    }

    Dog () {
        super("Dog");
    }

    Dog (String breed) {
        super("Dog");
        this.breed = breed;
    }

    @Override
    void makeNoise() {
        // TODO Auto-generated method stub
        System.out.println("Woof");
    }

    @Override
    void information () {
        System.out.printf("Type : %s, Breed : %s\n", this.type, this.breed);
    }
}

class DogBreed extends Dog {
    Double height;
    Double weight;

    {
        height = 0.0;
        weight = 0.0;
    }

    DogBreed (String breed) {
        super(breed);
    }

    DogBreed (String breed, Double h, Double w) {
        super(breed);
        this.height= h;
        this.weight = w;
    }

    @Override
    void information () {
        System.out.printf("Type : %s, Breed : %s, Height : %.2f, Weight : %.2f\n", this.type, this.breed, this.height, this.weight);
    }
}

class Main {
    public static void main(String[] args) {
        Animal hippo = new Animal("Hippo");
        hippo.makeNoise();
        hippo.information();

        System.out.println();

        Dog dogge = new Dog("Golden Retriver");
        dogge.makeNoise();
        dogge.information();

        System.out.println();

        DogBreed dawg = new DogBreed("Hasky", 100.0, 35.0);
        dawg.makeNoise();
        dawg.information();

        System.out.println();
    }
}