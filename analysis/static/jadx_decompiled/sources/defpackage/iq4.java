package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class iq4 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ jq4 b;

    public /* synthetic */ iq4(jq4 jq4Var, int i) {
        this.a = i;
        this.b = jq4Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 1:
                super.onAnimationEnd(animator);
                jq4 jq4Var = this.b;
                super/*android.graphics.drawable.Drawable*/.setVisible(false, false);
                ArrayList arrayList = jq4Var.Y;
                if (arrayList != null && !jq4Var.Z) {
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        ((le) it.next()).a(jq4Var);
                    }
                    break;
                }
                break;
            default:
                super.onAnimationEnd(animator);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        switch (this.a) {
            case 0:
                super.onAnimationStart(animator);
                jq4 jq4Var = this.b;
                ArrayList arrayList = jq4Var.Y;
                if (arrayList != null && !jq4Var.Z) {
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        ((le) it.next()).b(jq4Var);
                    }
                    break;
                }
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }
}
