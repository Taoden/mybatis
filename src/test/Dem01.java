package test;

import model.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.Date;
import java.util.List;

public class Dem01{
	@Test
	public void test1() throws IOException{
		/*
		* 1.读取配置文件
		* 2.通过sqlSessionFactoryBuilder创建SqlSessionFactory会话工厂。
		* 3.通过SqlSessionFactory创建SqlSession.
		* 4.通过SqlSession的操作数据库方法。
		* 关闭SqlSession
		* */
		InputStream is = Resources.getResourceAsStream("SqlMapConfig.xml");
		SqlSessionFactory build = new SqlSessionFactoryBuilder().build(is);
		SqlSession sqlSession = build.openSession();
		/*
		//根据id查询
		Object o = sqlSession.selectOne("finderUserByid", 10);
		System.out.println(o);*/
		//根据姓氏模糊查询
		/*List<Object> list = sqlSession.selectList("finderUserByName", '张');
		System.out.println(list);
		sqlSession.commit();*/
	/*插入数据

	User user=new User("dt","2",new Date(),"南昌");
		int insertUser = sqlSession.insert("insertUser", user);
		System.out.println(insertUser);*/

		/*删除数据
		sqlSession.delete("deleteUserByid",28);
		sqlSession.commit();*/
	/*
	* 更新数据
	* */
	/*	User user=new User();
		user.setId(29);
		user.setSex("男");
		user.setAddress("深圳");
		sqlSession.update("updateUserByid",user);*/

		//插入后，往模型里设置id

		User user=new User("dt","2",new Date(),"南昌");
		int insertUser = sqlSession.insert("insertUser2", user);
		System.out.println(insertUser);
		System.out.println(user.getId());
		sqlSession.commit();




		sqlSession.commit();
	}

}
