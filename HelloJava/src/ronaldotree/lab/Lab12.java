// package ronaldotree.lab;
//
//// 고객, 도서, 주문(매개변수 유 / 무)
//// 학생, 학과, 과목, 교수(매개변수 유 / 무)
// public class Lab12 {
// public static void main(String[] args) {
// // 고객, 도서, 주문(매개변수 무)
// // Customer c = new Customer();
// // c.custNo = 1;
// // c.name = "박지성";
// // c.jumin = "810101-1";
// // c.addr = "영국 런던";
// // c.phoneNo = "000-5000-0001";
// //
// // Book b = new Book();
// // b.bookNo = 1;
// // b.bookName = "축구의 역사";
// // b.pub = "굿스포츠";
// // b.price = 7000;
// //
// // Order o = new Order();
// // o.bookNo = 1;
// // o.custNo = 1;
// // o.price = 7000;
// // o.date = "2014-07-01";
//
// Customer c = new Customer(2, "김연아", "900101-2", "한국 서울", "000-6000-0001");
// Book b = new Book(2, "축구 아는 여자", "나무수", 13000);
// Order o = new Order(2, 2, 13000, "2014-07-03");
//
// // 학생, 학과, 과목, 교수
// // Student s = new Student();
// // s.addr = "경기도 고양시";
// // s.age = 25;
// // s.birth = "1985-03-22";
// // s.couns = "목 2교시";
// // s.major = "컴퓨터 공학";
// // s.name = "김태희";
// // s.prof = 504;
// // s.stuCode = 201350050;
// //
// // Major m = new Major();
// // m.major = "컴퓨터 공학";
// // m.office = "E동 2층";
// // m.phoneNo = "123-4567-8901";
// // m.repProf = 504;
// // m.repProfFrom = 2007;
// //
// // Class cl = new Class();
// // cl.classNo = 0205;
// // cl.contents = "자바 프로그래밍";
// // cl.prof = 301;
// // cl.title = "프로그래밍";
// //
// // Prof p = new Prof();
// // p.major = "프로그래밍";
// // p.name = "이순신";
// // p.profNo = 301;
//
// Student s = new Student(201250006, "송혜교", "서울 영등포구", 22, "1988-09-17", "컴퓨터
// 공학", 301, "월 3교시");
// Major m = new Major("의상 디자인", "234-5678-9012", "A동 1층", 301, 2009);
// Class cs = new Class(2011, "드레스 코드", "옷 입기의 기초", 445);
// Prof p = new Prof(445, "정약용", "의상 디자인");
// }
// }
//
//// 고객, 도서, 주문
// class Customer {
// int custNo;
// String name;
// String jumin;
// String addr;
// String phoneNo;
//
// Customer(int custNo, String name, String jumin, String addr, String phoneNo)
// {
// this.custNo = custNo;
// this.name = name;
// this.jumin = jumin;
// this.addr = addr;
// this.phoneNo = phoneNo;
// }
// }
//
// class Book {
// int bookNo;
// String bookName;
// String pub;
// int price;
//
// Book(int bookNo, String bookName, String pub, int price) {
// this.bookNo = bookNo;
// this.bookName = bookName;
// this.pub = pub;
// this.price = price;
// }
// }
//
// class Order {
// int custNo;
// int bookNo;
// int price;
// String date;
//
// Order(int custNo, int bookNo, int price, String date) {
// this.custNo = custNo;
// this.bookNo = bookNo;
// this.price = price;
// this.date = date;
// }
// }
//
//// 학생, 학과, 과목, 교수
// class Student {
// int stuCode;
// String name;
// String addr;
// int age;
// String birth;
// String major;
// int prof;
// String couns;
//
// Student(int stuCode, String name, String addr, int age, String birth, String
// major, int prof, String couns) {
// this.stuCode = stuCode;
// this.name = name;
// this.addr = addr;
// this.age = age;
// this.birth = birth;
// this.major = major;
// this.prof = prof;
// this.couns = couns;
// }
// }
//
// class Major {
// String major;
// String phoneNo;
// String office;
// int repProf;
// int repProfFrom;
//
// Major(String major, String phoneNo, String office, int repProf, int
// repProfFrom) {
// this.major = major;
// this.phoneNo = phoneNo;
// this.office = office;
// this.repProf = repProf;
// this.repProfFrom = repProfFrom;
// }
// }
//
// class Class {
// int classNo;
// String title;
// String contents;
// int prof;
//
// Class(int classNo, String title, String contents, int prof) {
// this.classNo = classNo;
// this.title = title;
// this.contents = contents;
// this.prof = prof;
// }
// }
//
// class Prof {
// int profNo;
// String name;
// String major;
//
// Prof(int profNo, String name, String major) {
// this.profNo = profNo;
// this.name = name;
// this.major = major;
// }
// }