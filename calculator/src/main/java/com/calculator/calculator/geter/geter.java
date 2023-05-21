package com.calculator.calculator.geter;

import com.calculator.calculator.operands;
import com.calculator.calculator.solve;
import com.calculator.calculator.stringtodouble;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PathVariable;
@RestController
public class geter {
    @CrossOrigin
    @GetMapping("/{res}")
    public static String gett(@PathVariable String res){
        operands my_operand = new operands();
        my_operand = stringtodouble.string_to_double(res);
        if(my_operand.operator_2=='v'){
            return solve.solution(my_operand);
        }
        else{
            String s;
            s = solve.solution(my_operand) + my_operand.operator_2;
            return s;
        }
    }
}
