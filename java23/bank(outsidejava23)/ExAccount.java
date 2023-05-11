package bank;

import bank.Account;
import mypkg.Util;
import java.io.*;

public class ExAccount extends Account implements Serializable {
    boolean state;

    public ExAccount() {
        super();
        state = true;
    }

    public boolean getState() {
        return state;
    }

    public void Delete()
    {
        state = false;
    }

    public String toString()
    {
        String s=super.toString()+"\nState"+state;
        return s;
    }

    public void display()
    {
        Util.display(toString());
    }
}