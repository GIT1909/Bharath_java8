package java8;
import java.util.*;

public class Main {

public List<String> pallindrome(List <String> pp)
{
  return pp.stream()
    .filter(value -> check(value))  
    .collect(Collectors.toList());
}

private static boolean  strcheck(String value) {

String s="";
  for(int j=value.length()-1;j>=0;j--)
  {
    s=s+value.charAt(j);
  }

  if(value.equals(s))
  {
  return(true);
  }
  else {
    return(false);
  }
}

public double average(List<Integer> avg)
{return avg.stream()
 .mapToInt(val -> val).average().orElse(0.00);
}
public List<String> checkLength(List <String> str)
{
  return str.stream()
  .filter(value -> ((value.length()==3) && (value.charAt(0)=='str') ))
  .collect(Collectors.toList());
     
  
  
}

}