package utils;

public class ConnectionFake {

    public ConnectionFake() {}

    public String createConnection() {
        return "Connection created";
    }

    public String insert(String value) {
        return "Insert value inserted" + value;
    }

}
