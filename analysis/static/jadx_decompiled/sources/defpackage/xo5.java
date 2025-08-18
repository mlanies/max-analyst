package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class xo5 extends ffe implements a66 {
    public int X;
    public /* synthetic */ Object Y;
    public final /* synthetic */ on5 Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xo5(on5 on5Var, Continuation continuation) {
        super(2, continuation);
        this.Z = on5Var;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) {
        return ((xo5) n(new i42(((i42) obj).a), (Continuation) obj2)).o(e5f.a);
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        xo5 xo5Var = new xo5(this.Z, continuation);
        xo5Var.Y = obj;
        return xo5Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0041  */
    @Override // defpackage.gi0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object o(java.lang.Object r4) throws java.lang.Throwable {
        /*
            r3 = this;
            tx3 r0 = defpackage.tx3.a
            int r1 = r3.X
            r2 = 1
            if (r1 == 0) goto L17
            if (r1 != r2) goto Lf
            java.lang.Object r3 = r3.Y
            defpackage.od2.a0(r4)
            goto L32
        Lf:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            r3.<init>(r4)
            throw r3
        L17:
            defpackage.od2.a0(r4)
            java.lang.Object r4 = r3.Y
            i42 r4 = (defpackage.i42) r4
            java.lang.Object r4 = r4.a
            boolean r1 = r4 instanceof defpackage.h42
            if (r1 != 0) goto L33
            r3.Y = r4
            r3.X = r2
            on5 r1 = r3.Z
            java.lang.Object r3 = r1.a(r4, r3)
            if (r3 != r0) goto L31
            return r0
        L31:
            r3 = r4
        L32:
            r4 = r3
        L33:
            boolean r3 = r4 instanceof defpackage.g42
            if (r3 == 0) goto L41
            java.lang.Throwable r3 = defpackage.i42.a(r4)
            if (r3 != 0) goto L40
            java.lang.Boolean r3 = java.lang.Boolean.FALSE
            return r3
        L40:
            throw r3
        L41:
            java.lang.Boolean r3 = java.lang.Boolean.TRUE
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xo5.o(java.lang.Object):java.lang.Object");
    }
}
