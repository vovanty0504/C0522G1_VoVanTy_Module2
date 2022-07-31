package on_tap.service.impl;

import on_tap.modle.BankAccount;
import on_tap.service.ISavingsCardService;
import on_tap.utils.ReadWriteBankAccountUtil;

import java.util.List;
import java.util.Scanner;

public class SavingsCardService implements ISavingsCardService {
    private static final Scanner SCANNER = new Scanner(System.in);
    private static final String PATH = "src/on_tap/date/savingscard.csv";

    @Override
    public void add() {

    }

    @Override
    public void remove() {

    }

    @Override
    public void display() {
        List<BankAccount> bankAccountList = ReadWriteBankAccountUtil.readBankAccountFile(PATH);
        for (BankAccount bankAccount : bankAccountList) {
            System.out.println(bankAccount);
        }
    }

    @Override
    public void find() {

    }
}
