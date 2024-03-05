class book {
    private String title;
    private String author;
    private String publisher;
    private String copyright;

    public book(String title, String author, String publisher, String copyright) {
        this.title = title;
        this.author = author;
        this.publisher = publisher;
        this.copyright = copyright;
    }

    public String getTitle(){
        return title;
    }

    public String getAuthor(){
        return author;
    }

    public String getPublisher(){
        return publisher;
    }

    public String getCopyright(){
        return copyright;
    }

    public void setTitle(String title){
        this.title = title;
    }

    public void setAuthor(String author){
        this.author = author;
    }

    public void setPublisher(String publisher){
        this.publisher = publisher;
    }

    public void setCopyright(String copyright){
        this.copyright = copyright;
    }
}
