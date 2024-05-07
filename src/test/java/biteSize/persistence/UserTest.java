//package biteSize.persistence;
//
//import biteSize.entity.Task;
//import biteSize.entity.User;
//import junit.framework.TestCase;
//import org.apache.logging.log4j.LogManager;
//import org.apache.logging.log4j.Logger;
//
//import java.util.List;
//
//public class UserTest extends TestCase {
//
//    private final Logger logger = LogManager.getLogger(this.getClass());
//
//    GenericDao dao;
//
//    // Cleans the database before each test
//    public void setUp() throws Exception {
//            dao = new GenericDao(User.class);
//        Database database = Database.getInstance();
//        database.runSQL("cleanDB.sql");
//    }
//
//    // User Tests
//
//    // Gets the user by id
//    public void testGetByIdUser() {
//        User retrievedUser = (User)dao.getById(1);
//        assertNotNull(retrievedUser);
//        assertEquals("Ian", retrievedUser.getName());
//    }
//
//    // Tests a successful user insert
//    public void testInsertUser() {
//        int insertedID;
//        User newUser = new User("Kobey", "kobey@gmail.com");
//        dao.insert(newUser);
//
//        User insertedUser = (User)dao.getById(4);
//        assertEquals("Kobey", insertedUser.getName());
//        assertEquals(4, insertedUser.getId());
//    }
//
//    // Tests a successful user update
//    public void testUpdateUser() {
//        User userToUpdate = (User)dao.getById(1);
//        userToUpdate.setName("Michael");
//        dao.update(userToUpdate);
//
//        User retrievedUser = (User)dao.getById(1);
//        assertEquals("Michael", retrievedUser.getName());
//    }
//
//    // Tests a successful user delete
//    public void testUserDelete() {
//        User userToDelete = (User)dao.getById(1);
//        dao.delete(userToDelete);
//        assertNull(dao.getById(1));
//    }
//
//    // Tests getting all users
//    public void testGetAllUsers() {
//        List<User> users = dao.getAll();
//        assertEquals(3, users.size());
//    }
//
//    // Tests getting users by equal string
//    public void testGetByEqual() {
//        List<User> users = dao.getPropertyEqual("name", "Ian");
//        assertEquals(1, users.size());
//        assertEquals("Ian", users.get(0).getName());
//    }
//
//    // Tests getting users by like string
//    public void testGetByLike() {
//        List<User> users = dao.getPropertyLike("name", "ian");
//        assertEquals(2, users.size());
//        assertEquals("Ian", users.get(0).getName());
//        assertEquals("Arianna", users.get(1).getName());
//    }
//
//    // Test Tasks
//
//    // Testing getting all tasks
//    public void testGetAllTasks() {
//        List<Task> tasks = dao.getAll();
//        for(Task task : tasks) {
//            logger.info(task.getName());
//        }
//        assertEquals(3, tasks.size());
//    }
//}