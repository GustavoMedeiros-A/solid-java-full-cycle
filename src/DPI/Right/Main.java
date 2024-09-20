
package DPI.Right;

public class Main {
    public static void main(String[] args) {


        // Now category is just a abstraction that movie will use
        var dramaCategory = new DramaCategory();
        var terrorCategory = new TerrorCategory();
        Movie movie = new Movie("name drama", dramaCategory);
        Movie movie2 = new Movie("name terror", terrorCategory);

        System.out.println(movie);
        System.out.println(movie2);
    }
}