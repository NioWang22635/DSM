package com.hitrust.dsm.po;
// Generated 2017/8/10 �U�� 10:46:06 by Hibernate Tools 5.2.3.Final

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * OrderHistory generated by hbm2java
 */
@Entity
@Table(name = "order_history", catalog = "DSM")
public class OrderHistory implements java.io.Serializable {

	private String rowId;
	private String osId;
	private String orderDate;
	private String team;

	public OrderHistory() {
	}

	public OrderHistory(String rowId, String osId, String orderDate, String team) {
		this.rowId = rowId;
		this.osId = osId;
		this.orderDate = orderDate;
		this.team = team;
	}

	@Id

	@Column(name = "ROW_ID", unique = true, nullable = false, length = 6)
	public String getRowId() {
		return this.rowId;
	}

	public void setRowId(String rowId) {
		this.rowId = rowId;
	}

	@Column(name = "OS_ID", nullable = false, length = 4)
	public String getOsId() {
		return this.osId;
	}

	public void setOsId(String osId) {
		this.osId = osId;
	}

	@Column(name = "ORDER_DATE", nullable = false, length = 12)
	public String getOrderDate() {
		return this.orderDate;
	}

	public void setOrderDate(String orderDate) {
		this.orderDate = orderDate;
	}

	@Column(name = "TEAM", nullable = false, length = 4)
	public String getTeam() {
		return this.team;
	}

	public void setTeam(String team) {
		this.team = team;
	}

}
