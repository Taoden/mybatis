package test;

import dao.UserDao;
import dao.UserDaoIMpl;
import model.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.Date;

public class Dem02{
	SqlSession sqlSession;
	SqlSessionFactory sqlSessionFactory;
	@Test
	public void test2() throws IOException{
		InputStream is = Resources.getResourceAsStream("SqlMapConfig.xml");
		SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(is);
		 sqlSession = sqlSessionFactory.openSession();
		//1.创建dao
		UserDao userDao =new UserDaoIMpl(sqlSessionFactory);
		User userByid = userDao.findUserByid(1);
		System.out.println(userByid);
		User user=new User("xxx","x",new Date(),"xx");
		userDao.save(user);

	}

}
