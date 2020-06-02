package com.devonfw.application.jtqj.peoplecentermanagement.logic.impl.usecase;

import java.util.Optional;

import javax.inject.Named;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.data.domain.Page;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.validation.annotation.Validated;

import com.devonfw.application.jtqj.peoplecentermanagement.dataaccess.api.PeopleCenterEntity;
import com.devonfw.application.jtqj.peoplecentermanagement.logic.api.to.PeopleCenterEto;
import com.devonfw.application.jtqj.peoplecentermanagement.logic.api.to.PeopleCenterSearchCriteriaTo;
import com.devonfw.application.jtqj.peoplecentermanagement.logic.api.usecase.UcFindPeopleCenter;
import com.devonfw.application.jtqj.peoplecentermanagement.logic.base.usecase.AbstractPeopleCenterUc;

/**
 * Use case implementation for searching, filtering and getting PeopleCenters
 */
@Named
@Validated
@Transactional
public class UcFindPeopleCenterImpl extends AbstractPeopleCenterUc implements UcFindPeopleCenter {

  /** Logger instance. */
  private static final Logger LOG = LoggerFactory.getLogger(UcFindPeopleCenterImpl.class);

  @Override
  public PeopleCenterEto findPeopleCenter(long id) {

    LOG.debug("Get PeopleCenter with id {} from database.", id);
    Optional<PeopleCenterEntity> foundEntity = getPeopleCenterRepository().findById(id);
    if (foundEntity.isPresent())
      return getBeanMapper().map(foundEntity.get(), PeopleCenterEto.class);
    else
      return null;
  }

  @Override
  public Page<PeopleCenterEto> findPeopleCenters(PeopleCenterSearchCriteriaTo criteria) {

    Page<PeopleCenterEntity> peoplecenters = getPeopleCenterRepository().findByCriteria(criteria);
    return mapPaginatedEntityList(peoplecenters, PeopleCenterEto.class);
  }

}
