import java.util.Vector;

public class VectorList<T> implements ADTLISTInterface<T> {

	private Vector<T> list;
	private int count = 0;

	public VectorList() {
		list = new Vector<T>();
	}

	public VectorList(int initalSize) {
		list = new Vector<T>(initalSize);
	}

	@Override
	public boolean add(T item) {
		count++;
		return list.add(item);
	}

	@Override
	public boolean add(T item, int location) {
		boolean isSuccessful = true;
		if ((location >= 1) && (location <= list.size() + 2)) {
			list.add(location - 1, item);
			count++;
		} else
			isSuccessful = false;

		return false;
	}

	@Override
	public boolean removeItem(int location) {
		T result = null;
		if ((location >= 1) && (location <= list.size())) {
			assert !empty();
			result = list.remove(location - 1);
		}
		count--;

		return true;
	}

	@Override
	public boolean remove() {
		for (int i = 0; i < count; i++) {
			removeItem(i);
		}
		count = 0;
		return false;
	}

	@Override
	public boolean replace(int location, T item) {

		boolean isSuccessful = true;
		if ((location >= 1) && (location <= list.size())) {
			assert !empty();
			list.set(location - 1, item);
		} else
			isSuccessful = false;
		return isSuccessful;
	}

	@Override
	public T[] lookAll() {
		@SuppressWarnings("unchecked")
		T[] result = (T[]) list.toArray();
		return result;
	}

	@Override
	public int getCount() {
		return this.count;
	}

	@Override
	public boolean empty() {
		if (count != 0)
			return false;
		else
			return true;

	}

	@Override
	public T look(int item) {
		T result = null;
		if ((item >= 1) && (item <= list.size())) {
			assert !empty();
			result = list.get(item - 1);
		}
		return result;
	}

	@Override
	public boolean checkforItem(T item) {
		boolean end = false;
		T result = null;
		for (int i = 0; i < count; i++) {
			if (list.contains(item)) {
				result = item;
			}
		}
		if (result != null)
			end = true;

		return end;
	}

}
