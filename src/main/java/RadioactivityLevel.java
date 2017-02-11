package main.java;

/**
 * Representation of the radioactivity scale
 * with 4 differents classes
 *
 * Created by mperalta on 09/02/2017.
 */
public enum RadioactivityLevel {
    LOW("low", 0, 50),
    MEDIUM_LOW("medium_low", 51, 100),
    MEDIUM_HIGH("medium_high", 101, 150),
    HIGH("high", 151, Integer.MAX_VALUE);

    private String label;
    private int min;
    private int max;

    RadioactivityLevel(String label, int min, int max) {
        this.label = label;
        this.min = min;
        this.max = max;
    }

    public String getLabel() {
        return label;
    }

    public int getMin() {
        return min;
    }

    public int getMax() {
        return max;
    }
}
