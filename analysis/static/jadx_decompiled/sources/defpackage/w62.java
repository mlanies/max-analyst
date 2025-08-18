package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class w62 extends ffe implements a66 {
    public int X;
    public final /* synthetic */ int Y;
    public final /* synthetic */ k72 Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w62(int i, k72 k72Var, Continuation continuation) {
        super(2, continuation);
        this.Y = i;
        this.Z = k72Var;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) {
        return ((w62) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        return new w62(this.Y, this.Z, continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00b3 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00c6  */
    @Override // defpackage.gi0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object o(java.lang.Object r9) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 268
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.w62.o(java.lang.Object):java.lang.Object");
    }
}
