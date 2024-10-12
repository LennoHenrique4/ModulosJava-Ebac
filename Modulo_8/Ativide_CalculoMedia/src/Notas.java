public class Notas {

    private int prova_1;

    private int prova_2;

    private int prova_3;

    private int prova_4;



    public int getProva_1() {
        return prova_1;
    }

    public void setProva_1(int prova_1) {
        this.prova_1 = prova_1;
    }

    public int getProva_2() {
        return prova_2;
    }

    public void setProva_2(int prova_2) {
        this.prova_2 = prova_2;
    }

    public int getProva_3() {
        return prova_3;
    }

    public void setProva_3(int prova_3) {
        this.prova_3 = prova_3;
    }

    public int getProva_4() {
        return prova_4;
    }
    public void setProva_4(int prova_4) {
        this.prova_4 = prova_4;
    }

    public void cadastrarProva1 (int prova_1) {
        setProva_1(prova_1);
    }
    public void imprimirProva1() {
        System.out.println(this.prova_1);
    }
    public void cadastrarProva2 (int prova_2) {
        setProva_2(prova_2);
    }

    public void imprimirProva2() {
        System.out.println(this.prova_2);
    }

    public void cadastrarProva3(int prova_3) {
        setProva_3(prova_3);
    }
    public void imprimirProva3() {
        System.out.println(this.prova_3);
    }

    public void cadastrarProva4 ( int prova_4){
        setProva_4(prova_4);
    }
    public void imprimirProva4 () {
        System.out.println(this.prova_4);
    }

}