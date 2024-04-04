# Insurance Claims Management System
Welcome to the Insurance Claims Management System, a tool designed to manage and track insurance claims efficiently. This system allows users to handle customer information, insurance cards, and claim data effectively.

Starting the Application: Navigate to the directory containing the application and run the Main.java file to start the application.

Main functionalities: 

1. Managing all customers: to view all customers, choose the option 1 after run the Main.java, it will shows the customer's full name, id, insurance card number and expiration date.
2. To view all claims owned by customers, choose option 2 to view all claims details.
3. To view a specific claim detail, choose option 3, input the Claim id with correct format: f-(10 numbers).

For example in the data file, choose option 3 and input: f-3955000001

And it will show the result: Claim Details: Claim{id='f-3955000001', claimDate=Mon Jan 01 00:00:00 ICT 2024, insuredPerson=null, cardNumber='1234567890', examDate=Tue Jan 02 00:00:00 ICT 2024, documents=[f-3955000001_1234567890_life.pdf], claimAmount=10000.000000, status='Processing', receiverBankingInfo='ACB-HarryPotter-0010001'}

4. To add a new claim, choose option 4, the system will ask the user to input some information to create a new claim, such as Claim id, Claim date, Insured Person id (format is c-(7 numbers)), etc.
5. To update a claim, choose option 5, this function will allow the user to update information from existing claim, but for authentication, the user must input the correct claim id in order to update it.
6. To delete a claim, choose option 6, the user will input a claim id to delete it.

For options 4, 5, and 6, after the user uses any of those function successfully without any error, the user have to select option 0 to save updates and exit the program, there will be changes in the claims.txt file.
