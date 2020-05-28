package com.devonfw.application.jtqj.peoplecentermanagement.logic.api.to;

import com.devonfw.application.jtqj.general.common.api.to.AbstractSearchCriteriaTo;
import com.devonfw.application.jtqj.peoplecentermanagement.common.api.CompositePeopleCenterKey;

/**
 * {@link SearchCriteriaTo} to find instances of
 * {@link com.devonfw.application.jtqj.peoplecentermanagement.common.api.Peoplecenter}s.
 */
public class PeoplecenterSearchCriteriaTo extends AbstractSearchCriteriaTo {

  private static final long serialVersionUID = 1L;

  private CompositePeopleCenterKey id;

  /**
   * @return idId
   */
  public CompositePeopleCenterKey getId() {

    return this.id;
  }

  /**
   * @param id setter for id attribute
   */
  public void setId(CompositePeopleCenterKey id) {

    this.id = id;
  }

}
