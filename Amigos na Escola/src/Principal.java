
import java.io.File;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.*;
import javax.swing.JOptionPane;

public class Principal {

    public static void main(String args[]) {
        JanelaSimples janela = new JanelaSimples();
        int opcao1;

        Scanner s = new Scanner(System.in);
        do {
            System.out.println("\n-----------------<<MENU>>------------------\n\n");
            while (true) {
                try {
                    Menu m = new Menu();
                    int opcao = m.ler();
                    opcao1 = opcao;
                    switch (opcao) {
                        case 0:
                            Aluno a = new Aluno();
                            a.lerDados();
                            BaseDadoAlunos.adicionar(a);
                            BaseDadoAlunos.cadastrar(a);
                            System.out.println("Aluno cadastrado com sucesso");
                            break;
                        case 1:
                            Aluno ap = new AlunoPosGraduacao();
                            ap.lerDados();
                            BaseDadoAlunos.adicionar(ap);
                            BaseDadoAlunos.cadastrar(ap);
                            System.out.println("Aluno cadastrado com sucesso");
                            break;
                        case 2:
                            Curso c = new Curso();
                            c.lerDados();
                            BaseDadosCursos.adicionar(c);
                            BaseDadosCursos.cadastrar(c);
                            System.out.println("Curso cadastrado com sucesso");
                            break;
                        case 3:
                            Disciplina d = new Disciplina();
                            d.lerDados();
                            BaseDadosDisciplinas.adicionar(d);
                            BaseDadosDisciplinas.cadastrar(d);
                            System.out.println("Disciplina cadastrada com sucesso");
                            break;
                        case 4:
                            ProjetoPesquisa pp = new ProjetoPesquisa();
                            pp.lerDados();
                            System.out.println("Digite o nome do professor responsavel pelo projeto");
                            String profResponsavel = s.nextLine();
                            Professor p2 = BaseDadosProfessores.buscar(profResponsavel);
                            pp.setProfessorResponsavel(p2);
                            BaseDadosProjetos.adicionar(pp);
                            BaseDadosProjetos.cadastrar(pp);
                            System.out.println("Projeto cadastrado com sucesso");
                            break;
                        case 5:
                            Tecnico t = new Tecnico();
                            t.lerDados();
                            t.calcSalario();
                            BaseDadosTecnicos.adicionar(t);
                            BaseDadosTecnicos.cadastrar(t);
                            System.out.println("Tecnico cadastrado com sucesso");
                            break;
                        case 6:
                            System.out.println("Digite o codigo do projeto");
                            int codprojeto = s.nextInt();
                            ProjetoPesquisa ppes = BaseDadosProjetos.buscar(codprojeto);
                            System.out.println("Digite o nome do pesquisador do projeto " + codprojeto);
                            String nome = s.nextLine();
                            Pesquisador pes = ppes.buscar(nome);
                            pes.mostrarDados();

                            break;
                        case 7:
                            System.out.println("Digite o codigo do projeto");
                            int codprojeto2 = s.nextInt();
                            ProjetoPesquisa ppes2 = BaseDadosProjetos.buscar(codprojeto2);
                            ppes2.mostrarDadoss();
                            break;
                        case 8:
                            System.out.println("Digite o codigo do projeto");
                            int codprojeto3 = s.nextInt();
                            ProjetoPesquisa ppes3 = BaseDadosProjetos.buscar(codprojeto3);
                            System.out.println("Digite o nome do aluno");
                            String nomeA = s.nextLine();
                            Aluno a9 = BaseDadoAlunos.buscar(nomeA);
                            ppes3.adicionar(a9);

                            break;
                        case 9:
                            System.out.println("Digite o codigo do projeto");
                            int codprojeto4 = s.nextInt();
                            ProjetoPesquisa ppes4 = BaseDadosProjetos.buscar(codprojeto4);
                            System.out.println("Digite o nome do professor");
                            String nomeP = s.nextLine();
                            Professor p9 = BaseDadosProfessores.buscar(nomeP);
                            ppes4.adicionar(p9);
                            break;
                        case 10:
                            Professor pr = new Professor();
                            pr.lerDados();
                            pr.calcSalario();
                            BaseDadosProfessores.adicionar(pr);
                            BaseDadosProfessores.cadastrar(pr);
                            System.out.println("Professor cadastrado com sucesso");
                            break;
                        case 11:
                            if(new File("alunos.dat").canRead()==true){
         try{
             FileInputStream in = new FileInputStream("alunos.dat");
             ObjectInputStream objIn = new ObjectInputStream(in);
             ArrayList<Aluno> alunos = (ArrayList<Aluno>) objIn.readObject();
            BaseDadoAlunos.recebeArray(alunos);
         }catch (Exception e ){
             e.printStackTrace();
         }
           
     }else{
         System.out.println("Não foi possivel carregar o arquivo de alunos");
     }
                             if(new File("cursos.dat").canRead()==true){
         try{
             FileInputStream in = new FileInputStream("cursos.dat");
             ObjectInputStream objIn = new ObjectInputStream(in);
             ArrayList<Curso> cursos = (ArrayList<Curso>) objIn.readObject();
            BaseDadosCursos.recebeArray(cursos);
         }catch (Exception e ){
             e.printStackTrace();
         }
           
     }else{
         System.out.println("Não foi possivel carregar o arquivo de cursos");
     } if(new File("disciplinas.dat").canRead()==true){
         try{
             FileInputStream in = new FileInputStream("disciplinas.dat");
             ObjectInputStream objIn = new ObjectInputStream(in);
             ArrayList<Disciplina> disciplinas = (ArrayList<Disciplina>) objIn.readObject();
            BaseDadosDisciplinas.recebeArray(disciplinas);
         }catch (Exception e ){
             e.printStackTrace();
         }
           
     }else{
         System.out.println("Não foi possivel carregar o arquivo de disciplinas");
     } if(new File("professores.dat").canRead()==true){
         try{
             FileInputStream in = new FileInputStream("professores.dat");
             ObjectInputStream objIn = new ObjectInputStream(in);
             ArrayList<Professor> professores = (ArrayList<Professor>) objIn.readObject();
            BaseDadosProfessores.recebeArray(professores);
         }catch (Exception e ){
             e.printStackTrace();
         }
           
     }else{
         System.out.println("Não foi possivel carregar o arquivo de professores");
     } if(new File("projetos.dat").canRead()==true){
         try{
             FileInputStream in = new FileInputStream("projetos.dat");
             ObjectInputStream objIn = new ObjectInputStream(in);
             ArrayList<ProjetoPesquisa> projetos = (ArrayList<ProjetoPesquisa>) objIn.readObject();
            BaseDadosProjetos.recebeArray(projetos);
         }catch (Exception e ){
             e.printStackTrace();
         }
           
     }else{
         System.out.println("Não foi possivel carregar o arquivo de projetos");
     } if(new File("tecnicos.dat").canRead()==true){
         try{
             FileInputStream in = new FileInputStream("tecnicos.dat");
             ObjectInputStream objIn = new ObjectInputStream(in);
             ArrayList<Funcionario> tecnicos = (ArrayList<Funcionario>) objIn.readObject();
            BaseDadosTecnicos.recebeArray(tecnicos);
         }catch (Exception e ){
             e.printStackTrace();
         }
           
     }else{
         System.out.println("Não foi possivel carregar o arquivo de tecnicos");
     }

                    }

                    break;
                } catch (OpcaoInvalidaException e) {
                    System.out.println(e);
                }

            }
        } while (opcao1 != 12);

    }
}

