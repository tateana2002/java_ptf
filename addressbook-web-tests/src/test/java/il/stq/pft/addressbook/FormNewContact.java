package il.stq.pft.addressbook;

public class FormNewContact {
  private final String name;
  private final String lastname;
  private final String address;
  private final String telefon;

  public FormNewContact(String name, String lastname, String address, String telefon) {
    this.name = name;
    this.lastname = lastname;
    this.address = address;
    this.telefon = telefon;
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
}
