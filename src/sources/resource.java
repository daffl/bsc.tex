public interface Resource<T>
{
	// GET
	public T get(Serializable id);
	// PUT
	public void save(T arg) throws NotSupportedException;
	// DELETE
	public void delete(T arg) throws NotSupportedException;
	// GET
	public List<T> getAll() throws NotSupportedException;
}