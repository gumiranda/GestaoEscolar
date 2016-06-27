
import java.io.Serializable;
import java.util.*;

public class AlunoPosGraduacao extends Aluno implements Serializable {

    private String graduacao;
    private String instituicao;
    private int anoInicio;
    private int anoConclusao;
    Curso curso;

    public void setCurso(Curso curso) {
        this.curso = curso;
    }

    public boolean setGraduacao(String graduacao) {
        if (graduacao.length() > 0) {
            this.graduacao = graduacao;
            return true;
        } else {
            System.out.println("Graduacao invalida!");
            return false;
        }
    }

    public boolean setInstituicao(String instituicao) {
        if (instituicao.length() > 0) {
            this.instituicao = instituicao;
            return true;
        } else {
            System.out.println("Instituicao inválida!");
            return false;
        }
    }

    public void mostrarDados() {
        super.mostrarDados();
        System.out.println("Instituicao de ensino: " + this.instituicao);
        System.out.println("Graduacao:" + this.graduacao);
        System.out.println("Ano de inicio:" + this.anoInicio);
        System.out.println("Ano de conclusao:" + this.anoConclusao);
        System.out.println("Tipo de aluno" + this.getTipo());

    }

    public void lerDados() {

        Scanner s = new Scanner(System.in);
        super.lerDados();
        System.out.println("Digite a graduacao do aluno:");
        while (!setGraduacao(s.nextLine()));
        System.out.println("Digite a instituicao do aluno");
        while (!setInstituicao(s.nextLine()));
        System.out.println("Digite o ano de inicio");
        while (true) {
            try {
                anoInicio = s.nextInt();
                System.out.println("Ok");
                break;
            } catch (InputMismatchException e) {
                System.out.println("Erro :" + e.toString());
                System.out.println("Digite novamente");
            }
        }
        System.out.println("Digite o ano de conclusao");
        while (true) {
            try {
                anoConclusao = s.nextInt();
                System.out.println("Ok");
                break;
            } catch (InputMismatchException e) {
                System.out.println("Erro :" + e.toString());
                System.out.println("Digite novamente");
            }
        }

    }

}
