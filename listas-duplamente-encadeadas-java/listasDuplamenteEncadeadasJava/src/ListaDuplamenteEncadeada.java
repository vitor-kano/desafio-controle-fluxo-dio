public class ListaDuplamenteEncadeada<T> {
    
    private NoDuplo<T> primeiroNo;
    private NoDuplo<T> ultimoNo;
    private int tamanhoLista;

    public ListaDuplamenteEncadeada(){
        this.primeiroNo = null;
        this.ultimoNo = null;
        this.tamanhoLista = 0;
    }

    private NoDuplo<T> getNo(int index) {
        NoDuplo<T> noAuxiliar = primeiroNo;
        //quando o index for maior do que o tamanho da lista, o noAuxiliar passará a ser nulo, retornando o último nó da lista.
        for(int i=0; (i < index) && (noAuxiliar != null); i++){
            noAuxiliar = noAuxiliar.getNoProximo();
        }
        return noAuxiliar;
    }

    public T get(int index){
        return this.getNo(index).getConteudo();
    }

    public void add(T conteudo){
        NoDuplo<T> novoNo = new NoDuplo<>(conteudo);
        novoNo.setNoProximo(null);
        novoNo.setNoPrevio(ultimoNo);
        if(primeiroNo == null){
            primeiroNo = novoNo;
        }
        if(ultimoNo != null){
            ultimoNo.setNoProximo(novoNo);
        }
        ultimoNo = novoNo;
        tamanhoLista++;
    }

    public void add(int index, T conteudo){
        NoDuplo<T> noAuxiliar = getNo(index);
        NoDuplo<T> novoNo = new NoDuplo<>(conteudo);

        //"Nó Auxiliar" será o próximo nó do "Novo Nó"
        novoNo.setNoProximo(noAuxiliar);

        //se o "Nó Auxiliar" não for nulo (index > tamanho da lista)
        if(novoNo.getNoProximo() != null){
            //Nó anterior do "Novo Nó" será o antigo Nó anterior do "Nó auxiliar"
            novoNo.setNoPrevio(noAuxiliar.getNoPrevio());
            //Nó posterior do "Novo Nó" será o antigo Nó posterior do "Nó auxiliar"
            novoNo.getNoProximo().setNoPrevio(novoNo);
        } else {
            //"Novo nó" será o último nó da lista
            //"Nó anterior" ao "novo Nó" será o antigo último nó da lista 
            novoNo.setNoPrevio(ultimoNo);
            //agora o último nó da lista será o "novo Nó"
            ultimoNo = novoNo;
        }
        if(index == 0){
            //referencia de primeiroNó da lista => novoNó
            primeiroNo = novoNo;
        } else {
            //Antes: [Nó index-1] --prox-nó--> [Nó auxiliar]
            //Depois: [Nó index-1] --prox-nó--> [novo Nó] 
            novoNo.getNoPrevio().setNoProximo(novoNo);
        }
        tamanhoLista++;
    }

    public void remove(int index){
        if(index == 0){
            primeiroNo = primeiroNo.getNoProximo();
            //se o segundo nó da lista existe
            if(primeiroNo != null){
                primeiroNo.setNoPrevio(null);
            }
        //Nó a remover não é o Primeiro Nó
        } else {
            NoDuplo<T> noAuxiliar = getNo(index);
            noAuxiliar.getNoPrevio().setNoProximo(noAuxiliar.getNoProximo());
            //Nó a remover não é o Último Nó
            if(noAuxiliar != ultimoNo){
                noAuxiliar.getNoProximo().setNoPrevio(noAuxiliar.getNoPrevio());
            }else { //Nó a remover é o Último nó
                ultimoNo = noAuxiliar.getNoPrevio();
            }
        }

        this.tamanhoLista--;
    }

    public int size() {
        return tamanhoLista;
    }

    @Override
    public String toString() {
        String strRetorno = "";
        
        NoDuplo<T> noAuxiliar = primeiroNo;
        for(int i = 0; i < size(); i++){
            strRetorno += "[No{conteudo = " + noAuxiliar.getConteudo() + "}" + ']' +  " > > > ";
            noAuxiliar = noAuxiliar.getNoProximo();
        }
        strRetorno += "null";
        return strRetorno;
    }
}
