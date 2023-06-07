package cn.edu.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
//全参构造
@AllArgsConstructor
//空参构造
@NoArgsConstructor
public class User {

    private Long id;
    private String name;
    private String birthPlace;
    private boolean operation;
}
