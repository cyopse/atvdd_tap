import java.util.ArrayList;

public class ProcessadorDeInvestimentos {

    public static ArrayList<ContaComum> contasComuns(){
        ArrayList<ContaComum> contascomums = new ArrayList<>();
        ContaComum conta1 = new ContaComum(10);
        ContaComum conta2 = new ContaComum(10);
        ContaComum conta3 = new ContaComum(10);
        contascomums.add(conta1);
        contascomums.add(conta2);
        contascomums.add(conta3);
        return contascomums;
    }

    public static void main(String[] args){

        for (ContaComum conta : contasComuns()) {
            conta.rende();
            System.out.println("novo saldo: ");
            System.out.println(conta.getSaldo());
        }
    }
}
