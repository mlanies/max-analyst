package defpackage;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.widget.FrameLayout;
import android.widget.TextView;

/* loaded from: classes.dex */
public final class v51 extends FrameLayout {
    public final TextView a;
    public final je7 b;

    public v51(Context context) {
        super(context, null);
        this.b = tu0.r(3, new k11(8));
        setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
        TextView textView = new TextView(context);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, tu0.G(28 * fk4.d().getDisplayMetrics().density));
        layoutParams.gravity = 17;
        textView.setLayoutParams(layoutParams);
        textView.setId(rvb.call_event_icon);
        textView.setBackground(getBackgroundView());
        textView.setMaxLines(1);
        i4f.p.b(textView, du4.b);
        textView.setTextColor(qp4.u0.p(textView).c.getText().e);
        textView.setGravity(17);
        float f = 8;
        textView.setPadding(tu0.G(fk4.d().getDisplayMetrics().density * f), textView.getPaddingTop(), tu0.G(f * fk4.d().getDisplayMetrics().density), textView.getPaddingBottom());
        np8.n(textView);
        this.a = textView;
        addView(textView);
    }

    private final Drawable getBackgroundView() {
        ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(getBgRadius(), null, null));
        shapeDrawable.getPaint().setColor(Color.parseColor("#CC393A40"));
        return shapeDrawable;
    }

    private final float[] getBgRadius() {
        return (float[]) this.b.getValue();
    }

    public final void setLabel(CharSequence charSequence) {
        this.a.setText(charSequence);
    }
}
