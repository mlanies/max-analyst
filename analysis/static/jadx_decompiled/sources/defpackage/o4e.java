package defpackage;

import android.content.Context;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

/* loaded from: classes2.dex */
public final class o4e extends LinearLayout {
    public final ImageView a;
    public final TextView b;
    public final TextView c;

    public o4e(Context context) {
        super(context, null);
        setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        setOrientation(1);
        setGravity(17);
        int iG = tu0.G(21 * fk4.d().getDisplayMetrics().density);
        ImageView imageView = new ImageView(context);
        int iG2 = tu0.G(188 * fk4.d().getDisplayMetrics().density);
        imageView.setLayoutParams(new LinearLayout.LayoutParams(iG2, iG2));
        addView(imageView);
        this.a = imageView;
        TextView textView = new TextView(context);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.topMargin = tu0.G(16 * fk4.d().getDisplayMetrics().density);
        layoutParams.leftMargin = iG;
        layoutParams.rightMargin = iG;
        textView.setLayoutParams(layoutParams);
        textView.setGravity(17);
        i4f.d.b(textView, du4.b);
        v3c.y(new fv5(3, null, 1), textView);
        addView(textView);
        this.b = textView;
        TextView textView2 = new TextView(context);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams2.topMargin = tu0.G(2 * fk4.d().getDisplayMetrics().density);
        layoutParams2.leftMargin = iG;
        layoutParams2.rightMargin = iG;
        textView2.setLayoutParams(layoutParams2);
        textView2.setGravity(17);
        i4f.n.b(textView2, du4.b);
        v3c.y(new fv5(3, null, 2), textView2);
        addView(textView2);
        this.c = textView2;
    }

    public final void setIcon(int i) {
        this.a.setImageResource(i);
    }

    public final void setSubtitle(Integer num) {
        TextView textView = this.c;
        if (num == null) {
            textView.setVisibility(8);
        } else {
            textView.setVisibility(0);
            textView.setText(num.intValue());
        }
    }

    public final void setTitle(int i) {
        this.b.setText(i);
    }
}
