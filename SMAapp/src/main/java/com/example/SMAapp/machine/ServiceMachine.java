package com.example.SMAapp.machine;

//import com.example.SMAapp.models.MachineList;
//import com.example.SMAapp.repo.MachineListRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.stereotype.Controller; //?

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Service
@AllArgsConstructor
public class ServiceMachine {

    MachineListRepo machineListRepo;

    public List<Machine> getAllMachine(){ // get the list of all the machines
        return machineListRepo.findAll();
    }


    public Machine saveMachine(Machine machine){ //add machine
        return machineListRepo.save(machine);
    }



//    @Autowired
//    private MachineListRepository MachineList;
//    @GetMapping("/machines")
//    public List<String> showListMachines(){
//        Iterable<MachineList> machines = MachineListRepository.findAll();
//        return List.of("machine", "list");
//    }
}
