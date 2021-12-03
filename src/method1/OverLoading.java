package method1;
class Sum{
    String name;
    int p,q;
  public void Cs()
  {
  }
  public  void Cs(String name,int x,int y) {
      this.name = name;
      p = x;
      q = y;
  }
  public  int add(int a,int b)
    {
        return a+b;
    }

    public int add(int a,int b,int c)
    {

      return a+b+c;

    }
      public void PrintData(){
          System.out.println(" Student information : ");
        System.out.println("Name: "+name);
        System.out.println("Roll: "+p);
        System.out.println("PhoneNumber :"+q);
          System.out.println("\n");


      }

}

public class OverLoading {
    public static void main(String[] args) {
        Sum s1=new Sum();
        s1.Cs();
        Sum s2= new Sum();
        s2.Cs("Liza",21,198736527);
        s2.PrintData();
        int v= s1.add(12,16);
        int k= s1.add(67,87 ,23);
        System.out.println("ADD number 1 : "+v);
        System.out.println("ADD number 2 : "+k);

    }
}
