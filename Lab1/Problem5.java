package Lab1;

enum Gender {
    Male, Female
}

class Person {
    Gender gender;

    Person (Gender gender) {
        this.gender = gender;
    }
}

class Main {
    private Vector<Person> toBeEat;  
}
