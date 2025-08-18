package defpackage;

import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class nw extends ffe implements a66 {
    public e52 X;
    public bx Y;
    public Iterator Z;
    public int s0;
    public int t0;
    public int u0;
    public int v0;
    public /* synthetic */ Object w0;
    public final /* synthetic */ bx x0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nw(bx bxVar, Continuation continuation) {
        super(2, continuation);
        this.x0 = bxVar;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) {
        return ((nw) n((List) obj, (Continuation) obj2)).o(e5f.a);
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        nw nwVar = new nw(this.x0, continuation);
        nwVar.w0 = obj;
        return nwVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0127 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x015b  */
    /* JADX WARN: Type inference failed for: r10v7, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r14v6, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r3v14, types: [int] */
    /* JADX WARN: Type inference failed for: r9v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r9v10 */
    /* JADX WARN: Type inference failed for: r9v3 */
    /* JADX WARN: Type inference failed for: r9v4, types: [int] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:41:0x0128 -> B:42:0x012f). Please report as a decompilation issue!!! */
    @Override // defpackage.gi0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object o(java.lang.Object r23) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 387
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nw.o(java.lang.Object):java.lang.Object");
    }
}
