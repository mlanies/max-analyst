package defpackage;

import android.app.job.JobParameters;
import android.net.Uri;

/* loaded from: classes.dex */
public abstract class gie {
    public static String[] a(JobParameters jobParameters) {
        return jobParameters.getTriggeredContentAuthorities();
    }

    public static Uri[] b(JobParameters jobParameters) {
        return jobParameters.getTriggeredContentUris();
    }
}
