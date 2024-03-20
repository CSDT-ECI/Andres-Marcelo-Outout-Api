package outout.services.AccountService.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;
import outout.model.User;
import outout.services.AccountService.IAccountService;
import outout.repository.AccountRepository.IAccountRepository;
import outout.view.AccountCredentials;

@Component("accountService")
public class AccountService implements IAccountService {

    @Autowired
    private IAccountRepository accountRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Override
    public void createAccount(AccountCredentials accountCredentials) {
        User user = new User();
        user.setUsername(accountCredentials.getUsername());
        user.setPassword(passwordEncoder.encode(accountCredentials.getPassword()));
        accountRepository.createAccount(user);
    }

    @Override
    public User getAccount(String username) {
        return null;
    }

    private boolean CheckCredentials(String username, String password) {
        return false;
    }
}
