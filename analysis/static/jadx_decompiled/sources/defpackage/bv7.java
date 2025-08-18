package defpackage;

import java.io.File;
import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class bv7 extends ffe implements a66 {
    public /* synthetic */ Object X;

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) {
        return ((bv7) n((File) obj, (Continuation) obj2)).o(e5f.a);
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        bv7 bv7Var = new bv7(2, continuation);
        bv7Var.X = obj;
        return bv7Var;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        od2.a0(obj);
        return new mqc(new rje(new aab(((File) this.X).getAbsolutePath()), null));
    }
}
