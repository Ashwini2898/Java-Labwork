package Server;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class TimerDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

Thread t1= new Thread();
int n=0;
while(n<11) {
	LocalTime t=LocalTime.now();
try {
	

	t1.sleep(10000);
} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
System.out.println(LocalDateTime.now());
	}
	n++;
}
}
