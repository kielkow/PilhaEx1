package pilhaex1;

public class PilhaEx1 {

    public static void main(String[] args) {
        
        
        Pilha p = new Pilha("Java SQL Ruby");

        p.imprimir();
        
        System.out.println(p.size());
        System.out.println(p.isEmpty());
        p.pop();
        p.push('R');
        System.out.println(p.isFull());
        System.out.println(p.top());
        
        
    }
    
}
