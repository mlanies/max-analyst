package defpackage;

import android.content.Context;
import android.os.Handler;
import android.os.HandlerThread;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.ExecutorService;

/* loaded from: classes.dex */
public final class so4 {
    public static final zhc n = new zhc(1);
    public final Context a;
    public final d9g b;
    public final po4 c;
    public final q64 d;
    public final CopyOnWriteArraySet e;
    public int f;
    public int g;
    public boolean h;
    public boolean i;
    public int j;
    public boolean k;
    public List l;
    public gb0 m;

    public so4(Context context, e34 e34Var, gw0 gw0Var, q24 q24Var, ExecutorService executorService) {
        q94 q94Var = new q94(e34Var);
        mw0 mw0Var = new mw0();
        mw0Var.a = gw0Var;
        mw0Var.d = q24Var;
        r94 r94Var = new r94(mw0Var, executorService);
        this.a = context.getApplicationContext();
        this.b = q94Var;
        this.i = true;
        this.l = Collections.emptyList();
        this.e = new CopyOnWriteArraySet();
        Handler handlerP = oaf.p(new hl4(1, this));
        HandlerThread handlerThread = new HandlerThread("ExoPlayer:DownloadManager");
        handlerThread.start();
        po4 po4Var = new po4(handlerThread, q94Var, r94Var, handlerP, this.i);
        this.c = po4Var;
        q64 q64Var = new q64(7, this);
        this.d = q64Var;
        gb0 gb0Var = new gb0(context, q64Var, n);
        this.m = gb0Var;
        int iD = gb0Var.d();
        this.j = iD;
        this.f = 1;
        po4Var.obtainMessage(1, iD, 0).sendToTarget();
    }

    public final void a() {
        Iterator it = this.e.iterator();
        while (it.hasNext()) {
            ((qo4) it.next()).d(this, this.k);
        }
    }

    public final void b(gb0 gb0Var, int i) {
        Object obj = gb0Var.d;
        if (this.j != i) {
            this.j = i;
            this.f++;
            this.c.obtainMessage(3, i, 0).sendToTarget();
        }
        boolean zD = d();
        Iterator it = this.e.iterator();
        while (it.hasNext()) {
            ((qo4) it.next()).b();
        }
        if (zD) {
            a();
        }
    }

    public final void c(boolean z) {
        if (this.i == z) {
            return;
        }
        this.i = z;
        this.f++;
        this.c.obtainMessage(2, z ? 1 : 0, 0).sendToTarget();
        boolean zD = d();
        Iterator it = this.e.iterator();
        while (it.hasNext()) {
            ((qo4) it.next()).getClass();
        }
        if (zD) {
            a();
        }
    }

    public final boolean d() {
        boolean z;
        if (this.i || this.j == 0) {
            z = false;
        } else {
            for (int i = 0; i < this.l.size(); i++) {
                if (((dn4) this.l.get(i)).b == 0) {
                    z = true;
                    break;
                }
            }
            z = false;
        }
        boolean z2 = this.k != z;
        this.k = z;
        return z2;
    }
}
