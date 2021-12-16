package design_patterns;

public class Singleton {
    private Singleton(){}

    private static Singleton single;

    public static Singleton getSingle(){
        if (single == null){
            single = new Singleton();
        }
        return single;
    }
}
