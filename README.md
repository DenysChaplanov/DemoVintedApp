# DemoVintedApp
This project was completed during the technical homework (interview) phase of Vinted.

![video](https://github.com/DenysChaplanov/DemoVintedApp/assets/71696135/ba4d1fd9-437e-45fe-8a3f-136b3047de87)

## Overal 
This project demonstrates good practices in Android app development, utilizing modern components and architectural principles. 

### Features:
1. *Supports "infinite" scrolling*
Additional elements are loaded when approaching the end of the list. Loading is implemented in a background thread.

2. *Search filtering*
The user  have an option to input the search phrase by which the provided items in the list are filtered

3. *Sending data using the POST method*. 
It's for tracking the shown items in the feed (for analytic guys)

## Technologies
In this project, the MVVM (Model-View-ViewModel) architecture was implemented, which separates the application components into Model, View, and ViewModel, providing a clearer structure and data management. The project was built using the following key libraries and technologies:

1. **MVVM (Model-View-ViewModel):** An architectural model that allows the separation of data logic and the user interface into individual components.
2. **AndroidX:** Modern Android architecture components used for developing more structured and performance-oriented applications.
3. **Retrofit and OkHttp:** Used for interacting with the server and making HTTP requests, enabling communication with a remote server and data retrieval.
4. **RxJava:** Utilized for asynchronous data processing and managing threads, enabling asynchronous operations without blocking the user interface.
5. **Moshi:** Used for parsing JSON data, facilitating the conversion of JSON data into Kotlin objects.
6. **Glide:** Employed for loading and displaying images, ensuring fast and efficient graphic handling.
7. **Android Navigation + SafeArgs:** Implemented for navigation between fragments, making screen management and transitions more convenient and understandable. SafeArgs is used to pass data between fragments.
8. **RecyclerView:** Utilized for displaying lists of items, allowing efficient rendering of dynamic data.
