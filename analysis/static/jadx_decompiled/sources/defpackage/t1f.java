package defpackage;

import android.animation.Animator;
import android.animation.AnimatorSet;

/* loaded from: classes.dex */
public abstract class t1f {
    public static long a(Animator animator) {
        return animator.getTotalDuration();
    }

    public static void b(Animator animator, long j) {
        ((AnimatorSet) animator).setCurrentPlayTime(j);
    }
}
