package com.devonfw.application.jtqj.peoplecentermanagement.dataaccess.api.repo;

import static com.querydsl.core.alias.Alias.$;

import java.sql.Timestamp;
import java.util.Iterator;
import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Order;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.devonfw.application.jtqj.peoplecentermanagement.common.api.PeopleCenterCustom;
import com.devonfw.application.jtqj.peoplecentermanagement.dataaccess.api.PeopleCenterEntity;
import com.devonfw.application.jtqj.peoplecentermanagement.logic.api.to.PeopleCenterSearchCriteriaTo;
import com.devonfw.module.jpa.dataaccess.api.QueryUtil;
import com.devonfw.module.jpa.dataaccess.api.data.DefaultRepository;
import com.querydsl.jpa.impl.JPAQuery;

/**
 * {@link DefaultRepository} for {@link PeopleCenterEntity}
 */
public interface PeopleCenterRepository extends DefaultRepository<PeopleCenterEntity> {

  /**
   * @param token
   * @return the {@link BookingEntity} objects that matched the search.
   */
  @Query("select pc " + "from PeopleCenterEntity pc")
  List<PeopleCenterEntity> findPersonCenterDays();

  @Query("select pc " + "from PeopleCenterEntity pc where pc.id= :id")
  PeopleCenterCustom findPersonCenterDay(@Param("id") long id);

  /**
   * @param criteria the {@link PeopleCenterSearchCriteriaTo} with the criteria to search.
   * @return the {@link Page} of the {@link PeopleCenterEntity} objects that matched the search. If no pageable is set,
   *         it will return a unique page with all the objects that matched the search.
   */
  default Page<PeopleCenterEntity> findByCriteria(PeopleCenterSearchCriteriaTo criteria) {

    PeopleCenterEntity alias = newDslAlias();
    JPAQuery<PeopleCenterEntity> query = newDslQuery(alias);

    Long people = criteria.getPeopleId();
    if (people != null) {
      query.where($(alias.getPeople().getId()).eq(people));
    }
    Long center = criteria.getCenterId();
    if (center != null) {
      query.where($(alias.getCenter().getId()).eq(center));
    }
    Timestamp start_date = criteria.getStart_date();
    if (start_date != null) {
      query.where($(alias.getStart_date()).eq(start_date));
    }
    Timestamp end_date = criteria.getEnd_date();
    if (end_date != null) {
      query.where($(alias.getEnd_date()).eq(end_date));
    }
    if (criteria.getPageable() == null) {
      criteria.setPageable(PageRequest.of(0, Integer.MAX_VALUE));
    } else {
      addOrderBy(query, alias, criteria.getPageable().getSort());
    }

    return QueryUtil.get().findPaginated(criteria.getPageable(), query, true);
  }

  /**
   * Add sorting to the given query on the given alias
   *
   * @param query to add sorting to
   * @param alias to retrieve columns from for sorting
   * @param sort specification of sorting
   */
  public default void addOrderBy(JPAQuery<PeopleCenterEntity> query, PeopleCenterEntity alias, Sort sort) {

    if (sort != null && sort.isSorted()) {
      Iterator<Order> it = sort.iterator();
      while (it.hasNext()) {
        Order next = it.next();
        switch (next.getProperty()) {
          case "people":
            if (next.isAscending()) {
              query.orderBy($(alias.getPeople().getId()).asc());
            } else {
              query.orderBy($(alias.getPeople().getId()).desc());
            }
            break;
          case "center":
            if (next.isAscending()) {
              query.orderBy($(alias.getCenter().getId()).asc());
            } else {
              query.orderBy($(alias.getCenter().getId()).desc());
            }
            break;
          case "start_date":
            if (next.isAscending()) {
              query.orderBy($(alias.getStart_date()).asc());
            } else {
              query.orderBy($(alias.getStart_date()).desc());
            }
            break;
          case "end_date":
            if (next.isAscending()) {
              query.orderBy($(alias.getEnd_date()).asc());
            } else {
              query.orderBy($(alias.getEnd_date()).desc());
            }
            break;
          default:
            throw new IllegalArgumentException("Sorted by the unknown property '" + next.getProperty() + "'");
        }
      }
    }
  }

}
