package com.devonfw.application.jtqj.peoplecentermanagement.logic.impl.usecase;

import java.util.Objects;

import javax.inject.Named;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.validation.annotation.Validated;

import com.devonfw.application.jtqj.peoplecentermanagement.common.api.CompositePeopleCenterKey;
import com.devonfw.application.jtqj.peoplecentermanagement.dataaccess.api.CompositePeopleCenterKeyImpl;
import com.devonfw.application.jtqj.peoplecentermanagement.dataaccess.api.PeoplecenterEntity;
import com.devonfw.application.jtqj.peoplecentermanagement.logic.api.to.PeoplecenterCto;
import com.devonfw.application.jtqj.peoplecentermanagement.logic.api.to.PeoplecenterEto;
import com.devonfw.application.jtqj.peoplecentermanagement.logic.api.usecase.UcManagePeoplecenter;
import com.devonfw.application.jtqj.peoplecentermanagement.logic.base.usecase.AbstractPeoplecenterUc;

/**
 * Use case implementation for modifying and deleting Peoplecenters
 */
@Named
@Validated
@Transactional
public class UcManagePeoplecenterImpl extends AbstractPeoplecenterUc implements UcManagePeoplecenter {

  /** Logger instance. */
  private static final Logger LOG = LoggerFactory.getLogger(UcManagePeoplecenterImpl.class);

  @Override
  public boolean deletePeoplecenter(CompositePeopleCenterKey id) {

    PeoplecenterEntity peoplecenter = getPeoplecenterRepository().find(new CompositePeopleCenterKeyImpl(id));
    getPeoplecenterRepository().delete(peoplecenter);
    LOG.debug("The peoplecenter with id '{}' has been deleted.", id);
    return true;
  }

  @Override
  public PeoplecenterEto savePeoplecenter(PeoplecenterEto peoplecenter) {

    Objects.requireNonNull(peoplecenter, "peoplecenter");

    PeoplecenterEntity peoplecenterEntity = getBeanMapper().map(peoplecenter, PeoplecenterEntity.class);

    // initialize, validate peoplecenterEntity here if necessary
    PeoplecenterEntity resultEntity = getPeoplecenterRepository().save(peoplecenterEntity);
    LOG.debug("Peoplecenter with id '{}' has been created.", resultEntity.getId());
    return getBeanMapper().map(resultEntity, PeoplecenterEto.class);
  }

  @Override
  public PeoplecenterCto savePeoplecenter(PeoplecenterCto peoplecenterCto) {

    Objects.requireNonNull(peoplecenterCto, "peopleCenter");

    PeoplecenterEntity employeeEntity = getBeanMapper().map(peoplecenterCto.getPeoplecenter(),
        PeoplecenterEntity.class);

    // initialize, validate employeeEntity here if necessary
    PeoplecenterEntity resultEntity = getPeoplecenterRepository().save(employeeEntity);
    LOG.debug("Employee with id '{}' has been created.", resultEntity.getId());
    PeoplecenterCto employeeCtoResult = new PeoplecenterCto();
    employeeCtoResult.setPeoplecenter(getBeanMapper().map(resultEntity, PeoplecenterEto.class));
    return employeeCtoResult;
  }
}
