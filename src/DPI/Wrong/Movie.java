package DPI.Wrong;

public class Movie {

    public String name;
    public DramaCategory category;


    // Dependency of implementation
    // Movie depende of the Drama classe
    public DramaCategory getCategory() {
        return new DramaCategory();
    }

    public void setCategory(DramaCategory category) {
        this.category = category;
    }

}

