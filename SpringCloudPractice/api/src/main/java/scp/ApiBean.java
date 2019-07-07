package scp;

import lombok.Data;

import java.io.Serializable;

@Data
public class ApiBean implements Serializable {
    private int id;
    private String name;
}
