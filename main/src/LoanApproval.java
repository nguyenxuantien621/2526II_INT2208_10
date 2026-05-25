public class LoanApproval {

    public String evaluateLoan(int age, double income, int creditScore, String employment) {
        if (age < 18 || age > 65) {
            return "Invalid Input";
        }
        if (income < 5.0 || income > 500.0) {
            return "Invalid Input";
        }
        if (creditScore < 300 || creditScore > 850) {
            return "Invalid Input";
        }
        if (!employment.equals("C") && !employment.equals("F")) {
            return "Invalid Input";
        }

        String riskLevel;
        if (creditScore >= 300 && creditScore <= 500) {
            riskLevel = "HIGH";
        } else if (creditScore >= 501 && creditScore <= 700) {
            riskLevel = "MEDIUM";
        } else {
            riskLevel = "LOW";
        }

        if (riskLevel.equals("HIGH")) {
            return "REJECT";
        }

        if (income < 15.0) {
            if (riskLevel.equals("MEDIUM") || employment.equals("F")) {
                return "REJECT";
            }
            return "MANUAL REVIEW";
        } else {
            if (employment.equals("C")) {
                return "APPROVE";
            }
            return "MANUAL REVIEW";
        }
    }
}