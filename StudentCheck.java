package com.niit.mockito;

public class StudentCheck {
	// private StudentDAO studDAO = null;
	StudentDAO studDAO=new StudentDAO();
	    public Student getDetails(String rollNo) throws Exception{
	        System.out.println("Before DB Call");
	        Student stud = studDAO.getStudentDetails(rollNo);
	        System.out.println("After DB Call");
	        return stud;
	    }
	    public void setStudDAO(StudentDAO studDAO){
	        this.studDAO = studDAO;
	    }
}