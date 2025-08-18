package defpackage;

import android.app.job.JobParameters;
import android.net.Network;

/* loaded from: classes.dex */
public abstract class hie {
    public static Network a(JobParameters jobParameters) {
        return jobParameters.getNetwork();
    }
}
