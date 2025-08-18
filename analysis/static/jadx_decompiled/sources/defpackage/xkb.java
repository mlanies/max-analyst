package defpackage;

import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class xkb extends ffe implements a66 {
    public blb X;
    public Iterator Y;
    public wgb Z;
    public int s0;
    public /* synthetic */ Object t0;
    public final /* synthetic */ blb u0;
    public final /* synthetic */ je7 v0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xkb(blb blbVar, je7 je7Var, Continuation continuation) {
        super(2, continuation);
        this.u0 = blbVar;
        this.v0 = je7Var;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) {
        return ((xkb) n((List) obj, (Continuation) obj2)).o(e5f.a);
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        xkb xkbVar = new xkb(this.u0, this.v0, continuation);
        xkbVar.t0 = obj;
        return xkbVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0156  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x0057 -> B:14:0x005a). Please report as a decompilation issue!!! */
    @Override // defpackage.gi0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object o(java.lang.Object r18) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 350
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xkb.o(java.lang.Object):java.lang.Object");
    }
}
