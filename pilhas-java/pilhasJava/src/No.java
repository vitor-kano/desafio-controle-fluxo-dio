public class No {
    private int dado;
    private No reNo = null;

    public No(){

    }

    public No(int dado){
        this.dado = dado;
    }

    public int getDado(){
        return dado;
    }

    public void setDado(int dado){
        this.dado = dado;
    }

    public No getNo(){
        return reNo;
    }

    public void setNo(No reNo){
        this.reNo = reNo;
    }

    @Override
    public String toString(){
        return "No{" + "dado=" + dado + '}';
    }
}
