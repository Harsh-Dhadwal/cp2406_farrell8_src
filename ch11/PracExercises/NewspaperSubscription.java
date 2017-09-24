package PracExercises;

abstract class NewspaperSubscription {
    String name;
    String address;
    double rate;

    void setName(String name) {
        this.name = name;
    }

    abstract void setAddress();

    String getName() {
        return name;
    }

    double getRate() {
        return rate;
    }

    String getAddress() {
        return address;
    }
}
