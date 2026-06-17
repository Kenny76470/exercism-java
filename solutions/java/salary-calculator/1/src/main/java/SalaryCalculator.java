public class SalaryCalculator {

    public double salaryMultiplier(int daysSkipped) {
        double multiplier = (daysSkipped >= 5) ? 0.85 : 1.0;
        return multiplier;
    }

    public int bonusMultiplier(int productsSold) {
        int mutiplier = (productsSold >= 20) ? 13 : 10;
        return mutiplier;
    }

    public double bonusForProductsSold(int productsSold) {
        return (double) (bonusMultiplier(productsSold) * productsSold) ;
    }

    public double finalSalary(int daysSkipped, int productsSold) {
        double total = 1000 * salaryMultiplier(daysSkipped) + bonusForProductsSold(productsSold);
        double finalSalary = (total >= 2000) ? 2000 : total;
        return finalSalary;
    } 
}
