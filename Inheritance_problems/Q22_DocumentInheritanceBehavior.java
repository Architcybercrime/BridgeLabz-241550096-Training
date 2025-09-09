/**
 * Base controller that defines the lifecycle.
 * Subclasses should override handle() to add behavior.
 */
class Controller {
    void handle(){ System.out.println("Base handle"); }
}

/** HomeController extends Controller and customizes handle(). */
class HomeController extends Controller {
    @Override void handle(){ System.out.println("Home handle"); }
}

public class Q22_DocumentInheritanceBehavior {
    public static void main(String[] args){ new HomeController().handle(); }
}