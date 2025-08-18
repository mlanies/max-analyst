package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class rv2 extends ffe implements a66 {
    public List X;
    public gw2 Y;
    public Collection Z;
    public Iterator s0;
    public List t0;
    public Collection u0;
    public int v0;
    public /* synthetic */ Object w0;
    public final /* synthetic */ gw2 x0;
    public final /* synthetic */ boolean y0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rv2(gw2 gw2Var, boolean z, Continuation continuation) {
        super(2, continuation);
        this.x0 = gw2Var;
        this.y0 = z;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) {
        return ((rv2) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        rv2 rv2Var = new rv2(this.x0, this.y0, continuation);
        rv2Var.w0 = obj;
        return rv2Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00ea  */
    /* JADX WARN: Type inference failed for: r12v2, types: [java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r12v3 */
    /* JADX WARN: Type inference failed for: r12v5, types: [java.util.ArrayList] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:30:0x00d8 -> B:31:0x00de). Please report as a decompilation issue!!! */
    @Override // defpackage.gi0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object o(java.lang.Object r22) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 428
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rv2.o(java.lang.Object):java.lang.Object");
    }
}
