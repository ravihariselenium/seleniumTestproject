package configuration.StudentAccount.AccountStatuspojo;

import java.util.List;

public class AccountStatusDelete {

	
	private List<Integer> campusIdList=null;
	private Integer id;
	private int campusGroupId;
	private String code;
	private String createdDateTime;
	private boolean isActive;
	private String lastModifiedDateTime;
	private Integer lastModifiedUserId;
	private String name;
	private String rowVersion;
	private String usage;
	private AccountStatusdeletecampusgrp campusGroup;
	private String originalState;
	private String secureState;
	private List<String> extendedProperties=null;
	private Integer entityState;
	
	public List<Integer> getCampusIdList() {
		return campusIdList;
	}
	public void setCampusIdList(List<Integer> campusIdList) {
		this.campusIdList = campusIdList;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public int getCampusGroupId() {
		return campusGroupId;
	}
	public void setCampusGroupId(int campusGroupId) {
		this.campusGroupId = campusGroupId;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getCreatedDateTime() {
		return createdDateTime;
	}
	public void setCreatedDateTime(String createdDateTime) {
		this.createdDateTime = createdDateTime;
	}
	public boolean isActive() {
		return isActive;
	}
	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}
	public String getLastModifiedDateTime() {
		return lastModifiedDateTime;
	}
	public void setLastModifiedDateTime(String lastModifiedDateTime) {
		this.lastModifiedDateTime = lastModifiedDateTime;
	}
	public Integer getLastModifiedUserId() {
		return lastModifiedUserId;
	}
	public void setLastModifiedUserId(Integer lastModifiedUserId) {
		this.lastModifiedUserId = lastModifiedUserId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getRowVersion() {
		return rowVersion;
	}
	public void setRowVersion(String rowVersion) {
		this.rowVersion = rowVersion;
	}
	public String getUsage() {
		return usage;
	}
	public void setUsage(String usage) {
		this.usage = usage;
	}
	public AccountStatusdeletecampusgrp getCampusGroup() {
		return campusGroup;
	}
	public void setCampusGroup(AccountStatusdeletecampusgrp campusGroup) {
		this.campusGroup = campusGroup;
	}
	public String getOriginalState() {
		return originalState;
	}
	public void setOriginalState(String originalState) {
		this.originalState = originalState;
	}
	public String getSecureState() {
		return secureState;
	}
	public void setSecureState(String secureState) {
		this.secureState = secureState;
	}
	public List<String> getExtendedProperties() {
		return extendedProperties;
	}
	public void setExtendedProperties(List<String> extendedProperties) {
		this.extendedProperties = extendedProperties;
	}
	public Integer getEntityState() {
		return entityState;
	}
	public void setEntityState(Integer entityState) {
		this.entityState = entityState;
	}

	
}
