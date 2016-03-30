/**
 * 
 */
package org.programming.mitra.spring.data.redis.model;

/**
 * @author Naresh Joshi
 * @since 18-Feb-2016
 */

public class Address implements Model {

	private static final long serialVersionUID = 1L;

	private static final String KEY = "ADDRESS";

	private long id;

	private String city;

	private String state;

	public Address() {
		super();
	}

	public Address(long id, String city, String state) {
		super();
		this.id = id;
		this.city = city;
		this.state = state;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (id ^ (id >>> 32));
		result = prime * result + ((city == null) ? 0 : city.hashCode());
		result = prime * result + ((state == null) ? 0 : state.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Address other = (Address) obj;
		if (city == null) {
			if (other.city != null)
				return false;
		} else if (!city.equals(other.city))
			return false;
		if (id != other.id)
			return false;
		if (state == null) {
			if (other.state != null)
				return false;
		} else if (!state.equals(other.state))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Address [id=" + id + ", city=" + city + ", state=" + state + "]";
	}

	@Override
	public String getHashKey() {
		return String.valueOf(id);
	}

	@Override
	public String getKey() {
		return KEY;
	}

}
