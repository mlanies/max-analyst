package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.widget.FrameLayout;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;

/* loaded from: classes2.dex */
public final class vm4 extends FrameLayout {
    public tg a;
    public final AppCompatTextView b;
    public final ShapeDrawable c;
    public final bt o;
    public ph4 s0;

    public vm4(Context context, int i) {
        super(context);
        bk4 bk4VarB = bk4.b();
        Resources resources = context.getResources();
        bt btVar = new bt();
        btVar.addFrame(resources.getDrawable(gpc.C0), 50);
        btVar.addFrame(resources.getDrawable(gpc.J0), 50);
        btVar.addFrame(resources.getDrawable(gpc.K0), 50);
        btVar.addFrame(resources.getDrawable(gpc.L0), 50);
        btVar.addFrame(resources.getDrawable(gpc.M0), 50);
        btVar.addFrame(resources.getDrawable(gpc.N0), 50);
        btVar.addFrame(resources.getDrawable(gpc.O0), 50);
        btVar.addFrame(resources.getDrawable(gpc.P0), 50);
        btVar.addFrame(resources.getDrawable(gpc.Q0), 50);
        btVar.addFrame(resources.getDrawable(gpc.D0), 50);
        btVar.addFrame(resources.getDrawable(gpc.E0), 50);
        btVar.addFrame(resources.getDrawable(gpc.F0), 50);
        btVar.addFrame(resources.getDrawable(gpc.G0), 50);
        btVar.addFrame(resources.getDrawable(gpc.H0), 50);
        btVar.addFrame(resources.getDrawable(gpc.I0), 50);
        this.o = btVar;
        AppCompatImageView appCompatImageView = new AppCompatImageView(getContext(), null);
        appCompatImageView.setImageDrawable(this.o);
        int i2 = bk4VarB.t;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i2, i2);
        layoutParams.gravity = 17;
        layoutParams.bottomMargin = bk4VarB.i;
        if (i == 1) {
            appCompatImageView.setRotationY(180.0f);
        }
        addView(appCompatImageView, layoutParams);
        AppCompatTextView appCompatTextView = new AppCompatTextView(getContext(), null);
        this.b = appCompatTextView;
        appCompatTextView.setTextColor(-1);
        this.b.setTextSize(bk4VarB.F);
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-2, -2);
        layoutParams2.gravity = 17;
        layoutParams2.topMargin = bk4VarB.i;
        addView(this.b, layoutParams2);
        int color = Color.parseColor("#40FFFFFF");
        ShapeDrawable shapeDrawable = new ShapeDrawable();
        this.c = shapeDrawable;
        shapeDrawable.getPaint().setColor(color);
        setBackground(this.c);
        int iB = fk4.b((int) 180.0f);
        if (i == 1) {
            float f = iB;
            setCorners(new float[]{0.0f, 0.0f, f, f, f, f, 0.0f, 0.0f});
        } else {
            float f2 = iB;
            setCorners(new float[]{f2, f2, 0.0f, 0.0f, 0.0f, 0.0f, f2, f2});
        }
    }

    private void setCorners(float[] fArr) {
        this.c.setShape(new RoundRectShape(fArr, null, null));
    }

    public final void a() {
        if (getVisibility() == 8) {
            return;
        }
        if (this.a == null) {
            setVisibility(8);
            return;
        }
        ph4 ph4Var = this.s0;
        if (ph4Var != null) {
            ph4Var.h();
        }
        this.o.stop();
        this.s0 = this.a.g(this);
    }

    public final void b() {
        if (getVisibility() == 0) {
            return;
        }
        if (this.a == null) {
            setVisibility(0);
            return;
        }
        if (this.o.isRunning()) {
            return;
        }
        ph4 ph4Var = this.s0;
        if (ph4Var != null) {
            ph4Var.h();
        }
        this.o.start();
        this.s0 = this.a.i(this);
    }

    public final void c(int i) {
        if (i == 0) {
            this.b.setText("");
        } else {
            this.b.setText(getResources().getString(jpc.z2, Integer.valueOf(i)));
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.o.stop();
        ph4 ph4Var = this.s0;
        if (ph4Var != null) {
            ph4Var.h();
        }
    }

    public void setAnimations(tg tgVar) {
        this.a = tgVar;
    }
}
