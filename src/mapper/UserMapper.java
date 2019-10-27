package mapper;

import model.User;
import vo.UserQueryVO;

import java.util.List;

public interface UserMapper{

	public int save(User user);
	public  User findUserByid(int id);

	public List<User> findUserByUserQueryVO(UserQueryVO userQueryVO);
}
