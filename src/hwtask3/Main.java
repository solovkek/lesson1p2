package hwtask3;

public class Main {
    public static void main(String[] args) {
        Computer [] computers = new Computer[5];

        for (int i = 0; i < 5; i++) {
            computers[i] = new Computer();

            computers[i].setModel("Sc-032");
            computers[i].setBrand("Artline");
        }

        for (Computer computer: computers) {
            System.out.println(computer);
        }

    }
}