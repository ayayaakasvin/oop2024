package Lab1;

class Temperature {
    private Double tValue;
    private Character scaleType; // F or C

    { // default values
        tValue = 0.0;
        scaleType = 'C';
    }

    Temperature () {

    }

    Temperature (Double temp, Character scale) {
        this.tValue = temp;

        if (!(scale.equals('C') || scale.equals('F'))) {
            System.out.printf("Wrong input(%c), must be 'C' or 'F'\n", scale);
            return;
        }

        this.scaleType = scale;
    }

    Temperature (Double temp) {
        this.tValue = temp;
    }

    Temperature (Character scale) {
        if (!(scale.equals('C') || scale.equals('F'))) {
            System.out.printf("Wrong input(%c), must be 'C' or 'F'\n", scale);
            return;
        }

        this.scaleType = scale;
    }

    public Double Celcius () {
        if (this.scaleType == 'C') {
            return tValue;
        }

        return (5.0 / 9.0) * (tValue - 32);
    }

    public Double Fahrenheit () {
        if (this.scaleType == 'F') {
            return tValue;
        }

        return (9.0 / 5.0) * tValue + 32;
    }

    public void setScaleType (Character scale) {
        if (!(scale == 'C' || scale == 'F')) {
            System.out.printf("Wrong input(%c), must be 'C' or 'F'\n", scale);
            return;
        }

        this.scaleType = scale;
    }

    public void setTemperatureValue (Double value) {
        this.tValue = value;
    }

    public void setScaleAndValue (Character scale, Double value) {
        this.setScaleType(scale);
        this.setTemperatureValue(value);
    }

    public Character ScaleType () {
        return this.scaleType;
    }

    public void PropertyPrint() {
        System.out.printf("Temperature object scale type is %c with value %.2f in Celcius and %.2f in Fahrenheit\n", this.ScaleType(), this.Celcius(), this.Fahrenheit());
    }

    public static void main(String[] args) {
        Temperature temp1 = new Temperature();
        temp1.PropertyPrint();
        Temperature tempWithScaleAndValue = new Temperature(36.6, 'C');
        tempWithScaleAndValue.PropertyPrint();
        Temperature tempWithValue = new Temperature(100.0);
        tempWithValue.PropertyPrint();
        Temperature tempWithScale = new Temperature('F');
        tempWithScale.PropertyPrint();

        System.out.println("Setting values");
        temp1.setScaleAndValue('A', 1.0);
        temp1.PropertyPrint();
        temp1.setScaleAndValue('F', 420.69);
        temp1.PropertyPrint();
    }
}