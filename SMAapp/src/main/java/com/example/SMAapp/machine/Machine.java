package com.example.SMAapp.machine;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor

@Entity
@Table(name = "machineList")

public class Machine {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;                        // id in internal base
    private long inventNum;                 //inventory number
    private String machineName;             // name of machine

//    @Transient

    public Machine(long inventNum, String machineName) {
        this.inventNum = inventNum;
        this.machineName = machineName;
    }


}
