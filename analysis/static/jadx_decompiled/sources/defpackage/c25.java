package defpackage;

import android.animation.AnimatorSet;
import android.graphics.drawable.Drawable;

/* loaded from: classes2.dex */
public final class c25 {
    public final Drawable a;
    public final AnimatorSet b;
    public final boolean c;

    public c25(Drawable drawable, AnimatorSet animatorSet) {
        this.a = drawable;
        AnimatorSet animatorSetClone = animatorSet.clone();
        this.b = animatorSetClone;
        this.c = animatorSetClone.getTotalDuration() == -1;
    }
}
