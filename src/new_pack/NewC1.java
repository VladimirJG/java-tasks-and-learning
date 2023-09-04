package new_pack;

public class NewC1 {
    public static void main(String[] args) {
        NewC0 mail = NewC0.MAIL;
        System.out.println(mail);
        System.out.println( mail.toHtml(mail.getName()));
    }
}
