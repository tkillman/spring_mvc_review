package spring.service.chap07;

import org.mybatis.spring.support.SqlSessionDaoSupport;

import spring.command.chap07.fileInfo;

public class fileDao extends SqlSessionDaoSupport{

	
	public int insertFile(fileInfo info){
		
		int resultNum =getSqlSession().insert("file.insert", info);
		
		return resultNum;
	}
	
	
}
