@Entity
class User
{
	String username
	String password
	Boolean active = true
}

User testUser = new User(username:"test",password:"test123")
// Save in database
test.save()
// Load user with id 1
User savedUser = User.load(1)
// Delete user
savedUser.delete()
// Find all users with username test
List<User> users = User.findByUsername("test")
// Find all active users
List<User> active = User.findByActive(true)