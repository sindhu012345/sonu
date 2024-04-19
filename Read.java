import java.io.FileReader;

class Read{
  public static void main(String [] args){
      char [] str=new char[100];
	  
	    try
		{
		 FileReader obj=new FileReader("C:/obj.txt");
		 obj.read(str);
		 System.out.println(str);
		 obj.close();
		}
		
    catch(Exception e){
	    System.out.println(e);
	}
  }
}