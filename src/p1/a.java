package p1;
public class a {

        private int privateVar = 10;       // private
        int defaultVar = 20;               // default
        protected int protectedVar = 30;   // protected
        public int publicVar = 40;         // public

        private void privateMethod() {
            System.out.println("Private Method");
        }

        void defaultMethod() {
            System.out.println("Default Method");
        }

        protected void protectedMethod() {
            System.out.println("Protected Method");
        }

        public void publicMethod() {
            System.out.println("Public Method");
        }

        public void testInsideClass() {
            System.out.println(privateVar);
            System.out.println(defaultVar);
            System.out.println(protectedVar);
            System.out.println(publicVar);

            privateMethod();
            defaultMethod();
            protectedMethod();
            publicMethod();
        }
    }
