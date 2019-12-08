package objectclass;

public class Student {
  int studId;
  String studName;

  public Student(int studId, String studName) {
	
	this.studId = studId;
	this.studName = studName;
}

@Override
public String toString() {
	return "Student Id=" + studId + ", Student Name=" + studName;
}
  
  
  
  
}
