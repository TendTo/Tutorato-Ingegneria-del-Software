class BaseClass {
    public void print() {
        System.out.println("From: BaseClass");
    }

    // Overloaded method
    public void print(String from) {
        System.out.println("From: " + from);
    }
}

class DerivedClass extends BaseClass {
    // Overriding method
    public void print() {
        super.print("DerivedClass");
    }
}

class Over {
    public static void main(String[] args) {
        BaseClass base = new BaseClass();
        base.print();
        base.print("Main");

        DerivedClass derived = new DerivedClass();
        derived.print();
    }
}