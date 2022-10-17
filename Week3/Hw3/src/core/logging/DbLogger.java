package core.logging;

public class DbLogger implements ILogger {
    @Override
    public void log(String data) {
        System.out.println(data+ "logged to database.");
    }
}
