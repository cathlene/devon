package com.devonfw.application.jtqj.peoplecentermanagement.logic.api.to;

import com.devonfw.application.jtqj.centermanagement.logic.api.to.CenterEto;
import com.devonfw.application.jtqj.peoplemanagement.logic.api.to.PeopleEto;
import com.devonfw.module.basic.common.api.to.AbstractCto;

/**
 * @author cvanmoor
 *
 */
public class PeopleCenterCustomCto extends AbstractCto {
  private static final long serialVersionUID = 1L;

  private PeopleCenterCustomEto peopleCenterCustom;

  private PeopleEto people;

  private CenterEto center;

  public PeopleCenterCustomEto getPeopleCustomCenter() {

    return this.peopleCenterCustom;
  }

  public void setPeopleCenterCustom(PeopleCenterCustomEto peopleCenterCustom) {

    this.peopleCenterCustom = peopleCenterCustom;
  }

  public PeopleEto getPeople() {

    return this.people;
  }

  public void setPeople(PeopleEto people) {

    this.people = people;
  }

  public CenterEto getCenter() {

    return this.center;
  }

  public void setCenter(CenterEto center) {

    this.center = center;
  }
}
