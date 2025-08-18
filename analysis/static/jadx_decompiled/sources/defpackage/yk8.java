package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import kotlin.NoWhenBranchMatchedException;

/* loaded from: classes.dex */
public final class yk8 {
    public int a;
    public final Object b;
    public final Object c;
    public final Object d;
    public final Object e;
    public final Object f;
    public final Object g;
    public final Object h;
    public Object i;

    public yk8(k33 k33Var, mbd mbdVar, uxc uxcVar, bs9 bs9Var, mh3 mh3Var, e6a e6aVar, o6a o6aVar) {
        this.b = k33Var;
        this.c = mbdVar;
        this.d = uxcVar;
        this.e = bs9Var;
        this.f = mh3Var;
        this.g = e6aVar;
        this.h = o6aVar;
    }

    public ImageView a() {
        return (ImageView) ((je7) this.i).getValue();
    }

    public void b(int i) {
        ImageView imageViewA;
        float f;
        float f2;
        String str = (String) this.d;
        ir6 ir6Var = hm9.m;
        if (ir6Var != null && ir6Var.c()) {
            ir6Var.d(us7.X, str, "Media viewer. New state media page: ".concat(i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? "null" : "REFRESH" : "LOADING" : "PAUSE" : "PLAY" : "NONE"), null);
        }
        if (i != 1) {
            br7.b((ViewGroup) this.b, a(), -1);
            c(true);
            if (i == 4) {
                imageViewA = a();
                f = 4;
                f2 = fk4.d().getDisplayMetrics().density;
            } else {
                imageViewA = a();
                f = 14;
                f2 = fk4.d().getDisplayMetrics().density;
            }
            rh4.p(f, f2, imageViewA);
        }
        int iS = au1.s(i);
        if (iS == 0) {
            c(false);
        } else if (iS == 1) {
            a().setImageDrawable((Drawable) ((je7) this.g).getValue());
        } else if (iS == 2) {
            a().setImageDrawable((Drawable) ((je7) this.h).getValue());
        } else if (iS == 3) {
            a().setImageDrawable((sz6) this.e);
        } else {
            if (iS != 4) {
                throw new NoWhenBranchMatchedException();
            }
            a().setImageDrawable((Drawable) ((je7) this.f).getValue());
        }
        this.a = i;
    }

    public void c(boolean z) {
        a().setVisibility(z ? 0 : 8);
    }

