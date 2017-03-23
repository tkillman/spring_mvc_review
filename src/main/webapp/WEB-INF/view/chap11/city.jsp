<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%request.setCharacterEncoding("UTF-8"); %>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<script src="https://code.jquery.com/jquery-3.1.0.min.js"></script>

<script type="text/javascript">
$(function(){
	
	// 시도테이블의 리스트 가져오기
	var url="/Spring_mvc_review/chap11/sidoList.do";
	
	//  경로 설정
	// http://localhost:8181/Spring_MVC/abc/index.jsp에서  'a.jsp'요청하면
	// http://localhost:8181/Spring_MVC/abc/a.jsp
	
	// '/a.jsp' 요청하면  http://localhost:8181/Srping_MVC/a.jsp

	var params="dumi="+new Date();
	
	$.ajax({
		type:"post"		// 포스트방식
		,url:url		// url 주소
		,data:params	//  요청에 전달되는 프로퍼티를 가진 객체
		,dataType:"json"
		,success:function(args){	//응답이 성공 상태 코드를 반환하면 호출되는 함수
			 for(var idx=0; idx<args.data.length; idx++) { //리스트였는데 배열처럼 꺼내오게된다.
				 $("#sido").append("<option value='"+args.data[idx]+"'>"+args.data[idx]+"</option>");
				 //id가 sido인 요소선택
				 //append로 기존 셀렉터로 선택된 요소 다음에 다음내용이 들어감
				 //<option value='0'>서울</option> 이런식으로 sido의 요소안에 자식으로 들어감
   // args.data[idx] : args 는 function(args)의 인자. data는 controller.java에서 json객체에 넣어준 key(여기서는 list가 값이 된다). [idx]는 list의 몇번쨰 데이터를 가져올지 배열을 나타냄
			 }
		}
	    ,error:function(e) {	// 이곳의 ajax에서 에러가 나면 얼럿창으로 에러 메시지 출력
	    	alert(e.responseText);
	    }
	});
	
});



</script>


<body>


<select id="sido">
<option value=""> --선택하세요--</option>
</select>

</body>
</html>