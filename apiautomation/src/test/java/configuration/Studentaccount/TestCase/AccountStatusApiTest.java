package configuration.Studentaccount.TestCase;

import java.util.ArrayList;
import java.util.List;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import configuration.StudentAccount.AccountStatuspojo.AccountStatusget;
import configuration.StudentAccount.AccountStatuspojo.AccountStatus;
import configuration.StudentAccount.AccountStatuspojo.AccountStatusDelete;
import configuration.StudentAccount.AccountStatuspojo.AccountStatusSave;
import configuration.StudentAccount.AccountStatuspojo.AccountStatusdeletecampusgrp;
import configuration.StudentAccount.AccountStatuspojo.AccountStatusdeletecampuslist;
import configuration.StudentAccount.AccountStatuspojo.AccountStatuspayload;
import configuration.StudentAccount.AccountStatuspojo.DeleteAccountStatuspayload;
import configuration.StudentAccount.AccountStatuspojo.GetAccountStatuspayload;
import configuration.StudentAccount.AccountStatuspojo.SaveAccountStatuspayload;
import io.restassured.RestAssured;
import io.restassured.config.SSLConfig;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import io.restassured.specification.RequestSpecification;
import junit.framework.Assert;
import studentnexus.primaryclass.primaryclass;;

public class AccountStatusApiTest extends AccountStatus
{
	
	public static Response response;
	public static RequestSpecification request;
	public static ResponseBody responsebody;
	public static JsonPath jsonpath;
	public static final ObjectMapper MAPPER=new ObjectMapper();
	
	public static String name;
	public static int id;
	public static String rowversion;
	public static int campusGroupId;
	public static String campusGrouprowversion;
	public static String campusGroupcampuslistrowversion;
	
