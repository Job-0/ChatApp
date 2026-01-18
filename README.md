# CetApp

CetApp is a real-time Android chat application built with Java. It leverages Firebase for seamless backend services, including real-time database capabilities and push notifications.

## Features

- **User Authentication**: Secure Sign Up and Sign In functionality.
- **Real-time Chat**: Send and receive messages instantly.
- **User List**: Browse available users to start a conversation.
- **Online Status**: See when other users are online.
- **Push Notifications**: Receive notifications for new messages using Firebase Cloud Messaging (FCM).
- **Responsive UI**: optimized for various screen sizes using SDP and SSP.

## Tech Stack

- **Language**: Java
- **Platform**: Android
- **Architecture**: MVVM / Android Architecture Components
- **Backend Service**: Firebase
    - **Firestore**: For real-time data storage (users, chat messages).
    - **Cloud Messaging (FCM)**: For push notifications.
- **Networking**: Retrofit 2 (likely used for triggering FCM notifications).
- **UI Components**:
    - Material Design
    - RoundedImageView
    - SDP/SSP for scalable UI units
    - View Binding

## Setup Instructions

To run this project locally, follow these steps:

1.  **Clone the Repository**
    ```bash
    git clone <repository-url>
    ```

2.  **Open in Android Studio**
    - Open Android Studio and select "Open an Existing Project".
    - Navigate to the cloned directory and select it.

3.  **Firebase Setup**
    - Go to the [Firebase Console](https://console.firebase.google.com/).
    - Create a new project.
    - Add an Android app to your project using the package name: `com.job.cetapp`.
    - Download the `google-services.json` file.
    - Place the `google-services.json` file inside the `app/` directory of your project (e.g., `CetApp/app/google-services.json`).
    - Enable **Cloud Firestore** in the Firebase Console (start in Test Mode for development).
    - Enable **Cloud Messaging** (if required for specific configurations).

4.  **Build and Run**
    - Sync the project with Gradle files.
    - Connect an Android device or start an emulator.
    - Run the application.

## Dependencies

Key dependencies used in this project:

- `com.google.firebase:firebase-messaging`
- `com.google.firebase:firebase-firestore`
- `com.squareup.retrofit2:retrofit`
- `com.intuit.sdp:sdp-android` & `com.intuit.ssp:ssp-android`
- `com.makeramen:roundedimageview`

## License

[Add License Information Here]
