package com.google.android.gms.common.api.internal;

import android.os.Looper;
import com.google.android.gms.common.annotation.KeepName;
import com.google.android.gms.common.api.Status;
import defpackage.fp3;
import defpackage.lj0;
import defpackage.mdg;
import defpackage.pag;
import defpackage.rjc;
import defpackage.wsa;
import defpackage.yu0;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicReference;

@KeepName
/* loaded from: classes.dex */
public abstract class BasePendingResult<R extends rjc> extends pag {
    public static final yu0 n = new yu0(11);
    public final Object e;
    public final CountDownLatch f;
    public final ArrayList g;
    public final AtomicReference h;
    public rjc i;
    public Status j;
    public volatile boolean k;
    public boolean l;
    public boolean m;

    public BasePendingResult(mdg mdgVar) {
        super(14);
        this.e = new Object();
        this.f = new CountDownLatch(1);
        this.g = new ArrayList();
        this.h = new AtomicReference();
        this.m = false;
        new lj0(mdgVar != null ? mdgVar.a.Y : Looper.getMainLooper(), 2);
        new WeakReference(mdgVar);
    }

    public final void O(wsa wsaVar) {
        synchronized (this.e) {
            try {
                if (R()) {
                    wsaVar.a(this.j);
                } else {
                    this.g.add(wsaVar);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public abstract rjc P(Status status);

    public final void Q(Status status) {
        synchronized (this.e) {
            try {
                if (!R()) {
                    S(P(status));
                    this.l = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean R() {
        return this.f.getCount() == 0;
    }

    public final void S(rjc rjcVar) {
        synchronized (this.e) {
            try {
                if (this.l) {
                    return;
                }
                R();
                fp3.p("Results have already been set", !R());
                fp3.p("Result has already been consumed", !this.k);
                this.i = rjcVar;
                this.j = rjcVar.a();
                this.f.countDown();
                ArrayList arrayList = this.g;
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    ((wsa) arrayList.get(i)).a(this.j);
                }
                arrayList.clear();
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
