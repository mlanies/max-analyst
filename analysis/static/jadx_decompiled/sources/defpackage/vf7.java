package defpackage;

import android.content.Context;
import android.widget.ImageView;
import android.widget.LinearLayout;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class vf7 extends LinearLayout {
    public boolean a;
    public final ld6 b;
    public final ImageView c;

    public vf7(Context context) {
        super(context, null);
        this.a = true;
        ld6 ld6Var = new ld6(context);
        ld6Var.setAnimConfig(new kd6(0, 0L, 1500L, 0.0f, 16));
        this.b = ld6Var;
        ImageView imageView = new ImageView(context);
        this.c = imageView;
        setOrientation(0);
        ld6Var.setImageResource(eub.max_image_logo);
        float f = 32;
        ld6Var.setLayoutParams(new LinearLayout.LayoutParams(tu0.G(fk4.d().getDisplayMetrics().density * f), tu0.G(fk4.d().getDisplayMetrics().density * f)));
        imageView.setImageResource(eub.max_text_logo);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(tu0.G(58 * fk4.d().getDisplayMetrics().density), tu0.G(f * fk4.d().getDisplayMetrics().density));
        layoutParams.setMarginStart(tu0.G(10 * fk4.d().getDisplayMetrics().density));
        imageView.setLayoutParams(layoutParams);
        addView(ld6Var);
        addView(imageView);
        setGravity(17);
        post(new nn6(6, this));
        v3c.y(new xh0(3, (Continuation) null, 17), this);
    }
}
