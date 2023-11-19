package com.example.SMAapp;

import com.example.SMAapp.machine.Machine;
import com.example.SMAapp.machine.ServiceMachine;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController

@AllArgsConstructor
public class ControllerMachine {
    ServiceMachine serviceMachine;

    @GetMapping()
    public List<String> hello(){                                // get the list of all the machines
        return List.of("Welcome","to", "SM Analitics!");
    }

    @GetMapping("/all_machines")
    public List<Machine> getAllMachine(){                       // get the list of all the machines
        return serviceMachine.getAllMachine();
    }

    @PostMapping("/add_new")
    public Machine saveMachine(@RequestBody Machine machine){   // add new machine
        return serviceMachine.saveMachine(machine);
    }

    @DeleteMapping(path = "/delete_id_{id}")
    public void deleteMachine(@PathVariable Long id){
        serviceMachine.deleteMachine(id);
    }


//    @DeleteMapping(path = "{inventNum}")
//    public void deleteMachine(@PathVariable Long inventNum){
//        serviceMachine.deleteMachine(inventNum);
//    }

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
