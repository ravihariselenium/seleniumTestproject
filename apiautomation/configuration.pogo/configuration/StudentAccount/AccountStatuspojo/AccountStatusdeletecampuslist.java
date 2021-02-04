package configuration.StudentAccount.AccountStatuspojo;

import java.util.List;

public class AccountStatusdeletecampuslist {
	
	private int id;
    private int campusGroupId;
    private int campusId;
    private String createdDateTime;
    private Boolean isCampusActive;
    private Boolean isSystemCode;
    private String  lastModifiedDateTime;
    private int lastModifiedUserId;
    private String rowVersion;
    private String originalState;
    private String secureState;
    private List<String> extendedProperties=null;
    private int entityState;
    
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getCampusGroupId() {
		return campusGroupId;
	}
	public void setCampusGroupId(int campusGroupId) {
		this.campusGroupId = campusGroupId;
	}
	public int getCampusId() {
		return campusId;
	}
	public void setCampusId(int campusId) {
		this.campusId = campusId;
	}
	public String getCreatedDateTime() {
		return createdDateTime;
	}
	public void setCreatedDateTime(String createdDateTime) {
		this.createdDateTime = createdDateTime;
	}
	public Boolean getIsCampusActive() {
		return isCampusActive;
	}
	public void setIsCampusActive(Boolean isCampusActive) {
		this.isCampusActive = isCampusActive;
	}
	public Boolean getIsSystemCode() {
		return isSystemCode;
	}
	public void setIsSystemCode(Boolean isSystemCode) {
		this.isSystemCode = isSystemCode;
	}
	public String getLastModifiedDateTime() {
		return lastModifiedDateTime;
	}
	public void setLastModifiedDateTime(String lastModifiedDateTime) {
		this.lastModifiedDateTime = lastModifiedDateTime;
	}
	public int getLastModifiedUserId() {
		return lastModifiedUserId;
	}
	public void setLastModifiedUserId(int lastModifiedUserId) {
		this.lastModifiedUserId = lastModifiedUserId;
	}
	public String getRowVersion() {
		return rowVersion;
	}
	public void setRowVersion(String rowVersion) {
		this.rowVersion = rowVersion;
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
	public int getEntityState() {
		return entityState;
	}
	public void setEntityState(int entityState) {
		this.entityState = entityState;
	}
	

}
