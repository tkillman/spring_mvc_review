package spring.service.chap11;

import java.util.List;

import org.mybatis.spring.support.SqlSessionDaoSupport;

public class SidoService extends SqlSessionDaoSupport{

	public List<String> sidoList(){
		
		System.out.println("in");
		List<String> sidoList = getSqlSession().selectList("city.sido");
		System.out.println(sidoList.toString());
		return sidoList;
		
	}
	
	
	
}
