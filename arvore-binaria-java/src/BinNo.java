public class BinNo<T extends Comparable<T>>{
    private T conteudo;
    private BinNo<T> noEsq;
    private BinNo<T> noDir;

    public BinNo(T conteudo) {
        this.conteudo = conteudo;
        noEsq = noDir = null;
    }

    public BinNo(){

    }

    public T getConteudo(){
        return this.conteudo;
    }

    public BinNo<T> getNoEsq(){
        return this.noEsq;
    }

    public BinNo<T> getNoDir(){
        return this.noDir;
    }

    public void setConteudo(T conteudo){
        this.conteudo = conteudo;
    }

    public void setNoEsq(BinNo<T> noEsq){
        this.noEsq = noEsq;
    }

    public void setNoDir(BinNo<T> noDir){
        this.noDir = noDir;
    }

    @Override
    public String toString() {
        return "Binary Node{conteudo=" + conteudo + "}"; 
    }

    
}