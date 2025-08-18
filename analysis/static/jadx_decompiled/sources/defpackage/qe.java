package defpackage;

import android.content.Context;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.DrawableWrapper;
import one.me.sdk.richvector.EnhancedAnimatedVectorDrawable;
import one.me.sdk.richvector.VectorPath;

/* loaded from: classes2.dex */
public final class qe extends DrawableWrapper implements Animatable {
    public final je7 a;
    public final je7 b;
    public final je7 c;

    public qe(Context context) {
        super(new EnhancedAnimatedVectorDrawable(context, woc.X));
        final int i = 0;
        this.a = tu0.r(3, new k56(this) { // from class: pe
            public final /* synthetic */ qe b;

            {
                this.b = this;
            }

            @Override // defpackage.k56
            public final Object invoke() {
                switch (i) {
                    case 0:
                        return ((EnhancedAnimatedVectorDrawable) this.b.getDrawable()).findPath("circle");
                    case 1:
                        return ((EnhancedAnimatedVectorDrawable) this.b.getDrawable()).findPath("hours");
                    default:
                        return ((EnhancedAnimatedVectorDrawable) this.b.getDrawable()).findPath("minutes");
                }
            }
        });
        final int i2 = 1;
        this.b = tu0.r(3, new k56(this) { // from class: pe
            public final /* synthetic */ qe b;

            {
                this.b = this;
            }

            @Override // defpackage.k56
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        return ((EnhancedAnimatedVectorDrawable) this.b.getDrawable()).findPath("circle");
                    case 1:
                        return ((EnhancedAnimatedVectorDrawable) this.b.getDrawable()).findPath("hours");
                    default:
                        return ((EnhancedAnimatedVectorDrawable) this.b.getDrawable()).findPath("minutes");
                }
            }
        });
        final int i3 = 2;
        this.c = tu0.r(3, new k56(this) { // from class: pe
            public final /* synthetic */ qe b;

            {
                this.b = this;
            }

            @Override // defpackage.k56
            public final Object invoke() {
                switch (i3) {
                    case 0:
                        return ((EnhancedAnimatedVectorDrawable) this.b.getDrawable()).findPath("circle");
                    case 1:
                        return ((EnhancedAnimatedVectorDrawable) this.b.getDrawable()).findPath("hours");
                    default:
                        return ((EnhancedAnimatedVectorDrawable) this.b.getDrawable()).findPath("minutes");
                }
            }
        });
    }

    public final void a(int i) {
        VectorPath vectorPath = (VectorPath) this.a.getValue();
        if (vectorPath != null) {
            vectorPath.setStrokeColor(i);
        }
        VectorPath vectorPath2 = (VectorPath) this.b.getValue();
        if (vectorPath2 != null) {
            vectorPath2.setStrokeColor(i);
        }
        VectorPath vectorPath3 = (VectorPath) this.c.getValue();
        if (vectorPath3 != null) {
            vectorPath3.setStrokeColor(i);
        }
        ((EnhancedAnimatedVectorDrawable) getDrawable()).invalidatePath();
    }

    @Override // android.graphics.drawable.Animatable
    public final boolean isRunning() {
        return ((EnhancedAnimatedVectorDrawable) getDrawable()).isRunning();
    }

    @Override // android.graphics.drawable.Animatable
    public final void start() {
        ((EnhancedAnimatedVectorDrawable) getDrawable()).start();
    }

    @Override // android.graphics.drawable.Animatable
    public final void stop() {
        ((EnhancedAnimatedVectorDrawable) getDrawable()).stop();
    }
}
