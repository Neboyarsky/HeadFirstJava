package Chapter2Objectville.Movie;

class Movie {
    String title;
    String genre;
    int rating;
    void playIt() {
        System.out.println("Playing the movie " + this.title + ".");
    }
}