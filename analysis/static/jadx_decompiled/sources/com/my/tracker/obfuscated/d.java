package com.my.tracker.obfuscated;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;
import defpackage.b9b;
import defpackage.er0;
import defpackage.gpf;
import defpackage.id0;
import defpackage.j1e;
import defpackage.mp;
import defpackage.np8;
import defpackage.oq9;
import defpackage.pe5;
import defpackage.tjg;
import defpackage.ukg;
import defpackage.xne;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class d {
    private final AtomicReference a = new AtomicReference();
    protected boolean b = false;

    public static final class a {
        public static final boolean a;

        /* JADX WARN: Removed duplicated region for block: B:15:0x002a  */
        static {
            /*
                java.lang.Class<mp> r0 = defpackage.mp.class
                java.lang.Class<lp> r1 = defpackage.lp.class
                java.lang.Class<kp> r2 = defpackage.kp.class
                boolean r2 = r2.equals(r2)     // Catch: java.lang.Throwable -> L1a
                if (r2 == 0) goto L2a
                boolean r1 = r1.equals(r1)     // Catch: java.lang.Throwable -> L1a
                if (r1 == 0) goto L2a
                boolean r0 = r0.equals(r0)     // Catch: java.lang.Throwable -> L1a
                if (r0 == 0) goto L2a
                r0 = 1
                goto L2b
            L1a:
                r0 = move-exception
                boolean r1 = r0 instanceof java.lang.NoClassDefFoundError
                if (r1 == 0) goto L25
                java.lang.String r0 = "AppSetIdProvider: App Set library classes not found"
                com.my.tracker.obfuscated.y0.a(r0)
                goto L2a
            L25:
                java.lang.String r1 = "AppSetIdProvider: error occurred while working with App Set library classes"
                com.my.tracker.obfuscated.y0.a(r1, r0)
            L2a:
                r0 = 0
            L2b:
                com.my.tracker.obfuscated.d.a.a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.my.tracker.obfuscated.d.a.<clinit>():void");
        }
    }

    private void b(Context context) {
        ukg ukgVarQ;
        p0 p0VarA = p0.a(context);
        String strC = p0VarA.c();
        int iD = p0VarA.d();
        if (!TextUtils.isEmpty(strC)) {
            this.a.set(new c(strC, iD));
        }
        if (!a.a) {
            y0.a("AppSetIdProvider: app set library is not available");
            return;
        }
        Executor executorA = h.a();
        if (executorA == null) {
            y0.b("AppSetIdProvider: background executor is not found");
            return;
        }
        try {
            b9b b9bVar = new b9b(context, 17);
            tjg tjgVar = (tjg) b9bVar.b;
            if (tjgVar.w0.b(tjgVar.v0, 212800000) == 0) {
                er0 er0Var = new er0();
                er0Var.e = new pe5[]{np8.f};
                er0Var.d = new oq9(tjgVar);
                er0Var.c = false;
                er0Var.b = 27601;
                ukgVarQ = tjgVar.c(0, er0Var.a());
            } else {
                ukgVarQ = j1e.q(new ApiException(new Status(17, null, null, null)));
            }
            gpf gpfVar = new gpf(b9bVar);
            ukgVarQ.getClass();
            ukgVarQ.k(xne.a, gpfVar).d(executorA, new id0(this, iD, p0VarA, strC));
        } catch (Throwable th) {
            y0.a("AppSetIdProvider: error occurred while trying to access app set id info", th);
        }
        a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(int i, p0 p0Var, String str, mp mpVar) {
        int i2 = mpVar.b;
        if (i2 != i) {
            p0Var.a(i2);
        }
        String str2 = mpVar.a;
        if (!str2.equals(str)) {
            p0Var.f(str2);
            y0.a("AppSetIdProvider: new id value has been received: ".concat(str2));
        }
        if (TextUtils.isEmpty(str2) || i2 == -1) {
            this.a.set(null);
        } else {
            this.a.set(new c(str2, i2));
        }
        synchronized (this.a) {
            this.a.notify();
        }
    }

    public c a(Context context) {
        if (!this.b) {
            b(context);
            this.b = true;
        }
        return (c) this.a.get();
    }

    private void a() {
        try {
            c cVar = (c) this.a.get();
            if (cVar != null) {
                y0.a("AppSetIdProvider: app set id has been collected, value: " + cVar.a);
            } else {
                synchronized (this.a) {
                    this.a.wait(300L);
                }
                y0.a("AppSetIdProvider: timeout for collecting id has exceeded");
            }
        } catch (Throwable th) {
            y0.a("AppSetIdProvider: attempt to block thread retrieving app set id finished unsuccessfully", th);
        }
    }
}
