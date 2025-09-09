class SecureConfig {
    public final void load(){ System.out.println("Loading secure config (cannot override)"); }
    void info(){ System.out.println("General info"); }
}

class AppConfig extends SecureConfig {
    // Attempting to override load() would cause a compile error; we don't do it.
    @Override void info(){ System.out.println("App-specific info"); }
}

public class Q16_MarkSuperclassMethodsFinalIfNeeded {
    public static void main(String[] args){ new AppConfig().load(); new AppConfig().info(); }
}