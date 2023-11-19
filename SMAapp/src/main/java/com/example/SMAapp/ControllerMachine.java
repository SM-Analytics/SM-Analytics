package com.example.SMAapp;

import com.example.SMAapp.machine.Machine;
import com.example.SMAapp.machine.ServiceMachine;
//import com.example.SMAapp.models.MachineList;
//import com.example.SMAapp.repo.MachineListRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.ui.Model;



import java.util.List;



@RestController

@AllArgsConstructor
public class ControllerMachine {
    ServiceMachine serviceMachine;
    @GetMapping()
    public List<Machine> getAllMahine(){ // get the list of all the machines
        return serviceMachine.getAllMachine();
    }

    @PostMapping
    public Machine saveMachine(@RequestBody Machine machine){ // add new machine
        return serviceMachine.saveMachine(machine);
    }

//    @GetMapping("/machines")
//    public List<String> showListMachines(){
//        return serviceMachine.showListMachines();
//    }


//    @Autowired
//    private MachineListRepository MachineList;
//    @GetMapping("/machines")
//    public List<String> showListMachines(Model model){
//        Iterable<MachineList> machines = MachineListRepository.findAll();
//        model.addAttribute("machines", machines);
//        return List.of("machine", "list");
//    }



}
