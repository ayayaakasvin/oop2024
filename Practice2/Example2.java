package Practice2;

import java.lang.StringBuilder;

class StarTriangle {
    public Integer amount = 1;
    private String star = "[*]";

    public StarTriangle (Integer amount) {
        this.amount = amount;
    }

    public StarTriangle () {

    }

    public String toString() {
        StringBuilder result = new StringBuilder();

        for (int i = 1; i <= amount; i++) {
            StringBuilder toAdd = new StringBuilder();
            for (int j = 0; j < i; j++) {
                toAdd.append(star);
            }
            toAdd.append("\n");
            result.append(toAdd);
        }

        return result.toString();
    }

    public static void main(String[] args) {
        StarTriangle small = new StarTriangle(5);

        System.out.println(small.toString());
    }
}