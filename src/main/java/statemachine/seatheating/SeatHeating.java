package statemachine.seatheating;

public enum SeatHeating {
    LEVEL3 {
        @Override
        SeatHeating nextLevel() {
            return SeatHeating.LEVELOFF;
        }
    },
    LEVEL2 {
        @Override
        SeatHeating nextLevel() {
            return SeatHeating.LEVEL1;
        }
    },
    LEVEL1 {
        @Override
        SeatHeating nextLevel() {
            return SeatHeating.LEVEL2;
        }
    },
    LEVELOFF {
        @Override
        SeatHeating nextLevel() {
            return SeatHeating.LEVEL3;
        }
    };

    abstract SeatHeating nextLevel();
    }
