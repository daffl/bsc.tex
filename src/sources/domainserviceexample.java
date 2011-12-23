public interface UserService
{
	// User.findAll() with paging
	public List<User> findAll(Pager pager);
	// usr.save()
	public void save(User usr);
	// User.load(id)
	public User load(Long id);
	// User.findyByUsername(username)
	public User findByUsername(String username);
	// usr.delete()
	public void delete(User usr);
	// User.findByActive(active)
	public List<User> findByActive(boolean active);
}