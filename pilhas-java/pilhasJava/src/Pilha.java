public class Pilha {
    private No refNoEntradaPilha;
    public Pilha(){
        this.refNoEntradaPilha = null;
    }

    public void push(No novoNo){
        No refAux = refNoEntradaPilha;
        refNoEntradaPilha = novoNo;
        refNoEntradaPilha.setNo(refAux);
    }

    public No pop(){
        if(!this.isEmpty()){
            No noPopped = refNoEntradaPilha;
            refNoEntradaPilha = refNoEntradaPilha.getNo();
            return noPopped;
        }
        return null;
    }

    public No top(){
        return refNoEntradaPilha;
    }

    public boolean isEmpty(){
        return refNoEntradaPilha == null ? true : false;
    }

    @Override
    public String toString(){
        String stringRetorno = "---------------------\n";
        stringRetorno += "       Pilha\n";
        stringRetorno += "------------------\n";

        No noAux = refNoEntradaPilha;
        while(true){
            if(noAux != null){
                stringRetorno += "[No{dado=" + noAux.getDado() + "}]\n";
                noAux = noAux.getNo();
            }else{
                break;
            }
        }
        stringRetorno += "==================\n";
                        
        return stringRetorno;
    }
}
