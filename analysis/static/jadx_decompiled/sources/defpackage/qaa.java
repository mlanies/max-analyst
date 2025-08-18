package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import kotlin.NoWhenBranchMatchedException;

/* loaded from: classes.dex */
public final class qaa extends View {
    public static final /* synthetic */ bc7[] o;
    public final int a;
    public final yj b;
    public final Paint c;

    static {
        oi9 oi9Var = new oi9(qaa.class, "appearance", "getAppearance()Lone/me/common/dot/OneMeDot$Appearance;");
        nec.a.getClass();
        o = new bc7[]{oi9Var};
    }

    public qaa(Context context) {
        int i;
        super(context, null);
        this.a = tu0.G(6 * fk4.d().getDisplayMetrics().density);
        this.b = new yj(this);
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paa appearance = getAppearance();
        fka fkaVarJ = qp4.u0.j(this);
        int iOrdinal = appearance.ordinal();
        if (iOrdinal == 0) {
            i = fkaVarJ.b().a.m;
        } else if (iOrdinal == 1) {
            i = fkaVarJ.b().a.c;
        } else if (iOrdinal == 2) {
            i = fkaVarJ.b().a.g;
        } else {
            if (iOrdinal != 3) {
                throw new NoWhenBranchMatchedException();
            }
            i = fkaVarJ.b().a.e;
        }
        paint.setColor(i);
        this.c = paint;
    }

    public final paa getAppearance() {
        bc7 bc7Var = o[0];
        return (paa) this.b.b;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        float measuredWidth = getMeasuredWidth();
        float measuredHeight = getMeasuredHeight();
        int i = this.a;
        canvas.drawRoundRect(0.0f, 0.0f, measuredWidth, measuredHeight, i / 2.0f, i / 2.0f, this.c);
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        int i3 = this.a;
        setMeasuredDimension(View.MeasureSpec.makeMeasureSpec(i3, 1073741824), View.MeasureSpec.makeMeasureSpec(i3, 1073741824));
    }

    public final void setAppearance(paa paaVar) {
        this.b.o1(this, o[0], paaVar);
    }
}
