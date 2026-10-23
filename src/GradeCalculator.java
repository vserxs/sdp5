public class GradeCalculator {
    private GradeStrategy strategy;

    public GradeCalculator(GradeStrategy strategy){
        setStrategy(strategy);
    }

    public void setStrategy(GradeStrategy strategy){
        if (strategy == null){
            throw new IllegalArgumentException("Strategy cant be null");
        }
        this.strategy = strategy;
    }

    public String calculateGrade(int score){
        if (score < 0 || score > 100) {
            throw new IllegalArgumentException("Score must be between 0 and 100");
        }
        return strategy.calculate(score);
    }
}
