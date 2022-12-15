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
