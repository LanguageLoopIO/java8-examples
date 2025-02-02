// Java 9: Module System
module mymodule {
    exports mypackage;
}

package mypackage;

public class MyModuleClass {
    public void greet() {
        System.out.println("Hello from module!");
    }
}
