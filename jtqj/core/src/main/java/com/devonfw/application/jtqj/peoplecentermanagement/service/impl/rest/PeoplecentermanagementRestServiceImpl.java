package com.devonfw.application.jtqj.peoplecentermanagement.service.impl.rest;

import java.util.List;

import javax.inject.Inject;
import javax.inject.Named;

import org.springframework.data.domain.Page;

import com.devonfw.application.jtqj.peoplecentermanagement.logic.api.Peoplecentermanagement;
import com.devonfw.application.jtqj.peoplecentermanagement.logic.api.to.PeopleCenterCto;
import com.devonfw.application.jtqj.peoplecentermanagement.logic.api.to.PeopleCenterCustomEto;
import com.devonfw.application.jtqj.peoplecentermanagement.logic.api.to.PeopleCenterEto;
import com.devonfw.application.jtqj.peoplecentermanagement.logic.api.to.PeopleCenterSearchCriteriaTo;
import com.devonfw.application.jtqj.peoplecentermanagement.service.api.rest.PeoplecentermanagementRestService;

/**
 * The service implementation for REST calls in order to execute the logic of component {@link Peoplecentermanagement}.
 */
@Named("PeoplecentermanagementRestService")
public class PeoplecentermanagementRestServiceImpl implements PeoplecentermanagementRestService {

  @Inject
  private Peoplecentermanagement peoplecentermanagement;

  @Override
  public PeopleCenterEto getPeopleCenter(long id) {

    return this.peoplecentermanagement.findPeopleCenter(id);
  }

  @Override
  public List<PeopleCenterCto> findPersonCenterDays() {

    return this.peoplecentermanagement.findPersonCenterDays();
  }

  @Override
  public List<PeopleCenterCustomEto> findPersonCenterDay(long id) {

    return this.peoplecentermanagement.findPersonCenterDay(id);
  }

  @Override
  public PeopleCenterEto savePeopleCenter(PeopleCenterEto peoplecenter) {

    return this.peoplecentermanagement.savePeopleCenter(peoplecenter);
  }

  @Override
  public void deletePeopleCenter(long id) {

    this.peoplecentermanagement.deletePeopleCenter(id);
  }

  @Override
  public Page<PeopleCenterEto> findPeopleCenters(PeopleCenterSearchCriteriaTo searchCriteriaTo) {

    return this.peoplecentermanagement.findPeopleCenters(searchCriteriaTo);
  }

}
