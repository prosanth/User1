
package com.example.prasanth.user1;

import com.firebase.client.Firebase;

public class User1Application extends android.app.Application {

    @Override
    public void onCreate() {
        super.onCreate();
        Firebase.setAndroidContext(this);
    }
}
