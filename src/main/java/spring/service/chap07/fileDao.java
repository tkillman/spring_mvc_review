package spring.service.chap07;

import org.mybatis.spring.support.SqlSessionDaoSupport;

public class fileDao extends SqlSessionDaoSupport{

	
	public int insertFile(fileInfo info){
		
		int resultNum =getSqlSession().insert("file.insert", info);
		
		return resultNum;
	}
	
	
}
