package Task7.com.codelean.ulti;

import Task7.com.codelean.access.CodeLeanB;

public class CodeLeanE extends CodeLeanB {

 public static void main(String[] args) {
  new CodeLeanB().methodPublic();
  new CodeLeanB().methodProtected(); // compile time error

  // works, accessing super class protected method using subclass
  new CodeLeanE().methodProtected();

 }

}
