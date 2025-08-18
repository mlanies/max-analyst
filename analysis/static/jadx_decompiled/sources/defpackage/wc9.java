package defpackage;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.content.res.Resources;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class wc9 {
    public final qpd a = new qpd();
    public final qpd b = new qpd();

    public static wc9 a(Context context, int i) throws Resources.NotFoundException {
        try {
            Animator animatorLoadAnimator = AnimatorInflater.loadAnimator(context, i);
            if (animatorLoadAnimator instanceof AnimatorSet) {
                return b(((AnimatorSet) animatorLoadAnimator).getChildAnimations());
            }
            if (animatorLoadAnimator == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            arrayList.add(animatorLoadAnimator);
            return b(arrayList);
        } catch (Exception unused) {
            Integer.toHexString(i);
            return null;
        }
    }

    public static wc9 b(ArrayList arrayList) {
        wc9 wc9Var = new wc9();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            Animator animator = (Animator) arrayList.get(i);
            if (!(animator instanceof ObjectAnimator)) {
                throw new IllegalArgumentException("Animator must be an ObjectAnimator: " + animator);
            }
            ObjectAnimator objectAnimator = (ObjectAnimator) animator;
            wc9Var.b.put(objectAnimator.getPropertyName(), objectAnimator.getValues());
            String propertyName = objectAnimator.getPropertyName();
            long startDelay = objectAnimator.getStartDelay();
            long duration = objectAnimator.getDuration();
            TimeInterpolator interpolator = objectAnimator.getInterpolator();
            if ((interpolator instanceof AccelerateDecelerateInterpolator) || interpolator == null) {
                interpolator = og.b;
            } else if (interpolator instanceof AccelerateInterpolator) {
                interpolator = og.c;
            } else if (interpolator instanceof DecelerateInterpolator) {
                interpolator = og.d;
            }
            xc9 xc9Var = new xc9();
            xc9Var.d = 0;
            xc9Var.e = 1;
            xc9Var.a = startDelay;
            xc9Var.b = duration;
            xc9Var.c = interpolator;
            xc9Var.d = objectAnimator.getRepeatCount();
            xc9Var.e = objectAnimator.getRepeatMode();
            wc9Var.a.put(propertyName, xc9Var);
        }
        return wc9Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof wc9) {
            return this.a.equals(((wc9) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "\n" + wc9.class.getName() + '{' + Integer.toHexString(System.identityHashCode(this)) + " timings: " + this.a + "}\n";
    }
}
