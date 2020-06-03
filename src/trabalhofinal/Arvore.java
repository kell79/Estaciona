package trabalhofinal;

public class Arvore {
    
    public No raiz;
public Uso elemento;

public Arvore(){
    
    this.raiz = null;
}

public No Pesquisa(No raiz){
    return this.Pesquisa(this.raiz);
}

private No Pesquisa(No raiz, int idUso){
    if(this.raiz == null){
        
        return null;
    }
    else if((this.raiz.IDuso) < idUso){
        return Pesquisa(raiz.esq, idUso);
    }
    else if((this.raiz.IDuso) > idUso){
        return Pesquisa(raiz.dir, idUso);
    }
    return this.raiz;
}

public void Adicionar(Uso elem){
    this.Adicionar(this.raiz,elem);
}

private No Adicionar(No novo , Uso elem){
    
     if(novo == null){
        novo = new No(elem.idUso);
        System.out.println(" Carro da placa " + elem.placa + "novo" + novo.IDuso + " tem vaga " + elem.idVaga);
    }
    else if((novo.IDuso) < elem.idUso){
        return Adicionar(novo.esq, elem);
    }
        
    else if((novo.IDuso) > elem.idUso){
        return Adicionar(novo.dir, elem);
    }
    return novo;
}
}



