package com.misaki.test.solr;

import java.io.Serializable;
import java.util.Arrays;

import org.apache.solr.client.solrj.beans.Field;

/**
 * Field对应managed-schema中的字段
 */
public class User implements Serializable {
	private static final long serialVersionUID = 5338967308751604751L;
	
	@Field("id")
	private String id;
	@Field("user_name")
	private String name;
	@Field("user_sex")
	private String sex;
	@Field("user_age")
	private String age;
	@Field("user_like")
	private String[] like;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public String[] getLike() {
		return like;
	}

	public void setLike(String[] like) {
		this.like = like;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", sex=" + sex + ", age="
				+ age + ", like=" + Arrays.toString(like) + "]";
	}
	
}
