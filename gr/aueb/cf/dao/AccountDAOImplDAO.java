package gr.aueb.cf.dao;

import gr.aueb.cf.model.Account;

public class AccountDAOImplDAO extends AbstractDAO<Account> implements IAccountDAO {

    public AccountDAOImplDAO() {
        // that is how we insert the class.
        this.setPersistentClass(Account.class);
    }
}
