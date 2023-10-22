package test;

import main.Account;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

public class AccountTest {

    @Test
    public void testAccount() throws Exception {
        //초기 입금액을 명시적으로 설정하지 않고는 계좌 생성 불가
        Account account = new Account(10000);
    }

    @Test
    public void testGetBalance() throws Exception {
        //10000원으로 계좌 생성
        Account account = new Account(10000);

        // 잔고 조회 결과 일치
        assertEquals(10000, account.getBalance());

        account = new Account(1000);
        assertEquals(1000, account.getBalance());

        account = new Account(0);
        assertEquals(0, account.getBalance());
    }
}