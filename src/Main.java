public class Main {
    public static void main(String[] args) {
        Author levTolstoy = new Author("Лев", "Толстой");
        Author nikolayNosov = new Author("Николай", "Носов");
        Book warAndPeace = new Book("Война и мир", levTolstoy, 1863);
        Book dunnoOnTheMoon = new Book("Незнайка на Луне", nikolayNosov, 1964);
        dunnoOnTheMoon.setYear(1965);
    }
}