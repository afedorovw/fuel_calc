package calculator.domain.cars;

import calculator.domain.tracks.Track;

public abstract class Car {

    private static final int FUEL_CAPACITY = 100;

    private int maxLapsForTrack;

    public abstract double getFuelEconomy();

    public int fuelCapacity() {
        return FUEL_CAPACITY;
    }

    public boolean isPitstopNeeded(Track track) {
        maxLapsForTrack(track);
        return maxLapsForTrack < track.laps();
    }

    public int maxLapsForTrack() {
        return this.maxLapsForTrack;
    }

    private void maxLapsForTrack(Track track) {
        int lapDistance = track.lapDistance();
        double fuelEconomy = getFuelEconomy();
        int fuelCapacity = fuelCapacity();
        double maxDistanceForCar = fuelCapacity * 100 / fuelEconomy;
        this.maxLapsForTrack = (int) ((maxDistanceForCar * 1000) / lapDistance);
    }
}
