package org.merveozer.oopjhomework.chapter2.pdf10_torbalar.question1.comparable;

public interface Register {

public default void registerStudent(Student student) {
		
		if(student instanceof VocationalStudent) {
			System.out.println("VocationalStudent " + student.getName() + " is registered by registration office.");
		}
		
		if(student instanceof GraduateStudent) {
			System.out.println("GraduateStudent " + student.getName() + " is registered by registration office.");
		}
		
		if(student instanceof UndergraduateStudent) {
			System.out.println("UndergraduateStudent " + student.getName() + " is registered by registration office.");
		}
		
		if(student instanceof MasterStudent) {
			System.out.println("MasterStudent " + student.getName() + " is registered by registration office.");
		}
		
		if(student instanceof PhdStudent) {
			System.out.println("PhdStudent " + student.getName() + " is registered by registration office.");
		}
	}

}
