package ch05.ex01;

import ch05.domain.Post;
import ch05.domain.Search;
import ch05.domain.User;
import config.Configuration;

public class Main {

	public static void main(String[] args) {
		Map mapper = Configuration.getMapper(Map.class);
		
		User user = mapper.selectUser(new Search("john", null));
									//이름이 john이고 정의가들어간 데이터 찾기
		//user = mapper.selectUser(new Search("john", new Post("정의", null)));
		//isEmpty()적용 전							//이름이 john이고 고리가 들어간 데이터 찾기
		user = mapper.selectUser(new Search("john", new Post(null, "고리")));
		
		//isEmpty()적용후
		//user = mapper.selectUser(new Search("john", new Post("정의", "")));
		System.out.println(user);
		//john이 쓴 글을 모두 찾을수 있음
	}
}
