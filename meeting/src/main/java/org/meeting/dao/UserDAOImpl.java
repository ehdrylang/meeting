package org.meeting.dao;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.meeting.domain.UserVO;
import org.springframework.stereotype.Repository;
@Repository
public class UserDAOImpl implements UserDAO {
	@Inject
	private SqlSession sqlSession;
	
	private static final String namespace = "org.meeting.mapper.UserMapper";

	@Override
	public void create(UserVO vo) {
		sqlSession.insert(namespace+".create",vo);
	}

	@Override
	public UserVO read(String id) throws Exception {
		return sqlSession.selectOne(namespace+".read",id);
	}

	@Override
	public void update(UserVO vo) throws Exception {
		sqlSession.update(namespace+".update",vo);
	}

	@Override
	public void delete(String id) throws Exception {
		sqlSession.delete(namespace+".delete",id);
	}
	
}