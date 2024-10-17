package vn.zele.entity;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.NamedQuery;
import jakarta.persistence.Table;

@Entity
@Table(name = "role")
@NamedQuery(name = "Role.findAll", query = "select r from Role r")
public class Role implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name = "roleid", columnDefinition = "int")
	private int roleid;
	
	@Column(name = "rolename", columnDefinition = "nvarchar(255)")
	private String rolename;
}
