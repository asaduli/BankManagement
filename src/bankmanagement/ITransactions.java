

package bankmanagement;

/**
 *
 * @author Asadul Islam
 */
public interface ITransactions {
    public void deposit (double ammount);
    public void withdraw(double ammount);
    public void transfer(Account a,double ammount);
}
