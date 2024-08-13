package week10.property;

import week08.account.Account;

public class PolindromeAccount implements Property<Account> {

    @Override
    public boolean test(Account i) {
        return i.getBalance() == 0;
    }

}
