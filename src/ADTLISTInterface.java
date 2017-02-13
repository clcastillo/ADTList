/**
 * Interface describing options of a ADT List
 * 
 * @author Carla Castillo
 *
 * @param <T>
 */

public interface ADTLISTInterface<T> {
	/**
	 * Add new item at the bottom
	 * 
	 * @param item
	 * @return boolean
	 */
	public boolean add(T item);

	/**
	 * Add new item in a specific location
	 * 
	 * @param item
	 * @param location
	 * @return boolean
	 */
	public boolean add(T item, int location);

	/**
	 * Remove from existence 
	 * @param location Where in the list it is located
	 * @return boolean
	 */
	public boolean removeExist(int location);

	/**
	 * Cross of list but data still exists
	 * @param location
	 * @return boolean
	 */
	public boolean removeCrossOut(int location);

	/**
	 * Remove All Items
	 * @return boolean
	 */
	public boolean remove();

	/**
	 * Copy item in list over another
	 * @param location
	 * @return boolean
	 */
	public boolean replace(int location, T item);

	/**
	 * Look for a specific item
	 * @param item
	 * @return T
	 */
	public T look(T item);

	/**
	 * Look at a copy of list
	 * @return T[]
	 */
	public T[] lookAll();

	/**
	 * Number of items on list
	 * @return integer
	 */
	public int getCount();

	/**
	 * Looks to see if the list is empty
	 * @return boolean
	 */
	public boolean empty();

}
