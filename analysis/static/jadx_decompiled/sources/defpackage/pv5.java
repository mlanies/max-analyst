package defpackage;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.facebook.drawee.view.SimpleDraweeView;

/* loaded from: classes.dex */
public final class pv5 extends ViewGroup implements kre {
    public final wjc a;
    public final jic b;
    public final TextView c;
    public final TextView o;
    public final SimpleDraweeView s0;

    public pv5(Context context) {
        super(context);
        wjc wjcVar = new wjc();
        this.a = wjcVar;
        float f = 28;
        int iG = tu0.G(fk4.d().getDisplayMetrics().density * f);
        this.b = iG <= 0 ? null : new jic(0.0f, iG, iG, 12);
        TextView textView = new TextView(context);
        textView.setId(uvb.oneme_folder_widget_title);
        textView.setMaxLines(2);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView.setEllipsize(truncateAt);
        i4f.q.b(textView, du4.b);
        this.c = textView;
        TextView textView2 = new TextView(context);
        textView2.setId(uvb.oneme_folder_widget_description);
        textView2.setMaxLines(2);
        textView2.setEllipsize(truncateAt);
        i4f.s.b(textView2, du4.b);
        this.o = textView2;
        SimpleDraweeView simpleDraweeView = new SimpleDraweeView(context);
        simpleDraweeView.setId(uvb.oneme_folder_widget_icon);
        e2b e2bVar = s36.a.get();
        e2bVar.g = wjcVar;
        e2bVar.k = true;
        simpleDraweeView.setController(e2bVar.a());
        this.s0 = simpleDraweeView;
        setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
        int iG2 = tu0.G(12 * fk4.d().getDisplayMetrics().density);
        setPadding(iG2, iG2, iG2, iG2);
        addView(simpleDraweeView, new ViewGroup.LayoutParams(tu0.G(fk4.d().getDisplayMetrics().density * f), tu0.G(f * fk4.d().getDisplayMetrics().density)));
        addView(textView, new ViewGroup.LayoutParams(-2, -2));
        addView(textView2, new ViewGroup.LayoutParams(-2, -2));
        setOutlineProvider(new ix3(fk4.d().getDisplayMetrics().density * 20.0f));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        onThemeChanged(qp4.u0.j(this));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        float f = 12;
        int iG = tu0.G(fk4.d().getDisplayMetrics().density * f);
        TextView textView = this.c;
        ote.E(textView, tu0.G(fk4.d().getDisplayMetrics().density * f), iG, 0, 12);
        ote.E(this.o, tu0.G(fk4.d().getDisplayMetrics().density * f), wg0.d(4, fk4.d().getDisplayMetrics().density, textView.getMeasuredHeight(), iG), 0, 12);
        SimpleDraweeView simpleDraweeView = this.s0;
        simpleDraweeView.layout(tu0.G(fk4.d().getDisplayMetrics().density * f), rh4.q(f, fk4.d().getDisplayMetrics().density, getMeasuredHeight() - simpleDraweeView.getMeasuredHeight()), simpleDraweeView.getMeasuredWidth() + tu0.G(fk4.d().getDisplayMetrics().density * f), rh4.q(f, fk4.d().getDisplayMetrics().density, getMeasuredHeight()));
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        float f = 12;
        this.c.measure(View.MeasureSpec.makeMeasureSpec(size - (tu0.G(fk4.d().getDisplayMetrics().density * f) * 2), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(0, 0));
        this.o.measure(View.MeasureSpec.makeMeasureSpec(size - (tu0.G(f * fk4.d().getDisplayMetrics().density) * 2), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(0, 0));
        float f2 = 28;
        this.s0.measure(View.MeasureSpec.makeMeasureSpec(tu0.G(fk4.d().getDisplayMetrics().density * f2), 1073741824), View.MeasureSpec.makeMeasureSpec(tu0.G(f2 * fk4.d().getDisplayMetrics().density), 1073741824));
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
