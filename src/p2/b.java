package p2;
import p1.a; // ✅ IMPORTANT
public class b {

        public static void main(String[] args) {
            a obj = new a();

            // ❌ Not accessible (private)
            // System.out.println(obj.privateVar);

            // ❌ Not accessible (default)
            // System.out.println(obj.defaultVar);

            // ❌ Not accessible (protected without inheritance)
            // System.out.println(obj.protectedVar);

            // ✅ Accessible (public)
            System.out.println(obj.publicVar);

            // ❌ obj.privateMethod();   // private
            // ❌ obj.defaultMethod();   // default
            // ❌ obj.protectedMethod(); // protected
            obj.publicMethod();           // public
        }
    }


