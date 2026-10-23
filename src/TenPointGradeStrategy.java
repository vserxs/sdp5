import java.util.Locale;

public class TenPointGradeStrategy implements GradeStrategy{

    @Override
    public String calculate(int score){
        double grade = score / 10.0;
        return String.format(Locale.US,"%.1f/10",grade);
    }
}
