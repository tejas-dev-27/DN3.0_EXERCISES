public class Main {
    public static void main(String[] args) {
        LibraryManagementSys library = new LibraryManagementSys(5);

        library.addBook(new Book("B1", "C", "Dennis MacAlistair Ritchie"));
        library.addBook(new Book("B2", "C++", "Bjarne Stroustrup"));
        library.addBook(new Book("B3", "PYTHON", "Guido van Rossum"));
        library.addBook(new Book("B4", "JAVA", "James Gosling"));
        library.addBook(new Book("B5", "JOURNALISM", "James Augustus Hicky "));

        System.out.println();
        System.out.println("Books available in the library:");
        library.displayBooks();

        String searchTitle = "1984";
        String searchAnotherTitle = "Java";
        Book foundBook = library.linearSearchByTitle(searchTitle);
        if (foundBook != null) {
            System.out.println();
            System.out.println("Found book using linear search: " + foundBook);
        } else {
            System.out.println();
            System.out.println("Book with title \"" + searchTitle + "\" not found using linear search.");
        }

        library.sortBooksByTitle();
        System.out.println();
        System.out.println("Books sorted by Title:");
        library.displayBooks();

        foundBook = library.binarySearchByTitle(searchAnotherTitle);
        if (foundBook != null) {
            System.out.println();
            System.out.println("Found book using binary search: " + foundBook);
        } else {
            System.out.println();
            System.out.println("Book with title \"" + searchTitle + "\" not found using binary search.");
        }
    }
}
