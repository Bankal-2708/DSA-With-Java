public class Setter_Getter {
  String name;
  int age;

  public void setname(String name) {
    this.name = name;
  }

  public String getname() {
    return name;
  }

  public void setage(int age){
    if(age < 0){
      System.out.println("Age cannot be negative");
    }else{
      this.age = age;
    }
  }

  public int getage(){
    return age;
  }

  public static void main(String[] args) {
    Setter_Getter s1 = new Setter_Getter();
    Setter_Getter s2 = new Setter_Getter();

    s1.setname("Bankal");
    s1.setage(21);

    s2.setname("Kittu");
    s2.setage(-20);

    System.out.println("Student name is " + s1.getname() + " age is " + s1.getage());
    System.out.println("Student name is " + s2.getname() + " age is " + s2.getage());
  }
}
