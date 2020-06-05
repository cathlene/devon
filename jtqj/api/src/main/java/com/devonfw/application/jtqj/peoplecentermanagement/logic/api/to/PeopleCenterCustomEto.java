package com.devonfw.application.jtqj.peoplecentermanagement.logic.api.to;

import com.devonfw.application.jtqj.peoplecentermanagement.common.api.PeopleCenterCustom;
import com.devonfw.module.basic.common.api.to.AbstractEto;

/**
 * Entity transport object of PeopleCenter
 */
public class PeopleCenterCustomEto extends AbstractEto implements PeopleCenterCustom {

  private static final long serialVersionUID = 1L;

  private String people_name;

  private Integer nr_days;

  private String center_name;

  /**
   * @return people_name
   */
  @Override
  public String getPeople_name() {

    return this.people_name;
  }

  /**
   * @param people_name new value of {@link #getpeople_name}.
   */
  public void setPeople_name(String people_name) {

    this.people_name = people_name;
  }

  /**
   * @return nr_days
   */
  @Override
  public Integer getNr_days() {

    return this.nr_days;
  }

  /**
   * @param nr_days new value of {@link #getnr_days}.
   */
  public void setNr_days(Integer nr_days) {

    this.nr_days = nr_days;
  }

  /**
   * @return center_name
   */
  @Override
  public String getCenter_name() {

    return this.center_name;
  }

  /**
   * @param center_name new value of {@link #getcenter_name}.
   */
  public void setCenter_name(String center_name) {

    this.center_name = center_name;
  }

}
