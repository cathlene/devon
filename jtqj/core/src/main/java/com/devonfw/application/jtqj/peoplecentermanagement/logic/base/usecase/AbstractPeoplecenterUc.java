package com.devonfw.application.jtqj.peoplecentermanagement.logic.base.usecase;

import javax.inject.Inject;

import com.devonfw.application.jtqj.general.logic.base.AbstractUc;
import com.devonfw.application.jtqj.peoplecentermanagement.dataaccess.api.repo.PeoplecenterRepository;

/**
 * Abstract use case for Peoplecenters, which provides access to the commonly necessary data access objects.
 */
public class AbstractPeoplecenterUc extends AbstractUc {

  /** @see #getPeoplecenterRepository() */
  @Inject
  private PeoplecenterRepository peoplecenterRepository;

  /**
   * Returns the field 'peoplecenterRepository'.
   * 
   * @return the {@link PeoplecenterRepository} instance.
   */
  public PeoplecenterRepository getPeoplecenterRepository() {

    return this.peoplecenterRepository;
  }

}
