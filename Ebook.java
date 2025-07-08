public class Ebook extends Book {
    String fileName;
    public Ebook(String ISBN,String title,double price, int year,String fileName){
        super(ISBN, title, price, year);
        this.fileName=fileName;
    }
  @Override
   
    public  boolean isForsale(){
        return true;
    }
    public  void deliver(String email,String address){
      System.out.println(getTitle()+ " will be sent to email "+ email);
    }
    
}


