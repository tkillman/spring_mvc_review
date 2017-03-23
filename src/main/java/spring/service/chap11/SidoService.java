package spring.service.chap11;

import java.util.List;

import org.mybatis.spring.support.SqlSessionDaoSupport;

public class SidoService extends SqlSessionDaoSupport{

	public List<String> sidoList(){
		
		List<String> sidoList = getSqlSession().selectList("city.sido");
		
		return sidoList;
	}
	
	
	
}
