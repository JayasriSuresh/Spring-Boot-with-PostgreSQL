package com.trial.psql.Controller;

import com.trial.psql.Model.StdModel;
import com.trial.psql.Service.StdService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class StdControls {
    @Autowired
    public StdService stdService;

    @PostMapping("/AddStudents")
    public StdModel AddStudents(@RequestBody StdModel stdModel) {
        return stdService.addStd(stdModel);
    }

    @GetMapping("/GetAllStudents")
    public List<StdModel> getAllStudents() {
        return stdService.getAllStd();
    }

    @GetMapping("/GetStdByRoll/{roll}")
    public Optional<StdModel> GetStdByRoll(@PathVariable int roll) {
        return stdService.getStdByRoll(roll);
    }

    @GetMapping("/getStuByCourse/{course}")
    public List<StdModel> getStuByCourse(@PathVariable String course) {
        return stdService.getStdByCourse(course);
    }
}
