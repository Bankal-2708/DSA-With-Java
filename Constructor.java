class Student {
  String name;
  int age;
  int section;

  // Student(String name, int age, int section) {
  //   this.name = name;
  //   this.age = age;
  //   this.section = section;
  // }

  public void display(String name, int age, int section) {
    System.out.println("Student name is " + name + " age is " + age + " section is " + section);
  }

  public static void main(String[] args) {
    Student s1 = new Student();
    Student s2 = new Student();

    s1.display("Bankal", 21, 2);
    s2.display("Kittu", 20, 1);
  }
}