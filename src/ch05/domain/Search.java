package ch05.domain;

public class Search {
	//검색조건
	private String userName;
	private Post post;
	
	public Search(String userName, Post post) {
		this.userName = userName;
		this.post = post;
	}
}
