package defpackage;

import java.util.Collection;
import java.util.Set;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class xa2 extends ffe implements a66 {
    public zb2 X;
    public int Y;
    public final /* synthetic */ Collection Z;
    public final /* synthetic */ zb2 s0;
    public final /* synthetic */ long t0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xa2(Set set, zb2 zb2Var, long j, Continuation continuation) {
        super(2, continuation);
        this.Z = set;
        this.s0 = zb2Var;
        this.t0 = j;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) {
        return ((xa2) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        return new xa2((Set) this.Z, this.s0, this.t0, continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x008c A[RETURN] */
    @Override // defpackage.gi0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object o(java.lang.Object r11) throws java.lang.Throwable {
        /*
            r10 = this;
            tx3 r0 = defpackage.tx3.a
            int r1 = r10.Y
            r2 = 1
            zb2 r3 = r10.s0
            r4 = 3
            r5 = 2
            if (r1 == 0) goto L28
            if (r1 == r2) goto L24
            if (r1 == r5) goto L1e
            if (r1 != r4) goto L16
            defpackage.od2.a0(r11)
            goto L8d
        L16:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L1e:
            zb2 r3 = r10.X
            defpackage.od2.a0(r11)
            goto L7f
        L24:
            defpackage.od2.a0(r11)
            goto L6e
        L28:
            defpackage.od2.a0(r11)
            java.util.ArrayList r11 = new java.util.ArrayList
            java.util.Collection r1 = r10.Z
            r6 = 10
            int r6 = defpackage.z53.S(r1, r6)
            r11.<init>(r6)
            java.util.Iterator r1 = r1.iterator()
        L3c:
            boolean r6 = r1.hasNext()
            if (r6 == 0) goto L53
            java.lang.Object r6 = r1.next()
            java.lang.String r6 = (java.lang.String) r6
            v52 r7 = new v52
            long r8 = r10.t0
            r7.<init>(r8, r6)
            r11.add(r7)
            goto L3c
        L53:
            java.lang.String r1 = defpackage.zb2.K0
            alc r1 = r3.e()
            r10.Y = r2
            r1.getClass()
            uh r6 = new uh
            r7 = 24
            r6.<init>(r1, r7, r11)
            ilc r11 = r1.a
            java.lang.Object r11 = defpackage.ote.j(r11, r6, r10)
            if (r11 != r0) goto L6e
            return r0
        L6e:
            java.lang.String r11 = defpackage.zb2.K0
            alc r11 = r3.e()
            r10.X = r3
            r10.Y = r5
            java.lang.Object r11 = r11.d(r10)
            if (r11 != r0) goto L7f
            return r0
        L7f:
            java.util.List r11 = (java.util.List) r11
            r1 = 0
            r10.X = r1
            r10.Y = r4
            java.lang.Object r10 = defpackage.zb2.j(r3, r11, r2, r10)
            if (r10 != r0) goto L8d
            return r0
        L8d:
            e5f r10 = defpackage.e5f.a
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xa2.o(java.lang.Object):java.lang.Object");
    }
}
