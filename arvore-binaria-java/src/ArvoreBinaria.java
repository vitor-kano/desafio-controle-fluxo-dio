public class ArvoreBinaria <T extends Comparable<T>> {
   
    private BinNo<T> raiz;
   
    public ArvoreBinaria(){
        this.raiz = null;
    }


    //MÉTODO INSERT
    private BinNo<T> inserir(BinNo<T> atual, BinNo<T> novoNo){
        //se a raiz for nula, novo Nó é inserido na raiz
        if(atual == null){
            return novoNo;
        } else if(novoNo.getConteudo().compareTo(atual.getConteudo()) < 0){
            atual.setNoEsq(inserir(atual.getNoEsq(), novoNo));
        } else {
            atual.setNoDir(inserir(atual.getNoDir(), novoNo));
        }
        return atual;
    }

    public void inserir(T conteudo){
        BinNo<T> novoNo = new BinNo<>(conteudo);
        this.raiz = inserir(raiz, novoNo);
    }

    //EXIBIÇÃO EM ORDEM
    public void exibirInOrdem(){
        System.out.println("\n Exibindo InOrdem");
        exibirInOrdem(this.raiz);
    }

    private void exibirInOrdem(BinNo<T> atual){
        if(atual != null){
            exibirInOrdem(atual.getNoEsq());
            System.out.println(atual.getConteudo() + ", ");
            exibirInOrdem(atual.getNoDir());
        }
    }

    //EXIBIÇÃO POS ORDEM
    public void exibirPosOrdem(){
        System.out.println("\n Exibindo PosOrdem");
        exibirPosOrdem(this.raiz);
    }

    private void exibirPosOrdem(BinNo<T> atual){
        if(atual != null){
            exibirPosOrdem(atual.getNoEsq());
            exibirPosOrdem(atual.getNoDir());
            System.out.println(atual.getConteudo() + ", ");
        }
    }

    //EXIBIÇÃO PRE ORDEM
    public void exibirPreOrdem(){
        System.out.println("\n Exibindo PreOrdem");
        exibirPreOrdem(this.raiz);
    }

    private void exibirPreOrdem(BinNo<T> atual){
        if(atual != null){
            System.out.println(atual.getConteudo() + ", ");
            exibirPreOrdem(atual.getNoEsq());
            exibirPreOrdem(atual.getNoDir());
        }
    }

    //MÉTODO REMOVE
    public void remover(T conteudo){
        try {
            BinNo<T> atual = this.raiz;
            BinNo<T> filho = null;
            BinNo<T> pai = null;
            BinNo<T> temp = null;

            //loop percorrendo até o Nó for encontrado
            while(atual != null && !atual.getConteudo().equals(conteudo)){
                pai = atual;
                if(conteudo.compareTo(atual.getConteudo()) < 0){
                    atual = atual.getNoEsq();
                } else{
                    atual = atual.getNoDir();
                }
            }
            if(atual == null){
                System.out.println("Conteudo nao encontrado: Bloco Try");
            }
            if(pai == null){
                
            } else if(atual.getNoDir() == null){

            } else if(atual.getNoEsq() == null){

            } else{

            }
        } catch (NullPointerException err) {
            System.out.println("Conteudo nao encontrado: Bloco Catch");
        }
    }


}
