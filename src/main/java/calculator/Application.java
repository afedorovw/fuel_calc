package calculator;

import calculator.domain.cars.Car;
import calculator.domain.tracks.Track;
import calculator.service.ConsoleInterface;

public class Application {
    /*
        private final GuiInterface userInterface;

        public Application(GuiInterface userInterface) {
            this.userInterface = userInterface;
        }

        void run() {
            Car car = userInterface.chooseCarInGui();
            Track track = userInterface.chooseTrackInGui();
            userInterface.showResult(car, track);
        }
    */

    private final ConsoleInterface consoleInterface;

    public Application(final ConsoleInterface consoleInterface) {
        this.consoleInterface = consoleInterface;
    }

    void run() {
        Car car = consoleInterface.choiceCarInConsole();
        Track track = consoleInterface.choiceTrackInConsole();
        consoleInterface.showResult(car, track);
    }

}
