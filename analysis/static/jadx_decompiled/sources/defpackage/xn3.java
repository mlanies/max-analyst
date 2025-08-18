package defpackage;

import java.util.Collection;
import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class xn3 extends ffe implements a66 {
    public Collection X;
    public nz4 Y;
    public int Z;
    public final /* synthetic */ yn3 s0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xn3(yn3 yn3Var, Continuation continuation) {
        super(2, continuation);
        this.s0 = yn3Var;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) {
        return ((xn3) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        return new xn3(this.s0, continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0066 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x007a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0093 A[RETURN] */
    @Override // defpackage.gi0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object o(java.lang.Object r11) throws java.lang.Throwable {
        /*
            r10 = this;
            tx3 r0 = defpackage.tx3.a
            int r1 = r10.Z
            e5f r2 = defpackage.e5f.a
            r3 = 5
            r4 = 4
            r5 = 3
            r6 = 2
            r7 = 1
            yn3 r8 = r10.s0
            if (r1 == 0) goto L40
            if (r1 == r7) goto L3c
            if (r1 == r6) goto L36
            if (r1 == r5) goto L30
            if (r1 == r4) goto L26
            if (r1 != r3) goto L1e
            defpackage.od2.a0(r11)
            goto L94
        L1e:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L26:
            nz4 r1 = r10.Y
            java.util.Collection r4 = r10.X
            java.util.List r4 = (java.util.List) r4
            defpackage.od2.a0(r11)
            goto L7e
        L30:
            java.util.Collection r1 = r10.X
            defpackage.od2.a0(r11)
            goto L6a
        L36:
            java.util.Collection r1 = r10.X
            defpackage.od2.a0(r11)
            goto L5a
        L3c:
            defpackage.od2.a0(r11)
            goto L4c
        L40:
            defpackage.od2.a0(r11)
            r10.Z = r7
            java.io.Serializable r11 = defpackage.yn3.c(r8, r10)
            if (r11 != r0) goto L4c
            return r0
        L4c:
            r1 = r11
            java.util.Collection r1 = (java.util.Collection) r1
            r10.X = r1
            r10.Z = r6
            java.io.Serializable r11 = defpackage.yn3.d(r8, r10)
            if (r11 != r0) goto L5a
            return r0
        L5a:
            java.util.Collection r11 = (java.util.Collection) r11
            r10.X = r11
            r10.Z = r5
            java.lang.Object r1 = defpackage.pag.c(r1, r10)
            if (r1 != r0) goto L67
            return r0
        L67:
            r9 = r1
            r1 = r11
            r11 = r9
        L6a:
            java.util.List r11 = (java.util.List) r11
            nz4 r5 = defpackage.nz4.a
            r10.X = r11
            r10.Y = r5
            r10.Z = r4
            java.lang.Object r1 = defpackage.pag.c(r1, r10)
            if (r1 != r0) goto L7b
            return r0
        L7b:
            r4 = r11
            r11 = r1
            r1 = r5
        L7e:
            java.util.List r11 = (java.util.List) r11
            dn3 r5 = new dn3
            r5.<init>(r4, r1, r11)
            q0e r11 = r8.k
            r1 = 0
            r10.X = r1
            r10.Y = r1
            r10.Z = r3
            r11.m(r1, r5)
            if (r2 != r0) goto L94
            return r0
        L94:
            java.util.concurrent.atomic.AtomicBoolean r10 = r8.o
            r11 = 0
            r10.set(r11)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xn3.o(java.lang.Object):java.lang.Object");
    }
}
