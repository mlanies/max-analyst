package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class ox9 extends ffe implements a66 {
    public int X;
    public int Y;
    public final /* synthetic */ long Z;
    public final /* synthetic */ qx9 s0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ox9(long j, qx9 qx9Var, Continuation continuation) {
        super(2, continuation);
        this.Z = j;
        this.s0 = qx9Var;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) {
        return ((ox9) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        return new ox9(this.Z, this.s0, continuation);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:0|2|(1:48)|(1:(1:(8:6|45|7|47|35|(1:40)|41|42)(2:13|14))(1:15))(3:21|22|(1:24))|52|26|50|27|(1:29)(6:30|47|35|(2:38|40)|41|42)|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0097, code lost:
    
        r0 = r10;
        r10 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x009b, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00b4  */
    @Override // defpackage.gi0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object o(java.lang.Object r10) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 232
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ox9.o(java.lang.Object):java.lang.Object");
    }
}
