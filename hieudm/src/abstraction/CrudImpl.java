package abstraction;

public class CrudImpl implements ICrudBase {

	@Override
	public void add() {
		System.out.println("add");
	}

	@Override
	public void delete() {
		System.out.println("delete");
		
	}

	@Override
	public void update() {
		System.out.println("update");
	}

	@Override
	public void show() {
		System.out.println("show");
	}

}
