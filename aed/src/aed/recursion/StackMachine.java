package aed.recursion;

import es.upm.aedlib.map.*;
import es.upm.aedlib.Position;
import es.upm.aedlib.positionlist.*;
import es.upm.aedlib.lifo.*;

public class StackMachine {
  Map<String,PositionList<Instruction>> code;
  LIFO<Integer> stack;

  public StackMachine(Map<String,PositionList<Instruction>> code) {
    this.stack = new LIFOArray<>();
    this.code = code;
  }

  public void run(String name) {
	  PositionList<Instruction> lista = code.get(name); 
	  if(lista==null) { throw new RuntimeException(); }
	  runAux(lista, lista.first());
  }
  // Funcion auxiliar de run
  private void runAux(PositionList<Instruction> lista, Position<Instruction> pos) {
	  Instruction i = pos.element();
	  
	  switch(i.getInstType()) {
		 case CALL: { 
			 run(i.getNameParm()); 
			 break; 
		 }
		 case RET: { 
			 pos = null; 
			 break; 
		 }
		 case PUSH: { 
			 stack.push(i.getIntParm()); 
			 break; 
		 }
		 case PRINT: { 
			 System.out.println(stack.pop()); 
			 break; 
		 }
		 case ADD: {
			 Integer e1 = stack.pop(); Integer e2 = stack.pop();
			 stack.push(e1+e2);
			 break;
		 }
		 case DROP: {
			 stack.pop();
			 break;
		 }
		 case DUP: {
			 stack.push(stack.top());
			 break;
		 }
		 case EQ: {
			 Integer e1 = stack.pop(); Integer e2 = stack.pop();
			 if(e1==e2) { stack.push(1); }
			 else { stack.push(0); }
			 break;
		 }
		 case MULT: {
			 Integer e1 = stack.pop(); Integer e2 = stack.pop();
			 stack.push(e1*e2);
			 break;
		 }
		 case IF_SKIP: {
			 if(stack.pop()!=0) { pos = skip(lista, pos, i.getIntParm()-1); }
			 break;
		 }
		 case SUB: {
			 Integer e1 = stack.pop(); Integer e2 = stack.pop();
			 stack.push(e1-e2);
			 break;
		 }
		 case SWAP: {
			 Integer e1 = stack.pop(); Integer e2 = stack.pop();
			 stack.push(e1); stack.push(e2);
			 break;
		 }
		 default: {
			 System.out.println(i);
			 break;
		 }
	  }

	  if(pos!=null) { 
		  runAux(lista, lista.next(pos));
	  }
  }
  // Funcion auxiliar para skipear instrucciones
  private Position<Instruction> skip(PositionList<Instruction> lista, Position<Instruction> pos, Integer n) {
	  if(n>0&&pos!=null) {
		  pos=lista.next(pos);
		  return skip(lista, pos, n-1);
	  }
	  return pos;
  }
}

