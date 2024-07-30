public class Main {
    public static void main(String[] args) {

        Computer basicComputer = new Computer.Builder("Intel i5", "1 slot 8GB")
                .hasBluetooth(true)
                .build();

        Computer gamingComputer = new Computer.Builder("Ryzen 7", "2 slots 16GB")
                .storage("1TB")
                .hasGraphicsCard(true)
                .hasBluetooth(true)
                .build();

        System.out.println();
        System.out.println("Basic Computer: " + basicComputer);
        System.out.println();
        System.out.println("Gaming Computer: " + gamingComputer);
    }
}
