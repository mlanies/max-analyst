package defpackage;

import android.content.Context;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class af2 extends LinearLayout {
    public final ImageView a;
    public final TextView b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public af2(Context context) {
        super(context, null);
        Continuation continuation = null;
        ImageView imageView = new ImageView(context);
        float f = 188;
        imageView.setLayoutParams(new LinearLayout.LayoutParams(tu0.G(fk4.d().getDisplayMetrics().density * f), tu0.G(f * fk4.d().getDisplayMetrics().density)));
        setGravity(1);
        int i = 3;
        v3c.y(new ze2(i, continuation, 0), imageView);
        this.a = imageView;
        TextView textView = new TextView(context);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.topMargin = tu0.G(16 * fk4.d().getDisplayMetrics().density);
        textView.setLayoutParams(layoutParams);
        textView.setGravity(1);
        i4f.d.b(textView, du4.b);
        v3c.y(new v9(i, continuation, 4), textView);
        this.b = textView;
        setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
        setGravity(17);
        setOrientation(1);
        addView(imageView);
        addView(textView);
    }

    public final void setIcon(int i) {
        this.a.setImageDrawable(kt3.b(getContext(), i));
    }

    public final void setTitle(int i) {
        this.b.setText(z7.B(getContext(), i));
    }
}
