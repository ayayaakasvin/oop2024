package Lab3.forth;

public class Person {
    private String name;

    public Person (String name) {
        setName(name);
    }

    public String getName () {
        return name;
    }

    public void setName (String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Person person = (Person) obj;
        return name != null && name.equals(person.name);
    }

    @Override
    public String toString() {
        return String.format("Person: name=%s", name);
    }
}