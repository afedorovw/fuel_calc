package calculator.repo;

import calculator.domain.tracks.Suzuka;
import calculator.domain.tracks.Spa;
import calculator.domain.tracks.Track;
import calculator.domain.tracks.Zandvoort;

import java.util.Map;

public class TrackStore {

    private Map<String, Track> store = Map.of(
        "Suzuka", new Suzuka(),
        "Spa", new Spa(),
        "Zandvoort", new Zandvoort()
    );

    public Track lookup(String trackName) {
        for (String key : store.keySet()) {
            if (key.equalsIgnoreCase(trackName)) {
                return store.get(key);
            }
        }
        throw new IllegalArgumentException("Track not found for given name: " + trackName);
    }

    public void showTracks() {
        System.out.println(store.keySet());
    }

    public String[] tracks() {
        String[] keys = new String[store.size()];
        int index = 0;
        for (Map.Entry<String, Track> mapEntry : store.entrySet()) {
            keys[index] = mapEntry.getKey();
            index++;
        }
        return keys;
    }
}
