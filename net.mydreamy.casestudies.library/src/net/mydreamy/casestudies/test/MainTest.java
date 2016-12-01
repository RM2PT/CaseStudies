package net.mydreamy.casestudies.test;

import java.time.LocalDateTime;
import java.util.List;

import entities.*;

import services.LibraryManagementSystem;
import services.impl.LibraryManagementSystemImpl;

public class MainTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("========= Inital LibraryManagementSystem =============");
		
		LibraryManagementSystem libraryservice = new LibraryManagementSystemImpl();
		long startTime = System.nanoTime();    
		// ... the code being measured ...    
		/* create student */
		System.out.println("Create student: Yilong Yang");
		Student s = new Student();
		s.setUserID(37418);
		s.setName("Yilong Yang");
		s.setSex(Sex.M);
		s.setOverDueFee(0);
		s.setRegistrationStatus(StudentStatus.PROGRAMMING);
		s.setSuspensionDays(0);
		s.setEmail("yylonly@gmail.com");
		s.setMajor("Software Engineering");
		s.setPassword("123456");
		s.setBorrowStatus(BorrowStatus.NORMAL);
		s.setFaculty("FST");
		s.setProgramme(Programme.PHD);
		
		libraryservice.createUser(s);
		long estimatedTime = System.nanoTime() - startTime;
		System.out.println("Create student: Yilong Yang, estimatedTime:" + ((float)estimatedTime)/100000 + "ms");
		
		System.out.println("Create student: Weiru Wang");

		Student s1 = new Student();
		s1.setUserID(47427);
		s1.setName("Weiru Wang");
		s1.setSex(Sex.F);
		s1.setOverDueFee(0);
		s1.setRegistrationStatus(StudentStatus.PROGRAMMING);
		s1.setSuspensionDays(0);
		s1.setEmail("belindaxxf@gmail.com");
		s1.setMajor("Machine Learning");
		s1.setPassword("123456");
		s1.setBorrowStatus(BorrowStatus.NORMAL);
		s1.setFaculty("FST");
		s1.setProgramme(Programme.PHD);
		
		libraryservice.createUser(s1);
		
		startTime = System.nanoTime();   
		/* create librarian */
		System.out.println("Create Librarian: Belinda");
		
		Librarian lib = new Librarian();
		lib.setLibrarianID(1);
		lib.setName("Belinda");
		lib.setPassword("123456");
		
		libraryservice.createLibrarian(lib);
		estimatedTime = System.nanoTime() - startTime;
		System.out.println("create librarian, estimatedTime:" + ((float)estimatedTime)/100000 + "ms");
		startTime = System.nanoTime();   

		/* add Book */
		System.out.println("add Book: Applying UML and patterns");
		Book b = new Book();
		b.setTitle("Applying UML and patterns");
		b.setAuthor("Craig Larman");
		b.setCopyNum(2);
		b.setCallNo("QA76.6-O35");
		b.setEdition("3rd");
		b.setPublisher("Prentice Hall PTR");
		b.setISBn(131489062);
	
		System.out.println(libraryservice.addBook(b));
		estimatedTime = System.nanoTime() - startTime;
		System.out.println("add Book: Applying UML and patterns, estimatedTime:" + ((float)estimatedTime)/100000 + "ms");
		startTime = System.nanoTime();   

		/* add BookCopy */
		BookCopy bc1 = new BookCopy();
		bc1.setBarcode(123456);
		bc1.setLocation("3/F A2 Science");
		bc1.setStatus(CopyStatus.AVAILABLE);
		bc1.setIsReserved(false);
		
		BookCopy bc2 = new BookCopy();
		bc2.setBarcode(123457);
		bc2.setLocation("3/F A2 Science");
		bc2.setStatus(CopyStatus.AVAILABLE);
		bc2.setIsReserved(false);
		System.out.println("add 2 copys of Applying UML and patterns");

		/* add BookCopy */
		System.out.println(libraryservice.addBookCopy("QA76.6-O35", bc1));
		System.out.println(libraryservice.addBookCopy("QA76.6-O35", bc2));
		estimatedTime = System.nanoTime() - startTime;
		System.out.println("add BookCopy, estimatedTime:" + ((float)estimatedTime)/100000 + "ms");
		startTime = System.nanoTime();   

		/* Search Book */
		System.out.println("========test searchBookByTitle===========");
		System.out.println("Search: Applying UML and patterns");
		List<Book> books = libraryservice.searchBookByTitle("Applying UML and patterns");
		estimatedTime = System.nanoTime() - startTime;
		System.out.println("Search: Applying UML and patterns, estimatedTime:" + ((float)estimatedTime)/100000 + "ms");

		System.out.println("Result:");
		System.out.println("title: " + books.get(0).getTitle());
		System.out.println("author: " + books.get(0).getAuthor());
		System.out.println("copynumber: " + books.get(0).getCopyNum());
		System.out.println("Publisher: " + books.get(0).getPublisher());
		System.out.println("Copy 1 Status: " + books.get(0).getCopys().get(0).getStatus());
		System.out.println("Copy 2 Status: " + books.get(0).getCopys().get(0).getStatus());
		
		System.out.println("========test searchBookByTitle===========");
		System.out.println("ISBN: 131489062");
		books = libraryservice.searchBookByISBN(131489062);
		System.out.println("Result:");
		System.out.println("title: " + books.get(0).getTitle());
		System.out.println("author: " + books.get(0).getAuthor());
		System.out.println("copynumber: " + books.get(0).getCopyNum());
		System.out.println("Publisher: " + books.get(0).getPublisher());
		System.out.println("Copy 1 Status: " + books.get(0).getCopys().get(0).getStatus());
		System.out.println("Copy 2 Status: " + books.get(0).getCopys().get(0).getStatus());

		System.out.println("=========== borrow book ===========");
			
		System.out.println("student name is " + libraryservice.queryUser(37418, 1).getName());
		System.out.println("student loaned number is " + libraryservice.queryUser(37418, 1).getLoanedNumber());
		startTime = System.nanoTime(); 
		System.out.println("the status of Book copy 123457 is : " + libraryservice.queryBookCopy(123457).getStatus());
		System.out.println("estimatedTime:" + ((float)(System.nanoTime() - startTime))/100000 + "ms");

		System.out.print("student with id 37418 borrows book copy 123457: ");
		startTime = System.nanoTime();   

		System.out.println(libraryservice.borrowBook(37418, 123457));
		estimatedTime = System.nanoTime() - startTime;
		System.out.println("student with id 37418 borrows book copy 123457, estimatedTime:" + ((float)estimatedTime)/100000 + "ms");
		
		System.out.println("student name is " + libraryservice.queryUser(37418, 1).getName());
		System.out.println("student loaned number is " + libraryservice.queryUser(37418, 1).getLoanedNumber());
		
		System.out.println("the status of Book copy 123457 is : " + libraryservice.queryBookCopy(123457).getStatus());

		System.out.print("student with id 37418 borrows book copy 123457 again: ");
		System.out.println(libraryservice.borrowBook(37418, 123457));
		
		System.out.println("=========== return book ===========");
		
		System.out.println("student name is " + libraryservice.queryUser(37418, 1).getName());
		System.out.println("student loaned number is " + libraryservice.queryUser(37418, 1).getLoanedNumber());
		
		System.out.println("the status of Book copy 123457 is : " + libraryservice.queryBookCopy(123457).getStatus());
		
		System.out.print("return book copy 123457: ");
		startTime = System.nanoTime();   

		System.out.println(libraryservice.returnBook(123457));
		estimatedTime = System.nanoTime() - startTime;
		System.out.println(" return book, estimatedTime:" + ((float)estimatedTime)/100000 + "ms");
		
		System.out.println("student name is " + libraryservice.queryUser(37418, 1).getName());
		System.out.println("student loaned number is " + libraryservice.queryUser(37418, 1).getLoanedNumber());
		
		System.out.println("the status of Book copy 123457 is : " + libraryservice.queryBookCopy(123457).getStatus());
		
		System.out.println("=========== reserve book ===========");
		
		   
		System.out.print("Reserve book when it is avaible : ");
		startTime = System.nanoTime();
		System.out.println(libraryservice.makeReservation(47427, 123457));
		estimatedTime = System.nanoTime() - startTime;
		System.out.println("Reserve book when it is avaible, estimatedTime:" + ((float)estimatedTime)/100000 + "ms");
			
		System.out.println("Brrow book 123457 by student 37418 (Yilong Yang)");
		System.out.println("student name is " + libraryservice.queryUser(37418, 1).getName());
		System.out.println("student loaned number is " + libraryservice.queryUser(37418, 1).getLoanedNumber());
		
		System.out.println("the status of Book copy 123457 is : " + libraryservice.queryBookCopy(123457).getStatus());
		
		System.out.print("student with id 37418 borrows book copy 123457: ");
		System.out.println(libraryservice.borrowBook(37418, 123457));
		
		System.out.println("Copy 123457 status is: " + libraryservice.queryBookCopy(123457).getStatus());
		System.out.println("Is reserved: " + libraryservice.queryBookCopy(123457).getIsReserved());
		
		System.out.print("Weiru Wang 47427 reserves book copy 123457 brrowed by Yilong Yang: ");
		System.out.println(libraryservice.makeReservation(47427, 123457));

		System.out.println("Is reserved: " + libraryservice.queryBookCopy(123457).getIsReserved());
		
		System.out.print("Weiru Wang 47427 cannel this reservation");
		startTime = System.nanoTime();

		System.out.println(libraryservice.cannelReservation(47427, 123457));
		System.out.println("cannelReservation, estimatedTime:" + ((float)estimatedTime)/100000 + "ms");

		System.out.println("Is reserved: " + libraryservice.queryBookCopy(123457).getIsReserved());
		
		System.out.print("Weiru Wang 47427 reserves book copy 123457 brrowed by Yilong Yang: ");
		System.out.println(libraryservice.makeReservation(47427, 123457));

		System.out.println("Is reserved: " + libraryservice.queryBookCopy(123457).getIsReserved());
		
		
		System.out.print("return book copy 123457: ");
		System.out.println(libraryservice.returnBook(123457));
		System.out.println("Copy 123457 status is: " + libraryservice.queryBookCopy(123457).getStatus());
		
		System.out.print("student with id 47427 borrows book copy 123457: ");
		System.out.println(libraryservice.borrowBook(47427, 123457));
		System.out.println("the status of Book copy 123457 is : " + libraryservice.queryBookCopy(123457).getStatus());

		System.out.println("student name is " + libraryservice.queryUser(47427, 1).getName());
		System.out.println("student loaned number is " + libraryservice.queryUser(47427, 1).getLoanedNumber());
		
		System.out.println("=========== listBorrowHistory ===========");
		startTime = System.nanoTime();

		List<Loan> bhis = libraryservice.listBorrowHistory(37418);
				System.out.println("the number of brrowed book of student 37418: " + bhis.size());
		for (Loan bc : bhis)
		{
			System.out.println("loaned book name: " + bc.getLoanedCopy().getBookBelongs().getTitle() + " loaned time: " + bc.getLoanDate() + " return time: " + bc.getReturnDate());
		}		

		System.out.println("cannelReservation, estimatedTime:" + ((float)(System.nanoTime() - startTime))/100000 + "ms");

		bhis = libraryservice.listBorrowHistory(47427);
		System.out.println("the number of brrowed book of student 47427: " + bhis.size());
		for (Loan bc : bhis)
		{
			System.out.println("loaned book name: " + bc.getLoanedCopy().getBookBelongs().getTitle() + " loaned time: " + bc.getLoanDate() + " return time: " + bc.getReturnDate());
		}
		
		System.out.println("=========== listHodingBook ===========");
		startTime = System.nanoTime();

		List<Loan> hb = libraryservice.listHodingBook(37418);
		System.out.println("the number of hoding book of student 37418: " + hb.size());
		for (Loan bc : hb)
		{
			System.out.println("hoding book name: " + bc.getLoanedCopy().getBookBelongs().getTitle() + ", loaned time: " + bc.getLoanDate() +  ", due time: " + bc.getDueDate() );
		}
		
		hb = libraryservice.listHodingBook(47427);
		System.out.println("the number of hoding book of student 47427: " + hb.size());
		for (Loan bc : hb)
		{
			System.out.println("hoding book name: " + bc.getLoanedCopy().getBookBelongs().getTitle() + ", loaned time: " + bc.getLoanDate() +  ", due time: " + bc.getDueDate() );
			System.out.println("change due time as tommorrow");
			bc.setDueDate(LocalDateTime.now().plusDays(1));
			System.out.println("hoding book name: " + bc.getLoanedCopy().getBookBelongs().getTitle() + ", loaned time: " + bc.getLoanDate() +  ", due time: " + bc.getDueDate() );
		}
		
