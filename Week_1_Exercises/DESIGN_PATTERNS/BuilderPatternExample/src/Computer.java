public class Computer {

    private final String CPU;
    private final String RAM;
    private final String storage;
    private final boolean hasGraphicsCard;
    private final boolean hasBluetooth;

    private Computer(Builder builder) {
        this.CPU = builder.CPU;
        this.RAM = builder.RAM;
        this.storage = builder.storage;
        this.hasGraphicsCard = builder.hasGraphicsCard;
        this.hasBluetooth = builder.hasBluetooth;
    }

    public String getCPU() {
        return CPU;
    }

    public String getRAM() {
        return RAM;
    }

    public String getStorage() {
        return storage;
    }

    public boolean hasGraphicsCard() {
        return hasGraphicsCard;
    }

    public boolean hasBluetooth() {
        return hasBluetooth;
    }

    @Override
    public String toString() {
        return "Computer [CPU = " + CPU + ", RAM = " + RAM + ", storage = " + storage
                + ", hasGraphicsCard = " + hasGraphicsCard + ", hasBluetooth = " + hasBluetooth + "]";
    }

    public static class Builder {

        private final String CPU;
        private final String RAM;

        private String storage = "256GB";
        private boolean hasGraphicsCard = false;
        private boolean hasBluetooth = false;

        public Builder(String CPU, String RAM) {
            this.CPU = CPU;
            this.RAM = RAM;
        }

        public Builder storage(String storage) {
            this.storage = storage;
            return this;
        }

        public Builder hasGraphicsCard(boolean hasGraphicsCard) {
            this.hasGraphicsCard = hasGraphicsCard;
            return this;
        }

        public Builder hasBluetooth(boolean hasBluetooth) {
            this.hasBluetooth = hasBluetooth;
            return this;
        }

        public Computer build() {
            return new Computer(this);
        }
    }
}
