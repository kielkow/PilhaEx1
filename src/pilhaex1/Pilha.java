package pilhaex1;

import java.util.EmptyStackException;

public class Pilha implements Interface{
    
    
    private char palavras[];
    private int topo;

    
    public Pilha(String frase){
        palavras = frase.toCharArray();
        topo = palavras.length-1;
    }

    
    public void imprimir(){
        String inverso = "";
        for(int i = palavras.length-1; i >= 0; i--){
            inverso += String.valueOf(palavras[i]);
        }
        System.out.println(inverso); 
    }
    
    
    @Override
    public boolean isEmpty() {
        return topo == -1;
    }

    @Override
    public boolean isFull() {
        return topo == palavras.length - 1;
    }

    @Override
    public int size() {
        return topo + 1;
    }

    @Override
    public void push(char elemento) {
        if (!isFull()) {
            topo++;
            palavras[topo] = elemento;
        }
    }

    @Override
    public int pop() throws EmptyStackException {
        if (!isEmpty()) {
            int retorno = palavras[topo];
            topo--;
            return retorno;
        }
        throw new EmptyStackException();
    }

    @Override
    public char top() throws EmptyStackException {
        if (!isEmpty()) {
            return palavras[topo];
        }
        throw new EmptyStackException();
    }
    
    
}
