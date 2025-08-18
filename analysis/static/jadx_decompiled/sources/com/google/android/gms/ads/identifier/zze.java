package com.google.android.gms.ads.identifier;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

/* loaded from: classes.dex */
public final class zze {
    public static final void zza(String str) {
        try {
            try {
                HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
                try {
                    if (httpURLConnection.getResponseCode() >= 200) {
                    }
                } finally {
                    httpURLConnection.disconnect();
                }
            } catch (IOException | RuntimeException e) {
                e.getMessage();
            }
        } catch (IndexOutOfBoundsException e2) {
            e2.getMessage();
        } finally {
        }
    }
}
