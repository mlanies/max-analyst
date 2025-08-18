package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Point;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.Animation;
import android.view.animation.DecelerateInterpolator;
import android.widget.ImageView;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;

/* loaded from: classes2.dex */
public final class ywe extends PopupWindow implements kre {
    public final int X;
    public final int Y;
    public final ImageView Z;
    public final View a;
    public final k56 b;
    public final k56 c;
    public final k56 o;
    public final TextView s0;
    public final TextView t0;
    public final ImageView u0;
    public final Handler v0;
    public ule w0;
    public final je7 x0;

    public /* synthetic */ ywe(Context context, View view, k56 k56Var, k56 k56Var2, int i, int i2, int i3) {
        this(context, view, k56Var, (i3 & 8) != 0 ? new sh5(1, k56Var) : k56Var2, (i3 & 16) != 0 ? new sh5(2, k56Var) : null, (i3 & 32) != 0 ? 2 : i, (i3 & 64) != 0 ? 2 : i2);
    }

    public static void b(ywe yweVar, View view, boolean z, wwe wweVar, int i) {
        wwe wweVar2 = (i & 4) != 0 ? null : wweVar;
        yweVar.getClass();
        int i2 = xoc.R0;
        Object tag = view.getTag(i2);
        if (tag == null) {
            if ((view.getVisibility() == 0) == z) {
                if (wweVar2 != null) {
                    wweVar2.invoke();
                    return;
                }
                return;
            }
        }
        boolean zF = tpa.f(tag, "fade_in");
        boolean zF2 = tpa.f(tag, "fade_out");
        if (zF && z) {
            return;
        }
        if (!zF2 || z) {
            String str = z ? "fade_in" : "fade_out";
            view.animate().cancel();
            view.clearAnimation();
            Animation animation = view.getAnimation();
            if (animation != null) {
                animation.setAnimationListener(null);
            }
            float alpha = view.getAlpha();
            float f = z ? 1.0f : 0.0f;
            float f2 = z ? fk4.d().getDisplayMetrics().density * 24.0f : fk4.d().getDisplayMetrics().density * 0.0f;
            float f3 = z ? fk4.d().getDisplayMetrics().density * 0.0f : fk4.d().getDisplayMetrics().density * 24.0f;
            if (z) {
                view.setTranslationY(f2);
            }
            view.animate().setDuration(150L).alpha(f).translationY(f3).setInterpolator(z ? new DecelerateInterpolator() : new AccelerateInterpolator()).setListener(new xwe(view, i2, str, alpha, f, z, f3, wweVar2)).start();
        }
    }

    public final void a() {
        View contentView = getContentView();
        if (contentView != null) {
            b(this, contentView, false, new wwe(this, 0), 2);
        }
    }

    public final void c(Integer num) {
        ImageView imageView = this.Z;
        imageView.setVisibility(num != null ? 0 : 8);
        k56 k56Var = this.o;
        imageView.setImageTintList(k56Var != null ? ColorStateList.valueOf(((Number) k56Var.invoke()).intValue()) : null);
        if (num != null) {
            imageView.setImageResource(num.intValue());
        }
        TextView textView = this.s0;
        ViewGroup.LayoutParams layoutParams = textView.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        marginLayoutParams.topMargin = num != null ? tu0.G(8 * fk4.d().getDisplayMetrics().density) : 0;
        textView.setLayoutParams(marginLayoutParams);
    }

    public final void d(jqe jqeVar) {
        TextView textView = this.s0;
        textView.setText(jqeVar.b(textView.getContext()));
    }

    @Override // android.widget.PopupWindow
    public final void dismiss() {
        super.dismiss();
        try {
            ule uleVar = this.w0;
            if (uleVar != null) {
                this.v0.removeCallbacks(uleVar);
            }
        } catch (Exception e) {
            hm9.l0(ywe.class.getName(), e.getMessage(), e);
        }
        this.w0 = null;
    }

    public final void e(Point point, int i, long j) {
        ule uleVar = this.w0;
        Handler handler = this.v0;
        if (uleVar != null) {
            handler.removeCallbacks(uleVar);
            this.w0 = null;
        }
        showAtLocation(this.a, i, point.x - (getWidth() / 2), point.y);
        View contentView = getContentView();
        if (contentView != null) {
            b(this, contentView, true, null, 6);
        }
        ule uleVar2 = new ule(3, this);
        handler.postDelayed(uleVar2, j);
        this.w0 = uleVar2;
    }

    @Override // defpackage.kre
    public final void onThemeChanged(fka fkaVar) {
        k56 k56Var = this.b;
        fka fkaVar2 = (fka) k56Var.invoke();
        ImageView imageView = this.Z;
        k56 k56Var2 = this.o;
        imageView.setImageTintList(k56Var2 != null ? ColorStateList.valueOf(((Number) k56Var2.invoke()).intValue()) : null);
        this.s0.setTextColor(ColorStateList.valueOf(fkaVar2.getText().e));
        ((twe) this.x0.getValue()).onThemeChanged(fkaVar);
        ImageView imageView2 = this.u0;
        ((fka) k56Var.invoke()).getIcon();
        imageView2.setImageTintList(ColorStateList.valueOf(-1));
    }

