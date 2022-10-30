package clinic.steps;
import static org.junit.Assert.assertTrue;

import clinic.main.*;
import io.cucumber.java.en.*;

public class adminGenerateReportSteps {
	String username;
	Boolean b=false;
	Boolean f=false;
	@Given("that the admin {string} is logged in")
	public void that_the_admin_is_logged_in(String string) {
	    // Write code here that turns the phrase above into concrete actions
		username=string;
	}

	@Given("there are patients in the clinic")
	public void there_are_patients_in_the_clinic() {
	    // Write code here that turns the phrase above into concrete actions
		if(PatientMethods.Patients.size()>0)
			b=true;
		else
			b=false;
	}
	@Given("at least one patient has an appointment")
	public void at_least_one_patient_has_an_appointment() {
	    // Write code here that turns the phrase above into concrete actions
	    f=false;
		for(int i=0;i<PatientMethods.Patients.size();i++)
	    {
	    	if(PatientMethods.Patients.get(i).getAppointments().size()>0)
	    	{
	    		f=true;
	    		break;
	    	}
	    }
	}
	@Then("the report can be generated")
	public void the_report_can_be_generated() {
	    // Write code here that turns the phrase above into concrete actions
		assertTrue("The report can not be generated",(f&&b));
	}

	@Then("the report is generated")
	public void the_report_is_generated() {
	    // Write code here that turns the phrase above into concrete actions
		for (int i=0 ; i <PatientMethods.Patients.size(); i++ ) 
		{
			System.out.println("\nPatient #"+(i+1));
			System.out.println(PatientMethods.Patients.get(i));
			System.out.println("Patient Appointements: ");
			
			for (int j=0 ; j <PatientMethods.Patients.get(i).getAppointments().size() ; j++ ) 
			{
				System.out.println("The Appointement#"+(j+1)+" "+ PatientMethods.Patients.get(i).getAppointments().get(j));
			}
		}
		
	}
}
