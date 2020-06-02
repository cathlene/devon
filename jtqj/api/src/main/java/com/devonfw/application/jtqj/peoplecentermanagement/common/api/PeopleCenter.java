package com.devonfw.application.jtqj.peoplecentermanagement.common.api;

import java.sql.Timestamp;

import com.devonfw.application.jtqj.general.common.api.ApplicationEntity;

public interface PeopleCenter extends ApplicationEntity {

  /**
   * getter for peopleId attribute
   *
   * @return peopleId
   */

  public Long getPeopleId();

  /**
   * @param people setter for people attribute
   */

  public void setPeopleId(Long peopleId);

  /**
   * getter for centerId attribute
   *
   * @return centerId
   */

  public Long getCenterId();

  /**
   * @param center setter for center attribute
   */

  public void setCenterId(Long centerId);

  /**
   * @return start_dateId
   */

  public Timestamp getStart_date();

  /**
   * @param start_date setter for start_date attribute
   */

  public void setStart_date(Timestamp start_date);

  /**
   * @return end_dateId
   */

  public Timestamp getEnd_date();

  /**
   * @param end_date setter for end_date attribute
   */

  public void setEnd_date(Timestamp end_date);

}
