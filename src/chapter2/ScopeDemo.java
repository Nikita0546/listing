public class ScopeDemo {
    public static void main(String[] args) {
        int x = 1;
        System.out.println("До вложенного блока: x = " + x);
        {
            int y = 3;
            System.out.println("Внутренний блок: x = " + x + ", y = " + y);
            x = y * 3;
        }
        // y = 100
        System.out.println("после вложенного блока: x = " + x);
    }
}
