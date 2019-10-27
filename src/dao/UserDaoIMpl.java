package dao;

import model.User;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

public class UserDaoIMpl implements UserDao{
	private SqlSessionFactory sqlSessionFactory;

	public UserDaoIMpl(){
	}

	public UserDaoIMpl(SqlSessionFactory sqlSessionFactory){
		this.sqlSessionFactory = sqlSessionFactory;
	}

	@Override
	public void save(User user){
		//获取session
		SqlSession sqlSession = sqlSessionFactory.openSession();
		sqlSession.insert("insertUser2",user);
		sqlSession.commit();
		sqlSession.close();
	}

	@Override
	public User findUserByid(int id){
		SqlSession sqlSession = sqlSessionFactory.openSession();
		Object o = sqlSession.selectOne("finderUserByid", id);
		sqlSession.close();
		return (User) o;
	}
}
