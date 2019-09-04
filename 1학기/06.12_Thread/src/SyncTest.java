
public class SyncTest {
		
	private int sum = 0;
	private int num = 0;
	public synchronized void IncreaseNumber() {
		num ++; //num = num + 1 
		sum = sum + num; //(num++과 같이 이 문장들은 읽고 쓰는 과정이 둘 다 된다.)
	}
		
	public void IncreasetNumber2() {
		synchronized (this) {
			num++;
		}
		sum = sum + num;
	}
	public static void main(String[] args) {
		
		
		
	}

}
