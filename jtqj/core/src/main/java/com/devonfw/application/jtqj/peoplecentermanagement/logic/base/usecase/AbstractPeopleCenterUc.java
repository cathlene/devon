package com.devonfw.application.jtqj.peoplecentermanagement.logic.base.usecase;

import javax.inject.Inject;

import com.devonfw.application.jtqj.general.logic.base.AbstractUc;
import com.devonfw.application.jtqj.peoplecentermanagement.dataaccess.api.repo.PeopleCenterRepository;

/**
 * Abstract use case for PeopleCenters, which provides access to the commonly necessary data access objects.
 */
public class AbstractPeopleCenterUc extends AbstractUc {

  /** @see #getPeopleCenterRepository() */
  @Inject
  private PeopleCenterRepository peopleCenterRepository;

  /**
   * Returns the field 'peopleCenterRepository'.
   * 
   * @return the {@link PeopleCenterRepository} instance.
   */
  public PeopleCenterRepository getPeopleCenterRepository() {

    return this.peopleCenterRepository;
  }

}
