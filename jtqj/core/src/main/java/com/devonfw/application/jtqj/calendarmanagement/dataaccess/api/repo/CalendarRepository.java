package com.devonfw.application.jtqj.calendarmanagement.dataaccess.api.repo;

import static com.querydsl.core.alias.Alias.$;

import java.util.Iterator;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Order;

import com.devonfw.application.jtqj.calendarmanagement.dataaccess.api.CalendarEntity;
import com.devonfw.application.jtqj.calendarmanagement.logic.api.to.CalendarSearchCriteriaTo;
import com.devonfw.module.jpa.dataaccess.api.QueryUtil;
import com.devonfw.module.jpa.dataaccess.api.data.DefaultRepository;
import com.querydsl.jpa.impl.JPAQuery;

/**
 * {@link DefaultRepository} for {@link CalendarEntity}
 */
public interface CalendarRepository extends DefaultRepository<CalendarEntity> {

  /**
   * @param criteria the {@link CalendarSearchCriteriaTo} with the criteria to search.
   * @return the {@link Page} of the {@link CalendarEntity} objects that matched the search. If no pageable is set, it
   *         will return a unique page with all the objects that matched the search.
   */
  default Page<CalendarEntity> findByCriteria(CalendarSearchCriteriaTo criteria) {

    CalendarEntity alias = newDslAlias();
    JPAQuery<CalendarEntity> query = newDslQuery(alias);

    String name = criteria.getName();
    if (name != null && !name.isEmpty()) {
      QueryUtil.get().whereString(query, $(alias.getName()), name, criteria.getNameOption());
    }
    Integer _year = criteria.get_year();
    if (_year != null) {
      query.where($(alias.get_year()).eq(_year));
    }
    Integer _month = criteria.get_month();
    if (_month != null) {
      query.where($(alias.get_month()).eq(_month));
    }
    Integer days_number = criteria.getDays_number();
    if (days_number != null) {
      query.where($(alias.getDays_number()).eq(days_number));
    }
    Integer yearmonth = criteria.getYearmonth();
    if (yearmonth != null) {
      query.where($(alias.getYearmonth()).eq(yearmonth));
    }
    Long center = criteria.getCenterId();
    if (center != null) {
      query.where($(alias.getCenter().getId()).eq(center));
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
  public default void addOrderBy(JPAQuery<CalendarEntity> query, CalendarEntity alias, Sort sort) {

    if (sort != null && sort.isSorted()) {
      Iterator<Order> it = sort.iterator();
      while (it.hasNext()) {
        Order next = it.next();
        switch (next.getProperty()) {
          case "name":
            if (next.isAscending()) {
              query.orderBy($(alias.getName()).asc());
            } else {
              query.orderBy($(alias.getName()).desc());
            }
            break;
          case "_year":
            if (next.isAscending()) {
              query.orderBy($(alias.get_year()).asc());
            } else {
              query.orderBy($(alias.get_year()).desc());
            }
            break;
          case "_month":
            if (next.isAscending()) {
              query.orderBy($(alias.get_month()).asc());
            } else {
              query.orderBy($(alias.get_month()).desc());
            }
            break;
          case "days_number":
            if (next.isAscending()) {
              query.orderBy($(alias.getDays_number()).asc());
            } else {
              query.orderBy($(alias.getDays_number()).desc());
            }
            break;
          case "yearmonth":
            if (next.isAscending()) {
              query.orderBy($(alias.getYearmonth()).asc());
            } else {
              query.orderBy($(alias.getYearmonth()).desc());
            }
            break;
          case "center":
            if (next.isAscending()) {
              query.orderBy($(alias.getCenter().getId()).asc());
            } else {
              query.orderBy($(alias.getCenter().getId()).desc());
            }
            break;
          default:
            throw new IllegalArgumentException("Sorted by the unknown property '" + next.getProperty() + "'");
        }
      }
    }
  }

}