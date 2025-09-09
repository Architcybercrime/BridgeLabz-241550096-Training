// Shallow, readable hierarchy: Base -> Sub
class Report { void render(){ System.out.println("Render report"); } }
class PdfReport extends Report { @Override void render(){ System.out.println("Render PDF report"); } }

public class Q15_AvoidDeepInheritanceHierarchies {
    public static void main(String[] args){ new PdfReport().render(); }
}