package defpackage;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.view.animation.LinearInterpolator;
import kotlin.NoWhenBranchMatchedException;

/* loaded from: classes.dex */
public final class u91 extends Drawable implements Animatable {
    public static final /* synthetic */ bc7[] s0;
    public final je7 X;
    public final kmd Y;
    public final yj Z;
    public final Context a;
    public final Path b = new Path();
    public final hg c;
    public final ObjectAnimator o;

    static {
        oi9 oi9Var = new oi9(u91.class, "backgroundColor", "getBackgroundColor$calls_ui_release()Lone/me/calls/ui/animation/CallIndicatorWaveDrawable$Companion$BackgroundColor;");
        nec.a.getClass();
        s0 = new bc7[]{oi9Var};
    }

    public u91(Context context) {
        this.a = context;
        hg hgVar = new hg("waveX", 0);
        this.c = hgVar;
        ObjectAnimator objectAnimatorOfInt = ObjectAnimator.ofInt((Object) null, hgVar, 0, context.getResources().getDisplayMetrics().widthPixels);
        objectAnimatorOfInt.setDuration(1200L);
        objectAnimatorOfInt.setRepeatCount(-1);
        objectAnimatorOfInt.setInterpolator(new LinearInterpolator());
        objectAnimatorOfInt.addUpdateListener(new z00(4, this));
        this.o = objectAnimatorOfInt;
        this.X = tu0.r(3, new x5(27, this));
        kmd kmdVarA = a();
        this.Y = kmdVarA;
        this.Z = new yj(this);
        kmd kmdVarA2 = a();
        kmdVarA.getClass();
        bc7 bc7Var = kmd.A0[0];
        kmdVarA2.b((hmd) kmdVarA.s0.b);
    }

    public final kmd a() {
        return (kmd) this.X.getValue();
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        hg hgVar = this.c;
        int iSave = canvas.save();
        try {
            if (this.o.isRunning()) {
                canvas.translate(-hgVar.a, 0.0f);
                Path path = this.b;
                canvas.clipOutPath(path);
                canvas.translate(getBounds().width(), 0.0f);
                canvas.clipOutPath(path);
                canvas.translate(hgVar.a - getBounds().width(), 0.0f);
                yj yjVar = this.Z;
                bc7 bc7Var = s0[0];
                int iOrdinal = ((t91) yjVar.b).ordinal();
                if (iOrdinal != 0) {
                    if (iOrdinal != 1) {
                        throw new NoWhenBranchMatchedException();
                    }
                    canvas.drawColor(qp4.u0.o(this.a).c.b().k);
                }
            }
            a().draw(canvas);
            canvas.restoreToCount(iSave);
        } catch (Throwable th) {
            canvas.restoreToCount(iSave);
            throw th;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return -1;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return -1;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Animatable
    public final boolean isRunning() {
        return a().isRunning() || this.o.isRunning();
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        float fWidth = rect.width();
        float fHeight = rect.height();
        int iMax = Math.max(rect.height(), rect.width());
        kmd kmdVarA = a();
        kmdVarA.y0.o1(kmdVarA, kmd.A0[6], Integer.valueOf(iMax / 2));
        a().setBounds(new Rect(0, 0, rect.width(), iMax));
        float f = 15;
        float f2 = 2;
        float fG = fHeight - (tu0.G(fk4.d().getDisplayMetrics().density * f) / f2);
        Path path = this.b;
        path.rewind();
        path.moveTo(0.0f, fG);
        float f3 = fWidth / 3.0f;
        path.cubicTo(f3, fHeight - tu0.G(fk4.d().getDisplayMetrics().density * f), f3 * f2, fHeight, fWidth, fHeight - (tu0.G(f * fk4.d().getDisplayMetrics().density) / f2));
        path.lineTo(fWidth, fHeight);
        path.lineTo(0.0f, fHeight);
        path.lineTo(0.0f, fG);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        a().setAlpha(i);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }

    @Override // android.graphics.drawable.Animatable
    public final void start() {
        a().a(qp4.u0.o(this.a).c);
        a().start();
        this.o.start();
    }

    @Override // android.graphics.drawable.Animatable
    public final void stop() {
        a().a(qp4.u0.o(this.a).c);
        a().stop();
        this.o.cancel();
    }
}