    public yk8(pge pgeVar, gaa gaaVar) {
        this.b = pgeVar;
        this.c = gaaVar;
        this.d = yk8.class.getName();
        sz6 sz6Var = new sz6();
        sz6Var.b = new int[]{0, qp4.u0.o(pgeVar.getContext()).b.e().e.a.a};
        this.e = sz6Var;
        final int i = 0;
        this.f = tu0.r(3, new k56(this) { // from class: xk8
            public final /* synthetic */ yk8 b;

            {
                this.b = this;
            }

            @Override // defpackage.k56
            public final Object invoke() {
                switch (i) {
                    case 0:
                        ViewGroup viewGroup = (ViewGroup) this.b.b;
                        Context context = viewGroup.getContext();
                        int i2 = woc.O1;
                        qp4.u0.o(viewGroup.getContext()).c.getIcon();
                        return ngg.u(i2, -1, context);
                    case 1:
                        ViewGroup viewGroup2 = (ViewGroup) this.b.b;
                        Context context2 = viewGroup2.getContext();
                        int i3 = woc.L0;
                        qp4.u0.o(viewGroup2.getContext()).c.getIcon();
                        return ngg.u(i3, -1, context2);
                    case 2:
                        ViewGroup viewGroup3 = (ViewGroup) this.b.b;
                        Context context3 = viewGroup3.getContext();
                        int i4 = woc.H0;
                        qp4.u0.o(viewGroup3.getContext()).c.getIcon();
                        return ngg.u(i4, -1, context3);
                    default:
                        yk8 yk8Var = this.b;
                        ImageView imageView = new ImageView(((ViewGroup) yk8Var.b).getContext());
                        float f = 52;
                        imageView.setLayoutParams(new FrameLayout.LayoutParams(tu0.G(fk4.d().getDisplayMetrics().density * f), tu0.G(f * fk4.d().getDisplayMetrics().density), 17));
                        pq9 pq9Var = qp4.u0;
                        int i5 = pq9Var.p(imageView).c.d().a.a.h;
                        ShapeDrawable shapeDrawable = new ShapeDrawable(new OvalShape());
                        pq9Var.p(imageView).c.b();
                        ngg.G(shapeDrawable, -1728053248);
                        imageView.setBackground(new RippleDrawable(ColorStateList.valueOf(i5), shapeDrawable, null));
                        rh4.p(14, fk4.d().getDisplayMetrics().density, imageView);
                        imageView.setImageDrawable((Drawable) ((je7) yk8Var.g).getValue());
                        tu0.K(imageView, 300L, new xx5(14, yk8Var));
                        return imageView;
                }
            }
        });
        final int i2 = 1;
        this.g = tu0.r(3, new k56(this) { // from class: xk8
            public final /* synthetic */ yk8 b;

            {
                this.b = this;
            }

            @Override // defpackage.k56
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        ViewGroup viewGroup = (ViewGroup) this.b.b;
                        Context context = viewGroup.getContext();
                        int i22 = woc.O1;
                        qp4.u0.o(viewGroup.getContext()).c.getIcon();
                        return ngg.u(i22, -1, context);
                    case 1:
                        ViewGroup viewGroup2 = (ViewGroup) this.b.b;
                        Context context2 = viewGroup2.getContext();
                        int i3 = woc.L0;
                        qp4.u0.o(viewGroup2.getContext()).c.getIcon();
                        return ngg.u(i3, -1, context2);
                    case 2:
                        ViewGroup viewGroup3 = (ViewGroup) this.b.b;
                        Context context3 = viewGroup3.getContext();
                        int i4 = woc.H0;
                        qp4.u0.o(viewGroup3.getContext()).c.getIcon();
                        return ngg.u(i4, -1, context3);
                    default:
                        yk8 yk8Var = this.b;
                        ImageView imageView = new ImageView(((ViewGroup) yk8Var.b).getContext());
                        float f = 52;
                        imageView.setLayoutParams(new FrameLayout.LayoutParams(tu0.G(fk4.d().getDisplayMetrics().density * f), tu0.G(f * fk4.d().getDisplayMetrics().density), 17));
                        pq9 pq9Var = qp4.u0;
                        int i5 = pq9Var.p(imageView).c.d().a.a.h;
                        ShapeDrawable shapeDrawable = new ShapeDrawable(new OvalShape());
                        pq9Var.p(imageView).c.b();
                        ngg.G(shapeDrawable, -1728053248);
                        imageView.setBackground(new RippleDrawable(ColorStateList.valueOf(i5), shapeDrawable, null));
                        rh4.p(14, fk4.d().getDisplayMetrics().density, imageView);
                        imageView.setImageDrawable((Drawable) ((je7) yk8Var.g).getValue());
                        tu0.K(imageView, 300L, new xx5(14, yk8Var));
                        return imageView;
                }
            }
        });
        final int i3 = 2;
        this.h = tu0.r(3, new k56(this) { // from class: xk8
            public final /* synthetic */ yk8 b;

            {
                this.b = this;
            }

            @Override // defpackage.k56
            public final Object invoke() {
                switch (i3) {
                    case 0:
                        ViewGroup viewGroup = (ViewGroup) this.b.b;
                        Context context = viewGroup.getContext();
                        int i22 = woc.O1;
                        qp4.u0.o(viewGroup.getContext()).c.getIcon();
                        return ngg.u(i22, -1, context);
                    case 1:
                        ViewGroup viewGroup2 = (ViewGroup) this.b.b;
                        Context context2 = viewGroup2.getContext();
                        int i32 = woc.L0;
                        qp4.u0.o(viewGroup2.getContext()).c.getIcon();
                        return ngg.u(i32, -1, context2);
                    case 2:
                        ViewGroup viewGroup3 = (ViewGroup) this.b.b;
                        Context context3 = viewGroup3.getContext();
                        int i4 = woc.H0;
                        qp4.u0.o(viewGroup3.getContext()).c.getIcon();
                        return ngg.u(i4, -1, context3);
                    default:
                        yk8 yk8Var = this.b;
                        ImageView imageView = new ImageView(((ViewGroup) yk8Var.b).getContext());
                        float f = 52;
                        imageView.setLayoutParams(new FrameLayout.LayoutParams(tu0.G(fk4.d().getDisplayMetrics().density * f), tu0.G(f * fk4.d().getDisplayMetrics().density), 17));
                        pq9 pq9Var = qp4.u0;
                        int i5 = pq9Var.p(imageView).c.d().a.a.h;
                        ShapeDrawable shapeDrawable = new ShapeDrawable(new OvalShape());
                        pq9Var.p(imageView).c.b();
                        ngg.G(shapeDrawable, -1728053248);
                        imageView.setBackground(new RippleDrawable(ColorStateList.valueOf(i5), shapeDrawable, null));
                        rh4.p(14, fk4.d().getDisplayMetrics().density, imageView);
                        imageView.setImageDrawable((Drawable) ((je7) yk8Var.g).getValue());
                        tu0.K(imageView, 300L, new xx5(14, yk8Var));
                        return imageView;
                }
            }
        });
        this.a = 1;
        final int i4 = 3;
        this.i = tu0.r(3, new k56(this) { // from class: xk8
            public final /* synthetic */ yk8 b;

            {
                this.b = this;
            }

            @Override // defpackage.k56
            public final Object invoke() {
                switch (i4) {
                    case 0:
                        ViewGroup viewGroup = (ViewGroup) this.b.b;
                        Context context = viewGroup.getContext();
                        int i22 = woc.O1;
                        qp4.u0.o(viewGroup.getContext()).c.getIcon();
                        return ngg.u(i22, -1, context);
                    case 1:
                        ViewGroup viewGroup2 = (ViewGroup) this.b.b;
                        Context context2 = viewGroup2.getContext();
                        int i32 = woc.L0;
                        qp4.u0.o(viewGroup2.getContext()).c.getIcon();
                        return ngg.u(i32, -1, context2);
                    case 2:
                        ViewGroup viewGroup3 = (ViewGroup) this.b.b;
                        Context context3 = viewGroup3.getContext();
                        int i42 = woc.H0;
                        qp4.u0.o(viewGroup3.getContext()).c.getIcon();
                        return ngg.u(i42, -1, context3);
                    default:
                        yk8 yk8Var = this.b;
                        ImageView imageView = new ImageView(((ViewGroup) yk8Var.b).getContext());
                        float f = 52;
                        imageView.setLayoutParams(new FrameLayout.LayoutParams(tu0.G(fk4.d().getDisplayMetrics().density * f), tu0.G(f * fk4.d().getDisplayMetrics().density), 17));
                        pq9 pq9Var = qp4.u0;
                        int i5 = pq9Var.p(imageView).c.d().a.a.h;
                        ShapeDrawable shapeDrawable = new ShapeDrawable(new OvalShape());
                        pq9Var.p(imageView).c.b();
                        ngg.G(shapeDrawable, -1728053248);
                        imageView.setBackground(new RippleDrawable(ColorStateList.valueOf(i5), shapeDrawable, null));
                        rh4.p(14, fk4.d().getDisplayMetrics().density, imageView);
                        imageView.setImageDrawable((Drawable) ((je7) yk8Var.g).getValue());
                        tu0.K(imageView, 300L, new xx5(14, yk8Var));
                        return imageView;
                }
            }
        });
    }
}
