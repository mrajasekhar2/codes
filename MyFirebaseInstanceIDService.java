package com.workflow99.workflowkwikpe;

import android.content.SharedPreferences;
import android.util.Log;

import com.google.firebase.iid.FirebaseInstanceId;
import com.google.firebase.iid.FirebaseInstanceIdService;

public class MyFirebaseInstanceIDService extends FirebaseInstanceIdService {
    SharedPreferences sharedPreferences;
    SharedPreferences.Editor sharedEditor;
    private static final String TAG = "MyFirebaseIIDService";
//    private APIClient mApiClient;

    /**
     * Called if InstanceID token is updated. This may occur if the security of
     * the previous token had been compromised. Note that this is called when the InstanceID token
     * is initially generated so this is where you would retrieve the token.
     */
//
    @Override
    public void onTokenRefresh() {
// Get updated InstanceID token.
        sharedPreferences = getApplicationContext().getSharedPreferences("KwikPe", 0); // 0 - for private mode
        sharedEditor = sharedPreferences.edit();
        String refreshedToken = FirebaseInstanceId.getInstance().getToken();

        Log.d(TAG, "Refreshed token: " + refreshedToken);
        sharedEditor.putString("firebasetoken", refreshedToken);
        sharedEditor.commit();
// If you want to send messages to this application instance or
// manage this apps subscriptions on the server side, send the
// Instance ID token to your app server.
        sendRegistrationToServer(refreshedToken);
    }

    /**
     * Persist token to third-party servers.
     * <p>
     * Modify this method to associate the user's FCM InstanceID token with any server-side account
     * maintained by your application.
     *
     * @param token The new token.
     */
    private void sendRegistrationToServer(String token) {
        // TODO: Implement this method to send token to your app server.
//        Toast.makeText(this, token, Toast.LENGTH_SHORT).show();
        Log.e("Refreshed_Token", token);
//        mApiClient.getClient()
//                .send_notification(token)
//                .enqueue(new Callback<FireBaseModel>() {
//
//                    @Override
//                    public void onResponse(Call<FireBaseModel> call, Response<FireBaseModel> response) {
//
//
//                    }
//
//                    @Override
//                    public void onFailure(Call<FireBaseModel> call, Throwable t) {
//                        try {
//                            if (null != t) {
//
//
//                            }
//                        } catch (Exception e) {
//                            e.printStackTrace();
//                        }
//
//                    }
//                });

    }
}


// samsung refresh token
//d8a8XYN-UOA:APA91bHPQfvaRZg_2LzOfJkPMdjdnwSrTD-LIYOFXMoJ9DevlULOvVetMFehdO3451rtwJ2BkquiKexMEyw2Me8N0rMZSWRn_JZ04N78jqclcyYbxAEruPd0oVCxRh3FtwlbpiPFMONh
