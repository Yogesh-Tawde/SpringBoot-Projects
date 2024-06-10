package in.ashokit.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Address 
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer addId;
	private String cityName;
	private String state;
	private String country;
    
	@ManyToOne
	@JoinColumn(name ="empId")
	private Employee emp;

	public Integer getAddId() 
	{
		return addId;
	}

	public void setAddId(Integer addId) 
	{
		this.addId = addId;
	}

	public String getCityName() 
	{
		return cityName;
	}

	public void setCityName(String cityName) 
	{
		this.cityName = cityName;
	}

	public String getState() 
	{
		return state;
	}

	public void setState(String state) 
	{
		this.state = state;
	}

	public String getCountry() 
	{
		return country;
	}

	public void setCountry(String country) 
	{
		this.country = country;
	}

	public Employee getEmp() 
	{
		return emp;
	}

	public void setEmp(Employee emp) 
	{
		this.emp = emp;
	}
	
}
