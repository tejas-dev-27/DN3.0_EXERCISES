public class ImageDocument implements Document {
    @Override
    public void open() {
        System.out.println("Opening Image");
    }

    @Override
    public void close() {
        System.out.println("Closing Image");
    }
}
