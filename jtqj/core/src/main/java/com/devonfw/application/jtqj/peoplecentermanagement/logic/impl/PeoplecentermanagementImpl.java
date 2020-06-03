package com.devonfw.application.jtqj.peoplecentermanagement.logic.impl;

import java.util.List;

import javax.inject.Inject;
import javax.inject.Named;

import org.springframework.data.domain.Page;

import com.devonfw.application.jtqj.general.logic.base.AbstractComponentFacade;
import com.devonfw.application.jtqj.peoplecentermanagement.logic.api.Peoplecentermanagement;
import com.devonfw.application.jtqj.peoplecentermanagement.logic.api.to.PeopleCenterCto;
import com.devonfw.application.jtqj.peoplecentermanagement.logic.api.to.PeopleCenterEto;
import com.devonfw.application.jtqj.peoplecentermanagement.logic.api.to.PeopleCenterSearchCriteriaTo;
import com.devonfw.application.jtqj.peoplecentermanagement.logic.api.usecase.UcFindPeopleCenter;
import com.devonfw.application.jtqj.peoplecentermanagement.logic.api.usecase.UcManagePeopleCenter;

/**
 * Implementation of component interface of peoplecentermanagement
 */
@Named
public class PeoplecentermanagementImpl extends AbstractComponentFacade implements Peoplecentermanagement {

  @Inject
  private UcFindPeopleCenter ucFindPeopleCenter;

  @Inject
  private UcManagePeopleCenter ucManagePeopleCenter;

  @Override
  public PeopleCenterEto findPeopleCenter(long id) {

    return this.ucFindPeopleCenter.findPeopleCenter(id);
  }

  @Override
  public Page<PeopleCenterEto> findPeopleCenters(PeopleCenterSearchCriteriaTo criteria) {

    return this.ucFindPeopleCenter.findPeopleCenters(criteria);
  }

  @Override
  public PeopleCenterEto savePeopleCenter(PeopleCenterEto peoplecenter) {

    return this.ucManagePeopleCenter.savePeopleCenter(peoplecenter);
  }

  @Override
  public boolean deletePeopleCenter(long id) {

    return this.ucManagePeopleCenter.deletePeopleCenter(id);
  }

  @Override
  public List<PeopleCenterCto> findPersonCenterDays() {

    return this.ucManagePeopleCenter.findPersonCenterDays();
  }

  @Override
  public PeopleCenterCto findPersonCenterDay(long id) {

    return this.ucManagePeopleCenter.findPersonCenterDay(id);
  }

}
