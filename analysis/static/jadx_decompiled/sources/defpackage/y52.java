package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutorService;

/* loaded from: classes.dex */
public final class y52 extends LinearLayout implements kre {
    public final rm2 a;
    public final AppCompatTextView b;
    public x52 c;
    public final jv5 o;

    public y52(Context context, ExecutorService executorService) {
        super(context, null);
        rm2 rm2Var = new rm2(context);
        this.a = rm2Var;
        AppCompatTextView appCompatTextView = new AppCompatTextView(context, null);
        appCompatTextView.setText(z7.B(appCompatTextView.getContext(), o4a.a));
        i4f.j.b(appCompatTextView, du4.b);
        pq9 pq9Var = qp4.u0;
        appCompatTextView.setTextColor(pq9Var.j(appCompatTextView).getText().e);
        this.b = appCompatTextView;
        jv5 jv5Var = new jv5(new w52(this), executorService, 3);
        this.o = jv5Var;
        RecyclerView recyclerView = new RecyclerView(context, null);
        recyclerView.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        recyclerView.setAdapter(jv5Var);
        recyclerView.setItemAnimator(null);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager();
        linearLayoutManager.o1(0);
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.j(new kq(2));
        setOrientation(1);
        setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        rm2Var.setClipToOutline(true);
        rm2Var.setOutlineProvider(new xq0(1, fk4.d().getDisplayMetrics().density * 16.0f));
        Integer numValueOf = Integer.valueOf(pq9Var.j(this).b().g);
        float f = 16;
        setBackground(hm9.b0(numValueOf, null, null, tu0.G(fk4.d().getDisplayMetrics().density * f)));
        setPaddingRelative(0, 0, 0, tu0.G(fk4.d().getDisplayMetrics().density * f));
        addView(rm2Var, new LinearLayout.LayoutParams(-1, tu0.G(220 * fk4.d().getDisplayMetrics().density)));
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.setMarginStart(tu0.G(f * fk4.d().getDisplayMetrics().density));
        layoutParams.topMargin = tu0.G(12 * fk4.d().getDisplayMetrics().density);
        layoutParams.bottomMargin = tu0.G(8 * fk4.d().getDisplayMetrics().density);
        addView(appCompatTextView, layoutParams);
        addView(recyclerView);
    }

    private final void setSelectedBackground(Drawable drawable) {
        this.a.setBackgroundPreview(drawable);
    }

    public final void a(pm2 pm2Var) {
        rm2 rm2Var = this.a;
        rm2Var.getClass();
        k29 k29Var = pm2Var.e;
        e52 e52Var = pm2Var.a;
        es8 es8Var = pm2Var.c;
        by8 by8VarC = k29.c(k29Var, e52Var, es8Var, true);
        es8 es8Var2 = pm2Var.b;
        by8 by8VarC2 = k29.c(k29Var, e52Var, es8Var2, true);
        ppe ppeVar = rm2Var.a;
        if (by8VarC2 != null) {
            ppeVar.setTextMessageLayout(by8VarC2);
        }
        vs8 vs8Var = rm2Var.c;
        ppeVar.setBackground(vs8Var);
        u6b u6bVar = es8Var2.X;
        u6bVar.f();
        ppeVar.g(u6bVar.k, false);
        ppe ppeVar2 = rm2Var.b;
        if (by8VarC != null) {
            ppeVar2.setTextMessageLayout(by8VarC);
        }
        vs8 vs8Var2 = rm2Var.o;
        ppeVar2.setBackground(vs8Var2);
        ppeVar2.setDateViewStatus(pm2Var.d);
        u6b u6bVar2 = es8Var.X;
        u6bVar2.f();
        ppeVar2.g(u6bVar2.k, false);
        nr2 nr2Var = pm2Var.f;
        int[] iArr = nr2Var.g().a.o;
        vs8Var.getClass();
        bc7[] bc7VarArr = vs8.z;
        vs8Var.u.o1(vs8Var, bc7VarArr[0], iArr);
        ppeVar.setDateTextColor(nr2Var.g().d.m);
        ppeVar.setTextMessageColors(nr2Var.d(true));
        ppeVar.getBackground().invalidateSelf();
        ppeVar.requestLayout();
        int[] iArr2 = nr2Var.k().a.o;
        vs8Var2.getClass();
        vs8Var2.v.o1(vs8Var2, bc7VarArr[1], iArr2);
        ppeVar2.setDateTextColor(nr2Var.k().d.m);
        ppeVar2.setTextMessageColors(nr2Var.k());
        ppeVar2.getBackground().invalidateSelf();
        ppeVar2.requestLayout();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.c = null;
    }

    @Override // defpackage.kre
    public final void onThemeChanged(fka fkaVar) {
        Drawable background = getBackground();
        GradientDrawable gradientDrawable = background instanceof GradientDrawable ? (GradientDrawable) background : null;
        if (gradientDrawable != null) {
            gradientDrawable.setColor(fkaVar.b().g);
        }
        this.b.setTextColor(fkaVar.getText().e);
        qp4.d(qp4.u0.b(getContext()), this);
    }

    public final void setBackgroundSelectedListener(x52 x52Var) {
        this.c = x52Var;
    }

    public final void setThemeItems(List<c62> list) {
        Object next;
        this.o.E(list);
        Iterator<T> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            Boolean bool = ((c62) next).a;
            if (bool != null ? bool.booleanValue() : false) {
                break;
            }
        }
        c62 c62Var = (c62) next;
        setSelectedBackground(c62Var != null ? c62Var.c : null);
    }
}
