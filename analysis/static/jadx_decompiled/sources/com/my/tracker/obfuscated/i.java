package com.my.tracker.obfuscated;

import android.content.Context;
import android.net.Uri;
import android.os.Handler;
import android.text.TextUtils;
import com.my.tracker.MyTracker;
import com.my.tracker.MyTrackerAttribution;
import defpackage.ibg;
import java.net.URLDecoder;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class i {
    final AtomicBoolean a = new AtomicBoolean(false);
    final z0 b;
    final Context c;

    public i(z0 z0Var, Context context) {
        this.b = z0Var;
        this.c = context.getApplicationContext();
    }

    public static i a(z0 z0Var, Context context) {
        return new i(z0Var, context);
    }

    public void a(String str) {
        if (TextUtils.isEmpty(str)) {
            y0.a("AttributionHandler: referrer is empty");
            return;
        }
        if (a()) {
            y0.a("AttributionHandler: attribution has already been received");
            return;
        }
        try {
            String queryParameter = Uri.parse("https://my.com/?" + URLDecoder.decode(str, "UTF-8")).getQueryParameter("mt_deeplink");
            if (TextUtils.isEmpty(queryParameter)) {
                y0.a("AttributionHandler: deeplink is empty");
            } else {
                a(new JSONObject().put("deeplink", queryParameter));
            }
        } catch (Throwable th) {
            y0.b("AttributionHandler error: handling referrer failed with error: ", th);
        }
    }

    public void b(String str) {
        if (a()) {
            y0.a("AttributionHandler: attribution has already been received");
            return;
        }
        try {
            JSONObject jSONObjectOptJSONObject = new JSONObject(str).optJSONObject("attribution");
            if (jSONObjectOptJSONObject == null) {
                y0.a("AttributionHandler: empty attribution object has been returned");
                return;
            }
            if (!jSONObjectOptJSONObject.has("error")) {
                a(jSONObjectOptJSONObject);
                return;
            }
            y0.a("AttributionHandler: attribution response returned error " + jSONObjectOptJSONObject.optInt("error"));
        } catch (Throwable th) {
            y0.b("AttributionHandler error: handling server attribution failed with error: ", th);
        }
    }

    public boolean a() {
        if (this.a.get()) {
            return true;
        }
        return !TextUtils.isEmpty(p0.a(this.c).g());
    }

    public void a(JSONObject jSONObject) {
        String strOptString = jSONObject.optString("deeplink");
        if (TextUtils.isEmpty(strOptString)) {
            y0.a("AttributionHandler: deeplink is empty");
            return;
        }
        if (!this.a.compareAndSet(false, true)) {
            y0.a("AttributionHandler: attribution has already been received");
            return;
        }
        p0 p0VarA = p0.a(this.c);
        if (!TextUtils.isEmpty(p0VarA.g())) {
            y0.a("AttributionHandler: attribution has already been received");
            return;
        }
        p0VarA.i(jSONObject.toString());
        MyTracker.AttributionListener attributionListenerC = this.b.c();
        if (attributionListenerC == null) {
            return;
        }
        Handler handlerB = this.b.b();
        if (handlerB == null) {
            handlerB = h.b;
        }
        try {
            handlerB.post(new ibg(attributionListenerC, 2, MyTrackerAttribution.newAttribution(strOptString)));
        } catch (Throwable th) {
            y0.b("AttributionHandler error: exception occurred while post runnable", th);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void a(MyTracker.AttributionListener attributionListener, MyTrackerAttribution myTrackerAttribution) {
        try {
            attributionListener.onReceiveAttribution(myTrackerAttribution);
        } catch (Throwable unused) {
            y0.b("AttributionHandler error: exception at AttributionListener::onReceiveAttribution()");
        }
    }
}
