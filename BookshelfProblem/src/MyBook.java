public class MyBook implements Comparable<MyBook> {
    private String[] bookDetails;
    private boolean toDelete;

    MyBook(String[] bookDetails) {
        this.bookDetails = bookDetails;
        this.toDelete = false;
    }

    public String[] getBookDetails() {
        return bookDetails;
    }

    public int getBookSize() {
        return Integer.parseInt(getBookDetails()[0]);
    }

    public String getBookName() {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 1; i < getBookDetails().length; i++){
            stringBuilder.append(getBookDetails()[i]);
            stringBuilder.append(" ");
        }
        return stringBuilder.toString();
    }

    public boolean isToDelete() {
        return toDelete;
    }

    public void setToDelete(boolean toDelete) {
        this.toDelete = toDelete;
    }

    @Override
    public int compareTo(MyBook o) {
        if ((Integer.parseInt(this.bookDetails[0])) > (o.getBookSize())) {
            return 1;
        } else if ((Integer.parseInt(this.bookDetails[0])) < (o.getBookSize())) {
            return -1;
        } else {
            return 0;
        }
    }
}
