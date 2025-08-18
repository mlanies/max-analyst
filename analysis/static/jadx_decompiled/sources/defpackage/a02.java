package defpackage;

import android.content.res.ColorStateList;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import androidx.appcompat.widget.AppCompatImageView;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class a02 extends ffe implements c66 {
    public final /* synthetic */ int X;
    public /* synthetic */ AppCompatImageView Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a02(int i, Continuation continuation, int i2) {
        super(i, continuation);
        this.X = i2;
    }

    @Override // defpackage.c66
    public final Object invoke(Object obj, Object obj2, Object obj3) throws Throwable {
        AppCompatImageView appCompatImageView = (AppCompatImageView) obj;
        Continuation continuation = (Continuation) obj3;
        switch (this.X) {
            case 0:
                a02 a02Var = new a02(3, continuation, 0);
                a02Var.Y = appCompatImageView;
                e5f e5fVar = e5f.a;
                a02Var.o(e5fVar);
                return e5fVar;
            case 1:
                a02 a02Var2 = new a02(3, continuation, 1);
                a02Var2.Y = appCompatImageView;
                e5f e5fVar2 = e5f.a;
                a02Var2.o(e5fVar2);
                return e5fVar2;
            case 2:
                a02 a02Var3 = new a02(3, continuation, 2);
                a02Var3.Y = appCompatImageView;
                e5f e5fVar3 = e5f.a;
                a02Var3.o(e5fVar3);
                return e5fVar3;
            default:
                a02 a02Var4 = new a02(3, continuation, 3);
                a02Var4.Y = appCompatImageView;
                e5f e5fVar4 = e5f.a;
                a02Var4.o(e5fVar4);
                return e5fVar4;
        }
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        switch (this.X) {
            case 0:
                od2.a0(obj);
                AppCompatImageView appCompatImageView = this.Y;
                pq9 pq9Var = qp4.u0;
                int i = pq9Var.j(appCompatImageView).d().a.a.h;
                ShapeDrawable shapeDrawable = new ShapeDrawable(new OvalShape());
                shapeDrawable.getPaint().setColor(-1);
                appCompatImageView.setBackgroundDrawable(new RippleDrawable(ColorStateList.valueOf(i), null, shapeDrawable));
                appCompatImageView.setImageResource(woc.o0);
                appCompatImageView.setImageTintList(ColorStateList.valueOf(pq9Var.j(appCompatImageView).getIcon().j));
                break;
            case 1:
                od2.a0(obj);
                AppCompatImageView appCompatImageView2 = this.Y;
                appCompatImageView2.setImageTintList(ColorStateList.valueOf(qp4.u0.j(appCompatImageView2).getIcon().i));
                appCompatImageView2.setImageResource(yfa.x);
                break;
            case 2:
                od2.a0(obj);
                AppCompatImageView appCompatImageView3 = this.Y;
                pq9 pq9Var2 = qp4.u0;
                appCompatImageView3.setImageTintList(ColorStateList.valueOf(pq9Var2.j(appCompatImageView3).getIcon().i));
                appCompatImageView3.setImageResource(yfa.a);
                int i2 = pq9Var2.j(appCompatImageView3).d().a.a.h;
                ShapeDrawable shapeDrawable2 = new ShapeDrawable(new OvalShape());
                shapeDrawable2.getPaint().setColor(-1);
                appCompatImageView3.setBackgroundDrawable(new RippleDrawable(ColorStateList.valueOf(i2), null, shapeDrawable2));
                break;
            default:
                od2.a0(obj);
                AppCompatImageView appCompatImageView4 = this.Y;
                pq9 pq9Var3 = qp4.u0;
                appCompatImageView4.setImageTintList(ColorStateList.valueOf(pq9Var3.j(appCompatImageView4).getIcon().i));
                appCompatImageView4.setImageResource(ica.i);
                int i3 = pq9Var3.j(appCompatImageView4).d().a.a.h;
                ShapeDrawable shapeDrawable3 = new ShapeDrawable(new OvalShape());
                shapeDrawable3.getPaint().setColor(-1);
                appCompatImageView4.setBackgroundDrawable(new RippleDrawable(ColorStateList.valueOf(i3), null, shapeDrawable3));
                break;
        }
        return e5f.a;
    }
}
