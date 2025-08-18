package defpackage;

import android.content.res.ColorStateList;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.RippleDrawable;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class a93 extends ffe implements c66 {
    public final /* synthetic */ int X;
    public /* synthetic */ lk3 Y;
    public /* synthetic */ fka Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a93(int i, Continuation continuation, int i2) {
        super(i, continuation);
        this.X = i2;
    }

    @Override // defpackage.c66
    public final Object invoke(Object obj, Object obj2, Object obj3) throws Throwable {
        lk3 lk3Var = (lk3) obj;
        fka fkaVar = (fka) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.X) {
            case 0:
                a93 a93Var = new a93(3, continuation, 0);
                a93Var.Y = lk3Var;
                a93Var.Z = fkaVar;
                e5f e5fVar = e5f.a;
                a93Var.o(e5fVar);
                return e5fVar;
            default:
                a93 a93Var2 = new a93(3, continuation, 1);
                a93Var2.Y = lk3Var;
                a93Var2.Z = fkaVar;
                e5f e5fVar2 = e5f.a;
                a93Var2.o(e5fVar2);
                return e5fVar2;
        }
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        switch (this.X) {
            case 0:
                od2.a0(obj);
                lk3 lk3Var = this.Y;
                ne0 ne0VarB = this.Z.b();
                lk3Var.setBackground(new RippleDrawable(ColorStateList.valueOf(ne0VarB.k), null, new ColorDrawable(-65536)));
                break;
            default:
                od2.a0(obj);
                lk3 lk3Var2 = this.Y;
                ne0 ne0VarB2 = this.Z.b();
                lk3Var2.setBackground(new RippleDrawable(ColorStateList.valueOf(ne0VarB2.k), null, new ColorDrawable(-65536)));
                break;
        }
        return e5f.a;
    }
}
