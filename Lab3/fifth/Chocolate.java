package Lab3.fifth;

public class Chocolate implements Comparable<Chocolate> {
    private double weight;
    private String name;

    Chocolate (String name, double weight) {
        setName(name);
        setWeight(weight);
    }

    public String getName () {
        return name;
    } 

    public void setName (String name) {        
        this.name = name;
    }
    
    public double getWeight () {
        return weight;
    } 

    public void setWeight (double weight) throws IllegalArgumentException {
        if (weight < 0.0) {
            throw new IllegalArgumentException("negative physical unit");
        }
        
        this.weight = weight;
    }

    @Override
    public String toString() {
        return String.format("Chocolate %s: weight = %f", name, weight);
    }
    
    @Override
    public int compareTo(Chocolate other) {
        return Double.compare(this.weight, other.weight);
    }
}
