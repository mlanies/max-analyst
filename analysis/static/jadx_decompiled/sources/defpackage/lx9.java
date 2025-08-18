package defpackage;

import java.util.ArrayList;
import java.util.List;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class lx9 extends ffe implements a66 {
    public qx9 X;
    public List Y;
    public int Z;
    public final /* synthetic */ qx9 s0;
    public final /* synthetic */ List t0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lx9(qx9 qx9Var, ArrayList arrayList, Continuation continuation) {
        super(2, continuation);
        this.s0 = qx9Var;
        this.t0 = arrayList;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) {
        return ((lx9) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        return new lx9(this.s0, (ArrayList) this.t0, continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x00bb A[RETURN] */
    @Override // defpackage.gi0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object o(java.lang.Object r23) throws java.lang.Throwable {
        /*
            r22 = this;
            r0 = r22
            tx3 r1 = defpackage.tx3.a
            int r2 = r0.Z
            java.util.List r3 = r0.t0
            qx9 r4 = r0.s0
            r5 = 3
            r6 = 2
            r7 = 1
            if (r2 == 0) goto L32
            if (r2 == r7) goto L2d
            if (r2 == r6) goto L22
            if (r2 != r5) goto L1a
            defpackage.od2.a0(r23)
            goto Lbc
        L1a:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L22:
            java.util.List r3 = r0.Y
            qx9 r4 = r0.X
            defpackage.od2.a0(r23)
            r2 = r23
            goto Lab
        L2d:
            defpackage.od2.a0(r23)
            goto L9e
        L32:
            defpackage.od2.a0(r23)
            java.util.ArrayList r2 = new java.util.ArrayList
            r9 = 10
            int r9 = defpackage.z53.S(r3, r9)
            r2.<init>(r9)
            java.util.Iterator r9 = r3.iterator()
        L44:
            boolean r10 = r9.hasNext()
            if (r10 == 0) goto L95
            java.lang.Object r10 = r9.next()
            ux9 r10 = (defpackage.ux9) r10
            vx9 r14 = new vx9
            boolean r11 = r10 instanceof defpackage.tx9
            if (r11 == 0) goto L5a
            r11 = r10
            tx9 r11 = (defpackage.tx9) r11
            goto L5b
        L5a:
            r11 = 0
        L5b:
            if (r11 == 0) goto L66
            boolean r11 = r11.d
            java.lang.Boolean r11 = java.lang.Boolean.valueOf(r11)
            r18 = r11
            goto L68
        L66:
            r18 = 0
        L68:
            boolean r11 = r10 instanceof defpackage.sx9
            if (r11 == 0) goto L70
            r11 = r10
            sx9 r11 = (defpackage.sx9) r11
            goto L71
        L70:
            r11 = 0
        L71:
            if (r11 == 0) goto L78
            ks4 r11 = r11.d
            r19 = r11
            goto L7a
        L78:
            r19 = 0
        L7a:
            long r12 = r10.b
            r23 = r9
            long r8 = r10.c
            long r10 = r10.a
            r15 = r10
            r11 = r14
            r20 = r12
            r12 = r15
            r10 = r14
            r14 = r20
            r16 = r8
            r11.<init>(r12, r14, r16, r18, r19)
            r2.add(r10)
            r9 = r23
            goto L44
        L95:
            r0.Z = r7
            java.lang.Object r2 = defpackage.qx9.d(r4, r2, r0)
            if (r2 != r1) goto L9e
            return r1
        L9e:
            r0.X = r4
            r0.Y = r3
            r0.Z = r6
            java.lang.Object r2 = defpackage.qx9.a(r4, r3, r0)
            if (r2 != r1) goto Lab
            return r1
        Lab:
            java.util.List r2 = (java.util.List) r2
            r6 = 0
            r0.X = r6
            r0.Y = r6
            r0.Z = r5
            r5 = 0
            java.lang.Object r0 = defpackage.qx9.c(r4, r3, r2, r5, r0)
            if (r0 != r1) goto Lbc
            return r1
        Lbc:
            e5f r0 = defpackage.e5f.a
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lx9.o(java.lang.Object):java.lang.Object");
    }
}
