package DebuggingExercises;

public abstract class DebugBoat {
    private String boatType;
    int passengers;
    String power;

    DebugBoat(String bt) {
        boatType = bt;
    }

    // override equals() method to satisfy
    // requirements of Debug Exercise 3.
    boolean equals(DebugBoat otherBoat) {
        boolean result;
        result = (this.passengers == otherBoat.passengers) && (this.power.equals(otherBoat.power));
        return result;
    }

    public String toString() {
        return ("This " + boatType + "boat carries " + passengers +
                " and is powered by " + power);
    }

    public abstract void setPower();

    public abstract void setPassengers();
}