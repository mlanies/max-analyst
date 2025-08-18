package defpackage;

import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class xr3 extends ffe implements c66 {
    public final /* synthetic */ int X;
    public /* synthetic */ View Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ xr3(int i, Continuation continuation, int i2) {
        super(i, continuation);
        this.X = i2;
    }

    @Override // defpackage.c66
    public final Object invoke(Object obj, Object obj2, Object obj3) throws Throwable {
        View view = (View) obj;
        Continuation continuation = (Continuation) obj3;
        switch (this.X) {
            case 0:
                xr3 xr3Var = new xr3(3, continuation, 0);
                xr3Var.Y = view;
                e5f e5fVar = e5f.a;
                xr3Var.o(e5fVar);
                return e5fVar;
            case 1:
                xr3 xr3Var2 = new xr3(3, continuation, 1);
                xr3Var2.Y = view;
                e5f e5fVar2 = e5f.a;
                xr3Var2.o(e5fVar2);
                return e5fVar2;
            default:
                xr3 xr3Var3 = new xr3(3, continuation, 2);
                xr3Var3.Y = view;
                e5f e5fVar3 = e5f.a;
                xr3Var3.o(e5fVar3);
                return e5fVar3;
        }
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        switch (this.X) {
            case 0:
                od2.a0(obj);
                View view = this.Y;
                view.setBackgroundColor(qp4.u0.j(view).b().k);
                break;
            case 1:
                od2.a0(obj);
                View view2 = this.Y;
                view2.setBackgroundColor(qp4.u0.j(view2).i().b.c);
                break;
            default:
                od2.a0(obj);
                View view3 = this.Y;
                Drawable background = view3.getBackground();
                GradientDrawable gradientDrawable = background instanceof GradientDrawable ? (GradientDrawable) background : null;
                if (gradientDrawable != null) {
                    gradientDrawable.setColor(qp4.u0.j(view3).getText().b);
                }
                break;
        }
        return e5f.a;
    }
}
