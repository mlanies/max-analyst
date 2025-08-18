package defpackage;

import android.os.RemoteException;
import com.google.android.gms.common.api.Status;

/* loaded from: classes.dex */
public abstract class peg {
    public final int a;

    public peg(int i) {
        this.a = i;
    }

    public static Status e(RemoteException remoteException) {
        return new Status(19, remoteException.getClass().getSimpleName() + ": " + remoteException.getLocalizedMessage(), null, null);
    }

    public abstract void a(Status status);

    public abstract void b(RuntimeException runtimeException);

    public abstract void c(kdg kdgVar);

    public abstract void d(aab aabVar, boolean z);
}
