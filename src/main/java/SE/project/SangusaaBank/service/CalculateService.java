package SE.project.SangusaaBank.service;

import SE.project.SangusaaBank.model.CalculatePersonal;
import org.springframework.stereotype.Service;

@Service
public class CalculateService {

    /*public CalculatePersonal calculateForPersonal (CalculatePersonal personal) {
        float a = 25;
        float b = 100;
        float result = (((Float.parseFloat(personal.getMoneyYourWant())*(a/b)) + Float.parseFloat(personal.getMoneyYourWant()))/Float.parseFloat(personal.getTimeToPayBack()));
        personal.setResult(Float.toString(result));
        return personal;
    }*/

    public CalculatePersonal calculateForStudentAndNurse (CalculatePersonal personal) {
        float a = 15;
        float b = 100;
        float result = ((Float.parseFloat(personal.getMoneyYourWant())*(a/b)) + Float.parseFloat(personal.getMoneyYourWant()))/Float.parseFloat(personal.getTimeToPayBack());
        personal.setResult(Float.toString(result));
        return personal;
    }
}