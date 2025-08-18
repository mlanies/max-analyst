package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.widget.FrameLayout;

/* loaded from: classes.dex */
public final class v21 extends FrameLayout {
    public final Drawable a;
    public final Drawable b;

    public v21(Context context) {
        super(context, null);
        je7 je7VarR = tu0.r(3, new k11(3));
        Drawable drawableB = kt3.b(context, ztb.ic_call_speaker_24);
        pq9 pq9Var = qp4.u0;
        pq9Var.p(this).c.getIcon();
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        drawableB.setColorFilter(new PorterDuffColorFilter(-1, mode));
        this.a = drawableB;
        Drawable drawableB2 = kt3.b(context, woc.a0);
        pq9Var.p(this).c.getIcon();
        drawableB2.setColorFilter(new PorterDuffColorFilter(-1, mode));
        this.b = drawableB2;
        ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape((float[]) je7VarR.getValue(), null, null));
        shapeDrawable.getPaint().setColor(pq9Var.p(this).c.b().k);
        setBackground(shapeDrawable);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int paddingTop = getPaddingTop();
        int height = ((getHeight() - getPaddingTop()) - paddingTop) / 2;
        int paddingLeft = getPaddingLeft();
        int paddingTop2 = getPaddingTop();
        int width = getWidth() - getPaddingRight();
        int height2 = (getHeight() - paddingTop) - height;
        Drawable drawable = this.a;
        drawable.setBounds(paddingLeft, paddingTop2, width, height2);
        drawable.draw(canvas);
        int paddingLeft2 = getPaddingLeft();
        int paddingTop3 = getPaddingTop() + height + paddingTop;
        int width2 = getWidth() - getPaddingRight();
        int height3 = getHeight() - getPaddingBottom();
        Drawable drawable2 = this.b;
        drawable2.setBounds(paddingLeft2, paddingTop3, width2, height3);
        drawable2.draw(canvas);
    }
}
