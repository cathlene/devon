package com.devonfw.application.jtqj.peoplecentermanagement.logic.impl.usecase;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import javax.inject.Named;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.validation.annotation.Validated;

import com.devonfw.application.jtqj.peoplecentermanagement.common.api.PeopleCenterCustom;
import com.devonfw.application.jtqj.peoplecentermanagement.dataaccess.api.PeopleCenterEntity;
import com.devonfw.application.jtqj.peoplecentermanagement.logic.api.to.PeopleCenterCto;
import com.devonfw.application.jtqj.peoplecentermanagement.logic.api.to.PeopleCenterCustomEto;
import com.devonfw.application.jtqj.peoplecentermanagement.logic.api.to.PeopleCenterEto;
import com.devonfw.application.jtqj.peoplecentermanagement.logic.api.usecase.UcManagePeopleCenter;
import com.devonfw.application.jtqj.peoplecentermanagement.logic.base.usecase.AbstractPeopleCenterUc;

/**
 * Use case implementation for modifying and deleting PeopleCenters
 */
@Named
@Validated
@Transactional
public class UcManagePeopleCenterImpl extends AbstractPeopleCenterUc implements UcManagePeopleCenter {

  /**
   * Logger instance.
   */
  private static final Logger LOG = LoggerFactory.getLogger(UcManagePeopleCenterImpl.class);

  @Override
  public boolean deletePeopleCenter(long peopleCenterId) {

    PeopleCenterEntity peopleCenter = getPeopleCenterRepository().find(peopleCenterId);
    getPeopleCenterRepository().delete(peopleCenter);
    LOG.debug("The peopleCenter with id '{}' has been deleted.", peopleCenterId);
    return true;
  }

  @Override
  public PeopleCenterEto savePeopleCenter(PeopleCenterEto peopleCenter) {

    Objects.requireNonNull(peopleCenter, "peopleCenter");

    PeopleCenterEntity peopleCenterEntity = getBeanMapper().map(peopleCenter, PeopleCenterEntity.class);

    // initialize, validate peopleCenterEntity here if necessary
    PeopleCenterEntity resultEntity = getPeopleCenterRepository().save(peopleCenterEntity);
    LOG.debug("PeopleCenter with id '{}' has been created.", resultEntity.getId());

    return getBeanMapper().map(resultEntity, PeopleCenterEto.class);
  }

  @Override
  public List<PeopleCenterCto> findPersonCenterDays() {

    List<PeopleCenterEntity> list = getPeopleCenterRepository().findPersonCenterDays();
    List<PeopleCenterCto> list2 = new ArrayList<PeopleCenterCto>();
    for (PeopleCenterEntity entity : list) {
      list2.add(getBeanMapper().map(entity, PeopleCenterCto.class));
    }

    return list2;

  }

  @Override
  public PeopleCenterCustomEto findPersonCenterDay(long id) {

    PeopleCenterCustom entity = getPeopleCenterRepository().findPersonCenterDay(id);
    return getBeanMapper().map(entity, PeopleCenterCustomEto.class);
  }

}
