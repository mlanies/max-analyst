package defpackage;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.facebook.drawee.view.SimpleDraweeView;

/* loaded from: classes.dex */
public final class bm0 extends FrameLayout implements kre {
    public final wjc a;
    public final jic b;
    public final TextView c;
    public final TextView o;
    public final SimpleDraweeView s0;

    public bm0(Context context) {
        super(context);
        wjc wjcVar = new wjc();
        this.a = wjcVar;
        float f = 32;
        int iG = tu0.G(fk4.d().getDisplayMetrics().density * f);
        this.b = iG <= 0 ? null : new jic(0.0f, iG, iG, 12);
        TextView textView = new TextView(context);
        textView.setId(uvb.oneme_folder_widget_title);
        textView.setMaxLines(2);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView.setEllipsize(truncateAt);
        i4f.z.b(textView, du4.b);
        this.c = textView;
        TextView textView2 = new TextView(context);
        textView2.setId(uvb.oneme_folder_widget_description);
        textView2.setMaxLines(2);
        textView2.setEllipsize(truncateAt);
        i4f.n.b(textView2, du4.b);
        this.o = textView2;
        SimpleDraweeView simpleDraweeView = new SimpleDraweeView(context);
        simpleDraweeView.setId(uvb.oneme_folder_widget_icon);
        e2b e2bVar = s36.a.get();
        e2bVar.g = wjcVar;
        e2bVar.k = true;
        simpleDraweeView.setController(e2bVar.a());
        this.s0 = simpleDraweeView;
        setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
        addView(simpleDraweeView, new FrameLayout.LayoutParams(tu0.G(fk4.d().getDisplayMetrics().density * f), tu0.G(f * fk4.d().getDisplayMetrics().density)));
        addView(textView, new FrameLayout.LayoutParams(-2, -2));
        addView(textView2, new FrameLayout.LayoutParams(-2, -2));
        setOutlineProvider(new ix3(fk4.d().getDisplayMetrics().density * 20.0f));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        onThemeChanged(qp4.u0.j(this));
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int measuredHeight = getMeasuredHeight() / 2;
        TextView textView = this.c;
        int measuredHeight2 = textView.getMeasuredHeight();
        TextView textView2 = this.o;
        int measuredHeight3 = textView2.getMeasuredHeight() + measuredHeight2;
        float f = 4;
        int iG = measuredHeight - ((tu0.G(fk4.d().getDisplayMetrics().density * f) + measuredHeight3) / 2);
        float f2 = 16;
        ote.E(textView, tu0.G(fk4.d().getDisplayMetrics().density * f2), iG, 0, 12);
        ote.E(textView2, tu0.G(f2 * fk4.d().getDisplayMetrics().density), wg0.d(f, fk4.d().getDisplayMetrics().density, textView.getMeasuredHeight(), iG), 0, 12);
        SimpleDraweeView simpleDraweeView = this.s0;
        float f3 = 32;
        simpleDraweeView.layout(rh4.q(f3, fk4.d().getDisplayMetrics().density, getMeasuredWidth()) - simpleDraweeView.getMeasuredWidth(), (getMeasuredHeight() / 2) - (simpleDraweeView.getMeasuredHeight() / 2), rh4.q(f3, fk4.d().getDisplayMetrics().density, getMeasuredWidth()), (simpleDraweeView.getMeasuredHeight() / 2) + (getMeasuredHeight() / 2));
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        float f = 32;
        int iQ = rh4.q(12, fk4.d().getDisplayMetrics().density, rh4.q(f, fk4.d().getDisplayMetrics().density, rh4.q(f, fk4.d().getDisplayMetrics().density, rh4.q(16, fk4.d().getDisplayMetrics().density, size))));
        this.c.measure(View.MeasureSpec.makeMeasureSpec(iQ, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(0, 0));
        this.o.measure(View.MeasureSpec.makeMeasureSpec(iQ, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(0, 0));
        this.s0.measure(View.MeasureSpec.makeMeasureSpec(tu0.G(fk4.d().getDisplayMetrics().density * f), 1073741824), View.MeasureSpec.makeMeasureSpec(tu0.G(f * fk4.d().getDisplayMetrics().density), 1073741824));
        setMeasuredDimension(size, size2);
    }

    @Override // defpackage.kre
    public final void onThemeChanged(fka fkaVar) {
        TextView textView = this.c;
        fkaVar.getText();
        textView.setTextColor(-1);
        this.o.setTextColor(f8.G(-1, 0.7f));
    }
}
