/*
public class OOPS {
    public static void main(String[] args) {
        pen p1 = new pen();
        p1.setcolor("Blue");
        System.out.println(p1.color);
        // p1.color = "red";
        p1.setTip(5);
        System.out.println(p1.tip);

        BankAccount myAcc = new BankAccount();
        myAcc.username = "Manu";
        myAcc.setPassword("accjkcc");
    }
}

class BankAccount{
    public String username;
    private String password;
    public void setPassword(String pwd){
        password = pwd;
    }
}
class pen{
    String color;
    int tip;
    void setcolor(String newColor){
        color = newColor;
    }
    void setTip(int newTip){
        tip = newTip;
    }
}
*/
// Getter and Setter
public class OOPS{
    public static void main(String[] args) {
        pen p1 = new pen();
        p1.setcolor("Blue");
        System.out.println(p1.getColor());
        // p1.color = "red";
        p1.setTip(5);
        System.out.println(p1.getTip());
    }
}
    class pen{
      private String color;
      private int tip;

      String getColor(){
          return this.color;
      }
      int getTip(){
          return this.tip;
      }
        void setcolor(String newColor){
            this.color = newColor;
        }
        void setTip(int newTip){
            tip = newTip;
        }
    }
