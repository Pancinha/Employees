import javax.swing.*;
import java.util.ArrayList;

public class CadastrarFunc {
    static int i;


    public static void main(String[]args){
        ArrayList<Funcionario> ListaFuncionario = new ArrayList<>();

        int flag = 5;

        while (flag<10 ) {
            int menu = Integer.parseInt(JOptionPane.showInputDialog("Selecione uma opção: \n"+"1-Cadastro  2- Todos Funcionarios"));
            switch (menu) {
                case 1:
                    flag=11;
                    // cadastramento
                    String nome = JOptionPane.showInputDialog("nome: ");
                    int dependentes = Integer.parseInt(JOptionPane.showInputDialog("Número de Dependentes: "));
                    int cpf = Integer.parseInt(JOptionPane.showInputDialog("Número do CPF: "));
                    String estadoCivil = JOptionPane.showInputDialog("Estado civil: ");
                    flag = 5;

                    Funcionario funcionario1 = new Funcionario(nome, dependentes, cpf, estadoCivil);
                    break;


                case 2:
                    flag=12;
                    //exibir todos funcionarios
                    for (i =0; i<ListaFuncionario.size(); i++){
                        JOptionPane.showMessageDialog(null,""+ListaFuncionario.get(i));
                        JOptionPane.showMessageDialog(null,"Está dentro do For");
                    }
                    break;

                case 3:
                    //retirar dependentes

                case 4:
                    // todos dependentes de um funcionario
                flag=7;
            }
        }
    }
}