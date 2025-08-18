package defpackage;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.graphics.PointF;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import java.util.HashMap;

/* loaded from: classes.dex */
public final class p12 extends w1f {
    public static final String[] R0 = {"android:changeBounds:bounds", "android:changeBounds:clip", "android:changeBounds:parent", "android:changeBounds:windowX", "android:changeBounds:windowY"};
    public static final l12 S0 = new l12(PointF.class, "topLeft", 0);
    public static final l12 T0 = new l12(PointF.class, "bottomRight", 1);
    public static final l12 U0 = new l12(PointF.class, "bottomRight", 2);
    public static final l12 V0 = new l12(PointF.class, "topLeft", 3);
    public static final l12 W0 = new l12(PointF.class, "position", 4);

    public static void Q(g2f g2fVar) {
        View view = g2fVar.b;
        if (!view.isLaidOut() && view.getWidth() == 0 && view.getHeight() == 0) {
            return;
        }
        HashMap map = g2fVar.a;
        map.put("android:changeBounds:bounds", new Rect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom()));
        map.put("android:changeBounds:parent", g2fVar.b.getParent());
    }

    @Override // defpackage.w1f
    public final void e(g2f g2fVar) {
        Q(g2fVar);
    }

    @Override // defpackage.w1f
    public final void h(g2f g2fVar) {
        Q(g2fVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.w1f
    public final Animator l(ViewGroup viewGroup, g2f g2fVar, g2f g2fVar2) {
        int i;
        ObjectAnimator objectAnimatorA;
        if (g2fVar == null || g2fVar2 == null) {
            return null;
        }
        HashMap map = g2fVar.a;
        HashMap map2 = g2fVar2.a;
        ViewGroup viewGroup2 = (ViewGroup) map.get("android:changeBounds:parent");
        ViewGroup viewGroup3 = (ViewGroup) map2.get("android:changeBounds:parent");
        if (viewGroup2 == null || viewGroup3 == null) {
            return null;
        }
        Rect rect = (Rect) map.get("android:changeBounds:bounds");
        Rect rect2 = (Rect) map2.get("android:changeBounds:bounds");
        int i2 = rect.left;
        int i3 = rect2.left;
        int i4 = rect.top;
        int i5 = rect2.top;
        int i6 = rect.right;
        int i7 = rect2.right;
        int i8 = rect.bottom;
        int i9 = rect2.bottom;
        int i10 = i6 - i2;
        int i11 = i8 - i4;
        int i12 = i7 - i3;
        int i13 = i9 - i5;
        Rect rect3 = (Rect) map.get("android:changeBounds:clip");
        Rect rect4 = (Rect) map2.get("android:changeBounds:clip");
        if ((i10 == 0 || i11 == 0) && (i12 == 0 || i13 == 0)) {
            i = 0;
        } else {
            i = (i2 == i3 && i4 == i5) ? 0 : 1;
            if (i6 != i7 || i8 != i9) {
                i++;
            }
        }
        if ((rect3 != null && !rect3.equals(rect4)) || (rect3 == null && rect4 != null)) {
            i++;
        }
        if (i <= 0) {
            return null;
        }
        l12 l12Var = ppf.a;
        View view = g2fVar2.b;
        view.setLeftTopRightBottom(i2, i4, i6, i8);
        if (i == 2) {
            if (i10 == i12 && i11 == i13) {
                this.K0.getClass();
                objectAnimatorA = ly9.a(view, W0, vu4.q(i2, i4, i3, i5));
            } else {
                o12 o12Var = new o12(view);
                this.K0.getClass();
                ObjectAnimator objectAnimatorA2 = ly9.a(o12Var, S0, vu4.q(i2, i4, i3, i5));
                this.K0.getClass();
                ObjectAnimator objectAnimatorA3 = ly9.a(o12Var, T0, vu4.q(i6, i8, i7, i9));
                AnimatorSet animatorSet = new AnimatorSet();
                animatorSet.playTogether(objectAnimatorA2, objectAnimatorA3);
                animatorSet.addListener(new m12(o12Var));
                objectAnimatorA = animatorSet;
            }
        } else if (i2 == i3 && i4 == i5) {
            this.K0.getClass();
            objectAnimatorA = ly9.a(view, U0, vu4.q(i6, i8, i7, i9));
        } else {
            this.K0.getClass();
            objectAnimatorA = ly9.a(view, V0, vu4.q(i2, i4, i3, i5));
        }
        if (view.getParent() instanceof ViewGroup) {
            ViewGroup viewGroup4 = (ViewGroup) view.getParent();
            gnf.b(viewGroup4, true);
            s().a(new n12(viewGroup4));
        }
        return objectAnimatorA;
    }

    @Override // defpackage.w1f
    public final String[] u() {
        return R0;
    }
}
