package defpackage;

import android.content.Context;
import android.media.session.MediaSession;
import android.os.Bundle;
import android.os.Handler;
import android.os.RemoteCallbackList;
import java.util.List;

/* loaded from: classes.dex */
public abstract class vh8 implements th8 {
    public final MediaSession a;
    public final uh8 b;
    public final ai8 c;
    public final Bundle e;
    public i3b g;
    public List h;
    public hd8 i;
    public int j;
    public int k;
    public t68 l;
    public final Object d = new Object();
    public final RemoteCallbackList f = new RemoteCallbackList();

    public vh8(Context context, String str, Bundle bundle) {
        MediaSession mediaSessionB = b(context, str, bundle);
        this.a = mediaSessionB;
        uh8 uh8Var = new uh8((wh8) this);
        this.b = uh8Var;
        this.c = new ai8(mediaSessionB.getSessionToken(), uh8Var);
        this.e = bundle;
        mediaSessionB.setFlags(3);
    }

    public abstract MediaSession b(Context context, String str, Bundle bundle);

    public final void c(t68 t68Var, Handler handler) {
        synchronized (this.d) {
            try {
                this.l = t68Var;
                this.a.setCallback(t68Var == null ? null : (sh8) t68Var.b, handler);
                if (t68Var != null) {
                    t68Var.I(this, handler);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.th8
    public final t68 getCallback() {
        t68 t68Var;
        synchronized (this.d) {
            t68Var = this.l;
        }
        return t68Var;
    }
}
