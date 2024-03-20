package outout.services.AuthenticationService.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import outout.repository.AccountRepository.IAccountRepository;
import outout.services.AccountService.IAccountService;
import outout.services.AuthenticationService.IAuthenticationService;

@Component("authenticationService")
public class AuthenticationService implements IAuthenticationService {
    @Autowired
    private IAccountRepository accountRepository;
    @Override
    public void authenticateUser(String username, String password) {
    }
}
