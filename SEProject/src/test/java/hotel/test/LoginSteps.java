package hotel.test;
import najah.edu.*;

import static org.junit.Assert.assertTrue;

import java.util.*;

import io.cucumber.java.en.*;
import junit.framework.Assert;
import najah.edu.Login;

public class LoginSteps {
	ArrayList<String> users=new ArrayList<String>();
	ArrayList<String> passwords=new ArrayList<String>();
	Login l;
	String u,p;
	int result;
	@Given("these are the users")
	public void these_are_the_users(io.cucumber.datatable.DataTable dataTable) {
	    // Write code here that turns the phrase above into concrete actions
	    // For automatic transformation, change DataTable to one of
	    // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
	    // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
	    // Double, Byte, Short, Long, BigInteger or BigDecimal.
	    //
	    // For other transformations you can register a DataTableType.
		for(int i=0;i<3;i++)
			users.add(dataTable.cell(i, 0));
		for(int i=0;i<3;i++)
			passwords.add(dataTable.cell(i, 1));
		
		for(int i=0;i<users.size();i++)
		{
			System.out.println(i+" "+users.get(i));
		}
		for(int i=0;i<users.size();i++)
		{
			System.out.println(i+" "+passwords.get(i));
		}
		l=new Login(users,passwords);
		
	}

	@Given("that the customer {string} is not logged in")
	public void that_the_customer_is_not_logged_in(String string) {
	    // Write code here that turns the phrase above into concrete actions
	}

	@When("customer tries to login")
	public void customer_tries_to_login() {
	    // Write code here that turns the phrase above into concrete actions
	}

	@When("username is {string} and password is {string}")
	public void username_is_and_password_is(String string, String string2) {
	    // Write code here that turns the phrase above into concrete actions
		u=string;
		p=string2;
		System.out.println(u+" "+p);
		result=l.checkLoginStatus(u, p);
	}

	@Then("the login succeeds")
	public void the_login_succeeds() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("result= "+result);
		assertTrue("Invalid Crdentials",result == 1);
	}

	@Then("the customer is logged in")
	public void the_customer_is_logged_in() {
	    // Write code here that turns the phrase above into concrete actions
	}

	@When("customer tries to log in")
	public void customer_tries_to_log_in() {
	    // Write code here that turns the phrase above into concrete actions
	}

	@Then("the login fails")
	public void the_login_fails() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("result= "+ result);
		assertTrue("Invalid Crdentials",result == -1);
	}

	@Then("the user is not logged in")
	public void the_user_is_not_logged_in() {
	    // Write code here that turns the phrase above into concrete actions
	}

}
