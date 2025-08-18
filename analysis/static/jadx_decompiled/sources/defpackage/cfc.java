package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class cfc extends ffe implements a66 {
    public int X;
    public final /* synthetic */ j4d Y;
    public final /* synthetic */ dfc Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cfc(j4d j4dVar, dfc dfcVar, Continuation continuation) {
        super(2, continuation);
        this.Y = j4dVar;
        this.Z = dfcVar;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) {
        return ((cfc) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        return new cfc(this.Y, this.Z, continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00cc  */
    @Override // defpackage.gi0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object o(java.lang.Object r13) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 321
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cfc.o(java.lang.Object):java.lang.Object");
    }
}
