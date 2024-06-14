package Models;

import Enums.StatusEmployeEnum;

public class EmployeModel {
    int id;
    public string name;
    public string email;
    public double salario;
    public StatusEmployeEnum status;


    public EmployeModel(string Name, string Email, double Salario, int id, StatusEmployeEnum Status)
    {
        this.id = id;
        name = Name;
        email = Email;
        salario = Salario;
        status = Status;
    }

    public double aumentarSalario(double aumento){
        return salario += aumento;
    }

    public double diminuirSalario(double reducao){
        return salario -= reducao;
    }

    public StatusEmployeEnum alterarStatus(StatusEmployeEnum novoStatus){
        return status = novoStatus;
    }
}
