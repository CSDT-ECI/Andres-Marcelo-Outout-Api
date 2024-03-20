package outout.repository.AccountRepository;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import outout.model.User;

public interface IAccountRepository {

    public void createAccount(User user);

    public User getAccount(String username);

}
