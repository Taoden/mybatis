package test;

import dao.UserDao;
import dao.UserDaoIMpl;
import mapper.UserMapper;
import model.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.Date;

public class Dem03{
	SqlSession session;
	@Test
	public void test2() throws IOException{
		InputStream is = Resources.getResourceAsStream("SqlMapConfig.xml");
		SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(is);
		 session= sqlSessionFactory.openSession();

		UserMapper mapper = session.getMapper(UserMapper.class);
		//获取数据
		System.out.println(mapper.findUserByid(10));
		//保存
		User user=new User("xxx","x",new Date(),"xx");
		mapper.save(user);
		session.commit();
		session.close();

	}

}
