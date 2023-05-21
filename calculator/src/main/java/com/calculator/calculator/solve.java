package com.calculator.calculator;

public class solve {
    public static String solution(operands my_operands){
        double result=0;
        if(my_operands.operator=="+"){
            result = operations.add(my_operands.op_1,my_operands.op_2);
        }
        else if(my_operands.operator=="-"){
            result = operations.sub(my_operands.op_1,my_operands.op_2);
        }
        else if(my_operands.operator=="*"){
            result = operations.mul(my_operands.op_1,my_operands.op_2);
        }
        else if(my_operands.operator=="÷"){
            result = operations.div(my_operands.op_1,my_operands.op_2);
        }
        else if(my_operands.operator=="⁒"){
            result = operations.mod(my_operands.op_1,my_operands.op_2);
        }
        else if(my_operands.operator=="^"){
            result = operations.power(my_operands.op_1,my_operands.op_2);
        }
        String str = Double.toString(result);
        return str;
    }
}
