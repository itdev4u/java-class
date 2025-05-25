package ch12.Enum;

public enum Transportation {
    BUS(100) {
        int fare(int distance) {
            return distance * BASIC_FARE * 2;
        }
    },
    TRAIN(150) {
        int fare(int distance) {
            return distance * BASIC_FARE * 3;
        }
    },
    SHIP(100) {
        int fare(int distance) {
            return distance * BASIC_FARE * 4;
        }
    },
    AIRPLANE(300) {
        int fare(int distance) {
            return distance * BASIC_FARE * 5;
        }
    };

    protected final int BASIC_FARE;
    Transportation(int basicFare) {
        BASIC_FARE = basicFare;
    }
    public int getBasicFare() {
        return BASIC_FARE;
    }
    abstract int fare(int distance);
}