    public ywe(Context context, View view, k56 k56Var, k56 k56Var2, k56 k56Var3, int i, int i2) {
        this.a = view;
        this.b = k56Var;
        this.c = k56Var2;
        this.o = k56Var3;
        this.X = i;
        this.Y = i2;
        this.v0 = new Handler(Looper.getMainLooper());
        je7 je7VarR = tu0.r(3, new wwe(this, 1));
        this.x0 = je7VarR;
        fka fkaVar = (fka) k56Var.invoke();
        setHeight(-2);
        setWidth(-2);
        setOutsideTouchable(false);
        ImageView imageView = new ImageView(context);
        imageView.setId(xoc.T0);
        imageView.setLayoutParams(new ti3(-2, -2));
        imageView.setVisibility(8);
        this.Z = imageView;
        TextView textView = new TextView(context);
        textView.setId(xoc.V0);
        textView.setLayoutParams(new ti3(-1, -2));
        textView.setGravity(17);
        textView.setMaxLines(3);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView.setEllipsize(truncateAt);
        textView.setTextColor(ColorStateList.valueOf(fkaVar.getText().e));
        i4f.p.b(textView, du4.b);
        this.s0 = textView;
        ImageView imageView2 = new ImageView(context);
        imageView2.setId(xoc.S0);
        float f = 20;
        imageView2.setLayoutParams(new ti3(tu0.G(fk4.d().getDisplayMetrics().density * f), tu0.G(f * fk4.d().getDisplayMetrics().density)));
        imageView2.setImageResource(woc.i0);
        ((fka) k56Var.invoke()).getClass();
        imageView2.setImageTintList(ColorStateList.valueOf(-1));
        tu0.K(imageView2, 300L, new elb(12, this));
        imageView2.setVisibility(8);
        this.u0 = imageView2;
        TextView textView2 = new TextView(context);
        textView2.setId(xoc.U0);
        textView2.setLayoutParams(new ti3(-1, -2));
        textView2.setGravity(17);
        textView2.setMaxLines(3);
        textView2.setEllipsize(truncateAt);
        textView2.setTextColor(ColorStateList.valueOf(fkaVar.getText().g));
        i4f.s.b(textView2, du4.b);
        textView2.setVisibility(8);
        this.t0 = textView2;
        ConstraintLayout constraintLayout = new ConstraintLayout(context);
        float f2 = 10;
        float f3 = 12;
        constraintLayout.setPadding(tu0.G(fk4.d().getDisplayMetrics().density * f3), tu0.G(fk4.d().getDisplayMetrics().density * f2) + (i == 1 ? tu0.G(8 * fk4.d().getDisplayMetrics().density) : 0), tu0.G(f3 * fk4.d().getDisplayMetrics().density), tu0.G(f2 * fk4.d().getDisplayMetrics().density) + (i == 2 ? tu0.G(8 * fk4.d().getDisplayMetrics().density) : 0));
        constraintLayout.setLayoutParams(new ViewGroup.MarginLayoutParams(-2, -2));
        constraintLayout.setBackground((twe) je7VarR.getValue());
        constraintLayout.addView(imageView2);
        constraintLayout.addView(imageView);
        constraintLayout.addView(textView);
        constraintLayout.addView(textView2);
        constraintLayout.setVisibility(8);
        dj3 dj3VarQ = fp3.q(constraintLayout);
        int id = imageView2.getId();
        dj3VarQ.d(id, 3, 0, 3);
        dj3VarQ.d(id, 7, 0, 7);
        int id2 = imageView.getId();
        dj3VarQ.d(id2, 6, 0, 6);
        dj3VarQ.d(id2, 7, 0, 7);
        dj3VarQ.d(id2, 3, 0, 3);
        dj3VarQ.d(id2, 4, textView.getId(), 3);
        dj3VarQ.g(id2).d.W = 2;
        int id3 = textView.getId();
        dj3VarQ.d(id3, 3, imageView.getId(), 4);
        dj3VarQ.d(id3, 6, 0, 6);
        dj3VarQ.d(id3, 7, imageView2.getId(), 6);
        dj3VarQ.d(id3, 4, textView2.getId(), 3);
        int id4 = textView2.getId();
        dj3VarQ.d(id4, 3, textView.getId(), 4);
        new l2a(dj3VarQ, 3, id4, 4).e(tu0.G(4 * fk4.d().getDisplayMetrics().density));
        dj3VarQ.d(id4, 7, textView.getId(), 7);
        dj3VarQ.d(id4, 6, textView.getId(), 6);
        dj3VarQ.d(id4, 4, 0, 4);
        dj3VarQ.a(constraintLayout);
        setContentView(constraintLayout);
    }
}
