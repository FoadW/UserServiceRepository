package hcl.microservice.user.model;



import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Getter
@Setter
@Table("user")
public class UserEntity {
	
	@Id
	private Long user_id;
	
	@Column("email")
	private String email1;
	
	@Column("fname")
	private String fname;
	
	@Column("password")
	private String password;
	
	@Column("active")
	private boolean active;
	
	@Column("created_on")
	private String created_on;
	
	@Column("address1")
	private String address1;
	
	@Column("address2")
	private String address2;
	
	@Column("state")
	private String state;
	
	@Column("city")
	private String city;
	
	@Column("zipcode")
	private String zipcode;
	
	@Column("country")
	private String country;
	
	@Column("phone")
	private String phone;
	
	@Column("is_Admin")
	private boolean isAdmin;
	
	@Column("image_file")
	private String image_file;
	
	

}
