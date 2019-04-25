package Postfix;

 import java.io.DataInputStream;
import java.io.IOException;
import java.util.*; 

class Caculator { 
	
  // char�� ���������� �ƴ��� Ȯ��
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
          // �ǿ����ڸ� ���ÿ� �ִ´� 
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

      //�¿��� ��� ����
      for (int i = 0; i < length; i++) { 

          // symbol�� ���������� Ȯ��
          if (isOperator(post_exp.charAt(i))) { 

              // 2���� �ǿ����ڸ� ���ÿ��� ���� 
              String op1 = s.peek(); 
              s.pop(); 
              String op2 = s.peek(); 
              s.pop(); 

              //�����ڿ� �ǿ����ڸ� ��ħ
              String temp = post_exp.charAt(i) + op2 + op1; 

              // String temp ���ÿ� �ٽ� �ִ´� 
              s.push(temp); 
          } 

          // symbol = �ǿ����ڶ��
          else { 

              // �����ڸ� ���ÿ� �ִ´�
              s.push(post_exp.charAt(i) + ""); 
          } 
         
      } 

      // stack[0] Prefix ǥ���� ���� 
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