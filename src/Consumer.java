import java.util.Objects;

public interface Consumer<T> {

	void accept(T t);
	
	default Consumer<T>
	andThen(Consumer<?super T>after){
		Objects.requireNonNull(after);
		return (T t)->{
			accept(t);
			after.accept(t);
		};
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
