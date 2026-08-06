package Due_8_4;

import java.util.LinkedList;
public class Customer {
    private int customerID;
    private String customerName;
    private String preferredShop;

    public String getPreferredShop() {
        return preferredShop;
    }

    public void setPreferredShop(String shop) {
        preferredShop = shop;
    }

    public int changePreferredShop(LinkedList<Customer> customers, String preferredShop, String newShop) {
        int count = 0;

        for (int i = 0; i < customers.size(); i++) {
            Customer customer = customers.get(i);
            if (customer.getPreferredShop().equals(preferredShop)) {
                customer.setPreferredShop(newShop);
                count++;
            }
        }
        return count;
    }
}
