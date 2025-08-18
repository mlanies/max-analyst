package defpackage;

import android.content.Context;
import android.os.Binder;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* loaded from: classes.dex */
public final class aj8 extends Binder implements sr6 {
    public final WeakReference c;
    public final Handler d;
    public final xi8 e;
    public final Set f;

    public aj8(bj8 bj8Var) {
        attachInterface(this, "androidx.media3.session.IMediaSessionService");
        this.c = new WeakReference(bj8Var);
        Context applicationContext = bj8Var.getApplicationContext();
        this.d = new Handler(applicationContext.getMainLooper());
        this.e = xi8.a(applicationContext);
        this.f = Collections.synchronizedSet(new HashSet());
    }

    public static sr6 k(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("androidx.media3.session.IMediaSessionService");
        if (iInterfaceQueryLocalInterface != null && (iInterfaceQueryLocalInterface instanceof sr6)) {
            return (sr6) iInterfaceQueryLocalInterface;
        }
        rr6 rr6Var = new rr6();
        rr6Var.c = iBinder;
        return rr6Var;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }

    @Override // defpackage.sr6
    public final void f0(kr6 kr6Var, Bundle bundle) {
        if (kr6Var == null || bundle == null) {
            return;
        }
        try {
            oh3 oh3VarA = oh3.a(bundle);
            if (this.c.get() == null) {
                try {
                    kr6Var.c(0);
                    return;
                } catch (RemoteException unused) {
                    return;
                }
            }
            int callingPid = Binder.getCallingPid();
            int callingUid = Binder.getCallingUid();
            long jClearCallingIdentity = Binder.clearCallingIdentity();
            if (callingPid == 0) {
                callingPid = oh3VarA.d;
            }
            vi8 vi8Var = new vi8(oh3VarA.c, callingPid, callingUid);
            boolean zB = this.e.b(vi8Var);
            this.f.add(kr6Var);
            try {
                this.d.post(new nd8(1, this, kr6Var, vi8Var, oh3VarA, zB));
            } finally {
                Binder.restoreCallingIdentity(jClearCallingIdentity);
            }
        } catch (RuntimeException e) {
            z04.d0("Ignoring malformed Bundle for ConnectionRequest", e);
        }
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i >= 1 && i <= 16777215) {
            parcel.enforceInterface("androidx.media3.session.IMediaSessionService");
        }
        if (i == 1598968902) {
            parcel2.writeString("androidx.media3.session.IMediaSessionService");
            return true;
        }
        if (i != 3001) {
            return super.onTransact(i, parcel, parcel2, i2);
        }
        f0(ga8.k(parcel.readStrongBinder()), (Bundle) (parcel.readInt() != 0 ? Bundle.CREATOR.createFromParcel(parcel) : null));
        return true;
    }
}
