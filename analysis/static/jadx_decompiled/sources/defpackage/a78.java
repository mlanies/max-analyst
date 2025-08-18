package defpackage;

import android.os.Bundle;
import android.support.v4.media.MediaBrowserCompat;
import android.support.v4.os.ResultReceiver;

/* loaded from: classes.dex */
public final class a78 implements Runnable {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ b78 b;
    public final /* synthetic */ ResultReceiver c;
    public final /* synthetic */ gaa o;

    public a78(gaa gaaVar, c78 c78Var, String str, ResultReceiver resultReceiver) {
        this.o = gaaVar;
        this.b = c78Var;
        this.c = resultReceiver;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ResultReceiver resultReceiver = this.c;
        gaa gaaVar = this.o;
        b78 b78Var = this.b;
        switch (this.a) {
            case 0:
                s68 s68Var = (s68) ((cj8) gaaVar.a).X.get(((c78) b78Var).a.getBinder());
                if (s68Var != null) {
                    cj8 cj8Var = (cj8) gaaVar.a;
                    cj8Var.getClass();
                    cj8Var.Y = s68Var;
                    if ((2 & 2) != 0) {
                        resultReceiver.send(-1, null);
                    } else {
                        Bundle bundle = new Bundle();
                        int i = MediaBrowserCompat.MediaItem.FLAG_BROWSABLE;
                        bundle.putParcelable("media_item", null);
                        resultReceiver.send(0, bundle);
                    }
                    cj8Var.Y = null;
                    break;
                }
                break;
            default:
                s68 s68Var2 = (s68) ((cj8) gaaVar.a).X.get(((c78) b78Var).a.getBinder());
                if (s68Var2 != null) {
                    cj8 cj8Var2 = (cj8) gaaVar.a;
                    cj8Var2.getClass();
                    cj8Var2.Y = s68Var2;
                    resultReceiver.send(-1, null);
                    cj8Var2.Y = null;
                    break;
                }
                break;
        }
    }

    public a78(gaa gaaVar, c78 c78Var, String str, Bundle bundle, ResultReceiver resultReceiver) {
        this.o = gaaVar;
        this.b = c78Var;
        this.c = resultReceiver;
    }
}
