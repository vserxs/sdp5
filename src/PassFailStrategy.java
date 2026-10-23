public class PassFailStrategy implements GradeStrategy{

    @Override
    public String calculate(int score) {
        if (score >= 60) {
            return "Pass";
        } else {
            return "Fail";
        }
    }
}
