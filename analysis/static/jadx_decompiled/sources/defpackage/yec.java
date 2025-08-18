package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.Log;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class yec extends ug8 implements ServiceConnection {
    public static final boolean B0 = Log.isLoggable("MediaRouteProviderProxy", 3);
    public yt8 A0;
    public final ComponentName t0;
    public final fc9 u0;
    public final ArrayList v0;
    public boolean w0;
    public boolean x0;
    public tec y0;
    public boolean z0;

    public yec(Context context, ComponentName componentName) {
        super(context, new ey1(21, componentName));
        this.v0 = new ArrayList();
        this.t0 = componentName;
        this.u0 = new fc9();
    }

    @Override // defpackage.ug8
    public final sg8 c(String str) {
        if (str == null) {
            throw new IllegalArgumentException("initialMemberRouteId cannot be null.");
        }
        vg8 vg8Var = this.Z;
        if (vg8Var != null) {
            List list = vg8Var.c;
            int size = list.size();
            for (int i = 0; i < size; i++) {
                if (((zf8) list.get(i)).c().equals(str)) {
                    wec wecVar = new wec(this, str);
                    this.v0.add(wecVar);
                    if (this.z0) {
                        wecVar.b(this.y0);
                    }
                    m();
                    return wecVar;
                }
            }
        }
        return null;
    }

    @Override // defpackage.ug8
    public final tg8 d(String str) {
        if (str != null) {
            return j(str, null);
        }
        throw new IllegalArgumentException("routeId cannot be null");
    }

    @Override // defpackage.ug8
    public final tg8 e(String str, String str2) {
        if (str == null) {
            throw new IllegalArgumentException("routeId cannot be null");
        }
        if (str2 != null) {
            return j(str, str2);
        }
        throw new IllegalArgumentException("routeGroupId cannot be null");
    }

    @Override // defpackage.ug8
    public final void f(bg8 bg8Var) {
        if (this.z0) {
            tec tecVar = this.y0;
            int i = tecVar.d;
            tecVar.d = i + 1;
            tecVar.b(10, i, 0, bg8Var != null ? bg8Var.a : null, null);
        }
        m();
    }

    public final void i() {
        if (this.x0) {
            return;
        }
        boolean z = B0;
        if (z) {
            toString();
        }
        Intent intent = new Intent("android.media.MediaRouteProviderService");
        intent.setComponent(this.t0);
        try {
            boolean zBindService = this.a.bindService(intent, this, 4097);
            this.x0 = zBindService;
            if (zBindService || !z) {
                return;
            }
            toString();
        } catch (SecurityException unused) {
            if (z) {
                toString();
            }
        }
    }

    public final xec j(String str, String str2) {
        vg8 vg8Var = this.Z;
        if (vg8Var == null) {
            return null;
        }
        List list = vg8Var.c;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (((zf8) list.get(i)).c().equals(str)) {
                xec xecVar = new xec(this, str, str2);
                this.v0.add(xecVar);
                if (this.z0) {
                    xecVar.b(this.y0);
                }
                m();
                return xecVar;
            }
        }
        return null;
    }

    public final void k() {
        if (this.y0 != null) {
            g(null);
            this.z0 = false;
            ArrayList arrayList = this.v0;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                ((uec) arrayList.get(i)).c();
            }
            tec tecVar = this.y0;
            tecVar.b(2, 0, 0, null, null);
            tecVar.b.b.clear();
            tecVar.a.getBinder().unlinkToDeath(tecVar, 0);
            tecVar.i.u0.post(new sec(tecVar, 0));
            this.y0 = null;
        }
    }

    public final void l() {
        if (this.x0) {
            if (B0) {
                toString();
            }
            this.x0 = false;
            k();
            try {
                this.a.unbindService(this);
            } catch (IllegalArgumentException unused) {
                toString();
            }
        }
    }

    public final void m() {
        if (!this.w0 || (this.X == null && this.v0.isEmpty())) {
            l();
        } else {
            i();
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) throws RemoteException {
        boolean z = B0;
        if (z) {
            toString();
        }
        if (this.x0) {
            k();
            Messenger messenger = iBinder != null ? new Messenger(iBinder) : null;
            if (messenger != null) {
                try {
                    if (messenger.getBinder() != null) {
                        tec tecVar = new tec(this, messenger);
                        int i = tecVar.d;
                        tecVar.d = i + 1;
                        tecVar.g = i;
                        if (tecVar.b(1, i, 4, null, null)) {
                            try {
                                tecVar.a.getBinder().linkToDeath(tecVar, 0);
                                this.y0 = tecVar;
                                return;
                            } catch (RemoteException unused) {
                                tecVar.binderDied();
                            }
                        }
                        if (z) {
                            toString();
                            return;
                        }
                        return;
                    }
                } catch (NullPointerException unused2) {
                }
            }
            toString();
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        if (B0) {
            toString();
        }
        k();
    }

    public final String toString() {
        return "Service connection " + this.t0.flattenToShortString();
    }
}
