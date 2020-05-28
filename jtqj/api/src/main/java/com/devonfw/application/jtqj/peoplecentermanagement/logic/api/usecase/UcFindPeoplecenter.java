package com.devonfw.application.jtqj.peoplecentermanagement.logic.api.usecase;

import java.util.List;

import org.springframework.data.domain.Page;

import com.devonfw.application.jtqj.peoplecentermanagement.common.api.CompositePeopleCenterKey;
import com.devonfw.application.jtqj.peoplecentermanagement.logic.api.to.PeoplecenterCto;
import com.devonfw.application.jtqj.peoplecentermanagement.logic.api.to.PeoplecenterEto;
import com.devonfw.application.jtqj.peoplecentermanagement.logic.api.to.PeoplecenterSearchCriteriaTo;

public interface UcFindPeoplecenter {

  /**
   * Returns a Peoplecenter by its id 'id'.
   *
   * @param id The id 'id' of the Peoplecenter.
   * @return The {@link PeoplecenterEto} with id 'id'
   */
  PeoplecenterEto findPeoplecenter(CompositePeopleCenterKey id);

  /**
   * Returns a paginated list of Peoplecenters matching the search criteria.
   *
   * @param criteria the {@link PeoplecenterSearchCriteriaTo}.
   * @return the {@link List} of matching {@link PeoplecenterEto}s.
   */
  Page<PeoplecenterEto> findPeoplecenters(PeoplecenterSearchCriteriaTo criteria);

  /**
   * Returns a composite Employee by its id 'id'.
   *
   * @param id The id 'id' of the Employee.
   * @return The {@link EmployeeCto} with id 'id'
   */
  PeoplecenterCto findPeoplecenterCto(CompositePeopleCenterKey id);

  /**
   * Returns a paginated list of composite Employees matching the search criteria.
   *
   * @param criteria the {@link EmployeeSearchCriteriaTo}.
   * @return the {@link List} of matching {@link EmployeeCto}s.
   */
  Page<PeoplecenterCto> findPeoplecentersCtos(PeoplecenterSearchCriteriaTo criteria);

}
