package defpackage;

import java.util.Collection;
import java.util.LinkedHashSet;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class bb2 extends ffe implements a66 {
    public zb2 X;
    public int Y;
    public final /* synthetic */ zb2 Z;
    public final /* synthetic */ Collection s0;
    public final /* synthetic */ long t0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bb2(zb2 zb2Var, LinkedHashSet linkedHashSet, long j, Continuation continuation) {
        super(2, continuation);
        this.Z = zb2Var;
        this.s0 = linkedHashSet;
        this.t0 = j;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) {
        return ((bb2) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        return new bb2(this.Z, (LinkedHashSet) this.s0, this.t0, continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x006b A[RETURN] */
    @Override // defpackage.gi0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object o(java.lang.Object r13) throws java.lang.Throwable {
        /*
            r12 = this;
            tx3 r0 = defpackage.tx3.a
            int r1 = r12.Y
            r2 = 1
            zb2 r3 = r12.Z
            r4 = 3
            r5 = 2
            if (r1 == 0) goto L27
            if (r1 == r2) goto L23
            if (r1 == r5) goto L1d
            if (r1 != r4) goto L15
            defpackage.od2.a0(r13)
            goto L6c
        L15:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L1d:
            zb2 r3 = r12.X
            defpackage.od2.a0(r13)
            goto L5e
        L23:
            defpackage.od2.a0(r13)
            goto L4d
        L27:
            defpackage.od2.a0(r13)
            java.lang.String r13 = defpackage.zb2.K0
            alc r13 = r3.e()
            r12.Y = r2
            r13.getClass()
            rp4 r1 = new rp4
            long r9 = r12.t0
            java.util.Collection r6 = r12.s0
            r8 = r6
            java.util.LinkedHashSet r8 = (java.util.LinkedHashSet) r8
            r11 = 3
            r6 = r1
            r7 = r13
            r6.<init>(r7, r8, r9, r11)
            ilc r13 = r13.a
            java.lang.Object r13 = defpackage.ote.j(r13, r1, r12)
            if (r13 != r0) goto L4d
            return r0
        L4d:
            java.lang.String r13 = defpackage.zb2.K0
            alc r13 = r3.e()
            r12.X = r3
            r12.Y = r5
            java.lang.Object r13 = r13.d(r12)
            if (r13 != r0) goto L5e
            return r0
        L5e:
            java.util.List r13 = (java.util.List) r13
            r1 = 0
            r12.X = r1
            r12.Y = r4
            java.lang.Object r12 = defpackage.zb2.j(r3, r13, r2, r12)
            if (r12 != r0) goto L6c
            return r0
        L6c:
            e5f r12 = defpackage.e5f.a
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bb2.o(java.lang.Object):java.lang.Object");
    }
}
