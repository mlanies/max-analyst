package defpackage;

import java.io.File;
import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class gj6 extends ffe implements a66 {
    public final /* synthetic */ ij6 X;
    public final /* synthetic */ File Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gj6(ij6 ij6Var, File file, Continuation continuation) {
        super(2, continuation);
        this.X = ij6Var;
        this.Y = file;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) {
        return ((gj6) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        return new gj6(this.X, this.Y, continuation);
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        od2.a0(obj);
        wha whaVar = (wha) this.X.d.getValue();
        whaVar.h("Дамп памяти закончился");
        whaVar.b("Если что файл можно будет найти по этому пути: " + this.Y.getAbsolutePath());
        return whaVar.i();
    }
}
