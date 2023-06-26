package exam02;

public enum Transportation {
    BUS(1250) {
        @Override
        public String getName() {
            return "버스";
        }
    },
    SUBWAY(1250) {
        @Override
        public String getName() {
            return "지하철";
        }
    },
    TAXI(4000) {
        @Override
        public String getName() {
            return "택시";
        }
    };

    private int fare;

    Transportation(int fare) {
        this.fare = fare;
    }

    public int getTotal(int personNum) {
        return fare * personNum;
    }

    public abstract String getName();
}
