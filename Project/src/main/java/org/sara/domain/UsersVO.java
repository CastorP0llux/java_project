package org.sara.domain;

import lombok.Data;

@Data
public class UsersVO {
	int users_id;
	String name;
	String pw;
	String address; // �����ؾ���
	String gender;
	String email;
	String mobile;
	int point;
}
