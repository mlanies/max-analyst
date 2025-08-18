package ru.ok.android.externcalls.analytics.internal.upload;

import android.app.Application;
import android.content.Intent;
import android.net.Uri;
import defpackage.i87;
import defpackage.nd7;
import defpackage.sqc;
import java.io.IOException;
import ru.ok.android.commons.app.ApplicationProvider;
import ru.ok.android.externcalls.analytics.internal.config.CallAnalyticsConfigStorage;

/* loaded from: classes2.dex */
public class UploadService extends sqc {
    public static final String ACTION_UPLOAD = "ru.ok.android.onelog.action.UPLOAD";
    private static final String LOG_TAG = "UploadService";
    public static final String SCHEME = "calls-sdk-analytics";

    private void onHandleUpload(String str) {
        try {
            UploadStarter.INSTANCE.upload(str);
        } catch (IOException e) {
            CallAnalyticsConfigStorage.INSTANCE.getLogger().e(LOG_TAG, "Cannot upload", e);
        }
    }

    public static void startUpload(String str) {
        Application application = ApplicationProvider.a;
        Application applicationT = nd7.t();
        i87.enqueueWork(applicationT, (Class<?>) UploadService.class, CallAnalyticsConfigStorage.INSTANCE.getUpload().getUploadJobId(), new Intent().setAction(ACTION_UPLOAD).setData(Uri.fromParts(SCHEME, str, null)).setClass(applicationT, UploadService.class));
    }

    @Override // defpackage.i87
    public void onHandleWork(Intent intent) {
        String action;
        if (intent == null || (action = intent.getAction()) == null) {
            return;
        }
        Uri data = intent.getData();
        if (!action.equals(ACTION_UPLOAD) || data == null) {
            return;
        }
        onHandleUpload(data.getSchemeSpecificPart());
    }
}
