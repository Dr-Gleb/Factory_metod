public class AccountFactory {
     final String MAIL="mail";
     final String GOOGLE="google";

    public Account getAccount(String accountType){
        if(MAIL.equals(accountType)){
            return new MailAccount();
        }
        else if(GOOGLE.equals(accountType)){
            return new GoogleAccount();
        }
        else return null;
    }
}
