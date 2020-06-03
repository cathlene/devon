package com.devonfw.application.jtqj.peoplecentermanagement.dataaccess.api;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Transient;

import com.devonfw.application.jtqj.centermanagement.dataaccess.api.CenterEntity;
import com.devonfw.application.jtqj.general.dataaccess.api.ApplicationPersistenceEntity;
import com.devonfw.application.jtqj.peoplecentermanagement.common.api.PeopleCenter;
import com.devonfw.application.jtqj.peoplemanagement.dataaccess.api.PeopleEntity;

/**
 * @author cvanmoor
 */
@Entity
@Table(name = "PEOPLE_CENTER")
public class PeopleCenterEntity extends ApplicationPersistenceEntity implements PeopleCenter {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  @Column(name = "id_people_center")
  private Long id;

  @ManyToOne
  @JoinColumn(name = "id_people")
  private PeopleEntity people;

  @ManyToOne
  @JoinColumn(name = "id_center")
  private CenterEntity center;

  private Timestamp start_date;

  private Timestamp end_date;

  private Integer yearmonthtart;

  private Integer yearmonthend;

  private static final long serialVersionUID = 1L;

  /**
   * @return people
   */
  public PeopleEntity getPeople() {

    return this.people;
  }

  /**
   * @param people new value of {@link #getpeople}.
   */
  public void setPeople(PeopleEntity people) {

    this.people = people;
  }

  /**
   * @return center
   */
  public CenterEntity getCenter() {

    return this.center;
  }

  /**
   * @param center new value of {@link #getcenter}.
   */
  public void setCenter(CenterEntity center) {

    this.center = center;
  }

  /**
   * @return start_date
   */
  @Override
  public Timestamp getStart_date() {

    return this.start_date;
  }

  /**
   * @param start_date new value of {@link #getstart_date}.
   */
  @Override
  public void setStart_date(Timestamp start_date) {

    this.start_date = start_date;
  }

  /**
   * @return end_date
   */
  @Override
  public Timestamp getEnd_date() {

    return this.end_date;
  }

  /**
   * @param end_date new value of {@link #getend_date}.
   */
  @Override
  public void setEnd_date(Timestamp end_date) {

    this.end_date = end_date;
  }

  @Override
  @Transient
  public Long getPeopleId() {

    if (this.people == null) {
      return null;
    }
    return this.people.getId();
  }

  @Override
  public void setPeopleId(Long peopleId) {

    if (peopleId == null) {
      this.people = null;
    } else {
      PeopleEntity peopleEntity = new PeopleEntity();
      peopleEntity.setId(peopleId);
      this.people = peopleEntity;
    }
  }

  @Override
  @Transient
  public Long getCenterId() {

    if (this.center == null) {
      return null;
    }
    return this.center.getId();
  }

  @Override
  public void setCenterId(Long centerId) {

    if (centerId == null) {
      this.center = null;
    } else {
      CenterEntity centerEntity = new CenterEntity();
      centerEntity.setId(centerId);
      this.center = centerEntity;
    }
  }

  @Override
  public Long getId() {

    // TODO Auto-generated method stub
    return this.id;
  }

  @Override
  public void setId(Long id) {

    this.id = id;

  }

  /**
   * @return yearmonthtart
   */
  public Integer getYearmonthtart() {

    return this.yearmonthtart;
  }

  /**
   * @param yearmonthtart new value of {@link #getyearmonthtart}.
   */
  public void setYearmonthtart(Integer yearmonthtart) {

    this.yearmonthtart = yearmonthtart;
  }

  /**
   * @return yearmonthend
   */
  public Integer getYearmonthend() {

    return this.yearmonthend;
  }

  /**
   * @param yearmonthend new value of {@link #getyearmonthend}.
   */
  public void setYearmonthend(Integer yearmonthend) {

    this.yearmonthend = yearmonthend;
  }

}
