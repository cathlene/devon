package com.devonfw.application.jtqj.peoplecentermanagement.logic.api.usecase;

import com.devonfw.application.jtqj.peoplecentermanagement.common.api.CompositePeopleCenterKey;
import com.devonfw.application.jtqj.peoplecentermanagement.logic.api.to.PeoplecenterCto;
import com.devonfw.application.jtqj.peoplecentermanagement.logic.api.to.PeoplecenterEto;

/**
 * Interface of UcManagePeoplecenter to centralize documentation and signatures of methods.
 */
public interface UcManagePeoplecenter {

  /**
   * Deletes a peoplecenter from the database by its id 'peoplecenterId'.
   *
   * @param peoplecenterId Id of the peoplecenter to delete
   * @return boolean <code>true</code> if the peoplecenter can be deleted, <code>false</code> otherwise
   */
  boolean deletePeoplecenter(CompositePeopleCenterKey peoplecenterId);

  /**
   * Saves a peoplecenter and store it in the database.
   *
   * @param peoplecenter the {@link PeoplecenterEto} to create.
   * @return the new {@link PeoplecenterEto} that has been saved with ID and version.
   */
  PeoplecenterEto savePeoplecenter(PeoplecenterEto peoplecenter);

  PeoplecenterCto savePeoplecenter(PeoplecenterCto peoplecenterCto);

}
