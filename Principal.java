import java.util.*;
public class Prueba{
    public static void main(String[] args) {
	    Usuario[] arr = creador();
     	for (int i = 0; i < arr.length; i++) {
		System.out.println(arr[i]);
	}
    }
   public Usuario[] creador(int index){
	Scanner sc = new Scanner(System.in);
	Usuario[] arrayUsuarios = new Usuario[index];
		for (int i = 0; i < arrayUsuarios.length; i++) {
			System.out.println("Dime el nombre "+(i+1));
			setNombre(sc.nextLine());
			System.out.println("Dime el apellido "+(i+1));
			setApellidos(sc.nextLine());
			System.out.println("Dime el email "+(i+1));
			setEmail(sc.nextLine());
		}
	sc.close();
	return arrayUsuarios;
	}
}
