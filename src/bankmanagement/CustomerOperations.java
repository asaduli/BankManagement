/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bankmanagement;

/**
 *
 * @author Asadul Islam
 */
public interface CustomerOperations {
    public void insetCustomer(Customer c);
    public void removeCustomer(Customer c);
     Customer getCustomer(int nid);
     public void showAllCustomer();
}
