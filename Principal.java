import java.util.*;
public class Prueba{
    public static void main(String[] args) {
        try {
			while(true) {
				System.out.println(fecha());
				Thread.sleep(1000);
			}
		}catch (Exception e) {
		}
    }
    public static String fecha(){
        Calendar date = Calendar.getInstance();
		return date.get(Calendar.DAY_OF_MONTH)+"/"+(date.get(Calendar.MONTH)+1)+"/"+date.get(Calendar.YEAR)+"  "+date.get(Calendar.HOUR)+"/"+(date.get(Calendar.MINUTE)+1)+"/"+date.get(Calendar.SECOND);
    }
}
