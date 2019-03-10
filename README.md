#Screenshots with the app
https://drive.google.com/open?id=19Dl6u34xVGPXbTDDtny_KJZIY4BLM45_
https://drive.google.com/open?id=1j6zSGXmrNQt-CfEK-hl6Ow4UI9wnmTC3
https://drive.google.com/open?id=12WZfcSru-C30eslGR3d_8_jWNOtw6ge7

The app opens with a login screen directed by Firebase Google Authentication. 
The main screen is a Navigation Drawer and its main fragment is a Trip List (RecyclerView) which is displayed when the Home item is clicked. The user has the option to:

-add a new trip by clicking the FAB (give permission to camera/gallery and choose a date-fragment Date Picker);

-see the full description of a trip by long pressing on it;

-mark as favourite one trip; its info is saved in Firebase and added in the list contained in the Favourite menu option of the Navigation Drawer, all the data from the app is saved in Firebase Cloud Firestore.
