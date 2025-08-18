package defpackage;

import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.ContentResolver;
import android.content.Context;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.provider.Settings;
import java.util.ArrayList;

/* loaded from: classes.dex */
public abstract class jq4 extends Drawable implements Animatable {
    public static final l12 v0 = new l12(Float.class, "growFraction", 7);
    public ValueAnimator X;
    public ArrayList Y;
    public boolean Z;
    public final Context a;
    public final tj0 b;
    public ValueAnimator o;
    public float s0;
    public int u0;
    public final Paint t0 = new Paint();
    public dh c = new dh();

    public jq4(Context context, tj0 tj0Var) {
        this.a = context;
        this.b = tj0Var;
        setAlpha(255);
    }

    public final float b() {
        tj0 tj0Var = this.b;
        if (tj0Var.e == 0 && tj0Var.f == 0) {
            return 1.0f;
        }
        return this.s0;
    }

    public final void c(le leVar) {
        if (this.Y == null) {
            this.Y = new ArrayList();
        }
        if (this.Y.contains(leVar)) {
            return;
        }
        this.Y.add(leVar);
    }

    public final boolean d(boolean z, boolean z2, boolean z3) {
        dh dhVar = this.c;
        ContentResolver contentResolver = this.a.getContentResolver();
        dhVar.getClass();
        return e(z, z2, z3 && Settings.Global.getFloat(contentResolver, "animator_duration_scale", 1.0f) > 0.0f);
    }

    public boolean e(boolean z, boolean z2, boolean z3) {
        int i = 1;
        int i2 = 0;
        ValueAnimator valueAnimator = this.o;
        l12 l12Var = v0;
        if (valueAnimator == null) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, l12Var, 0.0f, 1.0f);
            this.o = objectAnimatorOfFloat;
            objectAnimatorOfFloat.setDuration(500L);
            this.o.setInterpolator(og.b);
            ValueAnimator valueAnimator2 = this.o;
            if (valueAnimator2 != null && valueAnimator2.isRunning()) {
                throw new IllegalArgumentException("Cannot set showAnimator while the current showAnimator is running.");
            }
            this.o = valueAnimator2;
            valueAnimator2.addListener(new iq4(this, i2));
        }
        if (this.X == null) {
            ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(this, l12Var, 1.0f, 0.0f);
            this.X = objectAnimatorOfFloat2;
            objectAnimatorOfFloat2.setDuration(500L);
            this.X.setInterpolator(og.b);
            ValueAnimator valueAnimator3 = this.X;
            if (valueAnimator3 != null && valueAnimator3.isRunning()) {
                throw new IllegalArgumentException("Cannot set hideAnimator while the current hideAnimator is running.");
            }
            this.X = valueAnimator3;
            valueAnimator3.addListener(new iq4(this, i));
        }
        if (!isVisible() && !z) {
            return false;
        }
        ValueAnimator valueAnimator4 = z ? this.o : this.X;
        ValueAnimator valueAnimator5 = z ? this.X : this.o;
        if (!z3) {
            if (valueAnimator5.isRunning()) {
                boolean z4 = this.Z;
                this.Z = true;
                new ValueAnimator[]{valueAnimator5}[0].cancel();
                this.Z = z4;
            }
            if (valueAnimator4.isRunning()) {
                valueAnimator4.end();
            } else {
                boolean z5 = this.Z;
                this.Z = true;
                new ValueAnimator[]{valueAnimator4}[0].end();
                this.Z = z5;
            }
            return super.setVisible(z, false);
        }
        if (valueAnimator4.isRunning()) {
            return false;
        }
        boolean z6 = !z || super.setVisible(z, false);
        tj0 tj0Var = this.b;
        if (!z ? tj0Var.f != 0 : tj0Var.e != 0) {
            boolean z7 = this.Z;
            this.Z = true;
            new ValueAnimator[]{valueAnimator4}[0].end();
            this.Z = z7;
            return z6;
        }
        if (z2 || !valueAnimator4.isPaused()) {
            valueAnimator4.start();
        } else {
            valueAnimator4.resume();
        }
        return z6;
    }

    public final void f(le leVar) {
        ArrayList arrayList = this.Y;
        if (arrayList == null || !arrayList.contains(leVar)) {
            return;
        }
        this.Y.remove(leVar);
        if (this.Y.isEmpty()) {
            this.Y = null;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.u0;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Animatable
    public final boolean isRunning() {
        ValueAnimator valueAnimator;
        ValueAnimator valueAnimator2 = this.o;
        return (valueAnimator2 != null && valueAnimator2.isRunning()) || ((valueAnimator = this.X) != null && valueAnimator.isRunning());
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.u0 = i;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.t0.setColorFilter(colorFilter);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z, boolean z2) {
        return d(z, z2, true);
    }

    @Override // android.graphics.drawable.Animatable
    public final void start() {
        e(true, true, false);
    }

    @Override // android.graphics.drawable.Animatable
    public final void stop() {
        e(false, true, false);
    }
}
