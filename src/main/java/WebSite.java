public class WebSite {
    public static void main(String[] args) {
        PhpDeveloper developer = new PhpDeveloper();
        Tester tester = new Tester();
        ProjectMenedger projectMenedger = new ProjectMenedger();

        System.out.println("Start program...");
        developer.writeCode();
        tester.testCode();
        projectMenedger.checkCode();
    }
}
