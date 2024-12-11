import mysql.connector
conn=mysql.connector.connect(host="localhost",username="root",password="Ajay@787898",database="collage")

cur=conn.cursor()


#making connection to database 
def create_conection():
  conn=mysql.connector.connect(host="localhost",username="root",password="Ajay@787898",database="collage")
  print("connection successful")

#query to create a student table.
def create_table():
    cur.execute("DROP TABLE student_table")
    student_table="create table student_table(usn_no int not null,student_name varchar(20) not null, branch varchar(20) not null,student_email varchar(50) not null,student_DOB varchar(50) not null,student_address varchar(50) not null,student_no varchar(50) not null,parents_no varchar(50) not null,joining_year varchar(50) not null)"
    cur.execute(student_table)
    print("table created")

#insert student data in to database
def insert_student_data(usn,name,department,email,dob,address,student_mobno,parent_mobno,date_joining_year):
   info="insert into student_table(usn_no,student_name,branch,student_email,student_DOB,student_address,student_no,parents_no,joining_year)values(%s,%s,%s,%s,%s,%s,%s,%s,%s)"
   values=[(usn,name,department,email,dob,address,student_mobno,parent_mobno,date_joining_year)]
   try:
       cur.executemany(info,values)
       conn.commit()# inserting is successfully then it save changes into the  database.
       print("student data inserted successfully"+ "details :",usn,name,department,email,dob,address,student_mobno,parent_mobno,date_joining_year)
   except:
       conn.rollback()#If there is an error during the insert operation the changes are rolled back

#fetch all student data from database.
def get_student_data():
   #query
   query = "select * from student_table"
   cur.execute(query)
   results = cur.fetchall()
   for x in results:
      print(x)

def sort_student_by_usn():
   sort_student = "SELECT * FROM student_table ORDER BY usn_no asc"
   cur.execute(sort_student)
   results = cur.fetchall()
   for x in results:
      print(x)
   
def update_email(usn_no,email):
   update_query = "update student_table set student_email='"+email+"' where usn_no="+str(usn_no)
   print(update_query)
   cur.execute(update_query)

create_conection()
create_table()
insert_student_data(101,"Vjay","CSE","vijay@gmail.com","03/08/2000","Baglkot","7549561546","7406509584","2022")
insert_student_data(103,"Basvaraj","ECE","basu@gmail.com","06/06/2000","vijaypur","8310447174","9663676891","2022")
insert_student_data(102,"Charan","IS","charan@gmail.com","15/04/2000","Brngaluru","9597536489","9972697271","2022")
insert_student_data(105,"Ganesh","Cevil","gani@gmail.com","23/02/2000","Vijaynagar","9955644873","8310457923","2022")
insert_student_data(106,"Suresh","Mechenical","suri@gmail.com","28/01/2000","Hampi","9972471697","9663645721","2022")


#get_student_data()
update_email(101,"ajay@gmail.com")
sort_student_by_usn()




   





