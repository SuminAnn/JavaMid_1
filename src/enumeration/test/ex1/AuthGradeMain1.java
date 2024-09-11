package enumeration.test.ex1;

public class AuthGradeMain1 {

    public static void main(String[] args) {

        AuthGrade[] grades = AuthGrade.values();
        for (AuthGrade authGrade : grades) {
            printAuth(authGrade);
        }
        
    }

    private static void printAuth(AuthGrade grade){
        System.out.println("grade=" + grade.name() + ", level=" + grade.getLevel() + ", 설명=" + grade.getDescription() );
    }
}
