package creational.singleton;

public class CustomLogger {
    private static CustomLogger customLogger;
    private CustomLogger(){    }
    public static synchronized CustomLogger logger(){
        if(customLogger == null){
            customLogger = new CustomLogger();
        }
        return customLogger;
    }

    public void info(String message){
        System.out.println("INFO: "+message);
    }
}
