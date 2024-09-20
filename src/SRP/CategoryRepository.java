package SRP;

import utils.ConnectionFake;

public class CategoryRepository {
    private ConnectionFake connectionFake;

    public CategoryRepository(ConnectionFake connection) {
        this.connectionFake = connection;
    }

    public void createCategory(String category) {
        connectionFake.insert(category);
    }
}
