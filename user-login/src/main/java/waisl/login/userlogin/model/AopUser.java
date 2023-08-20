package waisl.login.userlogin.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class AopUser {
	@Id
	private String id;
	private Long budget;
	private Long poRelease;
	private String startDate;
	private String endDate;

	public AopUser() {

	}

	public AopUser(String id, Long budget, Long poRelease, String startDate, String endDate) {
		super();
		this.id = id;
		this.budget = budget;
		this.poRelease = poRelease;
		this.startDate = startDate;
		this.endDate = endDate;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Long getBudget() {
		return budget;
	}

	public void setBudget(Long budget) {
		this.budget = budget;
	}

	public Long getPoRelease() {
		return poRelease;
	}

	public void setPoRelease(Long poRelease) {
		this.poRelease = poRelease;
	}

	public String getStartDate() {
		return startDate;
	}

	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}

	public String getEndDate() {
		return endDate;
	}

	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}

	@Override
	public String toString() {
		return "AopUser [id=" + id + ", budget=" + budget + ", poRelease=" + poRelease + ", startDate=" + startDate
				+ ", endDate=" + endDate + "]";
	}

}
