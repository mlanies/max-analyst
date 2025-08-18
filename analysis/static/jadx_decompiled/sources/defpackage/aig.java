package defpackage;

import android.os.IBinder;
import android.os.IInterface;

/* loaded from: classes.dex */
public final class aig implements IInterface {
    public final IBinder c;

    public aig(IBinder iBinder) {
        this.c = iBinder;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.c;
    }
}
