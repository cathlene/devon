package com.devonfw.application.jtqj.peoplecentermanagement.logic.impl.usecase;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import javax.inject.Named;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.validation.annotation.Validated;

import com.devonfw.application.jtqj.peoplecentermanagement.common.api.CompositePeopleCenterKey;
import com.devonfw.application.jtqj.peoplecentermanagement.dataaccess.api.CompositePeopleCenterKeyImpl;
import com.devonfw.application.jtqj.peoplecentermanagement.dataaccess.api.PeoplecenterEntity;
import com.devonfw.application.jtqj.peoplecentermanagement.logic.api.to.PeoplecenterCto;
import com.devonfw.application.jtqj.peoplecentermanagement.logic.api.to.PeoplecenterEto;
import com.devonfw.application.jtqj.peoplecentermanagement.logic.api.to.PeoplecenterSearchCriteriaTo;
import com.devonfw.application.jtqj.peoplecentermanagement.logic.api.usecase.UcFindPeoplecenter;
import com.devonfw.application.jtqj.peoplecentermanagement.logic.base.usecase.AbstractPeoplecenterUc;

/**
 * Use case implementation for searching, filtering and getting Peoplecenters
 */
@Named
@Validated
@Transactional
public class UcFindPeoplecenterImpl extends AbstractPeoplecenterUc implements UcFindPeoplecenter {

  /** Logger instance. */
  private static final Logger LOG = LoggerFactory.getLogger(UcFindPeoplecenterImpl.class);

  @Override
  public PeoplecenterEto findPeoplecenter(CompositePeopleCenterKey id) {

    LOG.debug("Get Peoplecenter with id {} from database.", id);
    Optional<PeoplecenterEntity> foundEntity = getPeoplecenterRepository()
        .findById(new CompositePeopleCenterKeyImpl(id));
    if (foundEntity.isPresent())
      return getBeanMapper().map(foundEntity.get(), PeoplecenterEto.class);
    else
      return null;
  }

  @Override
  public Page<PeoplecenterEto> findPeoplecenters(PeoplecenterSearchCriteriaTo criteria) {

    Page<PeoplecenterEntity> peoplecenters = getPeoplecenterRepository().findByCriteria(criteria);
    return mapPaginatedEntityList(peoplecenters, PeoplecenterEto.class);
  }

  @Override
  public PeoplecenterCto findPeoplecenterCto(CompositePeopleCenterKey id) {

    PeoplecenterEntity entity = getPeoplecenterRepository().find(new CompositePeopleCenterKeyImpl(id));
    PeoplecenterCto cto = new PeoplecenterCto();
    cto.setPeoplecenter(getBeanMapper().map(entity, PeoplecenterEto.class));

    return cto;
  }

  @Override
  public Page<PeoplecenterCto> findPeoplecentersCtos(PeoplecenterSearchCriteriaTo criteria) {

    Page<PeoplecenterEntity> employees = getPeoplecenterRepository().findByCriteria(criteria);
    List<PeoplecenterCto> ctos = new ArrayList<>();
    for (PeoplecenterEntity entity : employees.getContent()) {
      PeoplecenterCto cto = new PeoplecenterCto();
      cto.setPeoplecenter(getBeanMapper().map(entity, PeoplecenterEto.class));
      ctos.add(cto);
    }
    Pageable pagResultTo = PageRequest.of(criteria.getPageable().getPageNumber(), criteria.getPageable().getPageSize());

    return new PageImpl<>(ctos, pagResultTo, employees.getTotalElements());
  }

}
