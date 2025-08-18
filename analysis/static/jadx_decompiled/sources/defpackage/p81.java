package defpackage;

import kotlin.coroutines.Continuation;
import one.me.calllist.ui.CallHistoryScreen;

/* loaded from: classes.dex */
public final class p81 extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ CallHistoryScreen Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p81(Continuation continuation, CallHistoryScreen callHistoryScreen) {
        super(2, continuation);
        this.Y = callHistoryScreen;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        p81 p81Var = (p81) n(obj, (Continuation) obj2);
        e5f e5fVar = e5f.a;
        p81Var.o(e5fVar);
        return e5fVar;
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        p81 p81Var = new p81(continuation, this.Y);
        p81Var.X = obj;
        return p81Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0191  */
    /* JADX WARN: Type inference failed for: r12v11 */
    /* JADX WARN: Type inference failed for: r12v2 */
    /* JADX WARN: Type inference failed for: r12v3 */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v3, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r7v15 */
    /* JADX WARN: Type inference failed for: r7v16 */
    /* JADX WARN: Type inference failed for: r7v3 */
    /* JADX WARN: Type inference failed for: r7v7 */
    /* JADX WARN: Type inference failed for: r9v3, types: [aba, android.view.View, androidx.constraintlayout.widget.ConstraintLayout] */
    @Override // defpackage.gi0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object o(java.lang.Object r18) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 408
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.p81.o(java.lang.Object):java.lang.Object");
    }
}
