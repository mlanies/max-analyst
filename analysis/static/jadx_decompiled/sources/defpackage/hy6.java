package defpackage;

import java.util.concurrent.ConcurrentHashMap;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class hy6 extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ u76 Y;
    public final /* synthetic */ fz6 Z;
    public final /* synthetic */ zme s0;
    public final /* synthetic */ ConcurrentHashMap t0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hy6(u76 u76Var, fz6 fz6Var, zme zmeVar, ConcurrentHashMap concurrentHashMap, Continuation continuation) {
        super(2, continuation);
        this.Y = u76Var;
        this.Z = fz6Var;
        this.s0 = zmeVar;
        this.t0 = concurrentHashMap;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        hy6 hy6Var = (hy6) n((sx3) obj, (Continuation) obj2);
        e5f e5fVar = e5f.a;
        hy6Var.o(e5fVar);
        return e5fVar;
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        hy6 hy6Var = new hy6(this.Y, this.Z, this.s0, this.t0, continuation);
        hy6Var.X = obj;
        return hy6Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01ab A[Catch: all -> 0x009a, TryCatch #0 {all -> 0x009a, blocks: (B:5:0x002e, B:8:0x003c, B:11:0x0047, B:14:0x0052, B:17:0x005d, B:20:0x0068, B:24:0x007d, B:26:0x0083, B:32:0x009e, B:34:0x00a4, B:36:0x00aa, B:38:0x00c2, B:41:0x00d0, B:43:0x00d6, B:45:0x00e7, B:51:0x00fc, B:53:0x010c, B:60:0x0126, B:61:0x012a, B:64:0x013f, B:66:0x0149, B:68:0x0166, B:70:0x016e, B:74:0x0179, B:75:0x0196, B:77:0x01ab, B:83:0x01cc, B:85:0x01da, B:56:0x011b, B:48:0x00ee), top: B:94:0x002e }] */
    /* JADX WARN: Removed duplicated region for block: B:84:0x01d8  */
    /* JADX WARN: Type inference failed for: r0v16 */
    /* JADX WARN: Type inference failed for: r0v17, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r0v19 */
    @Override // defpackage.gi0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object o(java.lang.Object r38) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 546
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hy6.o(java.lang.Object):java.lang.Object");
    }
}
