package JavaProgrammes;

public class SwappingData {
    public static void main(String[] args) {
        SwappingData obj = new SwappingData();
        obj.swap();
    }
        public void swap() {
            int x, y, temp;
            x = 15;
            y = 27;
            System.out.println("Before swapping : x, y, = " + x + ", " + + y);//15,27
            temp = x;
            x = y;
            y = temp;
            System.out.println("After swapping : x, y, = " + x + ", " + + y);//27,15

        }

    }

