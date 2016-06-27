
import java.util.*;
import java.util.Scanner;

public class Menu {

    Scanner s = new Scanner(System.in);

    public int ler() throws OpcaoInvalidaException {

        System.out.println("0 - Cadastrar Aluno\n1 - Cadastrar Aluno de Pos graduacao \n"
                + "2 - Cadastrar Curso \n3 - Cadastrar Disciplina \n4 - Cadastrar Projeto de Pesquisa \n"
                + "5 - Cadastrar Tecnico \n6 - Procurar Pequisadores Cadastrados nos Projetos \n7 - Procurar Projetos de Pesquisa Cadastrados \n8 - Cadastrar Alunos em determinado Projeto \n9 - Cadastrar Professores em determinado Projeto"
                + "\n10- Cadastrar Professor\n11- Carregar Base de Dados\n12-Sair \n\n>> Escolha a opcao: ");
        int opcao = s.nextInt();
        if (opcao < 0 || opcao > 12) {
            throw new OpcaoInvalidaException("Digite um numero de opcao valido");
        }
        return opcao;
    }
}
