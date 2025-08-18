package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class wie extends ffe implements a66 {
    public long X;
    public int Y;
    public /* synthetic */ Object Z;
    public final /* synthetic */ xie s0;
    public final /* synthetic */ boolean t0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wie(xie xieVar, boolean z, Continuation continuation) {
        super(2, continuation);
        this.s0 = xieVar;
        this.t0 = z;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) {
        return ((wie) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        wie wieVar = new wie(this.s0, this.t0, continuation);
        wieVar.Z = obj;
        return wieVar;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(15:0|2|(1:(1:(2:6|60)(2:7|8))(1:9))(2:10|(1:12))|13|14|21|(4:23|(1:28)|29|(2:31|(4:63|34|(1:36)(1:37)|38)))|39|65|40|41|(1:46)|47|(3:49|(1:57)|(1:59))|60) */
    @Override // defpackage.gi0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object o(java.lang.Object r17) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 496
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wie.o(java.lang.Object):java.lang.Object");
    }
}
