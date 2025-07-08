abstract class Book{
    String ISBN;
    String title;
    double price;
    int year;
    public Book(String ISBN,String title,double price, int year){
        this.ISBN=ISBN;
        this.title=title;
        this.price=price;
        this.year=year;
    }
    
    public String getISBN(){
        return ISBN;
    }
     public String getTitle(){
        return title;
    }
    public int getYear(){
        return year;
    }
    public double getPrice(){
        return price;
    }

   
    public abstract boolean isForsale();
    public abstract void deliver(String email,String address);
}