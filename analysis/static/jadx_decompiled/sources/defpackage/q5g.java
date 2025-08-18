package defpackage;

import android.content.Context;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.net.Uri;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import one.me.messages.list.loader.MessageModel;

/* loaded from: classes2.dex */
public final class q5g extends qy8 {
    public final kk7 I0;
    public tc9 J0;

    public q5g(Context context) {
        p5g p5gVar = new p5g(context);
        super(p5gVar);
        this.I0 = new kk7(null, new yqd(context, 8), 7);
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-2, -2);
        float f = 24;
        marginLayoutParams.setMarginStart(tu0.G(fk4.d().getDisplayMetrics().density * f));
        marginLayoutParams.setMarginEnd(tu0.G(f * fk4.d().getDisplayMetrics().density));
        p5gVar.setLayoutParams(marginLayoutParams);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        float f2 = fk4.d().getDisplayMetrics().density * 24.0f;
        float[] fArr = new float[8];
        for (int i = 0; i < 8; i++) {
            fArr[i] = f2;
        }
        gradientDrawable.setCornerRadii(fArr);
        p5gVar.setBackground(gradientDrawable);
    }

    @Override // defpackage.hqd
    public final void D() {
        CharSequence charSequenceA;
        tc9 tc9Var = this.J0;
        if (tc9Var == null || (charSequenceA = tc9Var.a()) == null) {
            return;
        }
        this.I0.getClass();
        kk7.a(charSequenceA);
    }

    @Override // defpackage.qy8
    public final void E(MessageModel messageModel, List list) {
        this.H0 = new ry8(messageModel.I0);
        tc9 tc9Var = messageModel.z0;
        this.J0 = tc9Var;
        View view = this.a;
        if (tc9Var != null) {
            p5g p5gVar = (p5g) view;
            p5gVar.y0 = tc9Var;
            Iterator it = tc9Var.b.iterator();
            boolean z = false;
            boolean z2 = false;
            boolean z3 = false;
            boolean z4 = false;
            while (true) {
                boolean zHasNext = it.hasNext();
                TextView textView = p5gVar.b;
                TextView textView2 = p5gVar.c;
                bu6 bu6Var = p5gVar.a;
                c17 c17Var = p5gVar.o;
                if (zHasNext) {
                    s5g s5gVar = (s5g) it.next();
                    Iterator it2 = it;
                    if (s5gVar instanceof t5g) {
                        ay7.b(p5gVar, c17Var, -1);
                        float f = p5gVar.x0;
                        c17Var.a = f;
                        c17Var.b = f;
                        c17Var.a(tc9Var.a, ((t5g) s5gVar).a, true);
                        z4 = true;
                    } else if (s5gVar instanceof u5g) {
                        u5g u5gVar = (u5g) s5gVar;
                        ViewGroup.LayoutParams layoutParams = bu6Var.getLayoutParams();
                        if (layoutParams == null) {
                            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                        }
                        layoutParams.width = u5gVar.a.getWidth();
                        layoutParams.height = u5gVar.a.getHeight();
                        bu6Var.setLayoutParams(layoutParams);
                        String str = u5gVar.b;
                        if (str == null || str.length() == 0) {
                            yt6 yt6Var = u5gVar.c;
                            if (yt6Var != null) {
                                bu6Var.setColorFilter((ColorFilter) null);
                                bu6Var.setImageAttach(yt6Var);
                            }
                        } else {
                            if (u5gVar.d) {
                                bu6Var.setColorFilter(qp4.u0.j(p5gVar).a().s().c.b);
                            } else {
                                bu6Var.setColorFilter((ColorFilter) null);
                            }
                            bu6Var.o(xv6.d(Uri.parse(str)).a(), null);
                        }
                        z = true;
                    } else {
                        if (!(s5gVar instanceof v5g)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        v5g v5gVar = (v5g) s5gVar;
                        boolean z5 = v5gVar.c;
                        if (z5) {
                            z3 = true;
                        } else {
                            z2 = true;
                        }
                        CharSequence charSequence = v5gVar.a;
                        if (z5) {
                            textView2.setText(charSequence);
                        } else {
                            textView.setText(charSequence);
                            kqe kqeVar = i4f.a;
                            v5gVar.b.b(textView, du4.b);
                        }
                    }
                    it = it2;
                } else {
                    bu6Var.setVisibility(z ? 0 : 8);
                    textView.setVisibility(z2 ? 0 : 8);
                    textView2.setVisibility(z3 ? 0 : 8);
                    c17Var.setVisibility(z4 ? 0 : 8);
                }
            }
        }
        F(messageModel, view);
    }

    @Override // defpackage.mr2
    public final void e(v83 v83Var) {
        Drawable background = ((p5g) this.a).getBackground();
        GradientDrawable gradientDrawable = background instanceof GradientDrawable ? (GradientDrawable) background : null;
        if (gradientDrawable != null) {
            gradientDrawable.setColors(v83Var.b.w);
        }
    }
}
