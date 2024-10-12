public class Alunos {

    private String nome;

    private int codigoAluno;

    private int mediaAluno;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void cadastrarNome(String nome) {
        setNome(nome);
    }

    public void imprimirNome() {
        System.out.println(this.nome);
    }

    public int getCodigoAluno() {
        return codigoAluno;
    }

    public void setCodigoAluno(int codigoAluno) {
        this.codigoAluno = codigoAluno;
    }

    public void cadastrarCodigo(int codigoAluno) {
        setCodigoAluno(codigoAluno);
    }

    public void imprimirCodigo() {
        System.out.println(this.codigoAluno);
    }

    public int getmediaAluno() {
        return mediaAluno;
    }

    public void setNotasAluno(int mediaAluno) {
        this.mediaAluno = mediaAluno;
    }











}
