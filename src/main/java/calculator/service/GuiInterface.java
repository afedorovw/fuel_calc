package calculator.service;

import calculator.domain.cars.Car;
import calculator.domain.tracks.Track;
import calculator.repo.CarStore;
import calculator.repo.TrackStore;

import javax.swing.*;

public class GuiInterface {

    private final CarStore carStore;
    private final TrackStore trackStore;

    public GuiInterface(CarStore carStore, TrackStore trackStore) {
        this.carStore = carStore;
        this.trackStore = trackStore;
    }

    public Car chooseCarInGui() {
        String desiredCar = JOptionPane.showInputDialog("Car:");
        return carStore.lookup(desiredCar);
    }

    public Track chooseTrackInGui() {
        String desiredTrack = JOptionPane.showInputDialog("Track:");
        return trackStore.lookup(desiredTrack);
    }

    public void showResult(Car car, Track track) {
        if (car.isPitstopNeeded(track)) {
            JOptionPane.showMessageDialog(
                    null,
                    "Pit-stop needed in " + car.maxLapsForTrack(),
                    "Результат:",
                    1
            );
        } else {
            JOptionPane.showMessageDialog(
                    null,
                    "Pit-stop not needed ",
                    "Результат:",
                    1
            );
        }
    }
}
