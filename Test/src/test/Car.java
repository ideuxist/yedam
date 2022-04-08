package test;

public class Car {
	
	 try
     {
         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

         String str = "";

         while((str = br.readLine()) != null)
         {
             System.out.println(str);
         }

     }
     catch (Exception e)
     {
         e.printStackTrace();
     }
     
 }




}
