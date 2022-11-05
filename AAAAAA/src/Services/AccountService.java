
package Services;

import Model.Account;
import Repositories.AccountRepository;


public class AccountService {
    AccountRepository accountRepository;
    
    public AccountService() {
        accountRepository = new AccountRepository();
    }
    
    public Account login(String user,String pass) {  
        Account account = accountRepository.login(user, pass);
        return account ;  
    }
}
