package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;

/* loaded from: classes.dex */
public final class fy2 extends View implements kre {
    public final e23 a;
    public ey2 b;
    public final tz6 c;

    public fy2(Context context) {
        super(context);
        e23 e23Var = new e23(context, null);
        float f = 28;
        e23Var.h = tu0.G(fk4.d().getDisplayMetrics().density * f);
        e23Var.j = 0;
        e23Var.c = new int[]{qp4.u0.b(context).i().e().e.e.a};
        e23Var.b = tu0.G(20 * fk4.d().getDisplayMetrics().density);
        e23Var.a = tu0.G(3 * fk4.d().getDisplayMetrics().density);
        e23Var.g = tu0.G(2 * fk4.d().getDisplayMetrics().density);
        this.a = e23Var;
        tz6 tz6Var = new tz6(context, e23Var, new y13(e23Var), new a23(e23Var));
        Resources resources = context.getResources();
        int i = yub.indeterminate_static;
        qbf qbfVar = new qbf();
        ThreadLocal threadLocal = vic.a;
        qbfVar.a = qic.a(resources, i, null);
        new pbf(qbfVar.a.getConstantState());
        tz6Var.y0 = qbfVar;
        tz6Var.setBounds(0, 0, tu0.G(fk4.d().getDisplayMetrics().density * f), tu0.G(fk4.d().getDisplayMetrics().density * f));
        tz6Var.d(true, true, true);
        tz6Var.setCallback(this);
        this.c = tz6Var;
        setLayerType(2, null);
        float f2 = 10;
        setPadding(0, tu0.G(fk4.d().getDisplayMetrics().density * f2), 0, tu0.G(f2 * fk4.d().getDisplayMetrics().density));
        setLayoutParams(new ViewGroup.LayoutParams(-1, rh4.c(f, fk4.d().getDisplayMetrics().density, getPaddingBottom() + getPaddingTop())));
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        tz6 tz6Var = this.c;
        int iSave = canvas.save();
        canvas.translate((getWidth() / 2.0f) - (tz6Var.getBounds().width() / 2.0f), (getHeight() / 2.0f) - (tz6Var.getBounds().height() / 2.0f));
        try {
            tz6Var.draw(canvas);
            canvas.restoreToCount(iSave);
            tz6Var.invalidateSelf();
        } catch (Throwable th) {
            canvas.restoreToCount(iSave);
            throw th;
        }
    }

    @Override // defpackage.kre
    public final void onThemeChanged(fka fkaVar) {
        this.a.c = new int[]{fkaVar.e().e.e.a};
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.c;
    }
}
