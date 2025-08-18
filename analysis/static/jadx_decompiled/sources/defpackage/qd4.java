package defpackage;

import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import java.util.Objects;

/* loaded from: classes.dex */
public final class qd4 implements Animation.AnimationListener {
    public final /* synthetic */ ovd a;
    public final /* synthetic */ ViewGroup b;
    public final /* synthetic */ View c;
    public final /* synthetic */ rd4 d;

    public qd4(ovd ovdVar, ViewGroup viewGroup, View view, rd4 rd4Var) {
        this.a = ovdVar;
        this.b = viewGroup;
        this.c = view;
        this.d = rd4Var;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
        ViewGroup viewGroup = this.b;
        viewGroup.post(new f5(viewGroup, this.c, this.d, 18));
        if (Log.isLoggable("FragmentManager", 2)) {
            Objects.toString(this.a);
        }
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationRepeat(Animation animation) {
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationStart(Animation animation) {
        if (Log.isLoggable("FragmentManager", 2)) {
            Objects.toString(this.a);
        }
    }
}
