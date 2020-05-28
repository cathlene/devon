package com.devonfw.application.jtqj.peoplecentermanagement.logic.api.to;

import com.devonfw.module.basic.common.api.to.AbstractCto;

/**
 * Composite transport object of Peoplecenter
 */
public class PeoplecenterCto extends AbstractCto {

  private static final long serialVersionUID = 1L;

  private PeoplecenterEto peoplecenter;

  public PeoplecenterEto getPeoplecenter() {

    return peoplecenter;
  }

  public void setPeoplecenter(PeoplecenterEto peoplecenter) {

    this.peoplecenter = peoplecenter;
  }

}
