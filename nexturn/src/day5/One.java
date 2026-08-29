package day5;

import day10.SampleRecord;

public sealed interface One permits SampleRecord, InterfaceImpl{
   void methodOne();
   void methodTwo();
   
}
