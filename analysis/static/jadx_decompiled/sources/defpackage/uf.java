package defpackage;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.util.LruCache;
import java.util.ArrayList;
import one.me.sdk.richvector.EnhancedVectorDrawable;

/* loaded from: classes2.dex */
public final class uf {
    public static final ey1 c = new ey1(26);
    public final Context a;
    public final Resources b;

    public uf(Context context) {
        this.a = context;
        this.b = context.getResources();
    }

    public static boolean c(Animator animator) {
        AnimatorSet animatorSet = animator instanceof AnimatorSet ? (AnimatorSet) animator : null;
        if (animatorSet == null) {
            ObjectAnimator objectAnimator = animator instanceof ObjectAnimator ? (ObjectAnimator) animator : null;
            return Boolean.valueOf(tpa.f(objectAnimator != null ? objectAnimator.getPropertyName() : null, "pathData")).booleanValue();
        }
        ArrayList<Animator> childAnimations = animatorSet.getChildAnimations();
        if (childAnimations.isEmpty()) {
            return false;
        }
        for (Animator animator2 : childAnimations) {
            ObjectAnimator objectAnimator2 = animator2 instanceof ObjectAnimator ? (ObjectAnimator) animator2 : null;
            if (Boolean.valueOf(tpa.f(objectAnimator2 != null ? objectAnimator2.getPropertyName() : null, "pathData")).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    public final Animator a(int i) {
        gh ghVar = new gh(this.a);
        ey1 ey1Var = gh.c;
        Animator animator = (Animator) ((LruCache) ey1Var.b).get(Integer.valueOf(i));
        if (animator != null) {
            return animator.clone();
        }
        Animator animatorA = ghVar.a(ghVar.b.getAnimation(i), null, 0);
        if (animatorA == null) {
            throw new IllegalArgumentException("Required value was null.".toString());
        }
        ((LruCache) ey1Var.b).put(Integer.valueOf(i), animatorA.clone());
        return animatorA;
    }

    public final EnhancedVectorDrawable b(XmlResourceParser xmlResourceParser) {
        int attributeCount = xmlResourceParser.getAttributeCount();
        int i = 0;
        while (true) {
            if (i >= attributeCount) {
                break;
            }
            if (tpa.f(xmlResourceParser.getAttributeName(i), "drawable")) {
                int attributeResourceValue = xmlResourceParser.getAttributeResourceValue(i, 0);
                if (attributeResourceValue != 0) {
                    return new EnhancedVectorDrawable(this.b, attributeResourceValue);
                }
            } else {
                i++;
            }
        }
        throw new IllegalStateException();
    }
}
