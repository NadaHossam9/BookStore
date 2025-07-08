public class DemoBook extends Book {
     public DemoBook(String ISBN,String title,double price, int year){
        super(ISBN, title, price, year);
     }
 @Override
  
    public  boolean isForsale(){
        return false;
    }
    public  void deliver(String email,String address){
        
    }
    
}

