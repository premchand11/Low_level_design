package creation_design_patterns.singleton;
// Class implementing Eager Loading
class JudgeAnalytics {
    private static final JudgeAnalytics judgeAnalytics = new JudgeAnalytics();

    private JudgeAnalytics() {
        // private constructor to prevent instantiation
    }

    public static JudgeAnalytics getInstance() {
        return judgeAnalytics;
    }
}


//class implementation of lazy loading

class JudgeAnalyticsLazy {
    private static JudgeAnalyticsLazy judgeAnalyticsLazy;
    private JudgeAnalyticsLazy() {
        // private constructor to prevent instantiation
    }
    public static JudgeAnalyticsLazy getInstance() {
        if (judgeAnalyticsLazy == null) {
            judgeAnalyticsLazy = new JudgeAnalyticsLazy();
        }
        return judgeAnalyticsLazy;
    }

}

public class Main {
    public static void main(String[] args) {
        // Attempt to create an instance of judgeAnalyticsLazy
        JudgeAnalyticsLazy judgeAnalyticsLazy = JudgeAnalyticsLazy.getInstance();
        System.out.println("JudgeAnalyticsLazy instance created: " + judgeAnalyticsLazy);
        JudgeAnalytics judgeAnalytics = JudgeAnalytics.getInstance();
        System.out.println("JudgeAnalytics instance created: " + judgeAnalytics);
    }
}
