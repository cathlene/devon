package com.devonfw.application.jtqj.peoplecentermanagement.logic.api.to;

import java.sql.Timestamp;

import com.devonfw.application.jtqj.peoplecentermanagement.common.api.PeopleCenter;
import com.devonfw.module.basic.common.api.to.AbstractEto;

/**
 * Entity transport object of PeopleCenter
 */
public class PeopleCenterEto extends AbstractEto implements PeopleCenter {

  private static final long serialVersionUID = 1L;

  private Long peopleId;

  private Long centerId;

  private Timestamp start_date;

  private Timestamp end_date;

  private Long id;

  private Integer yearmonthtart;

  private Integer yearmonthend;

  @Override
  public Long getPeopleId() {

    return this.peopleId;
  }

  @Override
  public void setPeopleId(Long peopleId) {

    this.peopleId = peopleId;
  }

  @Override
  public Long getCenterId() {

    return this.centerId;
  }

  @Override
  public void setCenterId(Long centerId) {

    this.centerId = centerId;
  }

  @Override
  public Timestamp getStart_date() {

    return this.start_date;
  }

  @Override
  public void setStart_date(Timestamp start_date) {

    this.start_date = start_date;
  }

  @Override
  public Timestamp getEnd_date() {

    return this.end_date;
  }

  @Override
  public void setEnd_date(Timestamp end_date) {

    this.end_date = end_date;
  }

  @Override
  public int hashCode() {

    final int prime = 31;
    int result = super.hashCode();

    result = prime * result + ((this.peopleId == null) ? 0 : this.peopleId.hashCode());

    result = prime * result + ((this.centerId == null) ? 0 : this.centerId.hashCode());
    result = prime * result + ((this.start_date == null) ? 0 : this.start_date.hashCode());
    result = prime * result + ((this.end_date == null) ? 0 : this.end_date.hashCode());
    return result;
  }

  @Override
  public boolean equals(Object obj) {

    if (this == obj) {
      return true;
    }
    if (obj == null) {
      return false;
    }
    // class check will be done by super type EntityTo!
    if (!super.equals(obj)) {
      return false;
    }
    PeopleCenterEto other = (PeopleCenterEto) obj;

    if (this.peopleId == null) {
      if (other.peopleId != null) {
        return false;
      }
    } else if (!this.peopleId.equals(other.peopleId)) {
      return false;
    }

    if (this.centerId == null) {
      if (other.centerId != null) {
        return false;
      }
    } else if (!this.centerId.equals(other.centerId)) {
      return false;
    }
    if (this.start_date == null) {
      if (other.start_date != null) {
        return false;
      }
    } else if (!this.start_date.equals(other.start_date)) {
      return false;
    }
    if (this.end_date == null) {
      if (other.end_date != null) {
        return false;
      }
    } else if (!this.end_date.equals(other.end_date)) {
      return false;
    }
    return true;
  }

  @Override
  public Long getId() {

    return id;
  }

  @Override
  public void setId(Long id) {

    this.id = id;
  }

  @Override
  public Integer getYearmonthtart() {

    return yearmonthtart;
  }

  @Override
  public void setYearmonthtart(Integer yearmonthtart) {

    this.yearmonthtart = yearmonthtart;
  }

  @Override
  public Integer getYearmonthend() {

    return yearmonthend;
  }

  @Override
  public void setYearmonthend(Integer yearmonthend) {

    this.yearmonthend = yearmonthend;
  }

}
