package outout.services.AccountService;

import outout.model.User;
import outout.repository.AccountRepository.Exceptions.AccountRepositoryException;
import outout.view.AccountCredentials;

public interface IAccountService {

    public void createAccount(AccountCredentials accountCredentials) throws AccountRepositoryException;

    public User getAccount(String username);

}
