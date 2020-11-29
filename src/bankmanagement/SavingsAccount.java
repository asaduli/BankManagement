
package bankmanagement;

/**
 *
 * @author Asadul Islam
 */
public class SavingsAccount extends Account {
    
    double interestRate;

    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }
    @Override
     public void showinfo(){
         System.out.println("User info for Savings Account Holder");
     }
    
}
