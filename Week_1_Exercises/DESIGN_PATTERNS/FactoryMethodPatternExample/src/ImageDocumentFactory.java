public class ImageDocumentFactory extends DocumentFactory {
    @Override
    public Document createDocument() {
        return new ImageDocument();
    }
}
