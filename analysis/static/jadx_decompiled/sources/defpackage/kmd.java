package defpackage;

import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.view.animation.LinearInterpolator;
import java.util.Arrays;
import kotlin.NoWhenBranchMatchedException;

/* loaded from: classes2.dex */
public final class kmd extends Drawable implements Animatable, kre {
    public static final /* synthetic */ bc7[] A0 = {new oi9(kmd.class, "colorState", "getColorState()Lone/me/sdk/uikit/common/emptyview/ShineAnimatedDrawable$Companion$ColorState;"), rh4.g(nec.a, kmd.class, "rotationValues", "getRotationValues()[F"), new oi9(kmd.class, "rotationDirection", "getRotationDirection()Lone/me/sdk/uikit/common/emptyview/ShineAnimatedDrawable$Companion$RotateDirection;"), new oi9(kmd.class, "rotationDuration", "getRotationDuration()J"), new oi9(kmd.class, "scaleValues", "getScaleValues()[F"), new oi9(kmd.class, "scaleDuration", "getScaleDuration()J"), new oi9(kmd.class, "shapeHeight", "getShapeHeight()Ljava/lang/Integer;"), new oi9(kmd.class, "isScaleAnimationEnabled", "isScaleAnimationEnabled()Z")};
    public static final float[] B0 = {1.0f, 0.33f, 1.0f};
    public static final float[] C0 = {0.0f, 359.0f};
    public final eob X;
    public final ObjectAnimator Y;
    public final ObjectAnimator Z;
    public final Context a;
    public final ShapeDrawable[] b;
    public final kpa[] c;
    public final eob o;
    public final jmd s0;
    public final jmd t0;
    public final jmd u0;
    public final jmd v0;
    public final jmd w0;
    public final jmd x0;
    public final jmd y0;
    public final jmd z0;

