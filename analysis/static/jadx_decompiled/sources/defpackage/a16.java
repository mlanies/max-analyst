package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.Transformation;

/* loaded from: classes.dex */
public final class a16 extends AnimationSet implements Runnable {
    public boolean X;
    public final ViewGroup a;
    public final View b;
    public boolean c;
    public boolean o;

    public a16(Animation animation, ViewGroup viewGroup, View view) {
        super(false);
        this.X = true;
        this.a = viewGroup;
        this.b = view;
        addAnimation(animation);
        viewGroup.post(this);
    }

    @Override // android.view.animation.AnimationSet, android.view.animation.Animation
    public final boolean getTransformation(long j, Transformation transformation) {
        this.X = true;
        if (this.c) {
            return !this.o;
        }
        if (!super.getTransformation(j, transformation)) {
            this.c = true;
            pla.a(this.a, this);
        }
        return true;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z = this.c;
        ViewGroup viewGroup = this.a;
        if (z || !this.X) {
            viewGroup.endViewTransition(this.b);
            this.o = true;
        } else {
            this.X = false;
            viewGroup.post(this);
        }
    }

    @Override // android.view.animation.Animation
    public final boolean getTransformation(long j, Transformation transformation, float f) {
        this.X = true;
        if (this.c) {
            return !this.o;
        }
        if (!super.getTransformation(j, transformation, f)) {
            this.c = true;
            pla.a(this.a, this);
        }
        return true;
    }
}
