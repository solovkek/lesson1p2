package hwtask2;
public class BookMain {
    public static void main(String[] args) {
        Book book = new Book();


        Author author = new Author();
        author.setName("George Orwell");
        author.show();
        Title title = new Title();
        title.setTitle("1984");
        title.show();
        Content content = new Content();
        content.setContent("Antiutopic");
        content.show();



        book.setAuthor(author);
        book.setTitle(title);
        book.setContent(content);

        book.show();
    }
}