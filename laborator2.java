package inheritanceexample;

class BaseClass {
    int baseInt;

    // Constructors
    public BaseClass() {
        this(0);
    }

    public BaseClass(int baseInt) {
        this.baseInt = baseInt;
    }

    // Methods
    public void method1() {
        System.out.println("Method 1 called from BaseClass");
    }

    public void method2() {
        System.out.println("Method 2 called from BaseClass");
    }
}

class DerivedClass extends BaseClass {
    int derivedInt;

    // Constructor
    public DerivedClass(int baseInt, int derivedInt) {
        super(baseInt);
        this.derivedInt = derivedInt;
    }

    // Method
    public void method3() {
        System.out.println("Method 3 called from DerivedClass");
    }
}

public class Main {
    public static void main(String[] args) {
        // a) BaseClass object using BaseClass constructor
        BaseClass baseObject1 = new BaseClass();
        baseObject1.method1();
        baseObject1.method2();

        // b) DerivedClass object using BaseClass constructor
        DerivedClass derivedObject1 = new DerivedClass(5, 10);
        derivedObject1.method1();
        derivedObject1.method2();
        derivedObject1.method3();

        // c) DerivedClass object using DerivedClass constructor
        DerivedClass derivedObject2 = new DerivedClass(3, 7);
        derivedObject2.method1();
        derivedObject2.method2();
        derivedObject2.method3();

        // d) BaseClass object using DerivedClass constructor
        BaseClass baseObject2 = new DerivedClass(2, 4);
        baseObject2.method1();
        baseObject2.method2();
    }
}
