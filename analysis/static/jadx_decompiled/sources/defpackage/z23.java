package defpackage;

import android.os.Looper;
import android.os.Message;
import java.util.ArrayDeque;
import java.util.Objects;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class z23 {
    public Object a;
    public Object b;
    public Object c;
    public Object d;
    public Object e;
    public Object f;

    public z23(Looper looper, rhe rheVar, lm7 lm7Var) {
        this(new CopyOnWriteArraySet(), looper, rheVar, lm7Var);
    }

    public static xj8 d(u2 u2Var, zw6 zw6Var, xj8 xj8Var, gue gueVar) {
        lue lueVarO1 = u2Var.O1();
        int iB = u2Var.B();
        Object objM = lueVarO1.q() ? null : lueVarO1.m(iB);
        int iB2 = (u2Var.n() || lueVarO1.q()) ? -1 : lueVarO1.f(iB, gueVar).b(maf.D(u2Var.k()) - gueVar.f());
        for (int i = 0; i < zw6Var.size(); i++) {
            xj8 xj8Var2 = (xj8) zw6Var.get(i);
            if (g(xj8Var2, objM, u2Var.n(), u2Var.o0(), u2Var.O(), iB2)) {
                return xj8Var2;
            }
        }
        if (zw6Var.isEmpty() && xj8Var != null) {
            if (g(xj8Var, objM, u2Var.n(), u2Var.o0(), u2Var.O(), iB2)) {
                return xj8Var;
            }
        }
        return null;
    }

    public static boolean g(xj8 xj8Var, Object obj, boolean z, int i, int i2, int i3) {
        if (!xj8Var.a.equals(obj)) {
            return false;
        }
        int i4 = xj8Var.b;
        return (z && i4 == i && xj8Var.c == i2) || (!z && i4 == -1 && xj8Var.e == i3);
    }

    public void a(jn jnVar, xj8 xj8Var, lue lueVar) {
        if (xj8Var == null) {
            return;
        }
        if (lueVar.b(xj8Var.a) != -1) {
            jnVar.I(xj8Var, lueVar);
            return;
        }
        lue lueVar2 = (lue) ((cx6) this.c).get(xj8Var);
        if (lueVar2 != null) {
            jnVar.I(xj8Var, lueVar2);
        }
    }

    public m90 b() {
        String strG = ((String) this.a) == null ? " mimeType" : "";
        if (((Integer) this.b) == null) {
            strG = strG.concat(" profile");
        }
        if (((bue) this.c) == null) {
            strG = au1.g(strG, " inputTimebase");
        }
        if (((Integer) this.d) == null) {
            strG = au1.g(strG, " bitrate");
        }
        if (((Integer) this.e) == null) {
            strG = au1.g(strG, " sampleRate");
        }
        if (((Integer) this.f) == null) {
            strG = au1.g(strG, " channelCount");
        }
        if (!strG.isEmpty()) {
            throw new IllegalStateException("Missing required properties:".concat(strG));
        }
        String str = (String) this.a;
        int iIntValue = ((Integer) this.b).intValue();
        m90 m90Var = new m90(str, iIntValue, (bue) this.c, ((Integer) this.d).intValue(), ((Integer) this.e).intValue(), ((Integer) this.f).intValue());
        if (Objects.equals(str, "audio/mp4a-latm") && iIntValue == -1) {
            throw new IllegalArgumentException("Encoder mime set to AAC, but no AAC profile was provided.");
        }
        return m90Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object c(long r11, defpackage.uaa r13, kotlin.coroutines.Continuation r14) throws java.lang.Throwable {
        /*
            r10 = this;
            boolean r5 = r14 instanceof defpackage.x23
            if (r5 == 0) goto L13
            r5 = r14
            x23 r5 = (defpackage.x23) r5
            int r6 = r5.t0
            r7 = -2147483648(0xffffffff80000000, float:-0.0)
            r8 = r6 & r7
            if (r8 == 0) goto L13
            int r6 = r6 - r7
            r5.t0 = r6
            goto L18
        L13:
            x23 r5 = new x23
            r5.<init>(r10, r14)
        L18:
            java.lang.Object r4 = r5.Z
            tx3 r6 = defpackage.tx3.a
            int r7 = r5.t0
            e5f r8 = defpackage.e5f.a
            r9 = 1
            if (r7 == 0) goto L39
            if (r7 != r9) goto L31
            long r0 = r5.Y
            java.lang.Long r2 = r5.X
            z23 r3 = r5.o
            defpackage.od2.a0(r4)
            r4 = r0
            r0 = r3
            goto L92
        L31:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L39:
            defpackage.od2.a0(r4)
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r7 = "dropServerDraft "
            r4.<init>(r7)
            r4.append(r11)
            java.lang.String r4 = r4.toString()
            java.lang.Object r7 = r10.a
            java.lang.String r7 = (java.lang.String) r7
            defpackage.hm9.n(r7, r4)
            java.lang.Object r4 = r10.f
            je7 r4 = (defpackage.je7) r4
            java.lang.Object r4 = r4.getValue()
            y7d r4 = (defpackage.y7d) r4
            qyc r4 = (defpackage.qyc) r4
            boolean r4 = r4.u()
            if (r4 != 0) goto L69
            java.lang.String r0 = "Drafts sync NOT enabled. Not discard to server"
            defpackage.hm9.n(r7, r0)
            return r8
        L69:
            if (r13 == 0) goto L6e
            java.lang.Long r3 = r13.e
            goto L6f
        L6e:
            r3 = 0
        L6f:
            if (r3 != 0) goto L77
            java.lang.String r0 = "Drafts sync enabled. No old draft. Not discard to server"
            defpackage.hm9.n(r7, r0)
            return r8
        L77:
            java.lang.String r4 = "Drafts sync enabled. Discard to server"
            defpackage.hm9.n(r7, r4)
            r5.o = r10
            r5.X = r3
            r5.Y = r11
            r5.t0 = r9
            java.lang.Object r4 = r10.b
            w23 r4 = (defpackage.w23) r4
            java.lang.Object r4 = r4.a(r11, r5)
            if (r4 != r6) goto L8f
            return r6
        L8f:
            r0 = r10
            r4 = r11
            r2 = r3
        L92:
            java.lang.Object r0 = r0.e
            je7 r0 = (defpackage.je7) r0
            java.lang.Object r0 = r0.getValue()
            pk r0 = (defpackage.pk) r0
            long r6 = r2.longValue()
            k4a r0 = (defpackage.k4a) r0
            boolean r1 = r0.o(r4)
            if (r1 == 0) goto Lc4
            r1 = 0
            int r1 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r1 >= 0) goto Laf
            goto Lc4
        Laf:
            dp4 r9 = new dp4
            m7b r1 = r0.y()
            p7b r1 = (defpackage.p7b) r1
            t33 r1 = r1.a
            long r2 = r1.o()
            r1 = r9
            r1.<init>(r2, r4, r6)
            defpackage.k4a.w(r0, r9)
        Lc4:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.z23.c(long, uaa, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public void e() {
        ArrayDeque arrayDeque = (ArrayDeque) this.f;
        if (arrayDeque.isEmpty()) {
            return;
        }
        aie aieVar = (aie) this.a;
        if (!aieVar.a.hasMessages(0)) {
            aieVar.getClass();
            yhe yheVarB = aie.b();
            yheVarB.a = aieVar.a.obtainMessage(0);
            aieVar.getClass();
            Message message = yheVarB.a;
            message.getClass();
            aieVar.a.sendMessageAtFrontOfQueue(message);
            yheVarB.a();
        }
        ArrayDeque arrayDeque2 = (ArrayDeque) this.e;
        boolean z = !arrayDeque2.isEmpty();
        arrayDeque2.addAll(arrayDeque);
        arrayDeque.clear();
        if (z) {
            return;
        }
        while (!arrayDeque2.isEmpty()) {
            ((Runnable) arrayDeque2.peekFirst()).run();
            arrayDeque2.removeFirst();
        }
    }

    public Object f(long j, Continuation continuation) throws Throwable {
        Object objT0 = j47.t0(((w9a) ((kke) ((je7) this.d).getValue())).b(), new y23(this, j, null), continuation);
        return objT0 == tx3.a ? objT0 : e5f.a;
    }

    public void h(int i, jm7 jm7Var) {
        ((ArrayDeque) this.f).add(new si1(new CopyOnWriteArraySet((CopyOnWriteArraySet) this.d), i, jm7Var, 11));
    }

    public void i(int i, jm7 jm7Var) {
        h(i, jm7Var);
        e();
    }

    public void j(lue lueVar) {
        jn jnVarA = cx6.a();
        if (((zw6) this.a).isEmpty()) {
            a(jnVarA, (xj8) this.e, lueVar);
            if (!f46.B((xj8) this.f, (xj8) this.e)) {
                a(jnVarA, (xj8) this.f, lueVar);
            }
            if (!f46.B((xj8) this.d, (xj8) this.e) && !f46.B((xj8) this.d, (xj8) this.f)) {
                a(jnVarA, (xj8) this.d, lueVar);
            }
        } else {
            for (int i = 0; i < ((zw6) this.a).size(); i++) {
                a(jnVarA, (xj8) ((zw6) this.a).get(i), lueVar);
            }
            if (!((zw6) this.a).contains((xj8) this.d)) {
                a(jnVarA, (xj8) this.d, lueVar);
            }
        }
        this.c = jnVarA.j();
    }

    public z23(CopyOnWriteArraySet copyOnWriteArraySet, Looper looper, rhe rheVar, lm7 lm7Var) {
        this.b = rheVar;
        this.d = copyOnWriteArraySet;
        this.c = lm7Var;
        this.e = new ArrayDeque();
        this.f = new ArrayDeque();
        this.a = rheVar.a(looper, new hl4(3, this));
    }
}
