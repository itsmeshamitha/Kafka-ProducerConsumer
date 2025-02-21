package com.dailycodebuffer.Driver.constant;

public class AppConstant {
    public static final String CAB_LOCATION = "cab-location";

}
/*1. public class AppConstant { ... }
Purpose: This line declares a public class named AppConstant.

Function: This class is used to hold constant values that can be accessed throughout the application.
It serves as a centralized place to define constants, making the code more maintainable and reducing the 
likelihood of errors due to hardcoding values in multiple places.

2. public static final String CAB_LOCATION = "cab-location";
Purpose: This line declares a constant named CAB_LOCATION.

Function:
public: The constant is accessible from any other class.

static: The constant belongs to the class itself rather than to any specific instance of the class. 
This means you can access it without creating an instance of AppConstant.

final: The value of the constant cannot be changed once it is initialized. This ensures that the value remains 
constant throughout the application's lifecycle.

String CAB_LOCATION: This declares a constant of type String with the name CAB_LOCATION.

"cab-location": This is the value assigned to the CAB_LOCATION constant. It represents the name of a Kafka topic in this context.*/
