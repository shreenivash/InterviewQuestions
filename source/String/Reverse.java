package String;

public class Reverse 
{
    public String reverse(String str) 
    {     
        if ((str==null)||(str.length() <= 1) )
            return str;
        return reverse(str.substring(1)) + str.charAt(0);
    }
    public static void main(String[] args) 
    {
    	Reverse obj=new Reverse();
        String str = "Quora is amazing";
        System.out.println("Reverse of \'"+str+"\' is \'"+obj.reverse(str)+"\'");    
    }    
}
