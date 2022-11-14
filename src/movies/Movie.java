package movies;

public class Movie {
    private String name;
    private String category;

    Movie(String _name, String _category) {
        this.name = _name;
        this.category = _category;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String _name) {
        this.name = name;
    }

    public String getCategory() {
        return this.category;
    }

    public void setCategory(String _category) {
        this.category = _category;
    }


}
