# SEBI-APP
Android Application Created for General Public to know about Securities Exchange Board of India and its services to public.

Application Design

High Level Design
  The design development of SEBI – Learn Life Android Application is separated into several design modules. The approach of high level design was is to design separate layouts for all the learning modules in the application.
The Application comprises of various modules such as About SEBI, Fun Learn, Kids Module, Young Investors Module, and Question Reviews Module and finally Tips module.
Design Approach is developing individual layouts to all the above modules using XML (Extensible Markup Language) layout files. These files are stored in SEBI-APP/SourceCode/LearnLife/res/layout
These layout files are used by the Fragment Files that are created individually for all modules. The fragments are in turn used by the MainActivity (Parent Activity) of the Android Application.
The designed layouts also use Adapters which were custom developed for custom use. To reduce the space used to navigate between different modules, a drawer type navigation was used. People can swipe the screen from left to right to draw this navigation menu and navigate between different modules of the application.
This navigation is made through Navigation drawer which was created using the NavigationDrawerAdapter class.

Low Level Design

Packages
  The application consists of three packages as shown in the LearnLife/src folder

Defined a set of images, I have all pointing to the some image in the LearnLife/res/drawable folder. These images are going to be used for the imageview. Typically in a real life scenario these images will be added dynamically from server.
I then initialized the ActionBar and set the background to HOLO Blue. I populated the rowItems list with RowItem objects. I then create an instance of the LazyAdapter(Our Custom Adapter) and  set it to our listview.
Also note I passed in the resource for each list item as R.layout.list_row. This defines what each list item will contain.
Here I implement a custom Adapter for our ListView. I have made use of the Holder pattern to make sure the performance of our ListView is maximum.
activity_main.xml
This layout defines a plain simple ListView within a Linear Layout.
list_row.xml
This layout defines an ImageView and 2 TextViews to be displayed as an individual list item. Also look at how I set the background of this layout to @drawable/card_greenborder. That gives it the Card look with green top.

Classes and Their Descriptions

(i) com.example.learnlife

a. FunLearnFragment: This Fragment holds data about the Fun Learn Module.
b. HomeFragment: This Fragment holds data about the Initial Module or the About Page.
c. MainActivity: This is the parent activity. This initializes the Navigation Drawer to navigate between different modules.
d. QuestionsAnswersFragment: Holds information or data about the Question Reviews Module.
e. RowItem: This is the template about what each RowItem in the card layout must contain. More specifically it has a Title, Image and Description.
f. SchoolChildrenFragment: Holds information or data about the Kids Module.
g. SebiLearnTipsFragment: Holds information or data about the Tips Module
h. TipsRowItem: As you might have noticed that Tips Layout does not contain any image but uses the same card layout. So it’s a layout definition especially for Tips Module.
i. YoungInvestorFragment: Holds information or data about the Young Investor Module.

(ii) com.example.learnlife.adapter

		Here NavDrawerListApapter holds information about the Navigation Drawer Menu.
	LazyAdapter is associated with all card layouts except with that of the Tips Module. It is responsible for lazy retrieval of data from the array which makes the application very effective in memory usage.
TipsLazyAdapter is associated with card layouts of the Tips Module. It is responsible for lazy retrieval of data from the array which makes the application very effective in memory usage for Tips Module.
(iii) com.example.learnlife.model

NavDrawerItem hold information about how each item in the navigation drawer is created.

Data Structure Details
All the data structures used in the application used in the application is of Array type. Mostly data structures in this application is to store Application Data such as Questions and Answers in Question Reviews Module, Names of Images to be retrieved in card layout etc.

Read Me (Instructions)
Compiling The Application Source Code
Software Needed For Compilation
The Android SDK provides you the API libraries and developer tools necessary to build, test, and debug apps for Android.
If you're a new Android developer, we recommend you download the ADT Bundle to quickly start developing apps. It includes the essential Android SDK components and a version of the Eclipse IDE with built-in ADT (Android Developer Tools) to streamline your Android app development.
With a single download, the ADT Bundle includes everything you need to begin developing apps:
Eclipse + ADT plugin
Android SDK Tools
Android Platform-tools
The latest Android platform
The latest Android system image for the emulator
Link for Download of Android SDK (Latest): http://developer.android.com/sdk/index.html?hl=sk

Compiling the Source Code
Here are step by step instructions to import and compile the application from the source code.

STEP 1: IMPORT LearLife Package into Eclipse

STEP 2: CHOOSE EXISTING ANDROID CODE INTO WORKSPACE

STEP 3: BROWSE THE SOURCE CODE

STEP 4: CHECK COPY PROJECT INTO WORKSPACE

STEP 5: IMPORT COMPATIBILITY FOLDER (appcompat_v7)
