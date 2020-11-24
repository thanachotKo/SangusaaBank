package SE.project.SangusaaBank.service;

import SE.project.SangusaaBank.data.CreditRepository;
import SE.project.SangusaaBank.model.Credit;
import SE.project.SangusaaBank.model.RegisterForStudyAndNursing;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.Random;

@Service
public class CreditService {

    CreditRepository repository;

    public CreditService(CreditRepository repository) {
        this.repository = repository;
    }

    public void crateCredit (Credit credit) {
        credit.setId(credit.getId());
        repository.savePersonal(credit);
        repository.saveCareer(credit);
        repository.saveCredit(credit);
    }

    public Credit findCredit (String id) {
        try {
            return repository.findById(id);
        } catch (NoSuchElementException e) {
            return null;
        }
    }

    public List<Credit> findAll () {
        return repository.findAll();
    }

    public Boolean check (Credit customerContact) {
        if (customerContact.getPhoneNumber().length() > 10 | customerContact.getPhoneNumber().length() < 10){
            return false;
        }
        if (customerContact.getCompanyPhoneNumber().length() > 9 | customerContact.getCompanyPhoneNumber().length() < 9){
            return false;
        }
        if (customerContact.getId().length() > 13 | customerContact.getId().length() < 13){
            return false;
        }
        String[] phoneNumber = customerContact.getPhoneNumber().split("");
        for (int i = 0; i < customerContact.getPhoneNumber().length(); i++){
            try {
                Integer.parseInt(phoneNumber[i]);
            }catch (NullPointerException e) {
                return false;
            }
        }
        String[] companyPhoneNumber = customerContact.getCompanyPhoneNumber().split("");
        for (int i = 0; i < customerContact.getCompanyPhoneNumber().length(); i++){
            try {
                Integer.parseInt(companyPhoneNumber[i]);
            }catch (NullPointerException e) {
                return false;
            }
        }
        String[] id = customerContact.getId().split("");
        for (int i = 0; i < customerContact.getPhoneNumber().length(); i++){
            try {
                Integer.parseInt(id[i]);
            }catch (NullPointerException e) {
                return false;
            }
        }
        return true;
    }

}
