package Lab1;

import java.util.Vector;

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
    private Vector<Person> toBeEat = new Vector<>();
    
    public void kidnap (Person p) {
        toBeEat.add(p);
    }

    public boolean willDragonEatOrNot () {
        for (int i = 0; i < toBeEat.size() - 1;) {
            if (toBeEat.get(i).gender == Gender.Male && toBeEat.get(i + 1).gender == Gender.Female) {
                toBeEat.removeElementAt(i);
                toBeEat.removeElementAt(i);
                if (i > 0) {
                    i--;
                }
                continue;
            }

            i++;
        }

        return toBeEat.isEmpty();
    }

    public static void main(String[] args) {
        Main some = new Main();
        some.kidnap(new Person(Gender.Female));
        some.kidnap(new Person(Gender.Male));
        some.kidnap(new Person(Gender.Female));
        some.kidnap(new Person(Gender.Male));

        System.out.println(some.willDragonEatOrNot()); // false


        some.toBeEat.clear(); // concerns about encapsulation, but for task ig its ok
        // to clear we can just create another method, or create another object to use :)
        some.kidnap(new Person(Gender.Male));
        some.kidnap(new Person(Gender.Male));
        some.kidnap(new Person(Gender.Female));
        some.kidnap(new Person(Gender.Female));

        System.out.println(some.willDragonEatOrNot()); // true
    }
}