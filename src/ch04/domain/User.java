package ch04.domain;

import java.time.LocalDate;
import java.util.List;

public class User {
	private int userId;
	private String userName;
	private LocalDate regDate;
	private List<Post> posts; //User has many(post)를 할땐 List를 써준다
	
	public User(int userId, String userName, LocalDate regDate) {
		this.userId = userId;
		this.userName = userName;
		this.regDate = regDate;
	}
	
	@Override
	public String toString() {
		return String.format("%d %s %s %s", userId, userName, regDate, posts);
	}
}
