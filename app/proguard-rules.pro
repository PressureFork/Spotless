# Spotless Proguard rules for production (app module)

-keep class androidx.compose.** { *; }
-keepclassmembers class androidx.compose.** { *; }
-keep class com.spotify.** { *; }
-keepclassmembers class com.spotify.** { *; }
-keep class okhttp3.** { *; }
-keep interface okhttp3.** { *; }
-keep enum okhttp3.** { *; }
-keep class kotlinx.coroutines.** { *; }
-keep class kotlinx.serialization.** { *; }
-keep class org.json.** { *; }
-keep class * extends androidx.lifecycle.ViewModel { *; }
-keep class androidx.navigation.** { *; }
-keep class androidx.datastore.** { *; }
-keep class * extends android.app.Activity { *; }
-keep class * extends androidx.fragment.app.Fragment { *; }
-keepclassmembers class ** {
    public static <fields>;
}
-keep class **.R$* { *; }
# Add library-specific rules here if needed.
-keepattributes Signature,InnerClasses,EnclosingMethod