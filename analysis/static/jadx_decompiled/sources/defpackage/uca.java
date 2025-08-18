package defpackage;

import android.os.Looper;
import java.io.File;
import java.lang.Thread;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CountDownLatch;

/* loaded from: classes2.dex */
public final class uca implements ir6 {
    public final oca a;
    public final pca b;
    public final khe e;
    public final khe f;
    public final CountDownLatch c = new CountDownLatch(1);
    public final ArrayList d = new ArrayList();
    public final String g = uca.class.getName();

    public uca(oca ocaVar, pca pcaVar) {
        this.a = ocaVar;
        this.b = pcaVar;
        final int i = 1;
        final int i2 = 0;
        this.e = new khe(new k56(this) { // from class: mca
            public final /* synthetic */ uca b;

            {
                this.b = this;
            }

            @Override // defpackage.k56
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        return j1e.a((lx3) this.b.b.d.invoke());
                    default:
                        kk5 kk5Var = (kk5) this.b.b.b.getValue();
                        kk5Var.getClass();
                        return new su7(kk5.g(kk5Var.b(), "upload").getAbsolutePath());
                }
            }
        });
        this.f = new khe(new k56(this) { // from class: mca
            public final /* synthetic */ uca b;

            {
                this.b = this;
            }

            @Override // defpackage.k56
            public final Object invoke() {
                switch (i) {
                    case 0:
                        return j1e.a((lx3) this.b.b.d.invoke());
                    default:
                        kk5 kk5Var = (kk5) this.b.b.b.getValue();
                        kk5Var.getClass();
                        return new su7(kk5.g(kk5Var.b(), "upload").getAbsolutePath());
                }
            }
        });
        if (i()) {
            final Thread.UncaughtExceptionHandler defaultUncaughtExceptionHandler = Thread.getDefaultUncaughtExceptionHandler();
            Thread.setDefaultUncaughtExceptionHandler(new Thread.UncaughtExceptionHandler() { // from class: nca
                @Override // java.lang.Thread.UncaughtExceptionHandler
                public final void uncaughtException(Thread thread, Throwable th) throws Throwable {
                    uca ucaVar = this.a;
                    Thread.UncaughtExceptionHandler uncaughtExceptionHandler = defaultUncaughtExceptionHandler;
                    String str = ucaVar.g;
                    ir6 ir6Var = hm9.m;
                    if (ir6Var != null) {
                        ir6Var.a(us7.t0, str, "!!! APPCRASH !!!", (8 & 8) != 0 ? null : null, (8 & 16) != 0 ? null : th);
                    }
                    ucaVar.h();
                    j47.f0(hz4.a, new sca(ucaVar, null));
                    if (uncaughtExceptionHandler != null) {
                        uncaughtExceptionHandler.uncaughtException(thread, th);
                    }
                }
            });
        }
        ir6 ir6Var = hm9.m;
        zba zbaVar = ir6Var instanceof zba ? (zba) ir6Var : null;
        hm9.m = this;
        if ((c() || ocaVar != null) && zbaVar != null) {
            Iterator it = zbaVar.a.iterator();
            while (it.hasNext()) {
                os7 os7Var = (os7) it.next();
                this.b.getClass();
                String str = (String) os7Var.g.getValue();
                ThreadLocal threadLocal = os7.h;
                j(os7Var.a.a, os7Var.b, str, os7Var.c, ema.A(os7Var.a, str, os7Var.c, Long.valueOf(os7Var.e)), os7Var.f, os7Var.e);
            }
            zbaVar.a.clear();
        }
    }

    @Override // defpackage.ir6
    public final void a(us7 us7Var, String str, String str2, Object[] objArr, Throwable th) {
        if (c()) {
            super.a(us7Var, str, str2, objArr, th);
        }
    }

    @Override // defpackage.ir6
    public final boolean c() {
        pca pcaVar = this.b;
        pcaVar.getClass();
        v44 v44Var = (v44) pcaVar.c.invoke();
        v44Var.getClass();
        return v44Var != v44.DISABLED;
    }

    @Override // defpackage.ir6
    public final void d(us7 us7Var, String str, String str2, Throwable th) {
        String strValueOf;
        if (c() || this.a != null) {
            Thread threadCurrentThread = Thread.currentThread();
            if (((Looper) rse.a.getValue()).isCurrentThread()) {
                strValueOf = "ui";
            } else {
                String name = threadCurrentThread.getName();
                strValueOf = (name == null || name.length() == 0) ? String.valueOf(threadCurrentThread.getId()) : threadCurrentThread.getName();
            }
            this.b.getClass();
            ThreadLocal threadLocal = os7.h;
            String strG = ema.g(strValueOf, str);
            j(us7Var.a, str, strG, str2, ema.A(us7Var, strG, str2, Long.valueOf(System.currentTimeMillis())), th, 0L);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f(kotlin.coroutines.Continuation r11) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 574
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.uca.f(kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final ArrayList g() {
        ArrayList arrayList = this.d;
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            bi5 bi5Var = (bi5) it.next();
            d63.V(y53.M(bi5Var.c(), (File) bi5Var.i.getValue()), arrayList2);
        }
        return arrayList2;
    }

    public final synchronized void h() {
        if (i()) {
            if (this.c.getCount() == 0) {
                return;
            }
            try {
                for (qca qcaVar : this.b.a) {
                    ArrayList arrayList = this.d;
                    sx3 sx3Var = (sx3) this.e.getValue();
                    int i = qcaVar.e;
                    qec qecVar = qcaVar.b;
                    qec qecVar2 = qcaVar.c;
                    arrayList.add(new bi5(new yf3(this, 27, qcaVar), i, sx3Var, qcaVar.d, qecVar, qecVar2));
                }
            } catch (Throwable th) {
                th.printStackTrace();
            }
            this.c.countDown();
        }
    }

    public final boolean i() {
        pca pcaVar = this.b;
        pcaVar.getClass();
        v44 v44Var = (v44) pcaVar.c.invoke();
        v44Var.getClass();
        return v44Var == v44.FILE_LOGS || v44Var == v44.DEV_OPTIONS_MENU;
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x0094, code lost:
    
        if (r11 == null) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x009a, code lost:
    
        if (r11.length() != 0) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00a5, code lost:
    
        if (((defpackage.pye) defpackage.np.e.getValue()) == null) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00a7, code lost:
    
        defpackage.pye.a(r10 + ": " + r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00be, code lost:
    
        r7 = defpackage.us7.c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00c1, code lost:
    
        if (r8 < 6) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00c3, code lost:
    
        if (r13 == null) goto L86;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00cd, code lost:
    
        if (((defpackage.pye) defpackage.np.e.getValue()) == null) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00d0, code lost:
    
        if (r8 != 3) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00d2, code lost:
    
        r7 = defpackage.ts7.Z;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00d5, code lost:
    
        if (r8 != 4) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x00d7, code lost:
    
        r7 = defpackage.ts7.Y;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x00db, code lost:
    
        if (r8 != 5) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x00dd, code lost:
    
        r7 = defpackage.ts7.o;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x00e0, code lost:
    
        if (r8 != 6) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x00e2, code lost:
    
        r7 = defpackage.ts7.c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x00e6, code lost:
    
        if (r8 != 7) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x00e8, code lost:
    
        r7 = defpackage.ts7.b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x00eb, code lost:
    
        r7 = defpackage.ts7.X;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x00ed, code lost:
    
        defpackage.pye.b(r7.a, r13, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x00f2, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:?, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void j(int r8, java.lang.String r9, java.lang.String r10, java.lang.String r11, java.lang.String r12, java.lang.Throwable r13, long r14) {
        /*
            Method dump skipped, instructions count: 243
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.uca.j(int, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Throwable, long):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object k(kotlin.coroutines.Continuation r7) throws java.lang.Throwable {
        /*
            r6 = this;
            boolean r0 = r7 instanceof defpackage.tca
            if (r0 == 0) goto L13
            r0 = r7
            tca r0 = (defpackage.tca) r0
            int r1 = r0.Z
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.Z = r1
            goto L18
        L13:
            tca r0 = new tca
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.X
            tx3 r1 = defpackage.tx3.a
            int r2 = r0.Z
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            java.util.Iterator r6 = r0.o
            defpackage.od2.a0(r7)
            goto L4c
        L29:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L31:
            defpackage.od2.a0(r7)
            boolean r7 = r6.i()
            if (r7 != 0) goto L3d
            java.lang.Boolean r6 = java.lang.Boolean.FALSE
            return r6
        L3d:
            java.util.concurrent.CountDownLatch r7 = r6.c     // Catch: java.lang.InterruptedException -> L66
            java.util.concurrent.TimeUnit r2 = java.util.concurrent.TimeUnit.SECONDS     // Catch: java.lang.InterruptedException -> L66
            r4 = 3
            r7.await(r4, r2)     // Catch: java.lang.InterruptedException -> L66
            java.util.ArrayList r6 = r6.d
            java.util.Iterator r6 = r6.iterator()
        L4c:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto L63
            java.lang.Object r7 = r6.next()
            bi5 r7 = (defpackage.bi5) r7
            r0.o = r6
            r0.Z = r3
            java.lang.Object r7 = r7.b(r0)
            if (r7 != r1) goto L4c
            return r1
        L63:
            java.lang.Boolean r6 = java.lang.Boolean.TRUE
            return r6
        L66:
            java.lang.Boolean r6 = java.lang.Boolean.FALSE
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.uca.k(kotlin.coroutines.Continuation):java.lang.Object");
    }
}
