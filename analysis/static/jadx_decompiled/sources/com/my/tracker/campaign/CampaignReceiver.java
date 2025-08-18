package com.my.tracker.campaign;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import com.my.tracker.obfuscated.y0;

/* loaded from: classes.dex */
public class CampaignReceiver extends BroadcastReceiver {
    public static void a(Context context, Intent intent) {
        Bundle extras;
        if (intent == null || (extras = intent.getExtras()) == null) {
            return;
        }
        String string = extras.getString("referrer");
        if (TextUtils.isEmpty(string)) {
            y0.a("CampaignReceiver: referrer is null or empty");
            return;
        }
        y0.a("CampaignReceiver: got referrer " + string);
        try {
            context.startService(new Intent(context, (Class<?>) CampaignService.class).putExtra("referrer", string));
        } catch (Throwable th) {
            y0.b("CampaignReceiver error: " + th);
        }
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        a(context, intent);
    }
}
