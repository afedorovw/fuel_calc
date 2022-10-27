package calculator;

import calculator.repo.CarStore;
import calculator.repo.TrackStore;
import calculator.service.ConsoleInterface;
import calculator.service.GuiInterface;

public class Main {
    public static void main(String[] args) {
      /*   new Application(new GuiInterface(
                new CarStore(),
                new TrackStore()
        )).run();
    }*/

        new Application(new ConsoleInterface(new CarStore(), new TrackStore())).run();

    }
}
