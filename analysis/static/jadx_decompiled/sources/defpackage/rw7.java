package defpackage;

import kotlin.coroutines.Continuation;
import one.me.android.MainActivity;

/* loaded from: classes.dex */
public final class rw7 extends ffe implements a66 {
    public final /* synthetic */ MainActivity X;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rw7(MainActivity mainActivity, Continuation continuation) {
        super(2, continuation);
        this.X = mainActivity;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        rw7 rw7Var = (rw7) n((ut7) obj, (Continuation) obj2);
        e5f e5fVar = e5f.a;
        rw7Var.o(e5fVar);
        return e5fVar;
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        return new rw7(this.X, continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x00ca  */
    @Override // defpackage.gi0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object o(java.lang.Object r20) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 473
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rw7.o(java.lang.Object):java.lang.Object");
    }
}
