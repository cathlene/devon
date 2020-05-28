package com.devonfw.application.jtqj.peoplecentermanagement.dataaccess.api.repo;

import static com.querydsl.core.alias.Alias.$;

import java.util.Iterator;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Order;

import com.devonfw.application.jtqj.peoplecentermanagement.common.api.CompositePeopleCenterKey;
import com.devonfw.application.jtqj.peoplecentermanagement.dataaccess.api.CompositePeopleCenterKeyImpl;
import com.devonfw.application.jtqj.peoplecentermanagement.dataaccess.api.PeoplecenterEntity;
import com.devonfw.application.jtqj.peoplecentermanagement.logic.api.to.PeoplecenterSearchCriteriaTo;
import com.devonfw.module.jpa.dataaccess.api.QueryUtil;
import com.devonfw.module.jpa.dataaccess.api.data.DefaultRepository;
import com.devonfw.module.jpa.dataaccess.api.data.GenericRepository;
import com.querydsl.jpa.impl.JPAQuery;

/**
 * {@link DefaultRepository} for {@link PeoplecenterEntity}
 */
public interface PeoplecenterRepository extends GenericRepository<PeoplecenterEntity, CompositePeopleCenterKeyImpl> {

  /**
   * @param criteria the {@link PeoplecenterSearchCriteriaTo} with the criteria to search.
   * @return the {@link Page} of the {@link PeoplecenterEntity} objects that matched the search. If no pageable is set,
   *         it will return a unique page with all the objects that matched the search.
   */
  default Page<PeoplecenterEntity> findByCriteria(PeoplecenterSearchCriteriaTo criteria) {

    PeoplecenterEntity alias = newDslAlias();
    JPAQuery<PeoplecenterEntity> query = newDslQuery(alias);

    CompositePeopleCenterKey id = criteria.getId();
    if (id != null) {
      query.where($(alias.getId()).eq(new CompositePeopleCenterKeyImpl(id)));
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
  public default void addOrderBy(JPAQuery<PeoplecenterEntity> query, PeoplecenterEntity alias, Sort sort) {

    if (sort != null && sort.isSorted()) {
      Iterator<Order> it = sort.iterator();
      while (it.hasNext()) {
        Order next = it.next();
        switch (next.getProperty()) {
          case "id":
            if (next.isAscending()) {
              query.orderBy($(alias.getId().toString()).asc());
            } else {
              query.orderBy($(alias.getId().toString()).desc());
            }

            break;
          default:
            throw new IllegalArgumentException("Sorted by the unknown property '" + next.getProperty() + "'");
        }
      }
    }
  }

}