package com.trial.psql.Repository;

import com.trial.psql.Model.StdModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StdRepo extends JpaRepository<StdModel, Integer> {

}