/*
        Aluno a99 = new Aluno();
        a99.lerDados();
        Professor j = new Professor();
        j.lerDados();
        BaseDadosProfessores.adicionar(j);

        ProjetoPesquisa pp1 = new ProjetoPesquisa();
        pp1.lerDados();
        ProjetoPesquisa.adicionar(j);
        System.out.println("Digite o nome do professor responsavel pelo projeto");
        String profResponsavel = s.nextLine();
        Professor p2 = BaseDadosProfessores.buscar(profResponsavel);
        pp1.setProfessorResponsavel(p2);
        ProjetoPesquisa.adicionar(a99);
        BaseDadosProjetos.adicionar(pp1);

        System.out.println("Entre com o codigo do projeto:");
        int codprojeto = s.nextInt();
        ProjetoPesquisa pp = BaseDadosProjetos.buscar(codprojeto);
        pp.mostrarDadoss();

        Curso c = new Curso();
        c.lerDados();
        BaseDadosCursos.adicionar(c);
        c.mostrarDados();

        Aluno al = new Aluno();
        al.lerDados();
        System.out.println("Entre com o codigo do curso");
        String codcurso = s.nextLine();
        Curso c1 = BaseDadosCursos.buscar(codcurso); // busca no array o curso correpondente ao codigo, c1 recebe o objeto encontrado 
        al.setCurso(c1);
        BaseDadoAlunos.adicionar(al);
        al.mostrarDados();

        AlunoPosGraduacao a2 = new AlunoPosGraduacao();
        a2.lerDados();
        System.out.println("Entre com o codigo do curso");
        String codcurso1 = s.nextLine();
        Curso c2 = BaseDadosCursos.buscar(codcurso1); // busca no array o curso correpondente ao codigo, c1 recebe o objeto encontrado 
        a2.setCurso(c2);
        BaseDadoAlunos.adicionar(a2);
        a2.mostrarDados();

        Disciplina d = new Disciplina();
        d.lerDados();
        System.out.println("Entre com o codigo do curso");
        String codcurso2 = s.nextLine();
        Curso c3 = BaseDadosCursos.buscar(codcurso2); // busca no array o curso correpondente ao codigo, c1 recebe o objeto encontrado 
        d.setCurso(c3);
        d.mostrarDados();
        BaseDadosDisciplinas.adicionar(d);

        Professor p = new Professor();
        p.lerDados();
        p.calcSalario();
        p.mostrarDados();
        BaseDadosProfessores.adicionar(p);

        Tecnico t = new Tecnico();
        t.lerDados();
        t.calcSalario(22, 33);
        t.mostrarDados();
        Tecnico t2 = new Tecnico();
        t2.lerDados();
        t2.calcSalario();
        t2.mostrarDados();
        BaseDadosTecnicos.adicionar(t);
        BaseDadosTecnicos.adicionar(t2);

        Funcionario.setPisoSalarial(678);
        Tecnico.setValorHoraExtra(30);

        FolhaPagamento.relatorio(BaseDadosProfessores.getArray());
        FolhaPagamento.somaFolha(BaseDadosTecnicos.getArray());

        System.out.printf("\n o total da folha de pagamento eh: %1.2f \n ", FolhaPagamento.getTotalFolha());
        System.out.printf("O total de encargos eh: %1.2f \n\n", FolhaPagamento.getTotalEncargos());
        
 */
