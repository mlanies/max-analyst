package defpackage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import kotlinx.coroutines.internal.ContextScope;

/* loaded from: classes.dex */
public final class fl2 {
    public final Object a;
    public final Object b;
    public final Object c;
    public final Object d;
    public final Object e;
    public final Object f;
    public final Object g;
    public final Object h;
    public final Object i;
    public Object j;

    public fl2(a4c a4cVar) {
        this.a = a4cVar;
        this.b = new lh4(0);
        this.c = new lh4(0);
        this.d = new lh4(0);
        this.e = new lh4(0);
        this.f = new lh4(0);
        this.g = new HashMap();
        this.h = new lh4(0);
        this.i = new lh4(0);
        this.j = new sy4(29);
    }

    public static long a(ArrayList arrayList, m56 m56Var) {
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Long l = (Long) m56Var.invoke((hxd) it.next());
            if (l != null) {
                arrayList2.add(l);
            }
        }
        ArrayList arrayList3 = new ArrayList();
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            Object next = it2.next();
            if (((Number) next).longValue() != -1) {
                arrayList3.add(next);
            }
        }
        Iterator it3 = arrayList3.iterator();
        long jLongValue = 0;
        while (it3.hasNext()) {
            jLongValue += ((Number) it3.next()).longValue();
        }
        return jLongValue;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object b(defpackage.fl2 r5, defpackage.fs8 r6, kotlin.coroutines.Continuation r7) {
        /*
            r5.getClass()
            boolean r0 = r7 instanceof defpackage.cl2
            if (r0 == 0) goto L16
            r0 = r7
            cl2 r0 = (defpackage.cl2) r0
            int r1 = r0.Y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.Y = r1
            goto L1b
        L16:
            cl2 r0 = new cl2
            r0.<init>(r5, r7)
        L1b:
            java.lang.Object r7 = r0.o
            tx3 r1 = defpackage.tx3.a
            int r2 = r0.Y
            r3 = 1
            if (r2 == 0) goto L32
            if (r2 != r3) goto L2a
            defpackage.od2.a0(r7)
            goto L4e
        L2a:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L32:
            defpackage.od2.a0(r7)
            java.lang.Object r7 = r5.b
            kke r7 = (defpackage.kke) r7
            w9a r7 = (defpackage.w9a) r7
            nx3 r7 = r7.b()
            dl2 r2 = new dl2
            r4 = 0
            r2.<init>(r5, r6, r4)
            r0.Y = r3
            java.lang.Object r7 = defpackage.j47.t0(r7, r2, r0)
            if (r7 != r1) goto L4e
            goto L4f
        L4e:
            r1 = r7
        L4f:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fl2.b(fl2, fs8, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public void c() {
        ((lh4) this.b).a = -1L;
        ((lh4) this.c).a = -1L;
        ((lh4) this.d).a = -1L;
        ((lh4) this.e).a = -1L;
        ((lh4) this.f).a = -1L;
        ((HashMap) this.g).clear();
        ((lh4) this.h).a = -1L;
        ((lh4) this.i).a = -1L;
    }

    public void d(int i, int i2) {
        q0e q0eVar;
        Object value;
        boolean z;
        boolean z2;
        do {
            q0eVar = (q0e) this.g;
            value = q0eVar.getValue();
            tzc tzcVar = (tzc) value;
            pzc pzcVar = tzcVar instanceof pzc ? (pzc) tzcVar : pzc.e;
            z = i2 != i;
            z2 = 1 != i;
            pzcVar.getClass();
        } while (!q0eVar.c(value, new pzc(i2, i, z, z2)));
    }

    public void e(nx8 nx8Var) {
        j47.T((ContextScope) this.c, null, null, new el2(this, nx8Var.b, nx8Var, null), 3);
    }

    public void f() {
        q0e q0eVar;
        Object value;
        q0e q0eVar2;
        Object value2;
        do {
            q0eVar = (q0e) this.h;
            value = q0eVar.getValue();
        } while (!q0eVar.c(value, null));
        do {
            q0eVar2 = (q0e) this.g;
            value2 = q0eVar2.getValue();
            tzc tzcVar = (tzc) value2;
            (tzcVar instanceof pzc ? (pzc) tzcVar : pzc.e).getClass();
        } while (!q0eVar2.c(value2, new pzc(0, 0, false, false)));
    }

    public fl2(il2 il2Var, je7 je7Var, je7 je7Var2, je7 je7Var3, kke kkeVar, qj qjVar) {
        this.a = il2Var;
        this.b = kkeVar;
        this.c = j1e.a(((w9a) kkeVar).c().getImmediate().plus(qjVar));
        this.d = je7Var;
        this.e = je7Var2;
        this.f = je7Var3;
        q0e q0eVarA = r0e.a(qzc.a);
        this.g = q0eVarA;
        this.i = new w7c(q0eVarA);
        q0e q0eVarA2 = r0e.a(null);
        this.h = q0eVarA2;
        this.j = new w7c(q0eVarA2);
    }

    public fl2() {
        this.b = mr0.l();
        this.a = mr0.l();
        this.e = mr0.l();
        this.f = mr0.l();
        this.c = mr0.l();
        this.d = mr0.l();
        this.g = mr0.l();
        this.h = mr0.l();
        this.i = mr0.l();
    }
}
