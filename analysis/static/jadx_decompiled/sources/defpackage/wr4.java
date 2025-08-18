package defpackage;

import android.media.MediaDrm;

/* loaded from: classes.dex */
public abstract class wr4 {
    public static boolean a(Throwable th) {
        return th instanceof MediaDrm.MediaDrmStateException;
    }

    public static int b(Throwable th) {
        return oaf.x(oaf.y(((MediaDrm.MediaDrmStateException) th).getDiagnosticInfo()));
    }
}
