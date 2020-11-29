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
public class FixedAccount extends Account{
    
    int tenureYear;

    public int getTenureYear() {
        return tenureYear;
    }

    public void setTenureYear(int tenureYear) {
        this.tenureYear = tenureYear;
    }
    
    @Override
    public void showinfo(){
        System.out.println("User info for fixed Account holder");
    }
    
    
}
