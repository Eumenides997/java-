import java.util.ArrayList;
import java.util.List;

public class test {

	public static void ConsumerApple(List<Apple> a,Consumer<Apple>c) {
		for(Apple app:a) {
			c.accept(app);
		}
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Apple> a=new ArrayList<Apple>();
		Apple ap=new Apple();
		ap.setcolor("��ɫ");
		ap.setweight(2);
		a.add(ap);
		Apple ab=new Apple();
		ab.setcolor("��ɫ");
		ab.setweight(2.5);
		a.add(ab);
		Apple az=new Apple();
		az.setcolor("��ɫ");
		az.setweight(1.5);
		a.add(az);
/*		System.out.println(ap.getcolor()+"\n"+ap.getweight());
		System.out.println(a.get(0).color+"\n"+a.get(0).weight+"\n"+a.get(0).a());*/
		
		ConsumerApple(a,new Consumer<Apple>() {

			@Override
			public void accept(Apple t) {
				// TODO Auto-generated method stub
				System.out.println(t.a());
			}
			
		});//�ڲ���
		
		ConsumerApple(a,t->{
			System.out.println(t.a());
		});//lambda���ʽ
		
}
}
