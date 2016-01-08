package proxy.virtual;

/**
 * Created by chenxinyue on 2016/1/8.
 */
public class BoolProxy implements Book {
    private Book book = null;
    public String readBook() {
        if (this.book == null) {
            new Thread(new Runnable() {
                public void run() {
                    try {
                        Book tempBool = new RealBook();
                        setBook(tempBool);
                        System.out.println(readBook());
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }).start();
            return "book is loading, wait for a minute!";
        } else {
            return book.readBook();
        }
    }

    public void setBook(Book book) {
        this.book = book;
    }
}
