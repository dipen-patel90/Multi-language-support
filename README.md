Multi-language-support
======================

Multi language support demo

Android: Supporting multiple language(Localization) in android apps
We can support different language in our Android application using resources file.
I am adding here example for the same.

We are going to support English, Hindi & Marathi language in this demo for this we have to create separate resources folder
for all the three language and we will put different resource file in this folder and then we can change application locale 
using below code :

public static void setLocale(Context context, String locale) {
  Locale myLocale = new Locale(locale);
  Resources res = context.getResources();
  DisplayMetrics dm = res.getDisplayMetrics();
  Configuration conf = res.getConfiguration();
  conf.locale = myLocale;
  res.updateConfiguration(conf, dm);
 }

We have to add three different string resource folder (e.g values-hi, values-en, values-ma) with resource file string.xml.
Now when we will change application locale, application will automatically choose appropriate resource folder for 
rendering it on application.

Similarly we can also use different image resources in our application for that we have to create different drawable folder
(eg. drawable-hi, drawable-en, drawable-ma) now we can put different image with same name in this drawable resource.


