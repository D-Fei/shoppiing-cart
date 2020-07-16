import com.train.beans.User;
import com.train.dao.UserDao;

public class App {
    public static void main(String[] args) {
        UserDao userDao = new UserDao();
        User user = userDao.getUser(2);
        System.out.println(user.toString());
    }
}
