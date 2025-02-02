// Java 9: VarHandle Example
import java.lang.invoke.*;

public class VarHandleExample {
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
        VarHandle handle = MethodHandles.lookup().findVarHandle(MyClass.class, "value", int.class);
        MyClass obj = new MyClass();
        handle.set(obj, 10); // Set value using VarHandle
        System.out.println(handle.get(obj)); // Output: 10
    }
}

class MyClass {
    public int value;
}
