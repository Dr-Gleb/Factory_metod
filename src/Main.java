public class Main {
    public static void main(String[] args) {
        AccountFactory accountFactory = new AccountFactory();
        Account mailAccount = accountFactory.getAccount("mail");
        mailAccount.messageAboutClass();
    }
}