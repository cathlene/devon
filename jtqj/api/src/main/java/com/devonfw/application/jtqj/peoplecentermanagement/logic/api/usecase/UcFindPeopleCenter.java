package com.devonfw.application.jtqj.peoplecentermanagement.logic.api.usecase;

import java.util.List;

import org.springframework.data.domain.Page;

import com.devonfw.application.jtqj.peoplecentermanagement.logic.api.to.PeopleCenterEto;
import com.devonfw.application.jtqj.peoplecentermanagement.logic.api.to.PeopleCenterSearchCriteriaTo;

public interface UcFindPeopleCenter {

  /**
   * Returns a PeopleCenter by its id 'id'.
   *
   * @param id The id 'id' of the PeopleCenter.
   * @return The {@link PeopleCenterEto} with id 'id'
   */
  PeopleCenterEto findPeopleCenter(long id);

  /**
   * Returns a paginated list of PeopleCenters matching the search criteria.
   *
   * @param criteria the {@link PeopleCenterSearchCriteriaTo}.
   * @return the {@link List} of matching {@link PeopleCenterEto}s.
   */
  Page<PeopleCenterEto> findPeopleCenters(PeopleCenterSearchCriteriaTo criteria);

}
