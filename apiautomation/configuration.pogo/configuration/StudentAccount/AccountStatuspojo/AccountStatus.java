
package configuration.StudentAccount.AccountStatuspojo;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
"campusIdList",
"id",
"campusGroupId",
"code",
"createdDateTime",
"isActive",
"lastModifiedDateTime",
"lastModifiedUserId",
"name",
"rowVersion",
"usage",
"campusGroup",
"originalState",
"secureState",
"extendedProperties",
"entityState",
"entityDirty"
})
public class AccountStatus {

@JsonProperty("campusIdList")
private List<Integer> campusIdList = null;

@JsonProperty("id")
private Integer id;

@JsonProperty("campusGroupId")
private Object campusGroupId;

@JsonProperty("code")
private String code;

@JsonProperty("createdDateTime")
private String createdDateTime;

@JsonProperty("isActive")
private Boolean isActive;

@JsonProperty("lastModifiedDateTime")
private String lastModifiedDateTime;

@JsonProperty("lastModifiedUserId")
private Integer lastModifiedUserId;

@JsonProperty("name")
private String name;

@JsonProperty("rowVersion")
private Object rowVersion;

@JsonProperty("usage")
private String usage;

@JsonProperty("campusGroup")
private Object campusGroup;

@JsonProperty("originalState")
private String originalState;

@JsonProperty("secureState")
private String secureState;

@JsonProperty("extendedProperties")
private List<Object> extendedProperties = null;

@JsonProperty("entityState")
private Integer entityState;

@JsonProperty("entityDirty")
private Boolean entityDirty;

@JsonIgnore
private Map<String, Object> additionalProperties = new HashMap<String, Object>();

@JsonProperty("campusIdList")
public List<Integer> getCampusIdList() {
return campusIdList;
}

//@JsonProperty("campusIdList")
public void setCampusIdList(List<Integer> campusIdList) {
this.campusIdList = campusIdList;
}

@JsonProperty("id")
public Integer getId() {
return id;
}

@JsonProperty("id")
public void setId(Integer id) {
this.id = id;
}

@JsonProperty("campusGroupId")
public Object getCampusGroupId() {
return campusGroupId;
}

@JsonProperty("campusGroupId")
public void setCampusGroupId(Object campusGroupId) {
this.campusGroupId = campusGroupId;
}

@JsonProperty("code")
public String getCode() {
return code;
}

@JsonProperty("code")
public void setCode(String code) {
this.code = code;
}

@JsonProperty("createdDateTime")
public String getCreatedDateTime() {
return createdDateTime;
}

@JsonProperty("createdDateTime")
public void setCreatedDateTime(String createdDateTime) {
this.createdDateTime = createdDateTime;
}

@JsonProperty("isActive")
public Boolean getIsActive() {
return isActive;
}

@JsonProperty("isActive")
public void setIsActive(Boolean isActive) {
this.isActive = isActive;
}

@JsonProperty("lastModifiedDateTime")
public String getLastModifiedDateTime() {
return lastModifiedDateTime;
}

@JsonProperty("lastModifiedDateTime")
public void setLastModifiedDateTime(String lastModifiedDateTime) {
this.lastModifiedDateTime = lastModifiedDateTime;
}

@JsonProperty("lastModifiedUserId")
public Integer getLastModifiedUserId() {
return lastModifiedUserId;
}

@JsonProperty("lastModifiedUserId")
public void setLastModifiedUserId(Integer lastModifiedUserId) {
this.lastModifiedUserId = lastModifiedUserId;
}

@JsonProperty("name")
public String getName() {
return name;
}

@JsonProperty("name")
public void setName(String name) {
this.name = name;
}

@JsonProperty("rowVersion")
public Object getRowVersion() {
return rowVersion;
}

@JsonProperty("rowVersion")
public void setRowVersion(Object rowVersion) {
this.rowVersion = rowVersion;
}

@JsonProperty("usage")
public String getUsage() {
return usage;
}

@JsonProperty("usage")
public void setUsage(String usage) {
this.usage = usage;
}

@JsonProperty("campusGroup")
public Object getCampusGroup() {
return campusGroup;
}

@JsonProperty("campusGroup")
public void setCampusGroup(Object campusGroup) {
this.campusGroup = campusGroup;
}

@JsonProperty("originalState")
public String getOriginalState() {
return originalState;
}

@JsonProperty("originalState")
public void setOriginalState(String originalState) {
this.originalState = originalState;
}

@JsonProperty("secureState")
public String getSecureState() {
return secureState;
}

@JsonProperty("secureState")
public void setSecureState(String secureState) {
this.secureState = secureState;
}

@JsonProperty("extendedProperties")
public List<Object> getExtendedProperties() {
return extendedProperties;
}

@JsonProperty("extendedProperties")
public void setExtendedProperties(List<Object> extendedProperties) {
this.extendedProperties = extendedProperties;
}

@JsonProperty("entityState")
public Integer getEntityState() {
return entityState;
}

@JsonProperty("entityState")
public void setEntityState(Integer entityState) {
this.entityState = entityState;
}

@JsonProperty("entityDirty")
public Boolean getEntityDirty() {
return entityDirty;
}

@JsonProperty("entityDirty")
public void setEntityDirty(Boolean entityDirty) {
this.entityDirty = entityDirty;
}

@JsonAnyGetter
public Map<String, Object> getAdditionalProperties() {
return this.additionalProperties;
}

@JsonAnySetter
public void setAdditionalProperty(String name, Object value) {
this.additionalProperties.put(name, value);
}

}