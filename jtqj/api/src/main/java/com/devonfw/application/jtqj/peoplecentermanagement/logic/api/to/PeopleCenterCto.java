package com.devonfw.application.jtqj.peoplecentermanagement.logic.api.to;

import com.devonfw.application.jtqj.centermanagement.logic.api.to.CenterEto;
import com.devonfw.application.jtqj.peoplemanagement.logic.api.to.PeopleEto;
import com.devonfw.module.basic.common.api.to.AbstractCto;

/**
 * Composite transport object of PeopleCenter
 */
public class PeopleCenterCto extends AbstractCto {

  private static final long serialVersionUID = 1L;

  private PeopleCenterEto peopleCenter;

  private PeopleEto people;

  private CenterEto center;

  public PeopleCenterEto getPeopleCenter() {

    return peopleCenter;
  }

  public void setPeopleCenter(PeopleCenterEto peopleCenter) {

    this.peopleCenter = peopleCenter;
  }

  public PeopleEto getPeople() {

    return people;
  }

  public void setPeople(PeopleEto people) {

    this.people = people;
  }

  public CenterEto getCenter() {

    return center;
  }

  public void setCenter(CenterEto center) {

    this.center = center;
  }

}
