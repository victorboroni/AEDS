package exercicio;

public class ListaEncadeada {
	protected Nodo cabeca;
	protected int tamanho;
	
	public ListaEncadeada() {
		this.cabeca = null;
		this.tamanho = 0;
	}
	
	void insertInicio(Nodo next) {
		next.setNext(this.cabeca);
		this.cabeca = next;
		this.tamanho++;
	}
	
	void printLista() {
		Nodo aux = this.cabeca;
		while(aux != null) {
			System.out.println(aux.getElement());
			aux = aux.getNext();
		}
	}
	
	void printListaOrdenada() {
		ordenacao();
		Nodo aux = this.cabeca;
		while(aux != null) {
			System.out.println(aux.getElement());
			aux = aux.getNext();
		}
	}
	
	void insertFinal(Nodo last) {
		Nodo lastElement = this.cabeca;
		for (int i = 0; i < this.tamanho; i++) {
			if(lastElement.getNext() != null) {
				lastElement = lastElement.getNext();
			}
		}
		lastElement.setNext(last);
		this.tamanho++;
	}
	// selecionar posição de exclução
	void excluirElemento(int posicao) {
		Nodo temp = null;
		Nodo anterior = null;
		Nodo inicio = this.cabeca;
		for (int i = 1; i < this.tamanho; i++) {
			if(i < posicao - 1) {
				inicio = inicio.getNext();
				anterior = inicio;
			}
		}
		temp = anterior.getNext().getNext();
		anterior.setNext(temp);
	}
	
	void ordenacao() {
		Nodo lastNodo = this.cabeca;
		boolean validador = true;
		int temp = 0;
		while(validador) {
			validador = false;
			for(int i = 0;i < this.tamanho-1; i++){              
	            if(lastNodo.getElement() > lastNodo.getNext().getElement()){
	                temp = lastNodo.getElement();
	                lastNodo.setElemento(lastNodo.getNext().getElement());
	                lastNodo.getNext().setElemento(temp);
	                validador = true;
	            }
	            lastNodo = lastNodo.getNext();
	        }
			lastNodo = this.cabeca;
		}
		
	}


}
