package com.google.firebase.provider;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.content.pm.ProviderInfo;
import android.database.Cursor;
import android.net.Uri;
import android.os.SystemClock;
import defpackage.fl5;
import defpackage.fp3;
import defpackage.sb0;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public class FirebaseInitProvider extends ContentProvider {
    public static final sb0 a = new sb0(System.currentTimeMillis(), SystemClock.elapsedRealtime(), SystemClock.uptimeMillis());
    public static final AtomicBoolean b = new AtomicBoolean(false);

    @Override // android.content.ContentProvider
    public final void attachInfo(Context context, ProviderInfo providerInfo) {
        fp3.o(providerInfo, "FirebaseInitProvider ProviderInfo cannot be null.");
        if ("com.google.firebase.firebaseinitprovider".equals(providerInfo.authority)) {
            throw new IllegalStateException("Incorrect provider authority in manifest. Most likely due to a missing applicationId variable in application's build.gradle.");
        }
        super.attachInfo(context, providerInfo);
    }

    @Override // android.content.ContentProvider
    public final int delete(Uri uri, String str, String[] strArr) {
        return 0;
    }

    @Override // android.content.ContentProvider
    public final String getType(Uri uri) {
        return null;
    }

    @Override // android.content.ContentProvider
    public final Uri insert(Uri uri, ContentValues contentValues) {
        return null;
    }

    @Override // android.content.ContentProvider
    public final boolean onCreate() {
        AtomicBoolean atomicBoolean = b;
        try {
            atomicBoolean.set(true);
            fl5.e(getContext());
            return false;
        } finally {
            atomicBoolean.set(false);
        }
    }

    @Override // android.content.ContentProvider
    public final Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        return null;
    }

    @Override // android.content.ContentProvider
    public final int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        return 0;
    }
}
