package movies;

public class Movie {
    private String name;
    private String category;

    // constructor method
    public Movie(String name, String category) {
        this.name = name;
        this.category = category;
    }
    // getter method of name field
    public String getName() {
        return name;
    }
    // setter method of name field
    public void setName(String name) {
        this.name = name;
    }
    // getter method of category field
    public String getCategory() {
        return category;
    }
    // setter method of category field
    public void setCategory(String category) {
        this.category = category;
    }
    // toString method
//    public String toString() {
//        return category;
//    }
}
