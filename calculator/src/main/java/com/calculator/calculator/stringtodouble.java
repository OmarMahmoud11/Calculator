package com.calculator.calculator;

public class stringtodouble {

    public static operands string_to_double(String str){
        operands my_operands = new operands();
        if(str.charAt(str.length()-1)>='0' && str.charAt(str.length()-1)<='9') {
            int i;
            for (i = 1; i < str.length(); i++) {
                if (str.charAt(i) == '+') {
                    my_operands.operator = "+";
                    break;
                } else if (str.charAt(i) == '-') {
                    my_operands.operator = "-";
                    break;
                } else if (str.charAt(i) == '*') {
                    my_operands.operator = "*";
                    break;
                } else if (str.charAt(i) == '÷') {
                    my_operands.operator = "÷";
                    break;
                } else if (str.charAt(i) == '⁒') {
                    my_operands.operator = "⁒";
                    break;
                }

            }
            String str1 = str.substring(0, i);
            String str2 = str.substring(i + 1, str.length());
            my_operands.op_1 = Double.parseDouble(str1);
            my_operands.op_2 = Double.parseDouble(str2);
            my_operands.operator_2 = 'v';
        }
        else{
            int i;
            for (i = 1; i < str.length()-1; i++) {
                if (str.charAt(i) == '+') {
                    my_operands.operator = "+";
                    break;
                } else if (str.charAt(i) == '-') {
                    my_operands.operator = "-";
                    break;
                } else if (str.charAt(i) == '*') {
                    my_operands.operator = "*";
                    break;
                } else if (str.charAt(i) == '÷') {
                    my_operands.operator = "÷";
                    break;
                } else if (str.charAt(i) == '⁒') {
                    my_operands.operator = "⁒";
                    break;
                }
            }
            if(i<str.length()-1) {
                String str1 = str.substring(0, i);
                String str2 = str.substring(i + 1, str.length()-1);
                my_operands.op_1 = Double.parseDouble(str1);
                my_operands.op_2 = Double.parseDouble(str2);
                my_operands.operator_2 = str.charAt(str.length()-1);
                if(my_operands.operator_2=='n'){
                    String s = solve.solution(my_operands);
                    my_operands.op_1 = Double.parseDouble(s);
                    my_operands.op_2 = -1;
                    my_operands.operator = "^";
                    my_operands.operator_2 = 'v';
                }
                else if(my_operands.operator_2=='s'){
                    String s = solve.solution(my_operands);
                    my_operands.op_1 = Double.parseDouble(s);
                    my_operands.op_2 = Double.parseDouble(s);
                    my_operands.operator = "*";
                    my_operands.operator_2 = 'v';
                }
                else if(my_operands.operator_2=='q'){
                    String s = solve.solution(my_operands);
                    my_operands.op_1 = Double.parseDouble(s);
                    my_operands.op_2 = 0.5;
                    my_operands.operator = "^";
                    my_operands.operator_2 = 'v';
                }
                else if(my_operands.operator_2=='m'){
                    String s = solve.solution(my_operands);
                    my_operands.op_1 = Double.parseDouble(s);
                    my_operands.op_2 = -1;
                    my_operands.operator = "*";
                    my_operands.operator_2 = 'v';
                }
            }
            else{
                String str1 = str.substring(0,i);

                if(str.charAt(str.length()-1)=='n'){
                    my_operands.op_1 = Double.parseDouble(str1);
                    my_operands.op_2 = -1.0;
                    my_operands.operator = "^";
                    my_operands.operator_2 = 'v';
                }
                else if(str.charAt(str.length()-1)=='s'){
                    my_operands.op_1 = Double.parseDouble(str1);
                    my_operands.op_2 = Double.parseDouble(str1);
                    my_operands.operator = "*";
                    my_operands.operator_2 = 'v';
                }
                else if(str.charAt(str.length()-1)=='q'){
                    my_operands.op_1 = Double.parseDouble(str1);
                    String str2 = "0.5";
                    my_operands.op_2 = Double.parseDouble(str2);
                    my_operands.operator = "^";
                    my_operands.operator_2 = 'v';
                }
                else if(str.charAt(str.length()-1)=='m'){
                    my_operands.op_1 = Double.parseDouble(str1);
                    String str2 = "-1";
                    my_operands.op_2 = Double.parseDouble(str2);
                    my_operands.operator = "*";
                    my_operands.operator_2 = 'v';
                }
                else{
                    my_operands.op_1 = Double.parseDouble(str1);
                    my_operands.op_2 = 1;
                    my_operands.operator = "*";
                    my_operands.operator_2 = str.charAt(str.length()-1);
                }
            }
        }

        return my_operands;
    }
}
