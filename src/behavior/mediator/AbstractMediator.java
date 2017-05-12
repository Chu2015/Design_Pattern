package behavior.mediator;

abstract class AbstractMediator {  
    protected AbstractPhone A;  
    protected AbstractPhone B;  
    protected AbstractPhone C;
    
    public AbstractMediator(AbstractPhone a, AbstractPhone b, AbstractPhone c) {  
        A = a;  
        B = b;
        C = c;
    }  
  
    public abstract void callB(int Phonenum);  
      
    public abstract void callA(int Phonenum);  
    
    public abstract void callC(int Phonenum);
  
}  