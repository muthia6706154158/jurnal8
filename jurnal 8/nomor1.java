import java.util.scanner;

public class nomor1 {
	public static void main(String[]args){
		Scanner show = new Scanner(System.in);
		System.out.print("Masukkan jumlah : ");
		int bil =show.nextInt();
		long fib[] = new long[];
		fib[0]=0;
		fib[1]=1;
	for(int i =2 ; i<bil;i++){
		fib [i] = fib [i-1] + fib[i-2];
	}
	for(int i =0 ; i<bil;i++){
		System.out.print(fib[i]+" ");
	}
	}
}
