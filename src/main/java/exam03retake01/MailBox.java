package exam03retake01;

import java.util.ArrayList;
import java.util.List;

public class MailBox {
    private List<Mail> mails;

    public List<Mail> findByCriteria(String criteria) {
        if (criteria.split(":")[0].equals("from")) {
            return getReceivedMailsByName(criteria.split(":")[1]);
        }
        if (criteria.split(":")[0].equals("to")){
            return getSendedMailsByName(criteria.split(":")[1]);
        } else {
            return getMailsByCriteria(criteria);
        }
    }

    private List<Mail> getMailsByCriteria(String criteria) {
        List<Mail> result = new ArrayList<>();
        for (Mail mail : mails){
            if (mail.getMessage().contains(criteria) || mail.getSubject().contains(criteria)){
                result.add(mail);
            }
        }
        return result;
    }

    private List<Mail> getSendedMailsByName(String criteria) {
        List<Mail> result = new ArrayList<>();


        return result;
    }

    private List<Mail> getReceivedMailsByName(String criteria){
        List<Mail> result = new ArrayList<>();
        for (Mail mail : mails) {
            if (mail.getFrom().equals(criteria)){
                result.add(mail);
            }
        }
        return result;
    }

}
