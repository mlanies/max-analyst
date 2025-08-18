package defpackage;

import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.widget.ImageView;
import kotlin.coroutines.Continuation;
import one.me.sdk.richvector.EnhancedVectorDrawable;
import one.me.sdk.richvector.VectorPath;

/* loaded from: classes2.dex */
public final class ze2 extends ffe implements c66 {
    public final /* synthetic */ int X;
    public /* synthetic */ ImageView Y;
    public /* synthetic */ fka Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ze2(int i, Continuation continuation, int i2) {
        super(i, continuation);
        this.X = i2;
    }

    @Override // defpackage.c66
    public final Object invoke(Object obj, Object obj2, Object obj3) throws Throwable {
        ImageView imageView = (ImageView) obj;
        fka fkaVar = (fka) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.X) {
            case 0:
                ze2 ze2Var = new ze2(3, continuation, 0);
                ze2Var.Y = imageView;
                ze2Var.Z = fkaVar;
                e5f e5fVar = e5f.a;
                ze2Var.o(e5fVar);
                return e5fVar;
            case 1:
                ze2 ze2Var2 = new ze2(3, continuation, 1);
                ze2Var2.Y = imageView;
                ze2Var2.Z = fkaVar;
                e5f e5fVar2 = e5f.a;
                ze2Var2.o(e5fVar2);
                return e5fVar2;
            case 2:
                ze2 ze2Var3 = new ze2(3, continuation, 2);
                ze2Var3.Y = imageView;
                ze2Var3.Z = fkaVar;
                e5f e5fVar3 = e5f.a;
                ze2Var3.o(e5fVar3);
                return e5fVar3;
            case 3:
                ze2 ze2Var4 = new ze2(3, continuation, 3);
                ze2Var4.Y = imageView;
                ze2Var4.Z = fkaVar;
                e5f e5fVar4 = e5f.a;
                ze2Var4.o(e5fVar4);
                return e5fVar4;
            case 4:
                ze2 ze2Var5 = new ze2(3, continuation, 4);
                ze2Var5.Y = imageView;
                ze2Var5.Z = fkaVar;
                e5f e5fVar5 = e5f.a;
                ze2Var5.o(e5fVar5);
                return e5fVar5;
            case 5:
                ze2 ze2Var6 = new ze2(3, continuation, 5);
                ze2Var6.Y = imageView;
                ze2Var6.Z = fkaVar;
                e5f e5fVar6 = e5f.a;
                ze2Var6.o(e5fVar6);
                return e5fVar6;
            case 6:
                ze2 ze2Var7 = new ze2(3, continuation, 6);
                ze2Var7.Y = imageView;
                ze2Var7.Z = fkaVar;
                e5f e5fVar7 = e5f.a;
                ze2Var7.o(e5fVar7);
                return e5fVar7;
            case 7:
                ze2 ze2Var8 = new ze2(3, continuation, 7);
                ze2Var8.Y = imageView;
                ze2Var8.Z = fkaVar;
                e5f e5fVar8 = e5f.a;
                ze2Var8.o(e5fVar8);
                return e5fVar8;
            case 8:
                ze2 ze2Var9 = new ze2(3, continuation, 8);
                ze2Var9.Y = imageView;
                ze2Var9.Z = fkaVar;
                e5f e5fVar9 = e5f.a;
                ze2Var9.o(e5fVar9);
                return e5fVar9;
            case 9:
                ze2 ze2Var10 = new ze2(3, continuation, 9);
                ze2Var10.Y = imageView;
                ze2Var10.Z = fkaVar;
                e5f e5fVar10 = e5f.a;
                ze2Var10.o(e5fVar10);
                return e5fVar10;
            default:
                ze2 ze2Var11 = new ze2(3, continuation, 10);
                ze2Var11.Y = imageView;
                ze2Var11.Z = fkaVar;
                e5f e5fVar11 = e5f.a;
                ze2Var11.o(e5fVar11);
                return e5fVar11;
        }
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        switch (this.X) {
            case 0:
                od2.a0(obj);
                this.Y.setImageTintList(ColorStateList.valueOf(this.Z.getIcon().j));
                break;
            case 1:
                od2.a0(obj);
                this.Y.setImageTintList(ColorStateList.valueOf(this.Z.a().h().b.b));
                break;
            case 2:
                od2.a0(obj);
                ImageView imageView = this.Y;
                this.Z.getIcon();
                imageView.setImageTintList(ColorStateList.valueOf(-1));
                break;
            case 3:
                od2.a0(obj);
                ImageView imageView2 = this.Y;
                this.Z.getIcon();
                imageView2.setImageTintList(ColorStateList.valueOf(-1));
                break;
            case 4:
                od2.a0(obj);
                ImageView imageView3 = this.Y;
                fka fkaVar = this.Z;
                Drawable drawable = imageView3.getDrawable();
                EnhancedVectorDrawable enhancedVectorDrawable = drawable instanceof EnhancedVectorDrawable ? (EnhancedVectorDrawable) drawable : null;
                if (enhancedVectorDrawable != null) {
                    int i = fkaVar.i().b.b;
                    VectorPath vectorPathFindPath = enhancedVectorDrawable.findPath("stroke");
                    if (vectorPathFindPath != null) {
                        vectorPathFindPath.setStrokeColor(i);
                        enhancedVectorDrawable.invalidatePath();
                    }
                }
                break;
            case 5:
                od2.a0(obj);
                ImageView imageView4 = this.Y;
                fka fkaVar2 = this.Z;
                Drawable background = imageView4.getBackground();
                GradientDrawable gradientDrawable = background instanceof GradientDrawable ? (GradientDrawable) background : null;
                if (gradientDrawable != null) {
                    gradientDrawable.setColor(fkaVar2.b().k);
                }
                ngg.G(imageView4.getDrawable(), fkaVar2.getIcon().k);
                break;
            case 6:
                od2.a0(obj);
                ngg.G(this.Y.getDrawable(), this.Z.getIcon().k);
                break;
            case 7:
                od2.a0(obj);
                ngg.G(this.Y.getDrawable(), this.Z.getIcon().k);
                break;
            case 8:
                od2.a0(obj);
                ngg.G(this.Y.getDrawable(), this.Z.f().a);
                break;
            case 9:
                od2.a0(obj);
                ImageView imageView5 = this.Y;
                fka fkaVar3 = this.Z;
                int i2 = fkaVar3.d().a.a.d;
                ShapeDrawable shapeDrawable = new ShapeDrawable(new OvalShape());
                shapeDrawable.getPaint().setColor(fkaVar3.b().a.h);
                imageView5.setBackground(new RippleDrawable(ColorStateList.valueOf(i2), shapeDrawable, null));
                imageView5.setImageTintList(ColorStateList.valueOf(-1));
                break;
            default:
                od2.a0(obj);
                ImageView imageView6 = this.Y;
                fka fkaVar4 = this.Z;
                imageView6.setImageTintList(ColorStateList.valueOf(fkaVar4.getIcon().i));
                Drawable background2 = imageView6.getBackground();
                if (background2 != null) {
                    background2.setTint(fkaVar4.b().a.g);
                }
                break;
        }
        return e5f.a;
    }
}
