package org.sara.domain;

import lombok.Data;

@Data
public class UsersVO {
	int users_id;
	String user_name;
	String pw;
	String adress; // �����ؾ���
	String gender;
	String email;
	String mobile;
	int point;
}
