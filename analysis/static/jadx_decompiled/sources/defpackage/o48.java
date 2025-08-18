package defpackage;

import android.graphics.drawable.GradientDrawable;
import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class o48 extends ffe implements c66 {
    public final /* synthetic */ int X;
    public /* synthetic */ fka Y;
    public final /* synthetic */ GradientDrawable Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o48(GradientDrawable gradientDrawable, Continuation continuation, int i) {
        super(3, continuation);
        this.X = i;
        this.Z = gradientDrawable;
    }

    @Override // defpackage.c66
    public final Object invoke(Object obj, Object obj2, Object obj3) throws Throwable {
        switch (this.X) {
            case 0:
                o48 o48Var = new o48(this.Z, (Continuation) obj3, 0);
                o48Var.Y = (fka) obj2;
                e5f e5fVar = e5f.a;
                o48Var.o(e5fVar);
                return e5fVar;
            default:
                o48 o48Var2 = new o48(this.Z, (Continuation) obj3, 1);
                o48Var2.Y = (fka) obj2;
                e5f e5fVar2 = e5f.a;
                o48Var2.o(e5fVar2);
                return e5fVar2;
        }
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        switch (this.X) {
            case 0:
                od2.a0(obj);
                this.Y.b();
                ngg.G(this.Z, -1728053248);
                break;
            default:
                od2.a0(obj);
                this.Z.setColors(this.Y.a().s().b.w);
                break;
        }
        return e5f.a;
    }
}
