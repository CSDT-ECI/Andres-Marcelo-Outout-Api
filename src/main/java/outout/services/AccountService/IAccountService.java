package outout.services.AccountService;

import outout.model.User;
import outout.view.AccountCredentials;

public interface IAccountService {

    public void createAccount(AccountCredentials accountCredentials);

    public User getAccount(String username);

}
