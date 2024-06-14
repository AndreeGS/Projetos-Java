import Models.EmployeModel;

public class Main {
    public static void main(String[] args) {

        int selecao;
        Scanner sc = new Scanner(System.in);
        List <EmployeModel> funcionarios = new List<EmployeModel>();

        System.out.println("Bem vindo ao sistema de RH");

        do {
            System.out.println("1-Cadastrar Colaborador");
            System.out.println("2-Realizar um aumento de salario");
            System.out.println("3-Fazer uma redução de salario");
            System.out.println("4-Alterar status do colaborador");
            System.out.println("5-Realizar exclusao do colaborador na base");
            System.out.println("6-Sair do programa");

            selecao = sc.nextInt();

            switch (selecao){
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    System.out.println("Para qual id de colaborador você deseja excluir: ");
                    int idExlusao = sc.nextInt();
                    break;
                case 6:
                    System.out.println("Saindo do programa :)");
                    break;
            }
        } while (selecao != 6);
    }
}