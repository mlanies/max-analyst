package defpackage;

import android.net.Uri;
import androidx.media3.common.PriorityTaskManager$PriorityTooLowException;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public abstract class a3d implements zo4 {
    public final a34 a;
    public final zpa b;
    public final ArrayList c;
    public final mw0 d;
    public final gw0 e;
    public final xw0 f;
    public final Executor g;
    public final long h;
    public final ArrayList i;
    public volatile boolean j;

    public a3d(tb8 tb8Var, zpa zpaVar, mw0 mw0Var, Executor executor) {
        tb8Var.b.getClass();
        ib8 ib8Var = tb8Var.b;
        this.a = d(ib8Var.a);
        this.b = zpaVar;
        this.c = new ArrayList(ib8Var.e);
        this.d = mw0Var;
        this.g = executor;
        gw0 gw0Var = mw0Var.a;
        gw0Var.getClass();
        this.e = gw0Var;
        this.f = xw0.c;
        this.i = new ArrayList();
        this.h = oaf.S(20000L);
    }

    public static a34 d(Uri uri) {
        Map mapEmptyMap = Collections.emptyMap();
        fm9.m(uri, "The uri must be set.");
        return new a34(uri, 0L, 1, null, mapEmptyMap, 0L, -1L, null, 1, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x00a4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void f(java.util.List r20, defpackage.xw0 r21, long r22) {
        /*
            r0 = r20
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>()
            r2 = 0
            r3 = r2
        L9:
            int r4 = r20.size()
            if (r2 >= r4) goto Lc0
            java.lang.Object r4 = r0.get(r2)
            y2d r4 = (defpackage.y2d) r4
            a34 r5 = r4.b
            r6 = r21
            java.lang.String r5 = r6.e(r5)
            java.lang.Object r7 = r1.get(r5)
            java.lang.Integer r7 = (java.lang.Integer) r7
            if (r7 != 0) goto L27
            r8 = 0
            goto L31
        L27:
            int r8 = r7.intValue()
            java.lang.Object r8 = r0.get(r8)
            y2d r8 = (defpackage.y2d) r8
        L31:
            if (r8 == 0) goto La4
            long r9 = r8.a
            long r11 = r9 + r22
            long r13 = r4.a
            int r11 = (r13 > r11 ? 1 : (r13 == r11 ? 0 : -1))
            if (r11 > 0) goto La4
            a34 r8 = r8.b
            android.net.Uri r11 = r8.a
            a34 r12 = r4.b
            android.net.Uri r13 = r12.a
            boolean r11 = r11.equals(r13)
            if (r11 == 0) goto La4
            long r13 = r8.g
            r15 = -1
            int r11 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r11 == 0) goto La4
            r11 = r1
            r17 = r2
            long r1 = r8.f
            long r1 = r1 + r13
            r18 = r4
            r19 = r5
            long r4 = r12.f
            int r1 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r1 != 0) goto Lab
            java.lang.String r1 = r8.h
            java.lang.String r2 = r12.h
            boolean r1 = defpackage.oaf.a(r1, r2)
            if (r1 == 0) goto Lab
            int r1 = r8.i
            int r2 = r12.i
            if (r1 != r2) goto Lab
            int r1 = r8.c
            int r2 = r12.c
            if (r1 != r2) goto Lab
            java.util.Map r1 = r8.e
            java.util.Map r2 = r12.e
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto Lab
            long r1 = r12.g
            int r4 = (r1 > r15 ? 1 : (r1 == r15 ? 0 : -1))
            if (r4 != 0) goto L8b
        L89:
            r1 = r15
            goto L8e
        L8b:
            long r15 = r13 + r1
            goto L89
        L8e:
            r4 = 0
            a34 r1 = r8.c(r4, r1)
            r7.getClass()
            int r2 = r7.intValue()
            y2d r4 = new y2d
            r4.<init>(r9, r1)
            r0.set(r2, r4)
            goto Lbb
        La4:
            r11 = r1
            r17 = r2
            r18 = r4
            r19 = r5
        Lab:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r3)
            r2 = r19
            r11.put(r2, r1)
            r4 = r18
            r0.set(r3, r4)
            int r3 = r3 + 1
        Lbb:
            int r2 = r17 + 1
            r1 = r11
            goto L9
        Lc0:
            int r1 = r20.size()
            defpackage.oaf.X(r0, r3, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.a3d.f(java.util.List, xw0, long):void");
    }

    @Override // defpackage.zo4
    public final void a(yo4 yo4Var) {
        ow0 ow0VarC;
        byte[] bArr;
        ArrayDeque arrayDeque;
        ArrayDeque arrayDeque2 = new ArrayDeque();
        ArrayDeque arrayDeque3 = new ArrayDeque();
        try {
            ow0 ow0VarC2 = this.d.c();
            ok5 ok5Var = (ok5) c(new w2d(this, ow0VarC2, this.a), false);
            if (!this.c.isEmpty()) {
                ok5Var = (ok5) ok5Var.a(this.c);
            }
            ArrayList arrayListE = e(ow0VarC2, ok5Var, false);
            Collections.sort(arrayListE);
            f(arrayListE, this.f, this.h);
            int size = arrayListE.size();
            int size2 = arrayListE.size() - 1;
            int i = 0;
            long j = 0;
            long j2 = 0;
            while (size2 >= 0) {
                a34 a34Var = ((y2d) arrayListE.get(size2)).b;
                String strE = this.f.e(a34Var);
                long j3 = a34Var.g;
                if (j3 == -1) {
                    long jA = dt3.a(((spd) this.e).i(strE));
                    if (jA != -1) {
                        j3 = jA - a34Var.f;
                    }
                }
                ArrayDeque arrayDeque4 = arrayDeque3;
                long jG = ((spd) this.e).g(a34Var.f, strE, j3);
                j2 += jG;
                if (j3 != -1) {
                    if (j3 == jG) {
                        i++;
                        arrayListE.remove(size2);
                    }
                    if (j != -1) {
                        j += j3;
                    }
                } else {
                    j = -1;
                }
                size2--;
                arrayDeque3 = arrayDeque4;
            }
            ArrayDeque arrayDeque5 = arrayDeque3;
            x2d x2dVar = yo4Var != null ? new x2d(yo4Var, j, size, j2, i) : null;
            arrayDeque2.addAll(arrayListE);
            while (!this.j && !arrayDeque2.isEmpty()) {
                if (arrayDeque5.isEmpty()) {
                    ow0VarC = this.d.c();
                    bArr = new byte[131072];
                } else {
                    z2d z2dVar = (z2d) arrayDeque5.removeFirst();
                    ow0VarC = z2dVar.t0;
                    bArr = z2dVar.v0;
                }
                z2d z2dVar2 = new z2d((y2d) arrayDeque2.removeFirst(), ow0VarC, x2dVar, bArr);
                b(z2dVar2);
                this.g.execute(z2dVar2);
                int size3 = this.i.size() - 1;
                while (size3 >= 0) {
                    z2d z2dVar3 = (z2d) this.i.get(size3);
                    if (arrayDeque2.isEmpty() || z2dVar3.b.e()) {
                        try {
                            z2dVar3.get();
                            g(size3);
                            arrayDeque = arrayDeque5;
                            try {
                                arrayDeque.addLast(z2dVar3);
                            } catch (ExecutionException e) {
                                e = e;
                                Throwable cause = e.getCause();
                                cause.getClass();
                                if (!(cause instanceof PriorityTaskManager$PriorityTooLowException)) {
                                    if (!(cause instanceof IOException)) {
                                        throw cause;
                                    }
                                    throw ((IOException) cause);
                                }
                                arrayDeque2.addFirst(z2dVar3.s0);
                                g(size3);
                                arrayDeque.addLast(z2dVar3);
                                size3--;
                                arrayDeque5 = arrayDeque;
                            }
                        } catch (ExecutionException e2) {
                            e = e2;
                            arrayDeque = arrayDeque5;
                        }
                    } else {
                        arrayDeque = arrayDeque5;
                    }
                    size3--;
                    arrayDeque5 = arrayDeque;
                }
                ArrayDeque arrayDeque6 = arrayDeque5;
                z2dVar2.a.b();
                arrayDeque5 = arrayDeque6;
            }
            for (int i2 = 0; i2 < this.i.size(); i2++) {
                ((ppc) this.i.get(i2)).cancel(true);
            }
            for (int size4 = this.i.size() - 1; size4 >= 0; size4--) {
                ((ppc) this.i.get(size4)).a();
                g(size4);
            }
        } catch (Throwable th) {
            for (int i3 = 0; i3 < this.i.size(); i3++) {
                ((ppc) this.i.get(i3)).cancel(true);
            }
            for (int size5 = this.i.size() - 1; size5 >= 0; size5--) {
                ((ppc) this.i.get(size5)).a();
                g(size5);
            }
            throw th;
        }
    }

    public final void b(ppc ppcVar) {
        synchronized (this.i) {
            try {
                if (this.j) {
                    throw new InterruptedException();
                }
                this.i.add(ppcVar);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final Object c(ppc ppcVar, boolean z) throws ExecutionException, InterruptedException, IOException {
        if (z) {
            ppcVar.run();
            try {
                return ppcVar.get();
            } catch (ExecutionException e) {
                Throwable cause = e.getCause();
                cause.getClass();
                if (cause instanceof IOException) {
                    throw ((IOException) cause);
                }
                int i = oaf.a;
                throw e;
            }
        }
        while (!this.j) {
            b(ppcVar);
            this.g.execute(ppcVar);
            try {
                return ppcVar.get();
            } catch (ExecutionException e2) {
                Throwable cause2 = e2.getCause();
                cause2.getClass();
                if (!(cause2 instanceof PriorityTaskManager$PriorityTooLowException)) {
                    if (cause2 instanceof IOException) {
                        throw ((IOException) cause2);
                    }
                    int i2 = oaf.a;
                    throw e2;
                }
            } finally {
                ppcVar.a();
                h(ppcVar);
            }
        }
        throw new InterruptedException();
    }

    @Override // defpackage.zo4
    public final void cancel() {
        synchronized (this.i) {
            try {
                this.j = true;
                for (int i = 0; i < this.i.size(); i++) {
                    ((ppc) this.i.get(i)).cancel(true);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public abstract ArrayList e(ow0 ow0Var, ok5 ok5Var, boolean z);

    public final void g(int i) {
        synchronized (this.i) {
            this.i.remove(i);
        }
    }

    public final void h(ppc ppcVar) {
        synchronized (this.i) {
            this.i.remove(ppcVar);
        }
    }

    @Override // defpackage.zo4
    public final void remove() {
        xw0 xw0Var = this.f;
        gw0 gw0Var = this.e;
        a34 a34Var = this.a;
        mw0 mw0Var = this.d;
        ow0 ow0VarD = mw0Var.d(null, mw0Var.e | 1, -4000);
        try {
            try {
                ArrayList arrayListE = e(ow0VarD, (ok5) c(new w2d(this, ow0VarD, a34Var), true), true);
                for (int i = 0; i < arrayListE.size(); i++) {
                    ((spd) gw0Var).l(xw0Var.e(((y2d) arrayListE.get(i)).b));
                }
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            } catch (Exception unused2) {
            }
        } finally {
            ((spd) gw0Var).l(xw0Var.e(a34Var));
        }
    }
}
