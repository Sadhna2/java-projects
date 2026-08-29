package day4;

public class AbstractClassImpl extends ClassA {

	public AbstractClassImpl() {
        
    }

    public AbstractClassImpl(int a) {
//        super(a);
        this.a=a;
    }

    @Override
    void display() {
        System.out.println("Value of a = " + a);
    }

    public static void main(String[] args) {

        AbstractClassImpl obj1 = new AbstractClassImpl();
        obj1.display();

        AbstractClassImpl obj2 = new AbstractClassImpl(10);
        obj2.display();
    }
}