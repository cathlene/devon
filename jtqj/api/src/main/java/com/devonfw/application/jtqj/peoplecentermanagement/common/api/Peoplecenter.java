package com.devonfw.application.jtqj.peoplecentermanagement.common.api;

import com.devonfw.application.jtqj.general.common.api.ApplicationEntity;

public interface Peoplecenter<T extends CompositePeopleCenterKey> extends ApplicationEntity<T> {

  @Override
  public T getId();

  @Override
  public void setId(T id);

}
