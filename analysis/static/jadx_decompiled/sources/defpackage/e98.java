package defpackage;

import android.content.Context;
import android.media.session.MediaController;
import android.media.session.MediaSession;
import android.os.RemoteException;
import android.support.v4.media.session.MediaControllerCompat;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class e98 {
    public final MediaController a;
    public final Object b = new Object();
    public final ArrayList c = new ArrayList();
    public final HashMap d = new HashMap();
    public final ai8 e;

    public e98(Context context, ai8 ai8Var) {
        this.e = ai8Var;
        Object obj = ai8Var.b;
        obj.getClass();
        MediaController mediaController = new MediaController(context, (MediaSession.Token) obj);
        this.a = mediaController;
        if (ai8Var.a() == null) {
            c98 c98Var = new c98(null);
            c98Var.b = new WeakReference(this);
            mediaController.sendCommand(MediaControllerCompat.COMMAND_GET_EXTRA_BINDER, null, c98Var);
        }
    }

    public final void a() {
        pr6 pr6VarA = this.e.a();
        if (pr6VarA == null) {
            return;
        }
        ArrayList arrayList = this.c;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ba8 ba8Var = (ba8) it.next();
            d98 d98Var = new d98(ba8Var);
            this.d.put(ba8Var, d98Var);
            ba8Var.c = d98Var;
            try {
                pr6VarA.g0(d98Var);
                ba8Var.i(13, null, null);
            } catch (RemoteException unused) {
            }
        }
        arrayList.clear();
    }

    public final void b(ba8 ba8Var) {
        MediaController mediaController = this.a;
        b98 b98Var = ba8Var.a;
        b98Var.getClass();
        mediaController.unregisterCallback(b98Var);
        synchronized (this.b) {
            pr6 pr6VarA = this.e.a();
            if (pr6VarA != null) {
                try {
                    d98 d98Var = (d98) this.d.remove(ba8Var);
                    if (d98Var != null) {
                        ba8Var.c = null;
                        pr6VarA.W(d98Var);
                    }
                } catch (RemoteException unused) {
                }
            } else {
                this.c.remove(ba8Var);
            }
        }
    }
}
