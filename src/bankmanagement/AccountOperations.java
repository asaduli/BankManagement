
package bankmanagement;

/**
 *
 * @author Asadul Islam
 */
public interface AccountOperations {
    
   public void insertAccount(Account a);
   public void removeAccount(Account a);
   Account getAccount(int accountNumber);
   public void showAllAccounts();
}
