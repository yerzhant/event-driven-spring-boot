package com.mploed.spring.events.applicationprocess.domain;

import javax.persistence.*;
import java.util.Date;

@Entity
public class CreditApplicationStatus {
	@Id
	@GeneratedValue
	private Long id;

	private String applicationNumber;

	@Temporal(TemporalType.TIMESTAMP)
	private Date applicationStart;

	private CreditApplicationStatus() {
	}

	public CreditApplicationStatus(String applicationNumber, Date applicationStart) {
		this.applicationNumber = applicationNumber;
		this.applicationStart = applicationStart;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getApplicationNumber() {
		return applicationNumber;
	}

	public void setApplicationNumber(String applicationNumber) {
		this.applicationNumber = applicationNumber;
	}

	public Date getApplicationStart() {
		return applicationStart;
	}

	public void setApplicationStart(Date applicationStart) {
		this.applicationStart = applicationStart;
	}

	@Override
	public String toString() {
		return "CreditApplicationStatus{" +
				"id=" + id +
				", applicationNumber='" + applicationNumber + '\'' +
				", applicationStart=" + applicationStart +
				'}';
	}
}
