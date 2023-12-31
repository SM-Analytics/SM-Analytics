package com.example.SMAapp.machine;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class ServiceMachine {

    MachineListRepo machineListRepo;

    // get the list of all the machines
    public List<Machine> getAllMachine(){
        return machineListRepo.findAll();
    }

    //add  new machine
    public Machine saveMachine(Machine machine){
//        Optional<Machine> machineOptional = MachineListRepo.findByInventNum(machine.getInventNum());
//        if(machineOptional.isPresent()){
//            throw new IllegalStateException("The machine with this inventory number is already exist.");
//        }
        return machineListRepo.save(machine);
    }

// delete machine by id
    public void deleteMachine(Long id) {
//        Optional<Machine> machineOptional = MachineListRepo.findById(id);
//        if(machineOptional.isEmpty()){
//            throw new IllegalStateException("There is no  machine with this inventory number.");
//
//        }
        machineListRepo.deleteById(id);
    }




//    //delete  machine  by inventory number
//    public void deleteMachine(Long inventNum) {  // delete machine by inventory number
////        Optional<Machine> machineOptional = MachineListRepo.findByInventNum(inventNum);
////        if(machineOptional.isEmpty()){
////            throw new IllegalStateException("There is no  machine with this inventory number.");
////
////        }
//
//        //@Transactional(readOnly = true)
//        //@Query(value = "select * from Machine m where m.inventNum=:inventNum");
//        Optional<Machine> machineOptional = machineListRepo.findByInventNum(inventNum);
////        List<Machine> findMySuperPostsNative(String title, long id);
////        if(machineOptional == null)
////            throw new IllegalStateException("There is no  machine with this inventory number.");
//        machineListRepo.deleteById();
//
//    }

}
