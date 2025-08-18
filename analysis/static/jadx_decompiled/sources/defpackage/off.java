package defpackage;

import java.util.List;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class off extends ffe implements a66 {
    public e52 X;
    public List Y;
    public int Z;
    public int s0;
    public int t0;
    public final /* synthetic */ List u0;
    public final /* synthetic */ rff v0;
    public final /* synthetic */ long w0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public off(List list, rff rffVar, long j, Continuation continuation) {
        super(2, continuation);
        this.u0 = list;
        this.v0 = rffVar;
        this.w0 = j;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) {
        return ((off) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        return new off(this.u0, this.v0, this.w0, continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00d1  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:32:0x00cc -> B:34:0x00cf). Please report as a decompilation issue!!! */
    @Override // defpackage.gi0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object o(java.lang.Object r13) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 231
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.off.o(java.lang.Object):java.lang.Object");
    }
}