	@BeforeMethod
	public void RequestSetup()
	{
		/*String url="https://btpcminexus05.campusmgmt.com:9500";
		String entity="/api/commands/StudentAccounts/AccountStatus";
		String baseurl=url+entity;
		
		RestAssured.baseURI=baseurl;
		
		request=RestAssured.given();
		request.header("Content-Type","application/json");
		request.auth().preemptive().basic("administrator", "testing");
		
		request.config(RestAssured.config().sslConfig(new SSLConfig().allowAllHostnames()));*/
		
		request=primaryclass.initialization();
	
	}
	
	
@Test(priority=1)
public void createaccountstatus()

{
	try {
		List<Integer> campusid= new ArrayList<Integer>();
		campusid.add(5);
		
		AccountStatus obj=new AccountStatus();
		obj.setCampusIdList(campusid);
		obj.setId(-1);
		obj.setCampusGroup(null);
		obj.setCode("TEST");
		obj.setCreatedDateTime("2020/12/12 08:49:31");
		obj.setIsActive(true);
		obj.setLastModifiedDateTime("2020/12/12 08:49:31");
		obj.setLastModifiedUserId(2);
		obj.setName("test");
		obj.setRowVersion(null);
		obj.setUsage("B");
		obj.setCampusGroup(null);
		obj.setOriginalState(null);
		obj.setSecureState(null); 
		obj.setExtendedProperties(null);
		obj.setEntityState(0);
		obj.setEntityDirty(true);
		
		AccountStatuspayload payloadobj=new AccountStatuspayload();
		payloadobj.payload=obj;
			
		String requestpayloadbody=MAPPER.writerWithDefaultPrettyPrinter().writeValueAsString(payloadobj);
		//System.out.println("Create CashDrawer Payload: " + requestpayloadbody);
		
		request.body(payloadobj);
		
		response=request.post("/SaveNew");
		responsebody=response.getBody();
		
		
		jsonpath=responsebody.jsonPath();
		System.out.println("Create CashDrawer Payload: " + jsonpath);
		

		name=jsonpath.getString("payload.data.name");
		id=Integer.parseInt(jsonpath.getString("payload.data.id"));
		
		Assert.assertEquals(response.getStatusCode(),200);
		//Assert.assertEquals(name, "Test");
	}
	
	catch(Exception e) {
		
	}
	
}
	
@Test(priority=2)
public void GetAccountStatusAfterSavenew()
{
	
	AccountStatusget accountstatusget=new AccountStatusget();
	accountstatusget.setId(id);
	
	GetAccountStatuspayload payloadobj=new GetAccountStatuspayload();
	payloadobj.payload=accountstatusget;
	
	//String MAPPER.writerWithDefaultPrettyPrinter().writeValueAsString(accountstatusget)
	request.body(payloadobj);
	response=request.post("/Get");
	responsebody=response.getBody();
	jsonpath=responsebody.jsonPath();
	
	id=Integer.parseInt(jsonpath.getString("payload.data.id"));
	rowversion=jsonpath.getString("payload.data.rowVersion");
	campusGroupId=Integer.parseInt(jsonpath.getString("payload.data.campusGroupId"));
	campusGrouprowversion=jsonpath.getString("payload.data.campusGroup.rowVersion");
	campusGroupcampuslistrowversion=(String) jsonpath.getList("payload.data.campusGroup.campusList.rowVersion").get(0);
	Assert.assertEquals(response.getStatusCode(), 200);
	
	System.out.println("Create CashDrawer Payload: " + response.getStatusCode());
	System.out.println("Create CashDrawer Payload: " + id);
	System.out.println("Create CashDrawer Payload: " + rowversion);
	System.out.println("Create CashDrawer Payload: " + campusGroupId);
	System.out.println("Create CashDrawer campusGrouprowversion: " + campusGrouprowversion);
}
	
@Test(priority=3)
public void SaveAccountStatus()
{
	
	List<Integer> campusid=new ArrayList<Integer>();
	campusid.add(5);
	AccountStatusSave accountStatusSave=new AccountStatusSave();
	
	accountStatusSave.setCampusIdList(campusid);
	accountStatusSave.setId(id);
	accountStatusSave.setCampusGroupId(campusGroupId);
	accountStatusSave.setCode("editcode");
	
	accountStatusSave.setCreatedDateTime("2020/12/12 08:49:31");
	accountStatusSave.setisActive(true);
	accountStatusSave.setLastModifiedDateTime("2020/12/12 08:49:31");
	accountStatusSave.setLastModifiedUserId(2);
	accountStatusSave.setName("editname");
	accountStatusSave.setRowVersion(rowversion);
	accountStatusSave.setUsage("B");
	accountStatusSave.setCampusGroup(null);
	accountStatusSave.setOriginalState(null);
	accountStatusSave.setSecureState(null);
	accountStatusSave.setExtendedProperties(null);
	accountStatusSave.setEntityState(2);
	
	SaveAccountStatuspayload saveAccountStatuspayload=new SaveAccountStatuspayload();
	saveAccountStatuspayload.payload=accountStatusSave;
	
	request.body(saveAccountStatuspayload);
	
	response=request.post("/Save");
	responsebody=response.getBody();
	jsonpath=responsebody.jsonPath();
	
	Assert.assertEquals(response.getStatusCode(),200);
}

@Test(priority=4)
public void GetAccountStatusAfterSave()
{
	
	GetAccountStatusAfterSavenew();
}

@Test(priority=5)
public void deleteAccountStatus() throws JsonProcessingException
{
	//inside the campus group campus list array
	AccountStatusdeletecampuslist accountStatusdeletecampuslist=new AccountStatusdeletecampuslist();
	
	accountStatusdeletecampuslist.setId(id);
    accountStatusdeletecampuslist.setCampusGroupId(campusGroupId);
 accountStatusdeletecampuslist.setCampusId(5);
    accountStatusdeletecampuslist.setCreatedDateTime("2020/12/12 08:49:31");
   accountStatusdeletecampuslist.setIsCampusActive(true);
   accountStatusdeletecampuslist.setIsSystemCode(true);
    accountStatusdeletecampuslist.setLastModifiedDateTime("2020/12/12 08:49:31");
    accountStatusdeletecampuslist.setLastModifiedUserId(2);
    accountStatusdeletecampuslist.setRowVersion(campusGroupcampuslistrowversion);
    accountStatusdeletecampuslist.setOriginalState(null);
    accountStatusdeletecampuslist.setSecureState(null);
   accountStatusdeletecampuslist.setExtendedProperties(null);
 accountStatusdeletecampuslist.setEntityState(0);
	
	List<AccountStatusdeletecampuslist> accountStatusdeletecampuslistlist=new ArrayList<AccountStatusdeletecampuslist>();
	accountStatusdeletecampuslistlist.add(accountStatusdeletecampuslist);
	
	AccountStatusdeletecampusgrp accountStatusdeletecampusgrp=new AccountStatusdeletecampusgrp();
	
	accountStatusdeletecampusgrp.setId(campusGroupId);
	accountStatusdeletecampusgrp.setCode("edittest");
	accountStatusdeletecampusgrp.setCreatedDateTime("2020/12/12 08:49:31");
	accountStatusdeletecampusgrp.setFinancialCampusGroup(false);
	accountStatusdeletecampusgrp.setIsActive(true);
	accountStatusdeletecampusgrp.setIsSystemCode(true);
	accountStatusdeletecampusgrp.setLastModifiedDateTime("2020/12/12 08:49:31");
	accountStatusdeletecampusgrp.setLastModifiedUserId(2);
	accountStatusdeletecampusgrp.setName("editname");
	accountStatusdeletecampusgrp.setRowVersion(campusGrouprowversion);
	accountStatusdeletecampusgrp.setSaStmtComments(null);
	accountStatusdeletecampusgrp.setSaStmtLastCloseDate(null);
	accountStatusdeletecampusgrp.setType("A");
	accountStatusdeletecampusgrp.setCampusList(accountStatusdeletecampuslistlist);

	
	
	AccountStatusDelete accountStatusDelete=new AccountStatusDelete();
	
	accountStatusDelete.setCampusIdList(null);
	accountStatusDelete.setId(id);
	accountStatusDelete.setCampusGroupId(campusGroupId);
	accountStatusDelete.setCode("edittest");
	accountStatusDelete.setCreatedDateTime("2020/12/12 08:49:31");
	accountStatusDelete.setActive(true);
	accountStatusDelete.setLastModifiedDateTime("2020/12/12 08:49:31");
	accountStatusDelete.setLastModifiedUserId(2);
	accountStatusDelete.setName("edittest");
	accountStatusDelete.setRowVersion(rowversion);
	accountStatusDelete.setUsage("B");
	accountStatusDelete.setCampusGroup(accountStatusdeletecampusgrp);
	accountStatusDelete.setOriginalState(null);
	accountStatusDelete.setSecureState(null);
	accountStatusDelete.setExtendedProperties(null);
	accountStatusDelete.setEntityState(0);
	
	DeleteAccountStatuspayload deleteAccountStatuspayload=new DeleteAccountStatuspayload();
	deleteAccountStatuspayload.payload=accountStatusDelete;
	String data = MAPPER.writerWithDefaultPrettyPrinter().writeValueAsString(deleteAccountStatuspayload);
	System.out.println("Get for SACashPaymentNames Payload: " + data);
	request.body(deleteAccountStatuspayload);
	response=request.post("/Delete");
	responsebody=response.getBody();
	jsonpath=responsebody.jsonPath();

	Assert.assertEquals(response.getStatusCode(), 200);
	Assert.assertEquals(jsonpath.getString("payload.deleted"),"true");
	
	
	
}
	
}

