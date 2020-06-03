package com.devonfw.application.jtqj.peoplecentermanagement.logic.api.to;

import com.devonfw.application.jtqj.peoplecentermanagement.common.api.PeopleCenterCustom;
import com.devonfw.module.basic.common.api.to.AbstractEto;

/**
 * Entity transport object of PeopleCenter
 */
public class PeopleCenterCustomEto extends AbstractEto implements PeopleCenterCustom {

  private static final long serialVersionUID = 1L;

  private Long id;

  @Override
  public Long getId() {

    return this.id;
  }

  @Override
  public void setId(Long id) {

    this.id = id;
  }

}
