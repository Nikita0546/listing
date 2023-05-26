public class SetGet {
    protected int integer = 20;

    SetGet(int number) {
        this.print("Класс инициализирован");
        this.integer = number;
    }

    public void set(int number) {
        this.integer = number;
        this.print("Значение установлено!");
    }
    public int get() {
        this.print("Значение возвращено!");
        return this.integer;
    }
    private void print(String text) {
        System.out.println(text);
    }
}


