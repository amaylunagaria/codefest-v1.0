import java.util.*;
public class Paytm
{
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    int T=1,t;
    t=sc.nextInt();

    while(t!=0)
    {
      t--;
      int inp=0;

      ArrayList<Integer> paytm_prices=new ArrayList<>();
      while(T<=36)
      {
        T++;
        inp=sc.nextInt();
        paytm_prices.add(inp);
      }
      T=1;
      ArrayList<String> result=get_max_profit(paytm_prices);
      System.out.println(result);
      paytm_prices.removeAll(paytm_prices);
    }
  }

  public static ArrayList<String> get_max_profit(ArrayList<Integer> list)
  {
    ArrayList<String> profit=new ArrayList<>();
    profit.removeAll(profit);
    double tm=9.3;
    int max=list.get(0),min=list.get(0),t1=0;
    double tmp=0;
    for(int i=0; i<list.size();i++)
    {
      if(max<list.get(i))
      {
        max=list.get(i);
        tmp=i;
      }
    }

    for(int i=0; i<list.size();i++)
    {
      if(min>list.get(i))
      min=list.get(i);
    }

    int pft=max-min;
    tmp++;
    double cnt=tmp/6;
    long l = (long)cnt;
    tm=tm+(int)l;
    cnt=(cnt-(int)l)*6;
    if(cnt>=3)
    {
      cnt=cnt-3;
      tm++;
      tm=tm+(cnt)/10;
    }
    else
    {
      tm=tm+(cnt)/10;
    }
    if(tm>13)
    tm=tm-12;
    tm=(double) (Math.round(tm*10.0)/10.0);

    profit.add(String.valueOf(pft));
    profit.add(String.valueOf(tm).concat("0"));
    return profit;
  }
}
