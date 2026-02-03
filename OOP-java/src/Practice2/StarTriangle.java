package Practice2;

public class StarTriangle {
    private int width;

    public StarTriangle(int width) {
        this.width = width;
    }

    public String toString() {
        StringBuilder result = new StringBuilder();

        for(int row = 1; row <= width; row++){
            for(int star =1; star <= row; star++){
                result.append("[*]");
            }
            result.append("\n");
        }

        return result.toString();
    }

    public static void main(String[] args) {
        StarTriangle small = new StarTriangle(3);
        System.out.println(small.toString());
    }
}
