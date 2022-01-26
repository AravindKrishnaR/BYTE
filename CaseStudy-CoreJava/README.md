# BYTE - Case Study (Core Java)
**Aravind Krishna R**

-----
## **Single inheritance**

Write a Java program to implement Single Inheritance.

Consider a class named **Person** with the following private data members.
**

|**Data Type**    |**Data Member**   |
| - | - |
|String|name|
|String|dateOfBirth|
|String|gender|
|String|mobileNumber|
|String|bloodGroup|

Include appropriate getters and setters.

Consider a class named **Donor** which extends **Person** class with the following private data members.

|**Data Type**    |**Data Member**   |
| :- | :- |
|String|bloodBankName|
|String|donorType|
|String|donationDate|

Include appropriate getters and setters.

The class **Donor** should have the following method

|**Method**|**Description**|
| :- | :- |
|public void displayDonationDetails( )|<p>This method displays the donation details.</p><p>Display the statement ‘Donation Details :’ inside this method</p>|

Consider another class **Main** and write the main method to test the above class.

In the main( ) method, read the person and donor details from the user and call the displayDonationDetails( ) method.

**[Note:** The date format should be **“dd-MM-yyyy”]**

### **Output:**
```
Enter the name : 
Justin
Enter Date of Birth : 
11-01-1995
Enter Gender : 
Male
Enter Mobile Number : 
9994910354
Enter Blood Group : 
B+ve
Enter Blood Bank Name : 
Blood Assurance
Enter Donor Type : 
Whole Blood
Enter Donation Date : 
09-07-2017
Donation Details : 
Name : Justin
Date Of Birth : 11-01-1995
Gender : Male
Mobile Number : 9994910354
Blood Group : B+ve
Blood Bank Name : Blood Assurance
Donor Type : Whole Blood
Donation Date : 09-07-2017
```

```
Enter the name : 
Steffie
Enter Date of Birth : 
12-01-1996
Enter Gender : 
Female
Enter Mobile Number : 
8868875432
Enter Blood Group : 
O+ve
Enter Blood Bank Name : 
Edward Blood Bank
Enter Donor Type : 
Whole Blood
Enter Donation Date : 
21-12-2016
Donation Details : 
Name : Steffie
Date Of Birth : 12-01-1996
Gender : Female
Mobile Number : 8868875432
Blood Group : O+ve
Blood Bank Name : Edward Blood Bank
Donor Type : Whole Blood
Donation Date : 21-12-2016
```
