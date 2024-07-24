package com.trial.psql.Service;

import com.trial.psql.Model.StdModel;
import com.trial.psql.Repository.StdRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class StdService {
    @Autowired
    public StdRepo stdRepo;

    public StdModel addStd (StdModel stdModel) {
        if(stdModel.getMark() < 50)
        {
            stdModel.setBacklogs(true);
        }
        else
        {
            stdModel.setBacklogs(false);
        }
        return stdRepo.save(stdModel);
    }

    public List<StdModel> getAllStd() {
        List<StdModel> stdDet = stdRepo.findAll();
        return stdDet;
    }

    public Optional<StdModel> getStdByRoll (int roll) {
        return stdRepo.findById(roll);
    }

    public List<StdModel> getStdByCourse (String course) {
        List<StdModel> stdDet = new ArrayList<>();
        for (StdModel stdModel : getAllStd()) {
            if (stdModel.getCourse().equals(course)) {
                stdDet.add(stdModel);
            }
        }
        return stdDet;
    }
}
