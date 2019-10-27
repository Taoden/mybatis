package test;

import mapper.UserMapper;
import model.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;
import vo.UserQueryVO;

import java.io.IOException;
import java.io.InputStream;
import java.util.Date;
import java.util.List;

public class Dem04{
	@Test
	public void test4() throws IOException{
		/*InputStream is = Resources.getResourceAsStream("SqlMapConfig.xml");
		SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(is);
		SqlSession	 session= sqlSessionFactory.openSession();
		UserMapper mapper = session.getMapper(UserMapper.class);
		UserQueryVO userQueryVO =new UserQueryVO();

		User user =new User();
		user.setId(1);

		List<User> userByUserQueryVO = mapper.findUserByUserQueryVO(userQueryVO);
		System.out.println(userByUserQueryVO);
		session.close();*/


	}

}
