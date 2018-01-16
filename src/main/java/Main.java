import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ConsoleView consoleView = new ConsoleView();

        int carCount = consoleView.askCarCount();
        int racingCount = consoleView.askRacingCount();
        Car[] cars = initCars(carCount);
    }

    public static Car[] initCars(int carCount) {
        Car[] cars = new Car[carCount];
        for (int i = 0; i < carCount; i++) {
            cars[i] = new Car();
        }
        return cars;
    }
}
