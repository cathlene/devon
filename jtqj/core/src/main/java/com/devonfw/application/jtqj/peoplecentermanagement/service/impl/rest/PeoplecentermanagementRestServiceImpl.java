package com.devonfw.application.jtqj.peoplecentermanagement.service.impl.rest;

import javax.inject.Inject;
import javax.inject.Named;

import org.springframework.data.domain.Page;

import com.devonfw.application.jtqj.peoplecentermanagement.common.api.CompositePeopleCenterKey;
import com.devonfw.application.jtqj.peoplecentermanagement.logic.api.Peoplecentermanagement;
import com.devonfw.application.jtqj.peoplecentermanagement.logic.api.to.PeoplecenterCto;
import com.devonfw.application.jtqj.peoplecentermanagement.logic.api.to.PeoplecenterEto;
import com.devonfw.application.jtqj.peoplecentermanagement.logic.api.to.PeoplecenterSearchCriteriaTo;
import com.devonfw.application.jtqj.peoplecentermanagement.service.api.rest.PeoplecentermanagementRestService;

/**
 * The service implementation for REST calls in order to execute the logic of component {@link Peoplecentermanagement}.
 */
@Named("PeoplecentermanagementRestService")
public class PeoplecentermanagementRestServiceImpl implements PeoplecentermanagementRestService {

  @Inject
  private Peoplecentermanagement peoplecentermanagement;

  @Override
  public PeoplecenterEto getPeoplecenter(CompositePeopleCenterKey id) {

    return this.peoplecentermanagement.findPeoplecenter(id);
  }

  @Override
  public PeoplecenterEto savePeoplecenter(PeoplecenterEto peoplecenter) {

    return this.peoplecentermanagement.savePeoplecenter(peoplecenter);
  }

  @Override
  public void deletePeoplecenter(CompositePeopleCenterKey id) {

    this.peoplecentermanagement.deletePeoplecenter(id);
  }

  @Override
  public Page<PeoplecenterEto> findPeoplecenters(PeoplecenterSearchCriteriaTo searchCriteriaTo) {

    return this.peoplecentermanagement.findPeoplecenters(searchCriteriaTo);
  }

  @Override
  public PeoplecenterCto getPeoplecenterCto(CompositePeopleCenterKey id) {

    return this.peoplecentermanagement.findPeoplecenterCto(id);
  }

  @Override
  public Page<PeoplecenterCto> getPeoplecenterCto(PeoplecenterSearchCriteriaTo searchCriteriaTo) {

    return this.peoplecentermanagement.findPeoplecentersCtos(searchCriteriaTo);

  }

  @Override
  public PeoplecenterCto savePeoplecenter(PeoplecenterCto peopleCenter) {

    return this.peoplecentermanagement.savePeoplecenter(peopleCenter);

  }
}