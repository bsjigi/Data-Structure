package Postfix;

 import java.io.DataInputStream;
import java.io.IOException;
import java.util.*; 

class Caculator { 
	
  // char이 연산자인지 아닌지 확인
  static boolean isOperator(char c) 
  { 
	  if (c == '+' || c == '-'
              || c == '*' || c == '/'
              || c == '^') { 
          return true; 
      } 
      return false; 
  
  } 
  
  static boolean isOperand(char y) 
  { 
      return (y >= 'a' && y <= 'z') || 
              (y >= 'A' && y <= 'Z'); 
  } 
    
  
  static String getInfix(String exp) 
  { 
	 
      Stack<String> s = new Stack<String>(); 
    
      for (int i = 0; i < exp.length(); i++) 
      { 
          // 피연산자를 스택에 넣는다 
          if (isOperand(exp.charAt(i))) 
          { 
          s.push(exp.charAt(i) + ""); 
          } 
       
          else
          { 
              String op1 = s.peek(); 
              s.pop(); 
              String op2 = s.peek(); 
              s.pop(); 
              s.push( op2 + exp.charAt(i) + 
                      op1 ); 
          } 
         
      } 
    
      
      return s.peek(); 
  } 

 
  static String postToPre(String post_exp) 
  { 
      Stack<String> s = new Stack<String>(); 

  
      int length = post_exp.length(); 

      //좌에서 우로 읽음
      for (int i = 0; i < length; i++) { 

          // symbol이 연산자인지 확인
          if (isOperator(post_exp.charAt(i))) { 

              // 2개의 피연산자를 스택에서 꺼냄 
              String op1 = s.peek(); 
              s.pop(); 
              String op2 = s.peek(); 
              s.pop(); 

              //연산자와 피연산자를 합침
              String temp = post_exp.charAt(i) + op2 + op1; 

              // String temp 스택에 다시 넣는다 
              s.push(temp); 
          } 

          // symbol = 피연산자라면
          else { 

              // 연산자를 스택에 넣는다
              s.push(post_exp.charAt(i) + ""); 
          } 
         
      } 

      // stack[0] Prefix 표현을 포함 
      return s.peek(); 
  } 


  public static void main(String args[]) throws IOException 
  { 
	  DataInputStream inp = new DataInputStream(System.in);
	  System.out.println("Enter the Expression: " ); 
	  String a = inp.readLine();
	  String b = a.replaceAll(" ","");
      System.out.println("Prefix : " + postToPre(b)); 
      System.out.println("Infix : " + getInfix(b));
  } 
} 