package outout.repository.AccountRepository;

import org.h2.jdbc.JdbcSQLException;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import outout.model.User;
import outout.repository.AccountRepository.Exceptions.AccountRepositoryException;

import javax.persistence.PersistenceException;

public interface IAccountRepository {

    public void createAccount(User user) throws AccountRepositoryException;

    public User getAccount(String username);

}
