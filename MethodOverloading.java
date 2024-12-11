class MethodOverloading {
    static void a(){
        System.out.println("Hello");
    }
    static void a(int b)
    {
        System.out.println("Hello"+b);
    }
    static void a(int b,String c)
    {
        System.out.println("Hello"+c+b);
    }
    public static void main(String[] args) {
        a();
        a(10);
        a(10,"world");
    }
}
