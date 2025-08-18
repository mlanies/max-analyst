package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.content.Context;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import com.google.android.gms.common.api.Scope;
import defpackage.bfg;
import defpackage.cig;
import defpackage.dr6;
import defpackage.ee6;
import defpackage.ehg;
import defpackage.fe6;
import defpackage.ffg;
import defpackage.fp3;
import defpackage.ge6;
import defpackage.gpf;
import defpackage.gwe;
import defpackage.he6;
import defpackage.jkg;
import defpackage.kad;
import defpackage.kdg;
import defpackage.ok;
import defpackage.oof;
import defpackage.pe5;
import defpackage.ph3;
import defpackage.qc6;
import defpackage.ri0;
import defpackage.rjg;
import defpackage.tgg;
import defpackage.vfg;
import defpackage.vgg;
import defpackage.vig;
import defpackage.xhg;
import defpackage.y7f;
import defpackage.yx8;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public abstract class a implements ok {
    public static final pe5[] J0 = new pe5[0];
    public final int A0;
    public final String B0;
    public volatile String C0;
    public ph3 D0;
    public boolean E0;
    public volatile vig F0;
    public final AtomicInteger G0;
    public final Set H0;
    public final Account I0;
    public final vfg X;
    public final Object Y;
    public final Object Z;
    public volatile String a;
    public yx8 b;
    public final Context c;
    public final jkg o;
    public ffg s0;
    public ri0 t0;
    public IInterface u0;
    public final ArrayList v0;
    public ehg w0;
    public int x0;
    public final oof y0;
    public final gpf z0;

    public a(Context context, Looper looper, int i, kad kadVar, ge6 ge6Var, he6 he6Var) {
        synchronized (jkg.h) {
            try {
                if (jkg.i == null) {
                    jkg.i = new jkg(context.getApplicationContext(), context.getMainLooper());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        jkg jkgVar = jkg.i;
        Object obj = ee6.c;
        fp3.n(ge6Var);
        fp3.n(he6Var);
        oof oofVar = new oof(ge6Var);
        gpf gpfVar = new gpf(he6Var);
        String str = (String) kadVar.X;
        this.a = null;
        this.Y = new Object();
        this.Z = new Object();
        this.v0 = new ArrayList();
        this.x0 = 1;
        this.D0 = null;
        this.E0 = false;
        this.F0 = null;
        this.G0 = new AtomicInteger(0);
        fp3.o(context, "Context must not be null");
        this.c = context;
        fp3.o(looper, "Looper must not be null");
        fp3.o(jkgVar, "Supervisor must not be null");
        this.o = jkgVar;
        this.X = new vfg(this, looper);
        this.A0 = i;
        this.y0 = oofVar;
        this.z0 = gpfVar;
        this.B0 = str;
        this.I0 = (Account) kadVar.a;
        Set set = (Set) kadVar.c;
        Iterator it = set.iterator();
        while (it.hasNext()) {
            if (!set.contains((Scope) it.next())) {
                throw new IllegalStateException("Expanding scopes is not permitted, use implied scopes instead");
            }
        }
        this.H0 = set;
    }

    public static /* bridge */ /* synthetic */ boolean u(a aVar, int i, int i2, IInterface iInterface) {
        synchronized (aVar.Y) {
            try {
                if (aVar.x0 != i) {
                    return false;
                }
                aVar.v(i2, iInterface);
                return true;
            } finally {
            }
        }
    }

    @Override // defpackage.ok
    public final Set a() {
        return j() ? this.H0 : Collections.emptySet();
    }

    @Override // defpackage.ok
    public final void b(String str) {
        this.a = str;
        disconnect();
    }

    @Override // defpackage.ok
    public final boolean c() {
        boolean z;
        synchronized (this.Y) {
            int i = this.x0;
            z = true;
            if (i != 2 && i != 3) {
                z = false;
            }
        }
        return z;
    }

    @Override // defpackage.ok
    public final void d() {
        if (!isConnected() || this.b == null) {
            throw new RuntimeException("Failed to connect when checking package");
        }
    }

    @Override // defpackage.ok
    public final void disconnect() {
        this.G0.incrementAndGet();
        synchronized (this.v0) {
            try {
                int size = this.v0.size();
                for (int i = 0; i < size; i++) {
                    bfg bfgVar = (bfg) this.v0.get(i);
                    synchronized (bfgVar) {
                        bfgVar.a = null;
                    }
                }
                this.v0.clear();
            } catch (Throwable th) {
                throw th;
            }
        }
        synchronized (this.Z) {
            this.s0 = null;
        }
        v(1, null);
    }

    @Override // defpackage.ok
    public final void e(ri0 ri0Var) {
        this.t0 = ri0Var;
        v(2, null);
    }

    @Override // defpackage.ok
    public final void f(y7f y7fVar) {
        ((kdg) y7fVar.b).o.x0.post(new gwe(10, y7fVar));
    }

    @Override // defpackage.ok
    public final pe5[] h() {
        vig vigVar = this.F0;
        if (vigVar == null) {
            return null;
        }
        return vigVar.b;
    }

    @Override // defpackage.ok
    public final String i() {
        return this.a;
    }

    @Override // defpackage.ok
    public final boolean isConnected() {
        boolean z;
        synchronized (this.Y) {
            z = this.x0 == 4;
        }
        return z;
    }

    @Override // defpackage.ok
    public boolean j() {
        return false;
    }

    @Override // defpackage.ok
    public final void k(dr6 dr6Var, Set set) {
        Bundle bundleN = n();
        String str = this.C0;
        int i = fe6.a;
        Scope[] scopeArr = qc6.z0;
        Bundle bundle = new Bundle();
        int i2 = this.A0;
        pe5[] pe5VarArr = qc6.A0;
        qc6 qc6Var = new qc6(6, i2, i, null, null, scopeArr, bundle, null, pe5VarArr, pe5VarArr, true, 0, false, str);
        qc6Var.o = this.c.getPackageName();
        qc6Var.Z = bundleN;
        if (set != null) {
            qc6Var.Y = (Scope[]) set.toArray(new Scope[0]);
        }
        if (j()) {
            Account account = this.I0;
            if (account == null) {
                account = new Account("<<default account>>", "com.google");
            }
            qc6Var.s0 = account;
            if (dr6Var != null) {
                qc6Var.X = dr6Var.asBinder();
            }
        }
        qc6Var.t0 = J0;
        qc6Var.u0 = m();
        if (t()) {
            qc6Var.x0 = true;
        }
        try {
            try {
                synchronized (this.Z) {
                    try {
                        ffg ffgVar = this.s0;
                        if (ffgVar != null) {
                            ffgVar.k(new tgg(this, this.G0.get()), qc6Var);
                        }
                    } finally {
                    }
                }
            } catch (RemoteException | RuntimeException unused) {
                int i3 = this.G0.get();
                xhg xhgVar = new xhg(this, 8, null, null);
                vfg vfgVar = this.X;
                vfgVar.sendMessage(vfgVar.obtainMessage(1, i3, -1, xhgVar));
            }
        } catch (DeadObjectException unused2) {
            int i4 = this.G0.get();
            vfg vfgVar2 = this.X;
            vfgVar2.sendMessage(vfgVar2.obtainMessage(6, i4, 3));
        } catch (SecurityException e) {
            throw e;
        }
    }

    public abstract IInterface l(IBinder iBinder);

    public pe5[] m() {
        return J0;
    }

    public Bundle n() {
        return new Bundle();
    }

    public final IInterface o() {
        IInterface iInterface;
        synchronized (this.Y) {
            try {
                if (this.x0 == 5) {
                    throw new DeadObjectException();
                }
                if (!isConnected()) {
                    throw new IllegalStateException("Not connected. Call connect() and wait for onConnected() to be called.");
                }
                iInterface = this.u0;
                fp3.o(iInterface, "Client is connected but service is null");
            } catch (Throwable th) {
                throw th;
            }
        }
        return iInterface;
    }

    public abstract String p();

    public abstract String q();

    public boolean r() {
        return g() >= 211700000;
    }

    public void s() {
        System.currentTimeMillis();
    }

    public boolean t() {
        return this instanceof vgg;
    }

    public final void v(int i, IInterface iInterface) {
        yx8 yx8Var;
        if ((i == 4) != (iInterface != null)) {
            throw new IllegalArgumentException();
        }
        synchronized (this.Y) {
            try {
                this.x0 = i;
                this.u0 = iInterface;
                if (i == 1) {
                    ehg ehgVar = this.w0;
                    if (ehgVar != null) {
                        jkg jkgVar = this.o;
                        String str = this.b.c;
                        fp3.n(str);
                        this.b.getClass();
                        if (this.B0 == null) {
                            this.c.getClass();
                        }
                        jkgVar.a(str, ehgVar, this.b.b);
                        this.w0 = null;
                    }
                } else if (i == 2 || i == 3) {
                    ehg ehgVar2 = this.w0;
                    if (ehgVar2 != null && (yx8Var = this.b) != null) {
                        String str2 = yx8Var.c;
                        jkg jkgVar2 = this.o;
                        fp3.n(str2);
                        this.b.getClass();
                        if (this.B0 == null) {
                            this.c.getClass();
                        }
                        jkgVar2.a(str2, ehgVar2, this.b.b);
                        this.G0.incrementAndGet();
                    }
                    ehg ehgVar3 = new ehg(this, this.G0.get());
                    this.w0 = ehgVar3;
                    String strQ = q();
                    boolean zR = r();
                    this.b = new yx8(strQ, zR, 2);
                    if (zR && g() < 17895000) {
                        throw new IllegalStateException("Internal Error, the minimum apk version of this BaseGmsClient is too low to support dynamic lookup. Start service action: ".concat(String.valueOf(this.b.c)));
                    }
                    jkg jkgVar3 = this.o;
                    String str3 = this.b.c;
                    fp3.n(str3);
                    this.b.getClass();
                    String name = this.B0;
                    if (name == null) {
                        name = this.c.getClass().getName();
                    }
                    if (!jkgVar3.b(new rjg(str3, this.b.b), ehgVar3, name)) {
                        String str4 = this.b.c;
                        int i2 = this.G0.get();
                        cig cigVar = new cig(this, 16);
                        vfg vfgVar = this.X;
                        vfgVar.sendMessage(vfgVar.obtainMessage(7, i2, -1, cigVar));
                    }
                } else if (i == 4) {
                    fp3.n(iInterface);
                    System.currentTimeMillis();
                }
            } finally {
            }
        }
    }
}
