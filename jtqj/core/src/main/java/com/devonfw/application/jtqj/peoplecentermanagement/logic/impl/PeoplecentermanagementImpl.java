package com.devonfw.application.jtqj.peoplecentermanagement.logic.impl;

import javax.inject.Inject;
import javax.inject.Named;

import org.springframework.data.domain.Page;

import com.devonfw.application.jtqj.general.logic.base.AbstractComponentFacade;
import com.devonfw.application.jtqj.peoplecentermanagement.common.api.CompositePeopleCenterKey;
import com.devonfw.application.jtqj.peoplecentermanagement.logic.api.Peoplecentermanagement;
import com.devonfw.application.jtqj.peoplecentermanagement.logic.api.to.PeoplecenterCto;
import com.devonfw.application.jtqj.peoplecentermanagement.logic.api.to.PeoplecenterEto;
import com.devonfw.application.jtqj.peoplecentermanagement.logic.api.to.PeoplecenterSearchCriteriaTo;
import com.devonfw.application.jtqj.peoplecentermanagement.logic.api.usecase.UcFindPeoplecenter;
import com.devonfw.application.jtqj.peoplecentermanagement.logic.api.usecase.UcManagePeoplecenter;

/**
 * Implementation of component interface of peoplecentermanagement
 */
@Named
public class PeoplecentermanagementImpl extends AbstractComponentFacade implements Peoplecentermanagement {

  @Inject
  private UcFindPeoplecenter ucFindPeoplecenter;

  @Inject
  private UcManagePeoplecenter ucManagePeoplecenter;

  @Override
  public PeoplecenterEto findPeoplecenter(CompositePeopleCenterKey id) {

    return this.ucFindPeoplecenter.findPeoplecenter(id);
  }

  @Override
  public Page<PeoplecenterEto> findPeoplecenters(PeoplecenterSearchCriteriaTo criteria) {

    return this.ucFindPeoplecenter.findPeoplecenters(criteria);
  }

  @Override
  public PeoplecenterEto savePeoplecenter(PeoplecenterEto peoplecenter) {

    return this.ucManagePeoplecenter.savePeoplecenter(peoplecenter);
  }

  @Override
  public boolean deletePeoplecenter(CompositePeopleCenterKey id) {

    return this.ucManagePeoplecenter.deletePeoplecenter(id);
  }

  @Override
  public PeoplecenterCto findPeoplecenterCto(CompositePeopleCenterKey id) {

    return this.ucFindPeoplecenter.findPeoplecenterCto(id);
  }

  @Override
  public Page<PeoplecenterCto> findPeoplecentersCtos(PeoplecenterSearchCriteriaTo criteria) {

    return this.ucFindPeoplecenter.findPeoplecentersCtos(criteria);
  }

  @Override
  public PeoplecenterCto savePeoplecenter(PeoplecenterCto peoplecenterCto) {

    return this.ucManagePeoplecenter.savePeoplecenter(peoplecenterCto);
  }

}
