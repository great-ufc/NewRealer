# New Version of REALER application
## REALER - Risk movEment ALERt

<b>Objective:</b> Alert of risk situations (falls or bumps) and record activities

<b>Old Functional Requirements:</b>
1. Login using Google Auth
2. Collect accelerometer data from the user's cell phone and compare it with the dataset to recognize risk situations using a trainnig AI Model
3. Alert on app screen using various features (text, vibration and flashlight) and send email to caregiver
      - Alarm features must be adapted according to battery level.
4. Register caregiver
5. Save logs
    - Save logs when registered activity occurs
    - Save logs when risk situations occur and what alert feature was available at that time
7. Display logged activities and logs

<b>New Functional Requirements:</b>
1. Collect gyroscope data from the user's cell phone and integrate to acceleroemter data for compare it with the dataset to recognize risk situations using a trainnig AI Model
2. Download Classification Graph
3. Download Better AI Model

<b>Functional Requirements Removed:</b>
1. Register activity you want to register
   Motivation: We observe taht generate data for register activity was not implemented correctly.
   Also This feature is not generating profitable returns for the application and was causing overhead.  
   For Future version of app we should be add a service specifically for this function. 

<b>Use Cases:</b> [view here](./Documentation/UseCases.md) (Needs Update)

<b>Functional Mockups:</b> [view here](./Documentation/FunctionalMockups.md) (Old Version)
