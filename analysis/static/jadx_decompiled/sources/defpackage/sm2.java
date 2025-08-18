package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.view.ViewGroup;
import android.widget.LinearLayout;

/* loaded from: classes.dex */
public final class sm2 extends LinearLayout implements kre {
    public final ppe a;
    public final ppe b;
    public final ppe c;
    public final Paint o;

    public sm2(Context context) {
        super(context, null);
        ppe ppeVar = new ppe(context);
        this.a = ppeVar;
        ppe ppeVar2 = new ppe(context);
        this.b = ppeVar2;
        ppe ppeVar3 = new ppe(context);
        this.c = ppeVar3;
        Paint paint = new Paint(1);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(fk4.d().getDisplayMetrics().density * 1.0f);
        pq9 pq9Var = qp4.u0;
        paint.setColor(pq9Var.j(this).i().b.b);
        this.o = paint;
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setCornerRadius(fk4.d().getDisplayMetrics().density * 16.0f);
        gradientDrawable.setOrientation(GradientDrawable.Orientation.BL_TR);
        l73 l73Var = pq9Var.j(this).a().s().b.a;
        gradientDrawable.setColors(new int[]{l73Var.g, l73Var.h});
        setOrientation(1);
        setGravity(16);
        setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 8388611;
        float f = 16;
        layoutParams.topMargin = tu0.G(fk4.d().getDisplayMetrics().density * f);
        layoutParams.setMarginStart(tu0.G(fk4.d().getDisplayMetrics().density * f));
        addView(ppeVar, layoutParams);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams2.topMargin = tu0.G(12 * fk4.d().getDisplayMetrics().density);
        layoutParams2.setMarginEnd(tu0.G(fk4.d().getDisplayMetrics().density * f));
        layoutParams2.gravity = 8388613;
        addView(ppeVar2, layoutParams2);
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams3.gravity = 8388611;
        layoutParams3.topMargin = tu0.G(fk4.d().getDisplayMetrics().density * f);
        layoutParams3.setMarginStart(tu0.G(fk4.d().getDisplayMetrics().density * f));
        layoutParams3.bottomMargin = tu0.G(f * fk4.d().getDisplayMetrics().density);
        addView(ppeVar3, layoutParams3);
        setClipToOutline(true);
        setOutlineProvider(new ix3(fk4.d().getDisplayMetrics().density * 16.0f));
        setBackground(gradientDrawable);
    }

    public final void a(qm2 qm2Var) {
        k29 k29Var = qm2Var.f;
        e52 e52Var = qm2Var.a;
        es8 es8Var = qm2Var.d;
        by8 by8VarC = k29.c(k29Var, e52Var, es8Var, true);
        es8 es8Var2 = qm2Var.b;
        by8 by8VarC2 = k29.c(k29Var, e52Var, es8Var2, true);
        es8 es8Var3 = qm2Var.c;
        by8 by8VarC3 = k29.c(k29Var, e52Var, es8Var3, true);
        ppe ppeVar = this.a;
        if (by8VarC2 != null) {
            ppeVar.setTextMessageLayout(by8VarC2);
        }
        qx7 qx7Var = vs8.y;
        pq9 pq9Var = qp4.u0;
        fka fkaVarJ = pq9Var.j(ppeVar);
        qx7Var.getClass();
        ppeVar.setBackground(qx7.e(fkaVarJ));
        u6b u6bVar = es8Var2.X;
        u6bVar.f();
        ppeVar.g(u6bVar.k, false);
        ppe ppeVar2 = this.b;
        if (by8VarC != null) {
            ppeVar2.setTextMessageLayout(by8VarC);
            ix8 ix8Var = es8Var.a.S0;
            if (ix8Var != null) {
                ppeVar2.f(ix8Var, false);
            }
            ppeVar2.setBackground(qx7.e(pq9Var.j(ppeVar2)));
        }
        ppeVar2.setDateViewStatus(qm2Var.e);
        u6b u6bVar2 = es8Var.X;
        u6bVar2.f();
        ppeVar2.g(u6bVar2.k, false);
        ppe ppeVar3 = this.c;
        if (by8VarC3 != null) {
            ppeVar3.setTextMessageLayout(by8VarC3);
        }
        ppeVar3.setBackground(qx7.e(pq9Var.j(ppeVar3)));
        u6b u6bVar3 = es8Var3.X;
        u6bVar3.f();
        ppeVar3.g(u6bVar3.k, false);
        nr2 nr2Var = qm2Var.g;
        ppeVar2.setDateTextColor(nr2Var.k().d.m);
        ppeVar2.setTextMessageColors(nr2Var.k());
        ppeVar2.k(nr2Var.k(), true);
        Drawable background = ppeVar2.getBackground();
        vs8 vs8Var = background instanceof vs8 ? (vs8) background : null;
        if (vs8Var != null) {
            if (vs8.b(vs8Var, false, 1, true, true, nr2Var.k().c.a, false)) {
                vs8Var.invalidateSelf();
            }
        }
        ppeVar2.requestLayout();
        ppeVar3.setTextMessageColors(nr2Var.g());
        ppeVar3.setDateTextColor(nr2Var.g().d.m);
        Drawable background2 = ppeVar3.getBackground();
        vs8 vs8Var2 = background2 instanceof vs8 ? (vs8) background2 : null;
        if (vs8Var2 != null) {
            if (vs8.b(vs8Var2, true, 1, true, true, nr2Var.d(true).c.a, false)) {
                vs8Var2.invalidateSelf();
            }
        }
        ppeVar3.requestLayout();
        ppeVar.setDateTextColor(nr2Var.g().d.m);
        ppeVar.setTextMessageColors(nr2Var.g());
        Drawable background3 = ppeVar.getBackground();
        vs8 vs8Var3 = background3 instanceof vs8 ? (vs8) background3 : null;
        if (vs8Var3 != null) {
            if (vs8.b(vs8Var3, true, 1, true, true, nr2Var.d(true).c.a, false)) {
                vs8Var3.invalidateSelf();
            }
        }
        ppeVar.requestLayout();
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        float f = (fk4.d().getDisplayMetrics().density * 1.0f) / 2;
        canvas.drawRoundRect(f, f, getWidth() - f, getHeight() - f, (fk4.d().getDisplayMetrics().density * 16.0f) - f, (fk4.d().getDisplayMetrics().density * 16.0f) - f, this.o);
    }

    @Override // defpackage.kre
    public final void onThemeChanged(fka fkaVar) {
        Drawable background = getBackground();
        GradientDrawable gradientDrawable = background instanceof GradientDrawable ? (GradientDrawable) background : null;
        if (gradientDrawable != null) {
            l73 l73Var = fkaVar.a().s().b.a;
            gradientDrawable.setColors(new int[]{l73Var.g, l73Var.h});
        }
        qp4.d(qp4.u0.b(getContext()), this);
    }

    public final void setBackgroundPreview(Drawable drawable) {
        setBackground(drawable);
        requestLayout();
    }
}
