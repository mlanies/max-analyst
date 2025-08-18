package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.internal.Segment;
import kotlinx.coroutines.internal.Symbol;

/* loaded from: classes.dex */
public final class y3d implements iy1, z3d, irf {
    public static final /* synthetic */ AtomicReferenceFieldUpdater Y = AtomicReferenceFieldUpdater.newUpdater(y3d.class, Object.class, "state$volatile");
    public final lx3 a;
    public Object c;
    private volatile /* synthetic */ Object state$volatile = b4d.a;
    public ArrayList b = new ArrayList(2);
    public int o = -1;
    public Object X = b4d.d;

    public y3d(lx3 lx3Var) {
        this.a = lx3Var;
    }

    @Override // defpackage.irf
    public final void a(Segment segment, int i) {
        this.c = segment;
        this.o = i;
    }

    @Override // defpackage.iy1
    public final void b(Throwable th) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = Y;
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj == b4d.b) {
                return;
            }
            Symbol symbol = b4d.c;
            while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, symbol)) {
                if (atomicReferenceFieldUpdater.get(this) != obj) {
                    break;
                }
            }
            ArrayList arrayList = this.b;
            if (arrayList == null) {
                return;
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((w3d) it.next()).a();
            }
            this.X = b4d.d;
            this.b = null;
            return;
        }
    }

    public final Object c(Continuation continuation) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = Y;
        w3d w3dVar = (w3d) atomicReferenceFieldUpdater.get(this);
        Object obj = this.X;
        ArrayList arrayList = this.b;
        if (arrayList != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                w3d w3dVar2 = (w3d) it.next();
                if (w3dVar2 != w3dVar) {
                    w3dVar2.a();
                }
            }
            atomicReferenceFieldUpdater.set(this, b4d.b);
            this.X = b4d.d;
            this.b = null;
        }
        Object obj2 = w3dVar.a;
        c66 c66Var = w3dVar.c;
        Object obj3 = w3dVar.d;
        Object objInvoke = c66Var.invoke(obj2, obj3, obj);
        Symbol symbol = b4d.e;
        Object obj4 = w3dVar.e;
        return obj3 == symbol ? ((m56) obj4).invoke(continuation) : ((a66) obj4).invoke(objInvoke, continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(kotlin.coroutines.Continuation r11) throws java.lang.Throwable {
        /*
            r10 = this;
            boolean r0 = r11 instanceof defpackage.x3d
            if (r0 == 0) goto L13
            r0 = r11
            x3d r0 = (defpackage.x3d) r0
            int r1 = r0.Z
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.Z = r1
            goto L18
        L13:
            x3d r0 = new x3d
            r0.<init>(r10, r11)
        L18:
            java.lang.Object r11 = r0.X
            tx3 r1 = defpackage.tx3.a
            int r2 = r0.Z
            r3 = 0
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L3b
            if (r2 == r5) goto L34
            if (r2 != r4) goto L2c
            defpackage.od2.a0(r11)
            goto Lc7
        L2c:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L34:
            y3d r10 = r0.o
            defpackage.od2.a0(r11)
            goto Lbc
        L3b:
            defpackage.od2.a0(r11)
            r0.o = r10
            r0.Z = r5
            sy1 r11 = new sy1
            kotlin.coroutines.Continuation r2 = defpackage.v3c.u(r0)
            r11.<init>(r5, r2)
            r11.n()
        L4e:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r2 = defpackage.y3d.Y
            java.lang.Object r6 = r2.get(r10)
            kotlinx.coroutines.internal.Symbol r7 = defpackage.b4d.a
            e5f r8 = defpackage.e5f.a
            if (r6 != r7) goto L6b
        L5a:
            boolean r7 = r2.compareAndSet(r10, r6, r11)
            if (r7 == 0) goto L64
            defpackage.nu0.w(r11, r10)
            goto Lb2
        L64:
            java.lang.Object r7 = r2.get(r10)
            if (r7 == r6) goto L5a
            goto L4e
        L6b:
            boolean r9 = r6 instanceof java.util.List
            if (r9 == 0) goto L99
        L6f:
            boolean r8 = r2.compareAndSet(r10, r6, r7)
            if (r8 == 0) goto L92
            java.lang.Iterable r6 = (java.lang.Iterable) r6
            java.util.Iterator r2 = r6.iterator()
        L7b:
            boolean r6 = r2.hasNext()
            if (r6 == 0) goto L4e
            java.lang.Object r6 = r2.next()
            w3d r6 = r10.e(r6)
            r6.g = r3
            r7 = -1
            r6.h = r7
            r10.f(r6, r5)
            goto L7b
        L92:
            java.lang.Object r8 = r2.get(r10)
            if (r8 == r6) goto L6f
            goto L4e
        L99:
            boolean r2 = r6 instanceof defpackage.w3d
            if (r2 == 0) goto Lc8
            w3d r6 = (defpackage.w3d) r6
            java.lang.Object r2 = r10.X
            c66 r5 = r6.f
            if (r5 == 0) goto Lae
            java.lang.Object r6 = r6.d
            java.lang.Object r2 = r5.invoke(r10, r6, r2)
            c66 r2 = (defpackage.c66) r2
            goto Laf
        Lae:
            r2 = r3
        Laf:
            r11.e(r8, r2)
        Lb2:
            java.lang.Object r11 = r11.m()
            if (r11 != r1) goto Lb9
            r8 = r11
        Lb9:
            if (r8 != r1) goto Lbc
            return r1
        Lbc:
            r0.o = r3
            r0.Z = r4
            java.lang.Object r11 = r10.c(r0)
            if (r11 != r1) goto Lc7
            return r1
        Lc7:
            return r11
        Lc8:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            java.lang.String r0 = "unexpected state: "
            r11.<init>(r0)
            r11.append(r6)
            java.lang.String r11 = r11.toString()
            java.lang.String r11 = r11.toString()
            r10.<init>(r11)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.y3d.d(kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final w3d e(Object obj) {
        ArrayList arrayList = this.b;
        Object obj2 = null;
        if (arrayList == null) {
            return null;
        }
        Iterator it = arrayList.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            if (((w3d) next).a == obj) {
                obj2 = next;
                break;
            }
        }
        w3d w3dVar = (w3d) obj2;
        if (w3dVar != null) {
            return w3dVar;
        }
        throw new IllegalStateException(("Clause with object " + obj + " is not found").toString());
    }

    public final void f(w3d w3dVar, boolean z) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = Y;
        if (atomicReferenceFieldUpdater.get(this) instanceof w3d) {
            return;
        }
        Object obj = w3dVar.a;
        if (!z) {
            ArrayList arrayList = this.b;
            if (!(arrayList instanceof Collection) || !arrayList.isEmpty()) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    if (((w3d) it.next()).a == obj) {
                        throw new IllegalStateException(("Cannot use select clauses on the same object: " + obj).toString());
                    }
                }
            }
        }
        w3dVar.b.invoke(obj, this, w3dVar.d);
        if (this.X != b4d.d) {
            atomicReferenceFieldUpdater.set(this, w3dVar);
            return;
        }
        if (!z) {
            this.b.add(w3dVar);
        }
        w3dVar.g = this.c;
        w3dVar.h = this.o;
        this.c = null;
        this.o = -1;
    }

    public final boolean g(Object obj, Object obj2) {
        return h(obj, obj2) == 0;
    }

    public final int h(Object obj, Object obj2) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = Y;
            Object obj3 = atomicReferenceFieldUpdater.get(this);
            if (!(obj3 instanceof ry1)) {
                if (tpa.f(obj3, b4d.b) || (obj3 instanceof w3d)) {
                    return 3;
                }
                if (tpa.f(obj3, b4d.c)) {
                    return 2;
                }
                if (tpa.f(obj3, b4d.a)) {
                    List listSingletonList = Collections.singletonList(obj);
                    while (!atomicReferenceFieldUpdater.compareAndSet(this, obj3, listSingletonList)) {
                        if (atomicReferenceFieldUpdater.get(this) != obj3) {
                            break;
                        }
                    }
                    return 1;
                }
                if (!(obj3 instanceof List)) {
                    throw new IllegalStateException(("Unexpected state: " + obj3).toString());
                }
                ArrayList arrayListU0 = x53.u0((Collection) obj3, obj);
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj3, arrayListU0)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj3) {
                        break;
                    }
                }
                return 1;
            }
            w3d w3dVarE = e(obj);
            if (w3dVarE != null) {
                c66 c66Var = w3dVarE.f;
                c66 c66Var2 = c66Var != null ? (c66) c66Var.invoke(this, w3dVarE.d, obj2) : null;
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj3, w3dVarE)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj3) {
                        break;
                    }
                }
                ry1 ry1Var = (ry1) obj3;
                this.X = obj2;
                Symbol symbol = b4d.a;
                Symbol symbolL = ry1Var.l(e5f.a, c66Var2);
                if (symbolL == null) {
                    this.X = b4d.d;
                    return 2;
                }
                ry1Var.q(symbolL);
                return 0;
            }
            continue;
        }
    }
}
