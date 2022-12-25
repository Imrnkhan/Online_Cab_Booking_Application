# Online_Cab_Booking_Application
### Build Rest API for Masai **Cab Booking Application**

**Features of this application:**

1. The application allows users to book rides on a route.
2. Users can register themself.
3. Driving partner can onboard on the system with the vehicle details
4. Users can search and select one from multiple available rides on a route with the same source and destination based on the nearest to the user.
5. Drivers who are within 5 Kms from the users source will be available for booking.
6. You can consider x-coordinate and y-coordinate for positions.

### Formula for finding distance between two coordinates:

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/3ff67041-3ae9-4251-bbea-bf0816b54d42/Untitled.png)

### Assumption

You can assume that driver is completing every ride immediately after it gets booked.

### **Requirements:**

1. Application should allow user onboarding.
    1. add_user
        1. Add basic user details
2. Application should allow Driver onboarding
    1. add_driver
        1. This will create an instance of the driver and will mark his current location on the map
3. Application should allow the user to find a ride based on the criteria below
    1. find_ride
        1. It will return a list of available rides within 5 unit of distance
    2. book_ride
        1. It will book the ride and update the position of the driver and the user to the destination given

User should have following fields-

### Rest API for User Resource

### Rest API for Driver Resource

### Task - 1

- Build Rest API for User,Driver
- Use MySQL database
- Use Response Entity depending upon the output.

### Task - 2

- Complete the All User and Driver APIs
- Establish a relationship between Driver and Cab.

### Task - 3

- Implement Exception Handling in the project
    - Handle Custom Exception
    - Create Custom Error Structure Response for Client
    - Create Global Exception Handler to handle the exceptions globally: All other exception handled in this single place
- Swagger Rest API Documentation
- Add Validations
    - First Name must not contain numbers or special characters
    - Last Name must not contain numbers or special characters
    - Mobile number must have 10 digits
    - Password should be alphanumeric and must contain 6-12 characters having at least one special character, one upper case, one lowercase, and one digit.
    

### Task - 4

- Implement Authentication (Verifying the User credentials)





Modules in Taxi Booking System
Admin Module: This module will allow Admin to log in to the system and manage the system and its functions. Admin can View/Confirm/Cancel booking, can check payments, check the status of the trip, etc. Admin can set/update prices and charges of the taxi rides. Admin can manage the drivers and their details.

Admin will be responsible for keeping a check on all the bookings done by users. Admin can View/Confirm/Cancel bookings done by users. Admin can check and manage the availability of taxis and also, keep a track of the status of all the taxis that are engaged.

User Module: In this module, a user can register first using their name, contact number, consumer id, and address and also, can manage their profile. The user module will allow users to log in to the system using their names & contact number.

Booking Module: In this module, users can book a taxi.

Availability: In this module, Admin can check whether the taxi is available.

Details of User: Details of a User like a Name, Contact Number, Address, Booking history, etc can be managed by Admin in this module.

Driver Module: In this module, details related to drivers can be managed.

Payment Module: All the operations related to payments can be managed in this module.

Users Roles
Two users can interact with this application 1) Admin 2) User

Admin:

Can Log in/Log out of the system.
Admin can View/Edit/Delete taxis into the system.
Admin can View/Confirm/Cancel booking done by the User.
Can check payments done by User.
Can check the availability of taxis and drivers.
Can manage driver staff.
Can change the charge.
Can change password.
Can manage “My Profiles”.
User:

Can Log in/Log out of the system.
Can Manage “My profile”.
Can search for taxis.
Users can Book/Cancel taxis.
Can make Payments online.
Can change password.
Driver:

Can Log in/Log out of the system.
Can Manage “My profile”.
Can see bookings done by users.
Can see user details.
Can keep records of rides.
Can change password.
Flow Diagram of Taxi Booking System






Tools and Technologies Used
Server-side: Spring Boot.
Back-end: MYSQL, Hibernate.
