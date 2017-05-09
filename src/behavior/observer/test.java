package behavior.observer;

public class test {
	public static int a;
	public final static int b=6;
    final int c=9;
    public int d;
	
	public static void main(String args[]){
	 ;
		Mysubject subject = new Mysubject();
		subject.add(new User1());
		subject.add(new User2());
		subject.distributemsg("�ͼ���������ëǮ");
	}
}
