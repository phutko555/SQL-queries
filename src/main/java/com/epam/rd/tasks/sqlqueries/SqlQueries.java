package com.epam.rd.tasks.sqlqueries;

/**
 * Implement sql queries like described
 */
public class SqlQueries {
    //Select all employees sorted by last name in ascending order
    //language=HSQLDB
    String select01 = "SELECT * FROM EMPLOYEE ORDER BY LASTNAME ASC;";

    //Select employees having no more than 5 characters in last name sorted by last name in ascending order
    //language=HSQLDB
    String select02 = "SELECT * FROM EMPLOYEE WHERE LASTNAME LIKE '____' OR LASTNAME LIKE '_____' OR LASTNAME LIKE '_' OR LASTNAME LIKE '__' OR LASTNAME LIKE '_____' ORDER BY LASTNAME ASC ;";

    //Select employees having salary no less than 2000 and no more than 3000
    //language=HSQLDB
    String select03 = "SELECT * FROM EMPLOYEE WHERE SALARY > 2000 AND SALARY <= 3000";

    //Select employees having salary no more than 2000 or no less than 3000
    //language=HSQLDB
    String select04 = "SELECT * FROM EMPLOYEE WHERE SALARY < 2000 OR SALARY >= 3000";

    //Select all employees assigned to departments and corresponding department
    //language=HSQLDB
    String select05 = "SELECT * FROM EMPLOYEE e JOIN DEPARTMENT d ON d.ID = e.DEPARTMENT; ";

    //Select all employees and corresponding department name if there is one.
    //Name column containing name of the department "depname".
    //language=HSQLDB
    String select06 = "SELECT   EMPLOYEE.ID,  EMPLOYEE.FIRSTNAME,  EMPLOYEE.LASTNAME,  DEPARTMENT.NAME AS depname,  EMPLOYEE.SALARY FROM    EMPLOYEE LEFT JOIN    DEPARTMENT ON EMPLOYEE.DEPARTMENT = DEPARTMENT.ID;";

    //Select total salary pf all employees. Name it "total".
    //language=HSQLDB
    String select07 = "SELECT SUM(SALARY) AS total FROM EMPLOYEE ;";

    //Select all departments and amount of employees assigned per department
    //Name column containing name of the department "depname".
    //Name column containing employee amount "staff_size".
    //language=HSQLDB
    String select08 = "SELECT D.NAME AS depname, COUNT(E.ID) AS staff_size FROM   DEPARTMENT D LEFT JOIN  EMPLOYEE E ON D.ID = E.DEPARTMENT GROUP BY  D.NAME HAVING  COUNT(E.ID) > 0;" ;


    //Select all departments and values of total and average salary per department
    //Name column containing name of the department "depname".
    //language=HSQLDB
    String select09 = "SELECT  D.NAME AS depname,  COALESCE(SUM(E.SALARY), 0) AS total,  CASE WHEN COUNT(E.SALARY) > 0 THEN AVG(E.SALARY) ELSE 0 END AS average FROM     DEPARTMENT D LEFT JOIN    EMPLOYEE E ON D.ID = E.DEPARTMENT GROUP BY   D.NAME HAVING  COUNT(E.SALARY) > 0; ";

    //Select lastnames of all employees and lastnames of their managers if an employee has a manager.
    //Name column containing employee's lastname "employee".
    //Name column containing manager's lastname "manager".
    //language=HSQLDB
    String select10 = "SELECT   E1.LASTNAME AS employee,  E2.LASTNAME AS manager FROM   EMPLOYEE E1 LEFT JOIN  (SELECT ID, LASTNAME FROM EMPLOYEE) E2 ON E1.MANAGER = E2.ID;";


}
