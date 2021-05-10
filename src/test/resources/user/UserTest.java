package user;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import com.fullteaching.backend.course.Course;
import com.fullteaching.backend.user.User;
import com.fullteaching.backend.user.UserRepository;

import static org.mockito.Mockito.mock;

public class UserTest {
	
	private User user1;
	private User user2;
	private UserRepository student1;
	private Set<Course> courses;
	
	
	/*public User(String name, String password, String nickName, String picture, String... roles){
		this.name = name;
		this.passwordHash = new BCryptPasswordEncoder().encode(password);
		this.roles = new ArrayList<>(Arrays.asList(roles));
		
		this.nickName = nickName;
		if (picture != null && picture != "") {
			this.picture = picture;
		} else {
			this.picture = "/../assets/images/default_session_image.png";
		}
		this.registrationDate = System.currentTimeMillis();
		this.courses = new HashSet<>();
	}*/
	@BeforeEach
	public void testUser() {
		Course course_qualidade_teste = mock(Course.class);
		
		this.courses = new HashSet<>();
		courses.add(course_qualidade_teste);
		
		this.user1 = new User("julianamariasousamesquita@id.uff.br", "123456Ju", "Aluna", "IGNORE"," ");
		this.user1.setCourses(courses);
		
		this.user2 = new User("lenoras@id.uff.br", "124578", "Aluna", "IGNORE"," ");
		this.user2.setCourses(courses);	
		
		this.student1 = (UserRepository) student1.findByName("student1@gmail.com");
	}
	
	/*public void setId(Long id) {
		this.id = id;
	}*/
	@Test
	public void testId() {
		boolean id = student1.existsById((long) 1);
		assertEquals(id,1);
	}
	
	/*public void setName(String name) {
		this.name = name;
	}*/
	@Test
	public void testName() {
		assertEquals(this.user1.getName(), "julianamariasousamesquita@id.uff.br");
	}	
	
    /*public void setPasswordHash(String passwordHash) {
		this.passwordHash = passwordHash;
	}*/
	@Test
	public void testPasswordHash() {
		assertEquals(this.user2.getPasswordHash(),"124578");
	}
	
	/*public void setRoles(List<String> roles) {
		this.roles = roles;
	}*/
	@Test
	public void testRoles() {
		assertEquals(this.user1.getRoles()," ");
	}
	
	/*public void setNickName(String nickName) {
		this.nickName = nickName;
	}*/
	@Test
	public void testNickName() {
		assertEquals(this.user2.getNickName(),"Aluna");
	}
	
	/*public void setPicture(String picture) {
		this.picture = picture;
	}*/
	@Test
	public void testPicture() {
		assertEquals(this.user1.getPicture(), "IGNORE");
	}
	
	/*public void setRegistrationDate(long registrationDate) {
		this.registrationDate = registrationDate;
	}*/
	@Test
	public void testRegistrationDate() {
		long date = 07052021;
		this.user1.setRegistrationDate(date);
		assertEquals(this.user1.getRegistrationDate(),date);
	}
	
	/*public void setCourses(Set<Course> courses) {
		this.courses = courses;
	}*/
	@Test
	public void testCourses(Set<Course> courses) {
		assertEquals(courses, this.user2.getCourses());
	}
	
	/*@Override
	public boolean equals(Object other){
	    if (other == null) return false;
	    if (other == this) return true;
	    if (!(other instanceof User))return false;
	    User otherUser = (User)other;
	    return ((otherUser.id == this.id) && (otherUser.name.equals(this.name)));
	}*/
	@Test
	public void testEquals() {		
		assertTrue(this.user1.equals(this.user1));
		assertTrue(this.user1.equals(this.user2));
	}
	
	/*@Override
	public int hashCode() {
	    return name.hashCode();
	}*/
	@Test
	public void testHashCode() {
		int code = this.user2.hashCode();
		assertEquals(this.user1.hashCode(),code);		
	}
	
	
	/*@Override
	public String toString() {
		return this.nickName;
	}*/
	@Test
	public void testToString() {
		assertEquals(this.user2.getNickName(),"Aluna");
	}

	
}
