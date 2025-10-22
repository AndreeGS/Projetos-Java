package factory;

import loan.Loan;
import loan.Personal;

public class LoanFactory {

    public static final String PESSOAL = "Pessoal";
    public static final String CONSIGNADO = "Consignado";

    public static Loan make(String type) {
        switch (type) {
            case PESSOAL:
                return new Personal();
            case CONSIGNADO:
                return new Loan();
            default:
                throw new IllegalArgumentException("Tipo não permitido: " + type);
        }
    }
}
