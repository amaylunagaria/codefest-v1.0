import java.util.*;
public class Trafficlane
{
  static ArrayList<Integer> laneclear=new ArrayList<>();
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    Trafficlane tl=new Trafficlane();
    int N,T=0,i=0,j=1;
    String a= " ",tk;
    N=sc.nextInt();
    ArrayList<Integer> lane=new ArrayList<>();

    while(N>=0)
    {
      N--;

      a=sc.nextLine();
      Scanner sc1=new Scanner(a);
      while(sc1.hasNext())
      {
        tk=sc1.next();
        lane.add(Integer.valueOf(tk));
      }

      Set<Integer> set = new LinkedHashSet<>();
      set.addAll(lane);
      lane.clear();
      lane.addAll(set);

      while(i<lane.size())
      {
        T=T+lane.get(i);i++;
      }
      lane.clear();

      sort(j,T);
      j++;
      i=0;
      T=0;
    }
    System.out.print("[");
    for(i=tl.laneclear.size()-2;i>0;i=i-2)
    {
      System.out.print(tl.laneclear.get(i)+", ");
      System.out.print(tl.laneclear.get(i+1));
      if(i>2)
      System.out.print(", ");
    }

    System.out.print("]");
  }

  public static void sort(int k, int t)
  {
    Iterator<Integer> it=laneclear.iterator();
    int i=0;
    if(laneclear.size()==0)
    {
      laneclear.add(k);
      laneclear.add(t);
    }
    else
    {
      for(i=1;i<laneclear.size();i=i+2)
      {
        if(t<laneclear.get(i))
        continue;
        else
        break;
      }
      if(i==laneclear.size())
      {

      }
      laneclear.add(i-1, k);
      laneclear.add(i, t);
      it=laneclear.iterator();
    }
  }
}
