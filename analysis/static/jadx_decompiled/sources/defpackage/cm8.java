package defpackage;

import android.content.Context;
import android.net.Uri;
import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class cm8 extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ Uri Y;
    public final /* synthetic */ dm8 Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cm8(Uri uri, dm8 dm8Var, Continuation continuation) {
        super(2, continuation);
        this.Y = uri;
        this.Z = dm8Var;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        cm8 cm8Var = (cm8) n((sx3) obj, (Continuation) obj2);
        e5f e5fVar = e5f.a;
        cm8Var.o(e5fVar);
        return e5fVar;
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        cm8 cm8Var = new cm8(this.Y, this.Z, continuation);
        cm8Var.X = obj;
        return cm8Var;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        od2.a0(obj);
        sx3 sx3Var = (sx3) this.X;
        dm8 dm8Var = this.Z;
        Context context = dm8Var.o;
        Uri uri = this.Y;
        if (tfg.x(uri, context, null)) {
            hm9.m0(sx3Var.getClass().getName(), "try to share internal file!", new Object[0]);
        } else {
            bm8 bm8Var = dm8Var.b;
            pnf.o(bm8Var.b, new yl8(uri));
            pnf.o(bm8Var.b, wl8.a);
        }
        return e5f.a;
    }
}
