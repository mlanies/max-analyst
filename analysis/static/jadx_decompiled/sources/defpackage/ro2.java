package defpackage;

import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.RippleDrawable;
import android.widget.FrameLayout;
import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class ro2 extends ffe implements c66 {
    public final /* synthetic */ int X;
    public /* synthetic */ FrameLayout Y;
    public /* synthetic */ fka Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ro2(int i, Continuation continuation, int i2) {
        super(i, continuation);
        this.X = i2;
    }

    @Override // defpackage.c66
    public final Object invoke(Object obj, Object obj2, Object obj3) throws Throwable {
        FrameLayout frameLayout = (FrameLayout) obj;
        fka fkaVar = (fka) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.X) {
            case 0:
                ro2 ro2Var = new ro2(3, continuation, 0);
                ro2Var.Y = frameLayout;
                ro2Var.Z = fkaVar;
                e5f e5fVar = e5f.a;
                ro2Var.o(e5fVar);
                return e5fVar;
            case 1:
                ro2 ro2Var2 = new ro2(3, continuation, 1);
                ro2Var2.Y = frameLayout;
                ro2Var2.Z = fkaVar;
                e5f e5fVar2 = e5f.a;
                ro2Var2.o(e5fVar2);
                return e5fVar2;
            case 2:
                ro2 ro2Var3 = new ro2(3, continuation, 2);
                ro2Var3.Y = frameLayout;
                ro2Var3.Z = fkaVar;
                e5f e5fVar3 = e5f.a;
                ro2Var3.o(e5fVar3);
                return e5fVar3;
            case 3:
                ro2 ro2Var4 = new ro2(3, continuation, 3);
                ro2Var4.Y = frameLayout;
                ro2Var4.Z = fkaVar;
                e5f e5fVar4 = e5f.a;
                ro2Var4.o(e5fVar4);
                return e5fVar4;
            case 4:
                ro2 ro2Var5 = new ro2(3, continuation, 4);
                ro2Var5.Y = frameLayout;
                ro2Var5.Z = fkaVar;
                e5f e5fVar5 = e5f.a;
                ro2Var5.o(e5fVar5);
                return e5fVar5;
            case 5:
                ro2 ro2Var6 = new ro2(3, continuation, 5);
                ro2Var6.Y = frameLayout;
                ro2Var6.Z = fkaVar;
                e5f e5fVar6 = e5f.a;
                ro2Var6.o(e5fVar6);
                return e5fVar6;
            default:
                ro2 ro2Var7 = new ro2(3, continuation, 6);
                ro2Var7.Y = frameLayout;
                ro2Var7.Z = fkaVar;
                e5f e5fVar7 = e5f.a;
                ro2Var7.o(e5fVar7);
                return e5fVar7;
        }
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        switch (this.X) {
            case 0:
                od2.a0(obj);
                this.Y.setBackgroundColor(this.Z.a().m().a.a.d);
                break;
            case 1:
                od2.a0(obj);
                this.Y.setBackgroundColor(this.Z.a().h().a.d);
                break;
            case 2:
                od2.a0(obj);
                FrameLayout frameLayout = this.Y;
                fka fkaVar = this.Z;
                qp4.u0.b(frameLayout.getContext()).getClass();
                qp4.c(frameLayout, fkaVar);
                break;
            case 3:
                od2.a0(obj);
                FrameLayout frameLayout2 = this.Y;
                fka fkaVar2 = this.Z;
                Drawable background = frameLayout2.getBackground();
                GradientDrawable gradientDrawable = background instanceof GradientDrawable ? (GradientDrawable) background : null;
                if (gradientDrawable != null) {
                    gradientDrawable.setColors(fkaVar2.e().c.a);
                }
                break;
            case 4:
                od2.a0(obj);
                this.Y.setBackgroundColor(this.Z.b().k);
                break;
            case 5:
                od2.a0(obj);
                this.Y.setBackgroundColor(this.Z.b().j);
                break;
            default:
                od2.a0(obj);
                FrameLayout frameLayout3 = this.Y;
                fka fkaVar3 = this.Z;
                GradientDrawable gradientDrawable2 = new GradientDrawable();
                gradientDrawable2.setCornerRadius(fk4.d().getDisplayMetrics().density * 16.0f);
                gradientDrawable2.setTint(fkaVar3.b().g);
                frameLayout3.setBackground(gradientDrawable2);
                frameLayout3.setForeground(new RippleDrawable(ColorStateList.valueOf(fkaVar3.d().a.a.h), null, s3e.K0));
                break;
        }
        return e5f.a;
    }
}
