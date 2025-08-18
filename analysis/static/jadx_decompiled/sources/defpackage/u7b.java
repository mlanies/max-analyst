package defpackage;

import java.util.Arrays;
import java.util.Map;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes2.dex */
public final class u7b implements qu7 {
    public final vxd X;
    public final je7 a;
    public final je7 b;
    public final je7 c;
    public final ConcurrentHashMap o = new ConcurrentHashMap();

    public u7b(je7 je7Var, je7 je7Var2, khe kheVar, kke kkeVar, o45 o45Var) {
        this.a = je7Var;
        this.b = je7Var2;
        this.c = kheVar;
        this.X = j47.T(j1e.a(((w9a) kkeVar).a().limitedParallelism(1, "presences").plus(new qj(o45Var))), null, null, new t7b(this, null), 3);
    }

    @Override // defpackage.qu7
    public final void a() {
        this.X.cancel((CancellationException) null);
    }

    public final r7b b(long j) {
        ti9 ti9Var;
        r7b r7bVar;
        boolean zG = ((el3) this.b.getValue()).g(j);
        r7b r7bVar2 = r7b.c;
        return (!zG || (ti9Var = (ti9) this.o.get(Long.valueOf(j))) == null || (r7bVar = (r7b) ti9Var.getValue()) == null) ? r7bVar2 : r7bVar;
    }

    public final ti9 c(long j) {
        return (ti9) this.o.computeIfAbsent(Long.valueOf(j), new di(17, new ww9(18)));
    }

    public final us d() {
        ConcurrentHashMap concurrentHashMap = this.o;
        us usVar = new us(concurrentHashMap.size());
        for (Map.Entry entry : concurrentHashMap.entrySet()) {
            long jLongValue = ((Number) entry.getKey()).longValue();
            r7b r7bVar = (r7b) ((ti9) entry.getValue()).getValue();
            if (r7bVar != null) {
                usVar.put(Long.valueOf(jLongValue), r7bVar);
            }
        }
        return usVar;
    }

    public final boolean e(long j) {
        r7b r7bVar;
        if (!((el3) this.b.getValue()).g(j)) {
            return false;
        }
        ti9 ti9Var = (ti9) this.o.get(Long.valueOf(j));
        if (ti9Var == null || (r7bVar = (r7b) ti9Var.getValue()) == null) {
            r7bVar = r7b.c;
        }
        int i = r7bVar.a;
        return i == 40 || i == 10 || i == 20;
    }

    public final void f(long j, r7b r7bVar) {
        Object value;
        Object value2;
        r7b r7bVar2 = (r7b) c(j).getValue();
        if (r7bVar2 == null || r7bVar2.b <= r7bVar.b) {
            ti9 ti9VarC = c(j);
            do {
                value = ti9VarC.getValue();
            } while (!ti9VarC.c(value, r7bVar));
        } else {
            ti9 ti9VarC2 = c(j);
            do {
                value2 = ti9VarC2.getValue();
            } while (!ti9VarC2.c(value2, new r7b(r7bVar.a, r7bVar2.b)));
        }
        if (((el3) this.b.getValue()).e) {
            uj3 uj3VarI = ((el3) this.b.getValue()).i(j, false);
            if (uj3VarI == null) {
                hm9.k0("ContactController", null, "updatePresence failure! contact not found", Arrays.copyOf(new Object[0], 0));
            } else {
                uj3VarI.a.o = r7bVar;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0049  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void g(defpackage.gi9 r15) {
        /*
            r14 = this;
            wv7 r0 = new wv7
            int r1 = r15.d
            r0.<init>(r1)
            long[] r1 = r15.b
            long[] r15 = r15.a
            int r2 = r15.length
            int r2 = r2 + (-2)
            if (r2 < 0) goto L4e
            r3 = 0
            r4 = r3
        L12:
            r5 = r15[r4]
            long r7 = ~r5
            r9 = 7
            long r7 = r7 << r9
            long r7 = r7 & r5
            r9 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r7 = r7 & r9
            int r7 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r7 == 0) goto L49
            int r7 = r4 - r2
            int r7 = ~r7
            int r7 = r7 >>> 31
            r8 = 8
            int r7 = 8 - r7
            r9 = r3
        L2c:
            if (r9 >= r7) goto L47
            r10 = 255(0xff, double:1.26E-321)
            long r10 = r10 & r5
            r12 = 128(0x80, double:6.3E-322)
            int r10 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r10 >= 0) goto L43
            int r10 = r4 << 3
            int r10 = r10 + r9
            r10 = r1[r10]
            r7b r12 = r14.b(r10)
            r0.f(r10, r12)
        L43:
            long r5 = r5 >> r8
            int r9 = r9 + 1
            goto L2c
        L47:
            if (r7 != r8) goto L4e
        L49:
            if (r4 == r2) goto L4e
            int r4 = r4 + 1
            goto L12
        L4e:
            je7 r14 = r14.a
            java.lang.Object r14 = r14.getValue()
            c34 r14 = (defpackage.c34) r14
            k24 r14 = (defpackage.k24) r14
            glc r14 = r14.d
            java.lang.Object r15 = r14.b
            jlc r15 = (defpackage.jlc) r15
            ilc r15 = r15.m()
            ru.ok.tamtam.android.db.room.OneMeRoomDatabase r15 = (ru.ok.tamtam.android.db.room.OneMeRoomDatabase) r15
            flc r1 = new flc
            r2 = 0
            r1.<init>(r0, r2, r14)
            r15.q(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.u7b.g(gi9):void");
    }
}
