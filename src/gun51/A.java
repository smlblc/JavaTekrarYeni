package gun51;

public abstract class A {
    public abstract void mehtodA();

    public final void print() {

    }

    private void methodB() {

    }
}


class B extends A {

    B() {
        this.print();
        //this.methodB(); private methods are not inherited
    }

    @Override
    public void mehtodA() {

    }

//   you can not override final method
//    @Override
//    public final void print(){
//
//    }

}