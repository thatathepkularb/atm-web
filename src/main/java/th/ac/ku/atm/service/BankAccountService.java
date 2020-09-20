package th.ac.ku.atm.service;

import org.mindrot.jbcrypt.BCrypt;
import org.springframework.stereotype.Service;
import th.ac.ku.atm.model.BankAccount;
import java.util.ArrayList;
import java.util.List;

@Service
public class BankAccountService {
    private ArrayList<BankAccount> bacnkAccountList = new ArrayList<>();

    public void createBankAccount(BankAccount bankAccount) {
        bacnkAccountList.add(bankAccount);
    }

    public List<BankAccount> getBankAccount() {
        return new ArrayList<>(bacnkAccountList);
    }



}
