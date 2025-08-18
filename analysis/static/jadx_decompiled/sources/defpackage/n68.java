package defpackage;

import android.content.Context;
import android.media.browse.MediaBrowser;
import android.media.session.MediaSession;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Messenger;
import android.os.Process;
import android.os.RemoteException;
import android.support.v4.media.session.IMediaSession;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public final class n68 extends MediaBrowser.ConnectionCallback {
    public final /* synthetic */ jo7 a;

    public n68(jo7 jo7Var) {
        this.a = jo7Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v8, types: [pr6] */
    @Override // android.media.browse.MediaBrowser.ConnectionCallback
    public final void onConnected() {
        nr6 nr6Var;
        jo7 jo7Var = this.a;
        o68 o68Var = (o68) jo7Var.b;
        int i = 0;
        if (o68Var != null) {
            MediaBrowser mediaBrowser = o68Var.b;
            try {
                Bundle extras = mediaBrowser.getExtras();
                if (extras != null) {
                    extras.getInt("extra_service_version", 0);
                    IBinder binder = extras.getBinder("extra_messenger");
                    if (binder != null) {
                        y7g y7gVar = new y7g(binder, o68Var.c);
                        o68Var.f = y7gVar;
                        m68 m68Var = o68Var.d;
                        Messenger messenger = new Messenger(m68Var);
                        o68Var.g = messenger;
                        m68Var.getClass();
                        m68Var.c = new WeakReference(messenger);
                        try {
                            Context context = o68Var.a;
                            Bundle bundle = new Bundle();
                            bundle.putString("data_package_name", context.getPackageName());
                            bundle.putInt("data_calling_pid", Process.myPid());
                            bundle.putBundle("data_root_hints", (Bundle) y7gVar.c);
                            y7gVar.E(6, bundle, messenger);
                        } catch (RemoteException unused) {
                        }
                    }
                    IBinder binder2 = extras.getBinder("extra_session_binder");
                    int i2 = uh8.d;
                    if (binder2 == null) {
                        nr6Var = null;
                    } else {
                        IInterface iInterfaceQueryLocalInterface = binder2.queryLocalInterface(IMediaSession.DESCRIPTOR);
                        if (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof pr6)) {
                            nr6 nr6Var2 = new nr6();
                            nr6Var2.c = binder2;
                            nr6Var = nr6Var2;
                        } else {
                            nr6Var = (pr6) iInterfaceQueryLocalInterface;
                        }
                    }
                    if (nr6Var != null) {
                        MediaSession.Token sessionToken = mediaBrowser.getSessionToken();
                        fm9.k(sessionToken != null);
                        if (!(sessionToken instanceof MediaSession.Token)) {
                            throw new IllegalArgumentException("token is not a valid MediaSession.Token object");
                        }
                        o68Var.h = new ai8(sessionToken, nr6Var);
                    }
                }
            } catch (IllegalStateException unused2) {
            }
        }
        da8 da8Var = (da8) jo7Var.c;
        q68 q68Var = da8Var.h;
        if (q68Var != null) {
            o68 o68Var2 = q68Var.a;
            if (o68Var2.h == null) {
                MediaSession.Token sessionToken2 = o68Var2.b.getSessionToken();
                fm9.k(sessionToken2 != null);
                if (!(sessionToken2 instanceof MediaSession.Token)) {
                    throw new IllegalArgumentException("token is not a valid MediaSession.Token object");
                }
                o68Var2.h = new ai8(sessionToken2, null);
            }
            vs5 vs5Var = new vs5(da8Var, 16, o68Var2.h);
            a98 a98Var = da8Var.b;
            a98Var.G(vs5Var);
            a98Var.X.post(new aa8(da8Var, i));
        }
    }

    @Override // android.media.browse.MediaBrowser.ConnectionCallback
    public final void onConnectionFailed() {
        jo7 jo7Var = this.a;
        Object obj = jo7Var.b;
        ((da8) jo7Var.c).b.release();
    }

    @Override // android.media.browse.MediaBrowser.ConnectionCallback
    public final void onConnectionSuspended() {
        jo7 jo7Var = this.a;
        o68 o68Var = (o68) jo7Var.b;
        if (o68Var != null) {
            o68Var.f = null;
            o68Var.g = null;
            o68Var.h = null;
            m68 m68Var = o68Var.d;
            m68Var.getClass();
            m68Var.c = new WeakReference(null);
        }
        ((da8) jo7Var.c).b.release();
    }
}
