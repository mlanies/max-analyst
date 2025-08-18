package defpackage;

import android.content.Context;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import com.facebook.drawee.view.SimpleDraweeView;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class s3e extends hqd implements a1d, zp4 {
    public static final ShapeDrawable K0;
    public final SimpleDraweeView F0;
    public final TextView G0;
    public final TextView H0;
    public final View I0;
    public y0d J0;

    static {
        ShapeDrawable shapeDrawable = new ShapeDrawable();
        float f = fk4.d().getDisplayMetrics().density * 16.0f;
        float[] fArr = new float[8];
        for (int i = 0; i < 8; i++) {
            fArr[i] = f;
        }
        shapeDrawable.setShape(new RoundRectShape(fArr, null, null));
        K0 = shapeDrawable;
    }

    public s3e(Context context) {
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -2);
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setLayoutParams(layoutParams);
        int iG = tu0.G(14 * fk4.d().getDisplayMetrics().density);
        int iG2 = tu0.G(12 * fk4.d().getDisplayMetrics().density);
        frameLayout.setPadding(iG2, iG, iG2, iG);
        SimpleDraweeView simpleDraweeView = new SimpleDraweeView(frameLayout.getContext());
        float f = 40;
        int iG3 = tu0.G(fk4.d().getDisplayMetrics().density * f);
        int i = gja.o;
        simpleDraweeView.setId(i);
        simpleDraweeView.setLayoutParams(new FrameLayout.LayoutParams(iG3, iG3, 8388627));
        ((la6) simpleDraweeView.getHierarchy()).h(ssc.m);
        frameLayout.addView(simpleDraweeView);
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, -2, 16);
        float f2 = 10;
        layoutParams2.leftMargin = rh4.c(f2, fk4.d().getDisplayMetrics().density, tu0.G(f * fk4.d().getDisplayMetrics().density));
        float f3 = 24;
        layoutParams2.rightMargin = rh4.c(f2, fk4.d().getDisplayMetrics().density, tu0.G(fk4.d().getDisplayMetrics().density * f3));
        LinearLayout linearLayout = new LinearLayout(frameLayout.getContext());
        linearLayout.setLayoutParams(layoutParams2);
        linearLayout.setOrientation(1);
        TextView textView = new TextView(linearLayout.getContext());
        int i2 = gja.q;
        textView.setId(i2);
        i4f.k.b(textView, du4.b);
        linearLayout.addView(textView);
        TextView textView2 = new TextView(linearLayout.getContext());
        int i3 = gja.p;
        textView2.setId(i3);
        i4f.p.b(textView2, du4.b);
        linearLayout.addView(textView2);
        Continuation continuation = null;
        v3c.y(new yx5(textView, textView2, continuation, 2), linearLayout);
        frameLayout.addView(linearLayout);
        AppCompatImageView appCompatImageView = new AppCompatImageView(frameLayout.getContext(), null);
        int iG4 = tu0.G(f3 * fk4.d().getDisplayMetrics().density);
        int i4 = gja.n;
        appCompatImageView.setId(i4);
        appCompatImageView.setLayoutParams(new FrameLayout.LayoutParams(iG4, iG4, 8388629));
        appCompatImageView.setImageResource(fja.a);
        int i5 = 3;
        v3c.y(new r1b(i5, continuation, 15), appCompatImageView);
        frameLayout.addView(appCompatImageView);
        v3c.y(new ro2(i5, continuation, 6), frameLayout);
        super(frameLayout);
        this.F0 = (SimpleDraweeView) frameLayout.findViewById(i);
        this.G0 = (TextView) frameLayout.findViewById(i2);
        this.H0 = (TextView) frameLayout.findViewById(i3);
        this.I0 = frameLayout.findViewById(i4);
    }

    @Override // defpackage.hqd
    public final void A(ol7 ol7Var) {
        if (ol7Var instanceof w0d) {
            this.J0 = (y0d) ol7Var;
            w0d w0dVar = (w0d) ol7Var;
            this.F0.setImageURI(w0dVar.b);
            this.G0.setText(w0dVar.c);
            this.H0.setText(w0dVar.o);
        }
    }

    @Override // defpackage.a1d
    public final void b(m6e m6eVar) {
        View view = this.a;
        if (m6eVar != null) {
            tu0.K(view, 300L, new v7d(this, 9, m6eVar));
        } else {
            view.setOnClickListener(null);
        }
    }
}