    public kmd(Context context) {
        this.a = context;
        pq9 pq9Var = qp4.u0;
        this.b = new ShapeDrawable[]{a14.b(pq9Var.b(context).i().g().b.a.a), a14.b(pq9Var.b(context).i().g().b.a.b), a14.b(pq9Var.b(context).i().g().b.a.c), a14.b(pq9Var.b(context).i().g().b.a.d)};
        kpa[] kpaVarArr = new kpa[4];
        for (int i = 0; i < 4; i++) {
            kpaVarArr[i] = new kpa(new eob("x"), new eob("y"));
        }
        this.c = kpaVarArr;
        eob eobVar = new eob("scaleXY", 1.0f);
        this.o = eobVar;
        eob eobVar2 = new eob("rotation", 0.0f);
        this.X = eobVar2;
        float[] fArr = B0;
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat((Object) null, eobVar, Arrays.copyOf(fArr, fArr.length));
        objectAnimatorOfFloat.setDuration(8000L);
        objectAnimatorOfFloat.setRepeatCount(-1);
        objectAnimatorOfFloat.setInterpolator(new LinearInterpolator());
        final int i2 = 0;
        objectAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: gmd
            public final /* synthetic */ kmd b;

            {
                this.b = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                switch (i2) {
                    case 0:
                        this.b.invalidateSelf();
                        break;
                    default:
                        this.b.invalidateSelf();
                        break;
                }
            }
        });
        this.Y = objectAnimatorOfFloat;
        float[] fArr2 = C0;
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat((Object) null, eobVar2, Arrays.copyOf(fArr2, fArr2.length));
        objectAnimatorOfFloat2.setDuration(8000L);
        objectAnimatorOfFloat2.setRepeatCount(-1);
        objectAnimatorOfFloat2.setInterpolator(new LinearInterpolator());
        final int i3 = 1;
        objectAnimatorOfFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: gmd
            public final /* synthetic */ kmd b;

            {
                this.b = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                switch (i3) {
                    case 0:
                        this.b.invalidateSelf();
                        break;
                    default:
                        this.b.invalidateSelf();
                        break;
                }
            }
        });
        this.Z = objectAnimatorOfFloat2;
        this.s0 = new jmd(this, 0);
        this.t0 = new jmd(fArr2, this, 1);
        this.u0 = new jmd(this, 2);
        this.v0 = new jmd(this, 3);
        this.w0 = new jmd(fArr, this, 4);
        this.x0 = new jmd(this, 5);
        this.y0 = new jmd(this, 6);
        this.z0 = new jmd(this, 7);
    }

    public final void a(fka fkaVar) {
        int[] iArr;
        int i = 0;
        bc7 bc7Var = A0[0];
        int iOrdinal = ((hmd) this.s0.b).ordinal();
        if (iOrdinal == 0) {
            iArr = new int[]{fkaVar.g().b.a.a, fkaVar.g().b.a.b, fkaVar.g().b.a.c, fkaVar.g().b.a.d};
        } else if (iOrdinal == 1) {
            iArr = new int[]{-12940805, -10285313, -5616385, -16745729};
        } else if (iOrdinal == 2) {
            iArr = new int[]{-16745729, -13908427, -14904446, -15024573};
        } else {
            if (iOrdinal != 3) {
                throw new NoWhenBranchMatchedException();
            }
            iArr = new int[]{-9803158, -6645094, -8882570, -10197916};
        }
        int length = iArr.length;
        int i2 = 0;
        while (i < length) {
            this.b[i2].getPaint().setColor(iArr[i]);
            i++;
            i2++;
        }
    }

    public final void b(hmd hmdVar) {
        this.s0.o1(this, A0[0], hmdVar);
    }

    public final void c(boolean z) {
        this.z0.o1(this, A0[7], Boolean.valueOf(z));
    }

    public final void d() {
        bc7 bc7Var = A0[7];
        if (((Boolean) this.z0.b).booleanValue()) {
            ObjectAnimator objectAnimator = this.Y;
            if (objectAnimator.isRunning()) {
                return;
            }
            objectAnimator.start();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        canvas.save();
        float fCenterX = getBounds().centerX();
        float fCenterY = getBounds().centerY();
        canvas.rotate(this.X.a, fCenterX, fCenterY);
        float f = this.o.a;
        canvas.scale(f, f, fCenterX, fCenterY);
        ShapeDrawable[] shapeDrawableArr = this.b;
        int length = shapeDrawableArr.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            ShapeDrawable shapeDrawable = shapeDrawableArr[i];
            int i3 = i2 + 1;
            kpa kpaVar = this.c[i2];
            eob eobVar = (eob) kpaVar.a;
            eob eobVar2 = (eob) kpaVar.b;
            float f2 = eobVar.a;
            float f3 = eobVar2.a;
            int iSave = canvas.save();
            canvas.translate(f2, f3);
            try {
                shapeDrawable.draw(canvas);
                canvas.restoreToCount(iSave);
                i++;
                i2 = i3;
            } catch (Throwable th) {
                canvas.restoreToCount(iSave);
                throw th;
            }
        }
        canvas.restore();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Animatable
    public final boolean isRunning() {
        return this.Z.isRunning() || this.Y.isRunning();
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        bc7 bc7Var = A0[6];
        Integer num = (Integer) this.y0.b;
        int iIntValue = num != null ? num.intValue() : Math.min(rect.width() / 2, rect.height() / 2);
        int i = iIntValue / 2;
        int i2 = 0;
        for (ShapeDrawable shapeDrawable : this.b) {
            float f = iIntValue;
            shapeDrawable.getShape().resize(f, f);
            shapeDrawable.setBounds(0, 0, iIntValue, iIntValue);
        }
        kpa[] kpaVarArr = this.c;
        int length = kpaVarArr.length;
        int i3 = 0;
        while (i2 < length) {
            kpa kpaVar = kpaVarArr[i2];
            int i4 = i3 + 1;
            float f2 = i;
            double d = i3 * 1.5707964f;
            float fCos = (((float) Math.cos(d)) * f2) + rect.left + i;
            float fSin = (f2 * ((float) Math.sin(d))) + rect.top + i;
            ((eob) kpaVar.a).a = fCos;
            ((eob) kpaVar.b).a = fSin;
            i2++;
            i3 = i4;
        }
    }

    @Override // defpackage.kre
    public final void onThemeChanged(fka fkaVar) {
        a(fkaVar);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        for (ShapeDrawable shapeDrawable : this.b) {
            shapeDrawable.setAlpha(i);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        for (ShapeDrawable shapeDrawable : this.b) {
            shapeDrawable.getPaint().setColorFilter(colorFilter);
        }
    }

    @Override // android.graphics.drawable.Animatable
    public final void start() {
        hm9.n("ShineAnimatedDrawable", "start()");
        d();
        this.Z.start();
    }

    @Override // android.graphics.drawable.Animatable
    public final void stop() {
        hm9.n("ShineAnimatedDrawable", "stop()");
        ObjectAnimator objectAnimator = this.Y;
        if (objectAnimator.isRunning()) {
            objectAnimator.cancel();
        }
        this.Z.cancel();
    }
}
