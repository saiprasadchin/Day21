public class Employee{
public static void main(String[] args){
System.out.println("Welcome to Employee Wage Computation Program\n");
}
}

Push to master branch

UC 1: Attendance checking
Code:
public class Employee{
public static void main(String[] args){
System.out.println("Welcome to Employee Wage Computation Program\n");
int attendance = (int)((Math.random() * 10) % 2);
System.out.println((attendance == 1) ? "Employee Present" : "Employee Absent");
}
}

Output:

UC 2:Calculate Daily Wage
Code:
public class Employee{
public static void main(String[] args){
System.out.println("Welcome to Employee Wage Computation Program\n");
int attendance = (int)((Math.random() * 10) % 2);
System.out.println((attendance == 1) ? "Employee Present" : "Employee Absent");
int work_hours = 8;
int wage = daily_wage(attendance, work_hours);
System.out.print("Day's wage is :"+wage);
}
public static int daily_wage(int attendance, int work_hours){
int wage = 0;
if(attendance == 1){
wage = 20 * work_hours;
}
return wage;
}
}

Output:

UC 3: Part Time Wage and Full Time Wage
Code:
public class Employee{
public static void main(String[] args){
System.out.println("Welcome to Employee Wage Computation Program\n");
int attendance = (int)((Math.random() * 10) % 2);
System.out.println((attendance == 1) ? "Employee Present" : "Employee Absent");
int workTime = 0;
if(attendance == 1)
workTime = (int)((Math.random() * 10) % 2);
int work_hours = 0;
if(workTime == 1)
work_hours = 8;
else
work_hours = 4;
int wage = 0;
if(attendance == 1){
System.out.println((workTime == 1) ? "Full time" : "Part time");
wage = 20 * work_hours;
}
System.out.print("Day's wage is :"+wage);
}
}

Output:

UC 4: Above code but using switch statement
Code:
public class Employee{
public static void main(String[] args){
System.out.println("Welcome to Employee Wage Computation Program\n");
int attendance = (int)((Math.random() * 10) % 2);
int isPresent = 1;
int isAbsent = 0;
int isFullTime = 1;
int isPartTime = 2;
int empHours = 0;
int empRatePerHour = 20;
int salary = 0;
if( attendance == 1){
System.out.println("Employee Present");
empHours = 8;
}
else {
System.out.println("Employee Absent");
}
if(attendance == 1){
int time =(int)((Math.random() * 10 ) % 3);
switch (time) {
case 1:
System.out.println("Full Time");
break;
case 2:
System.out.println("Part Time");
empHours=4;
break;
default:
break;
}
salary = (empHours * empRatePerHour);
System.out.println("Salary is:"+salary);

}
}
}

Output:

UC 5: Wages for a month
Code:
public class Employee{
public static void main(String[] args){
System.out.println("Welcome to Employee Wage Computation Program\n");
int attendance = (int)((Math.random() * 10) % 2);
int workingDays =20;
int totalHours = 100;
int isPresent = 1;
int isAbsent = 0;
int isFullTime = 1;
int isPartTime = 2;
int totalWage = 0;
int empHours = 0;
int empRatePerHour = 20;
int salary = 0;
if( attendance == 1){
System.out.println("Employee Present");
empHours = 8;
}
else {
System.out.println("Employee Absent");
}
for(int i = 0; i < workingDays; i++){
if(attendance == 1) {
int time = (int) ((Math.random() * 10) % 3);
switch (time) {
case 1:
//System.out.println("Full Time");

break;
case 2:
//System.out.println("Part Time");
empHours = 4;
break;
default:
break;
}
salary =salary + (empHours * empRatePerHour);
}
}
System.out.println("Total salary :"+salary);
}
}
Output:

UC 6: Upto 100 hours or 20 daya
Code:
while( totalHours < 100 && workingDays < 20 ){
int attendance = (int)((Math.random() * 10 ) % 2);
System.out.println(attendance);
if (attendance == 1) {
workingDays++;
int time = (int) ((Math.random() * 10) % 3);
switch (time) {
case 2:
totalHours+=4;
empHours = 4;
break;
default:
totalHours+=8;
empHours = 8;
break;
}
salary = salary + (empHours * empRatePerHour);
}
}

System.out.println("Total salary :"+salary+" Hours worked:"+totalHours+" Working
Days:"+workingDays);
Output:

UC 7
Using class variables and methods
Code:
public class Employee{
int workingDays = 0;
int totalHours = 0;
int empHours = 0;
int empRatePerHour = 20;
int salary = 0;
public void getEmpWage(){
while( totalHours < 100 && workingDays < 20 ){
int attendance = (int)((Math.random() * 10 ) % 2);
System.out.println(attendance);
if (attendance == 1) {
workingDays++;
int time = (int) ((Math.random() * 10) % 3);
switch (time) {
case 2:
totalHours+=4;
empHours = 4;
break;
default:
totalHours+=8;
empHours = 8;
break;
}
salary = salary + (empHours * empRatePerHour);
}
}

System.out.println("Total salary :"+salary+" Hours worked:"+totalHours+" Working
Days:"+workingDays);
}
public static void main(String[] args){
Employee ep = new Employee();
System.out.println("Welcome to Employee Wage Computation Program\n");
ep.getEmpWage();
}
}