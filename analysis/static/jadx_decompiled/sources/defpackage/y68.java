package defpackage;

import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import android.support.v4.media.session.MediaSessionCompat;

/* loaded from: classes.dex */
public final class y68 implements Runnable {
    public final /* synthetic */ Bundle X;
    public final /* synthetic */ gaa Y;
    public final /* synthetic */ b78 a;
    public final /* synthetic */ String b;
    public final /* synthetic */ int c;
    public final /* synthetic */ int o;

    public y68(int i, int i2, c78 c78Var, gaa gaaVar, Bundle bundle, String str) {
        this.Y = gaaVar;
        this.a = c78Var;
        this.b = str;
        this.c = i;
        this.o = i2;
        this.X = bundle;
    }

    @Override // java.lang.Runnable
    public final void run() throws RemoteException {
        b78 b78Var = this.a;
        IBinder binder = ((c78) b78Var).a.getBinder();
        gaa gaaVar = this.Y;
        ((cj8) gaaVar.a).X.remove(binder);
        s68 s68Var = new s68((cj8) gaaVar.a, this.b, this.c, this.o, (c78) b78Var);
        cj8 cj8Var = (cj8) gaaVar.a;
        cj8Var.Y = s68Var;
        ph4 ph4VarB = cj8Var.b(this.X);
        cj8Var.Y = null;
        if (ph4VarB == null) {
            try {
                ((c78) b78Var).a(2, null);
                return;
            } catch (RemoteException unused) {
                return;
            }
        }
        try {
            cj8Var.X.put(binder, s68Var);
            binder.linkToDeath(s68Var, 0);
            ai8 ai8Var = cj8Var.s0;
            if (ai8Var != null) {
                Bundle bundle = (Bundle) ph4VarB.b;
                c78 c78Var = (c78) b78Var;
                c78Var.getClass();
                if (bundle == null) {
                    bundle = new Bundle();
                }
                bundle.putInt("extra_service_version", 2);
                Bundle bundle2 = new Bundle();
                bundle2.putString("data_media_item_id", "androidx.media3.session.MediaLibraryService");
                bundle2.putParcelable("data_media_session_token", mf7.a(ai8Var, MediaSessionCompat.Token.CREATOR));
                bundle2.putBundle("data_root_hints", bundle);
                c78Var.a(1, bundle2);
            }
        } catch (RemoteException unused2) {
            cj8Var.X.remove(binder);
        }
    }
}
