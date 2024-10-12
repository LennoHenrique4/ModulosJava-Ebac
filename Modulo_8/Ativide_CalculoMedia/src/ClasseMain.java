public class ClasseMain {

    public static void main(String args[]) {

        System.out.print("   Ficha do Aluno: ");
        Alunos alunos = new Alunos();


        alunos.cadastrarNome("Lenno");
        System.out.print(alunos.getNome());

        System.out.print(" ");
        alunos.cadastrarCodigo(1);
        System.out.println(alunos.getCodigoAluno());
        System.out.println("");

        notasMedia();

    }

    public static void notasMedia() {

        Notas notas = new Notas();



        System.out.print("   Nota da Prova 1:");
        System.out.print(" ");
        notas.cadastrarProva1(70);
        System.out.println(notas.getProva_1());
        int nota1 = notas.getProva_1();

        System.out.print("   Nota da Prova 2:");
        System.out.print(" ");
        notas.cadastrarProva2(70);
        System.out.println(notas.getProva_2());
        int nota2 = notas.getProva_2();

        System.out.print("   Nota da Prova 3:");
        System.out.print(" ");
        notas.cadastrarProva3(70);
        System.out.println(notas.getProva_2());
        int nota3 = notas.getProva_3();

        System.out.print("   Nota da Prova 4:");
        System.out.print(" ");
        notas.cadastrarProva4(70);
        System.out.println(notas.getProva_2());
        int nota4 = notas.getProva_4();

        System.out.println("");
        System.out.print("   Média: ");
        int media = (nota1 + nota2 + nota3 + nota4) / 4;
        System.out.print(media);

    }

}







