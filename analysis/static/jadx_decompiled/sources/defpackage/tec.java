package defpackage;

import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.SparseArray;

/* loaded from: classes.dex */
public final class tec implements IBinder.DeathRecipient {
    public final Messenger a;
    public final pc b;
    public final Messenger c;
    public int f;
    public int g;
    public final /* synthetic */ yec i;
    public int d = 1;
    public int e = 1;
    public final SparseArray h = new SparseArray();

    public tec(yec yecVar, Messenger messenger) {
        this.i = yecVar;
        this.a = messenger;
        pc pcVar = new pc(this);
        this.b = pcVar;
        this.c = new Messenger(pcVar);
    }

    public final void a(int i) {
        int i2 = this.d;
        this.d = i2 + 1;
        b(5, i2, i, null, null);
    }

    public final boolean b(int i, int i2, int i3, Bundle bundle, Bundle bundle2) {
        Message messageObtain = Message.obtain();
        messageObtain.what = i;
        messageObtain.arg1 = i2;
        messageObtain.arg2 = i3;
        messageObtain.obj = bundle;
        messageObtain.setData(bundle2);
        messageObtain.replyTo = this.c;
        try {
            this.a.send(messageObtain);
            return true;
        } catch (DeadObjectException | RemoteException unused) {
            return false;
        }
    }

    @Override // android.os.IBinder.DeathRecipient
    public final void binderDied() {
        this.i.u0.post(new sec(this, 1));
    }

    public final void c(int i, int i2) {
        Bundle bundleG = zr6.g(i2, "volume");
        int i3 = this.d;
        this.d = i3 + 1;
        b(7, i3, i, null, bundleG);
    }

    public final void d(int i, int i2) {
        Bundle bundleG = zr6.g(i2, "volume");
        int i3 = this.d;
        this.d = i3 + 1;
        b(8, i3, i, null, bundleG);
    }
}
