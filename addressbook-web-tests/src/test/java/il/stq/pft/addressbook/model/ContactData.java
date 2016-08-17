package il.stq.pft.addressbook.model;

public class ContactData {
  private final String name;
  private final String lastname;
  private final String address;
  private final String telefon;
  private final String emailaddress;
  private String group;

  public ContactData(String name, String lastname, String address, String telefon, String emailaddress,String group) {
    this.name = name;
    this.lastname = lastname;
    this.address = address;
    this.telefon = telefon;
    this.emailaddress = emailaddress;
    this.group = group;
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

  public String getGroup() {
    return group;
  }
}
