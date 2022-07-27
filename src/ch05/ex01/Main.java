package ch05.ex01;

import ch05.domain.Post;
import ch05.domain.Search;
import ch05.domain.User;
import config.Configuration;

public class Main {

	public static void main(String[] args) {
		Map mapper = Configuration.getMapper(Map.class);
		
		User user = mapper.selectUser(new Search("john", null));
									//�̸��� john�̰� ���ǰ��� ������ ã��
		//user = mapper.selectUser(new Search("john", new Post("����", null)));
		//isEmpty()���� ��							//�̸��� john�̰� ���� �� ������ ã��
		user = mapper.selectUser(new Search("john", new Post(null, "��")));
		
		//isEmpty()������
		//user = mapper.selectUser(new Search("john", new Post("����", "")));
		System.out.println(user);
		//john�� �� ���� ��� ã���� ����
	}
}
