package balance;

import java.util.ArrayList;
import java.util.Iterator;

public class Bank {

    private ArrayList<Balance> balanceList;
    Iterator<Balance> itr;

    public Bank() {
        balanceList = new ArrayList<Balance>();
    }

    public void newAccount(Balance e) {
        balanceList.add(e);
    }

    public Balance searchAccount(long accountNum) {
        itr = balanceList.iterator();
        while (itr.hasNext()) {
            Balance b = new Balance(itr.next());
            if (b.getAccountNum() == accountNum)
                return b;
        }
        return null;
    }

    public long getBalanceListSize() {
        return balanceList.size();
    }
}