//		System.out.println("send notification to" + user.getName());
		
//		System.out.println(libraryservice.dueSoonNotification());
		
//		List<Loan> hbs = libraryservice.listHodingBook(37418);
//		System.out.println("the number of hoding book: " + hbs.size());
//		for (Loan bc : hbs)
//		{
//			System.out.println("hoding book name: " + bc.getBookBelongs().getTitle());
//		}
		
		System.out.println("=========== renew book ===========");
		System.out.println("renew copy with barcode 123457");
		startTime = System.nanoTime();

		System.out.println(libraryservice.renewBook(47427, 123457));
		System.out.println("cannelReservation, estimatedTime:" + ((float)(System.nanoTime() - startTime))/100000 + "ms");

		hb = libraryservice.listHodingBook(47427);
		System.out.println("the number of hoding book of student 47427: " + hb.size());
		for (Loan bc : hb)
		{
			System.out.println("hoding book name: " + bc.getLoanedCopy().getBookBelongs().getTitle() + ", loaned time: " + bc.getLoanDate() +  ", due time: " + bc.getDueDate() + ", renew times: " + bc.getRenewedTimes());
			
		}
		
		System.out.println("renew copy with barcode 123457");
		System.out.println(libraryservice.renewBook(47427, 123457));
		
		hb = libraryservice.listHodingBook(47427);
		System.out.println("the number of hoding book of student 47427: " + hb.size());
		for (Loan bc : hb)
		{
			System.out.println("hoding book name: " + bc.getLoanedCopy().getBookBelongs().getTitle() + ", loaned time: " + bc.getLoanDate() +  ", due time: " + bc.getDueDate() + ", renew times: " + bc.getRenewedTimes());
			
		}
		
		System.out.println("renew copy with barcode 123457");
		System.out.println(libraryservice.renewBook(47427, 123457));
		
		hb = libraryservice.listHodingBook(47427);
		System.out.println("the number of hoding book of student 47427: " + hb.size());
		for (Loan bc : hb)
		{
			System.out.println("hoding book name: " + bc.getLoanedCopy().getBookBelongs().getTitle() + ", loaned time: " + bc.getLoanDate() +  ", due time: " + bc.getDueDate() + ", renew times: " + bc.getRenewedTimes());
			
		}
		
		System.out.println("renew copy with barcode 123457");
		System.out.println(libraryservice.renewBook(47427, 123457));
		
		hb = libraryservice.listHodingBook(47427);
		System.out.println("the number of hoding book of student 47427: " + hb.size());
		for (Loan bc : hb)
		{
			System.out.println("hoding book name: " + bc.getLoanedCopy().getBookBelongs().getTitle() + ", loaned time: " + bc.getLoanDate() +  ", due time: " + bc.getDueDate() + ", renew times: " + bc.getRenewedTimes());
			System.out.println("change due time as over due status");
			bc.setDueDate(LocalDateTime.now().plusDays(2));
			System.out.println("hoding book name: " + bc.getLoanedCopy().getBookBelongs().getTitle() + ", loaned time: " + bc.getLoanDate() +  ", due time: " + bc.getDueDate() );
		}
		
		System.out.println("=========== Notification ===========");
		startTime = System.nanoTime();
		System.out.println(libraryservice.dueSoonNotification());
		System.out.println("Notification, estimatedTime:" + ((float)(System.nanoTime() - startTime))/100000 + "ms");

		
		System.out.println("=========== Compute Over Due ===========");
		System.out.println("Regurar check over due");
		startTime = System.nanoTime();

		System.out.println(libraryservice.checkOverDueandComputeOverDueFee());
		System.out.println("estimatedTime:" + ((float)(System.nanoTime() - startTime))/100000 + "ms");

		System.out.println("the number of hoding book of student 47427: " + hb.size());
		for (Loan bc : hb)
		{
			System.out.println("Set overdue 4 days");
			bc.setDueDate(LocalDateTime.now().minusDays(4));
			System.out.println("Regurar check over due again");
			System.out.println(libraryservice.checkOverDueandComputeOverDueFee());
			System.out.println("hoding book name: " + bc.getLoanedCopy().getBookBelongs().getTitle() + ", loaned time: " + bc.getLoanDate() +  ", due time: " + bc.getDueDate() + ", renew times: " + bc.getRenewedTimes());
			System.out.println("overdue3: " + bc.getOverDue3Days() + " overdue10: " + bc.getOverDue10Days() + " overdue17: " + bc.getOverDue17Days() + " overdue31: "+ bc.getOverDue31Days());
		}
		
		for (Loan bc : hb)
		{
			System.out.println("Set overdue 11 days");
			bc.setDueDate(LocalDateTime.now().minusDays(11));
			System.out.println("Regurar check over due again");
			System.out.println(libraryservice.checkOverDueandComputeOverDueFee());
			System.out.println("hoding book name: " + bc.getLoanedCopy().getBookBelongs().getTitle() + ", loaned time: " + bc.getLoanDate() +  ", due time: " + bc.getDueDate() + ", renew times: " + bc.getRenewedTimes());
			System.out.println("overdue3: " + bc.getOverDue3Days() + " overdue10: " + bc.getOverDue10Days() + " overdue17: " + bc.getOverDue17Days() + " overdue31: "+ bc.getOverDue31Days());
		}
		
		for (Loan bc : hb)
		{
			System.out.println("Set overdue 50 days");
			bc.setDueDate(LocalDateTime.now().minusDays(50));
			System.out.println("Regurar check over due again");
			System.out.println(libraryservice.checkOverDueandComputeOverDueFee());
			System.out.println("hoding book name: " + bc.getLoanedCopy().getBookBelongs().getTitle() + ", loaned time: " + bc.getLoanDate() +  ", due time: " + bc.getDueDate() + ", renew times: " + bc.getRenewedTimes());
			System.out.println("overdue3: " + bc.getOverDue3Days() + " overdue10: " + bc.getOverDue10Days() + " overdue17: " + bc.getOverDue17Days() + " overdue31: "+ bc.getOverDue31Days());
			
			System.out.println("=========== Check Weiru Status ==========="); 
			Student stu = (Student) libraryservice.queryUser(47427, 1);
			System.out.println("Borrow status: " + stu.getBorrowStatus());
			System.out.println("Suspension day: " + stu.getSuspensionDays());
			System.out.println("OverDueFee: " + stu.getOverDueFee());
			
			System.out.print("Count supspension day: ");
			System.out.println(libraryservice.countDownSuspensionDay());
			System.out.println("Suspension day: " + stu.getSuspensionDays());

			
			System.out.println("=========== Pay Over Due Fee===========");
			
			System.out.println("return book " + libraryservice.returnBook(123457));
			
			System.out.print("Pay Over Due Fee 60: ");
			startTime = System.nanoTime();

			System.out.println(libraryservice.payOverDueFee(47427, 60));
			System.out.println("estimatedTime:" + ((float)(System.nanoTime() - startTime))/100000 + "ms");

		    Student stu1 = (Student) libraryservice.queryUser(47427, 1);
			System.out.println("OverDueFee: " + stu1.getOverDueFee());

			
			System.out.println("pass 43 days");
			startTime = System.nanoTime();

			for (int i = 0; i < 43; i++)
				libraryservice.countDownSuspensionDay();
			System.out.println("estimatedTime:" + ((float)(System.nanoTime() - startTime))/100000 + "ms");

			System.out.println("Suspension day: " + stu.getSuspensionDays());
			System.out.println("Borrow status: " + stu.getBorrowStatus());

			
		}

	
		
	}

}
