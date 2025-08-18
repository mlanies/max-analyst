package defpackage;

import java.io.File;
import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class gv7 extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ CharSequence Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gv7(CharSequence charSequence, Continuation continuation) {
        super(2, continuation);
        this.Y = charSequence;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) {
        return ((gv7) n((File) obj, (Continuation) obj2)).o(e5f.a);
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        gv7 gv7Var = new gv7(this.Y, continuation);
        gv7Var.X = obj;
        return gv7Var;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        od2.a0(obj);
        aab aabVar = new aab(((File) this.X).getAbsolutePath());
        return new nj7(new mqc(new rje(aabVar, null)), this.Y.toString(), 2);
    }
}
