package main.java;

/**
 * Created by mperalta on 09/02/2017.
 */
public class RadioactivityMeasurer {

    /**
     * Measure a radioactivity level {radioactivityLevel}
     * and returns a given litteral level
     *
     * If the input is not correct, the method throws a new IllegalArgumentException
     *
     * @param radioactivityLevel
     * @return
     */
    public static String measure(int radioactivityLevel) {
        for (RadioactivityLevel level : RadioactivityLevel.values()) {
            if (level.getMin() <= radioactivityLevel && radioactivityLevel <= level.getMax()) {
                return level.getLabel();
            }
        }

        throw new IllegalArgumentException();
    }

//    Previous function
//    /**
//     * Measure a radioactivity level {radioactivityLevel}
//     * and returns a given litteral level
//     *
//     * If the input is not correct, the method throws a new IllegalArgumentException
//     *
//     * @param radioactivityLevel
//     * @return
//     */
//    public static String measure(int radioactivityLevel) {
//        if (RadioactivityLevel.LOW.getMin() <= radioactivityLevel && radioactivityLevel <= RadioactivityLevel.LOW.getMax()) {
//            return RadioactivityLevel.LOW.getLabel();
//        } else if (RadioactivityLevel.MEDIUM_LOW.getMin() <= radioactivityLevel && radioactivityLevel <= RadioactivityLevel.MEDIUM_LOW.getMax()) {
//            return RadioactivityLevel.MEDIUM_LOW.getLabel();
//        } else if (RadioactivityLevel.MEDIUM_HIGH.getMin() <= radioactivityLevel && radioactivityLevel <= RadioactivityLevel.MEDIUM_HIGH.getMax()) {
//            return RadioactivityLevel.MEDIUM_HIGH.getLabel();
//        } else if (RadioactivityLevel.HIGH.getMin() <= radioactivityLevel) {
//            return RadioactivityLevel.HIGH.getLabel();
//        }
//        throw new IllegalArgumentException();
//    }
}
