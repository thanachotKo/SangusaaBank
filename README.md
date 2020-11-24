โปรแกรมชื่อ "ระบบจัดการสินเชื่อธนาคาร" 

รายชื่อสมาชิกกลุ่ม
1. นาย ธนโชติ กกกลาง  6110450154
2. นาย ธรรมวัฒน์ รัตนชื่น 6110450171
3. นาย จิรวัฒน์ มะลิคำ 6110450693
4. นาย ธราเทพ กุหลาบ 6110450821

         - โปรแกรมนี้ถูกสร้างมาเพื่อแก้ไขปัญหาทางการทำธุรกรรมทางออนไลน์สามารถดำเนินการได้ผ่านทางแอปพลิเคชั่นบนโทรศัพท์มือถือสมาร์ทโฟนเท่านั้น
ทำให้ลูกค้าที่ไม่มีสมาร์ทโฟน หรือผู้ที่ใช้โทรศัพท์ไม่คล่องจะไม่สามารถทำธุรกรรมทางออนไลน์ได้ จึงเกิด web service ตัวนี้ขึ้นมาเพื่ออำนวยความสะดวกแก่ลูกค้าทุกประเภท
ให้สามารถเข้าถึงการบริการของธนาคารได้โดยง่ายยิ่งขึ้น
         - โดยหลักการทำงานของโปรแกรมคราวๆ คือ ลูกค้าเข้ามาหน้าแรกของเว็บไซต์ ลูกค้าจะได้เข้าสู่ระบบผ่านบัญชีและรหัสผ่าน หากลูกค้ายังไม่เป็นสมาชิก จะต้องดำเนินการสมัครสมาชิกก่อน เมื่อสมัครสมาชิกสำเร็จจึงเข้าสู่ระบบ ลูกค้าสามารถเลือกรูปแบบการสมัครสินเชื่อที่ต้องการ 
จากนั้นดำเนินการกรอกข้อมูลที่จำเป็นต้องใช้สมัครสินเชื่อ เมื่อกรอกข้อมูลเสร็จเรียบร้อยแล้ว รอพนักงานตรวจสอบเอกสาร และติดต่อกลับ หากเอกสารถูกต้องเรียบร้อยก็จะนัดวันเซ็นสัญญาแต่หากเอกสารไม่ครบ ลูกค้าจะต้องเข้าไปแก้ไขเอกสารเพิ่มเติมในระบบ 

-โปรแกรมที่ต้องมี
1.IntelliJ 
2.XAMPP Control
3.MySQL  Workbench
4.เว็บเบราเซอร์อะไรก็ได้

-คำแนะนำในการ install และรันโปรเจค
1.เปิดโปรแกรมIntellijแล้วรันโปรเจค
2.เปิดXAMPP Control panelแล้วรันMySQL
3.เปิดMySQL Workbenchแล้วทำการสร้างDatabaseโดยเชื่อมต่อกับlocalhost Server และใช้port3306
จากนั้นสร้างDatabaseและTableโดยคำสั่งเหล่านี้

create database data;
-----------------------------
USE data;

CREATE TABLE customer (
   id varchar(45) not null,
   FirstName varchar(45) not null,
   LastName varchar(45) not null,
   password TEXT NOT NULL,
   date varchar(45) not null,
   Status varchar(45) not null,
   PRIMARY KEY (id)
);
------------------------------
USE data;

CREATE TABLE Personal (
   id varchar(45) NOT NULL,
   FirstName VARCHAR(45) NOT NULL,
   LastName varchar(45) not null,
   PhoneNumber varchar(10) not null,
   Email varchar(45) not null,
   CompanyName varchar(45) not null,
   primary key (id)
);
---------------------------------------
use data;

create table Credit(
    Creditid varchar(45) not null,
    MoneyYouWant TEXT NOT NULL,
    TimeToPayBack VARCHAR(45) NOT NULL,
    IncomePerMonth text not null,
    primary key(Creditid)
);
---------------------------------------------
use data;

create table Career(
   CareerId varchar(45) not null,
   Creditid varchar(45) not null,
   CareerName varchar(45) not null,
   CompanyName varchar(100) not null,
   CompanyLocation VARCHAR(100) NOT NULL,
   CompanyPhoneNumber VARCHAR(10) NOT NULL,
   AllTimeInCompany VARCHAR(20) NOT NULL,
   PictureSalaryStatement VARCHAR(100) NOT NULL,
   PictureBeForeSixMonth VARCHAR(100) NOT NULL,
   PRIMARY KEY (CareerId)
   );
-----------------------------------------------------------

4.รันโปรแกรมผ่านIntelliJ
5.เปิดเว็ยเบราเซอร์ใดๆก็ได้ แล้วไปยัง http://localhost:8080/mainpage-notlogin เพื่อไปยังหน้าแรกของเว็บ
