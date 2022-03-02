package elementos;

import org.openqa.selenium.By;

public class Elementos {
	
	//Elementos Web
	private By signin = By.cssSelector("#header > div.nav > div > div > nav > div.header_user_info > a");
	private By email = By.xpath("//*[@id=\"email_create\"]");
	private By create = By.xpath ("//*[@id=\"SubmitCreate\"]/span");
	private By firstname = By.xpath ("//*[@id=\"customer_firstname\"]");
	private By lastname = By.xpath ("//*[@id=\"customer_lastname\"]");
	private By passwd = By.xpath ("//*[@id=\"passwd\"]");
	private By address1 = By.xpath ("//*[@id=\"address1\"]");
	private By city = By.xpath ("//*[@id=\"city\"]");
	private By state = By.xpath ("//*[@id=\"id_state\"]/option[4]");
	private By postcode = By.xpath ("//*[@id=\"postcode\"]");
	private By phone = By.xpath ("//*[@id=\"phone_mobile\"]");
	private By email_reference = By.xpath ("//*[@id=\"alias\"]");
	private By register = By.xpath ("//*[@id=\"submitAccount\"]/span");
	private By signout = By.xpath ("//a[.='Sign out']");
	private By emailinvalido = By.xpath ("//ol//li[text()[contains(.,'Invalid email address')]]");
	private By emailregistered = By.xpath ("//ol//li[text()[contains(.,'An account using this email address has already been registered. Please enter a valid password or request a new one. ')]]");
	private By submitLogin = By.xpath ("//*[@id=\"SubmitLogin\"]/span");
	private By email_logar = By.xpath("//*[@id=\"email\"]");






	//Metodos publicos para acessos aos elementos


	public By getSignin() {
		return signin;
	}

	public By getEmail() {
		return email;
	}

	public By getCreate() {
		return create;
	}

	public By getFirstname() {
		return firstname;
	}

	public By getLastname() {
		return lastname;
	}

	public By getPhone() {
		return phone;
	}

	public By getPasswd() {
		return passwd;
	}

	public By getAddress1() {
		return address1;
	}

	public By getCity() {
		return city;
	}

	public By getState() {
		return state;
	}

	public By getPostcode() {
		return postcode;
	}

	public By getEmail_reference() {
		return email_reference;
	}

	public By getRegister() {
		return register;
	}

	public By getSignout() {
		return signout;
	}

	public By getEmailinvalido() {
		return emailinvalido;
	}

	public By getEmailregistered() {
		return emailregistered;
	}

	public By getSubmitLogin() {
		return submitLogin;
	}

	public By getEmail_logar() {
		return email_logar;
	}


}
