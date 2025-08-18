package com.my.tracker.obfuscated;

import android.content.Intent;
import android.net.Uri;

/* loaded from: classes.dex */
public final class p {
    private final t a;

    private p(t tVar) {
        this.a = tVar;
    }

    public static p a(t tVar) {
        return new p(tVar);
    }

    public String a(Intent intent) {
        y0.a("DeeplinkHandler: handling deeplink");
        if (intent == null) {
            y0.a("DeeplinkHandler: intent is null");
            return null;
        }
        try {
            Uri data = intent.getData();
            if (data == null) {
                y0.a("DeeplinkHandler: intent data is null");
                return null;
            }
            y0.a("DeeplinkHandler: intent data: " + data);
            String queryParameter = data.getQueryParameter("mt_deeplink");
            String queryParameter2 = data.getQueryParameter("mt_click_id");
            if (queryParameter != null) {
                y0.a("DeeplinkHandler: found mt_deeplink in intent");
            } else {
                y0.a("DeeplinkHandler: mt_deeplink not found in intent");
                queryParameter = data.toString();
            }
            y0.a("DeeplinkHandler: deeplink " + queryParameter);
            y0.a("DeeplinkHandler: clickId " + queryParameter2);
            this.a.a(queryParameter, queryParameter2);
            return queryParameter;
        } catch (Throwable th) {
            y0.b("DeeplinkHandler error: ", th);
            return null;
        }
    }
}
