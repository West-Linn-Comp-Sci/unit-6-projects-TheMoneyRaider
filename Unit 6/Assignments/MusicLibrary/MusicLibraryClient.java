/**
 * Write a description of class a here.
 *
 * @Griffin Stober
 * @V1.0
 */
public class MusicLibraryClient {
    public static void main(String[] args) {
        MusicLibrary myLibrary = new MusicLibrary();

        Album a1 = new Album("First", "one Guy", 10, 42.5);
        Album a2 = new Album("This Music", "Some Band", 9, 36);
        Album a3 = new Album("Play", "People", 12, 39.1);
        myLibrary.add(a1);
        myLibrary.add(a2);
        
        System.out.println(myLibrary);

        System.out.println("+++++++++++++++++++++++++++++++++++++++");

        myLibrary.doubleSize();

        System.out.println(myLibrary);

        System.out.println("+++++++++++++++++++++++++++++++++++++++");

        
        myLibrary.remove(3);
        myLibrary.add(a3);
        System.out.println(myLibrary);

        System.out.println("+++++++++++++++++++++++++++++++++++++++");
        // System.out.println(myLibrary.findTitle("Play"));
        // System.out.println(myLibrary.findArtist("one Guy"));
        // System.out.println(myLibrary.findArtist("First2"));
        myLibrary.doubleSize();
        
        myLibrary.sortTime();
        System.out.println(myLibrary);

        System.out.println("+++++++++++++++++++++++++++++++++++++++");
        

        System.out.println(myLibrary);

        System.out.println("+++++++++++++++++++++++++++++++++++++++");
        myLibrary.sortTime();
        System.out.println(myLibrary);
        System.out.println(myLibrary.binarySearchTime(39.1));
        System.out.println("+++++++++++++++++++++++++++++++++++++++");
        myLibrary.sortArtist();
        System.out.println(myLibrary);
        System.out.println(myLibrary.binarySearchArtist("People"));
        
    }
}