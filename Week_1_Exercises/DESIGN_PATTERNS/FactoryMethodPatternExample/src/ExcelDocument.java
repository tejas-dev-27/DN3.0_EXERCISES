public class ExcelDocument implements Document {
    @Override
    public void open() {
        System.out.println("Opening Excel Sheet");
    }

    @Override
    public void close() {
        System.out.println("Closing Excel Sheet");
    }
}
