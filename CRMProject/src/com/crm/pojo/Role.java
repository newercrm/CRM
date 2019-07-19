package com.crm.pojo;

public class Role {
    private Long rid;

    private String rolename;
    

    public Role() {
		
	}

	public Role(Long rid, String rolename) {
		this.rid = rid;
		this.rolename = rolename;
	}

	public Long getRid() {
        return rid;
    }

    public void setRid(Long rid) {
        this.rid = rid;
    }

    public String getRolename() {
        return rolename;
    }

    public void setRolename(String rolename) {
        this.rolename = rolename == null ? null : rolename.trim();
    }
}