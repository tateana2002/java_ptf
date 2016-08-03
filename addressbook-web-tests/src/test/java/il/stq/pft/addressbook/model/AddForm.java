package il.stq.pft.addressbook.model;

public class AddForm {
  private final String name;
  private final String lastname;
  private final String address;
  private final String telefon;
  private final String emailaddress;

  public AddForm(String name, String lastname, String address, String telefon, String emailaddress) {
    this.name = name;
    this.lastname = lastname;
    this.address = address;
    this.telefon = telefon;
    this.emailaddress = emailaddress;
  }

  public String getName() {
    return name;
  }

  public String getLastname() {
    return lastname;
  }

  public String getAddress() {
    return address;
  }

  public String getTelefon() {
    return telefon;
  }

  public String getEmailaddress() {
    return emailaddress;
  }
}
