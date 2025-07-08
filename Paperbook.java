public class Paperbook extends Book {
    int stock;
   public Paperbook(String ISBN,String title,double price, int year, int stock){
    super(ISBN, title, price, year);
    this.stock=stock;
   }
   public  int getStock(){
    return stock;
   }
   public boolean reducedStock(int quantity){
    if(stock>=quantity){
        stock-=quantity;
        return true;
    }
      else {
        return false;
      }
   }
   @Override

    public  boolean isForsale(){
        return stock>0;
    }
    public  void deliver(String email,String address){
          System.out.println( getTitle()+ " will be shipped to "+ address);
    }
}
