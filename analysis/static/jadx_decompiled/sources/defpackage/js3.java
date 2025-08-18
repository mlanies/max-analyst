package defpackage;

/* loaded from: classes.dex */
public final class js3 {
    public static final /* synthetic */ bc7[] j;
    public final sx3 a;
    public final j0e b;
    public final td c;
    public final je7 d;
    public final je7 e;
    public final w4d f = mqd.D();
    public final khe g = new khe(new es3(0, this));
    public final q0e h;
    public final w7c i;

    static {
        oi9 oi9Var = new oi9(js3.class, "searchJob", "getSearchJob()Lkotlinx/coroutines/Job;");
        nec.a.getClass();
        j = new bc7[]{oi9Var};
    }

    public js3(sx3 sx3Var, j0e j0eVar, td tdVar, je7 je7Var, je7 je7Var2) {
        this.a = sx3Var;
        this.b = j0eVar;
        this.c = tdVar;
        this.d = je7Var;
        this.e = je7Var2;
        q0e q0eVarA = r0e.a(dn3.d);
        this.h = q0eVarA;
        this.i = new w7c(q0eVarA);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x006e A[EDGE_INSN: B:33:0x006e->B:23:0x006e BREAK  A[LOOP:1: B:11:0x0029->B:34:?]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.util.ArrayList a(defpackage.js3 r7, java.util.List r8, java.lang.String r9) {
        /*
            r7.getClass()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r8 = r8.iterator()
        Lc:
            boolean r1 = r8.hasNext()
            if (r1 == 0) goto L75
            java.lang.Object r1 = r8.next()
            r2 = r1
            nn3 r2 = (defpackage.nn3) r2
            java.util.List r3 = r2.o
            r4 = 0
            if (r3 == 0) goto L44
            boolean r5 = r3.isEmpty()
            if (r5 == 0) goto L25
            goto L44
        L25:
            java.util.Iterator r3 = r3.iterator()
        L29:
            boolean r5 = r3.hasNext()
            if (r5 == 0) goto L44
            java.lang.Object r5 = r3.next()
            java.lang.Number r5 = (java.lang.Number) r5
            long r5 = r5.longValue()
            java.lang.String r5 = java.lang.String.valueOf(r5)
            boolean r5 = defpackage.eae.o0(r5, r9, r4)
            if (r5 == 0) goto L29
            goto L6e
        L44:
            je7 r3 = r7.e
            java.lang.Object r5 = r3.getValue()
            b0d r5 = (defpackage.b0d) r5
            java.lang.CharSequence r6 = r2.b
            java.lang.String r6 = r6.toString()
            boolean r5 = r5.h(r6, r9)
            if (r5 != 0) goto L6e
            java.lang.CharSequence r2 = r2.c
            if (r2 == 0) goto L6b
            java.lang.Object r3 = r3.getValue()
            b0d r3 = (defpackage.b0d) r3
            java.lang.String r2 = r2.toString()
            boolean r2 = r3.h(r2, r9)
            goto L6c
        L6b:
            r2 = r4
        L6c:
            if (r2 == 0) goto L6f
        L6e:
            r4 = 1
        L6f:
            if (r4 == 0) goto Lc
            r0.add(r1)
            goto Lc
        L75:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.js3.a(js3, java.util.List, java.lang.String):java.util.ArrayList");
    }

    public final void b() {
        ((ti9) this.g.getValue()).setValue(null);
        x77 x77Var = (x77) this.f.T0(this, j[0]);
        if (x77Var != null) {
            x77Var.cancel(null);
        }
        this.h.m(null, dn3.d);
    }
}
