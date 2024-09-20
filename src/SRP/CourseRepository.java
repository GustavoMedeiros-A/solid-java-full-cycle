package SRP;

import utils.ConnectionFake;

public class CourseRepository {
    private ConnectionFake connectionFake;

    public CourseRepository(ConnectionFake connectionFake) {
        this.connectionFake = connectionFake;
    }

    public void createCategory(Course course) {
        connectionFake.insert(course.getName());
        connectionFake.insert(course.getDescription());
        connectionFake.insert(course.getCategory());
    }
}
