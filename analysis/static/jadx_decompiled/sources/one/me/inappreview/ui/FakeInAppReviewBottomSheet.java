package one.me.inappreview.ui;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Paint;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import defpackage.au1;
import defpackage.bc7;
import defpackage.dd4;
import defpackage.dj3;
import defpackage.du4;
import defpackage.es3;
import defpackage.fk4;
import defpackage.fp3;
import defpackage.g5c;
import defpackage.hob;
import defpackage.i4f;
import defpackage.jpc;
import defpackage.kb5;
import defpackage.kg3;
import defpackage.khe;
import defpackage.kr0;
import defpackage.l2a;
import defpackage.lb5;
import defpackage.nec;
import defpackage.o9;
import defpackage.pq9;
import defpackage.q7c;
import defpackage.qp4;
import defpackage.tu0;
import defpackage.u00;
import defpackage.v3c;
import defpackage.vba;
import defpackage.wba;
import defpackage.xba;
import defpackage.y53;
import defpackage.yba;
import defpackage.yf3;
import defpackage.ze2;
import defpackage.zr6;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import one.me.sdk.bottomsheet.BottomSheetWidget;
import one.me.sdk.richvector.EnhancedVectorDrawable;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lone/me/inappreview/ui/FakeInAppReviewBottomSheet;", "Lone/me/sdk/bottomsheet/BottomSheetWidget;", "<init>", "()V", "in-app-review_release"}, k = 1, mv = {2, 0, 0})
@SuppressLint({"ValidController"})
/* loaded from: classes2.dex */
public final class FakeInAppReviewBottomSheet extends BottomSheetWidget {
    public static final /* synthetic */ bc7[] H0 = {new hob(FakeInAppReviewBottomSheet.class, "rateView", "getRateView()Landroidx/constraintlayout/widget/ConstraintLayout;", 0), zr6.e(nec.a, FakeInAppReviewBottomSheet.class, "thankView", "getThankView()Landroid/widget/FrameLayout;", 0)};
    public final ShapeDrawable A0;
    public final ShapeDrawable B0;
    public final ShapeDrawable C0;
    public final ShapeDrawable D0;
    public final khe E0;
    public final dd4 F0;
    public boolean G0;
    public final q7c y0;
    public final q7c z0;

    /* JADX WARN: Multi-variable type inference failed */
    public FakeInAppReviewBottomSheet() {
        super(null, 1, 0 == true ? 1 : 0);
        this.y0 = viewBinding(wba.a);
        this.z0 = viewBinding(wba.h);
        float[] fArr = {fk4.d().getDisplayMetrics().density * 50.0f, fk4.d().getDisplayMetrics().density * 50.0f, fk4.d().getDisplayMetrics().density * 50.0f, fk4.d().getDisplayMetrics().density * 50.0f, fk4.d().getDisplayMetrics().density * 50.0f, fk4.d().getDisplayMetrics().density * 50.0f, fk4.d().getDisplayMetrics().density * 50.0f, fk4.d().getDisplayMetrics().density * 50.0f};
        this.A0 = new ShapeDrawable(new RoundRectShape(fArr, null, null));
        ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(fArr, null, null));
        shapeDrawable.getPaint().setStyle(Paint.Style.STROKE);
        shapeDrawable.getPaint().setStrokeWidth(fk4.d().getDisplayMetrics().density * 1.0f);
        this.B0 = shapeDrawable;
        ShapeDrawable shapeDrawable2 = new ShapeDrawable(new RoundRectShape(fArr, null, null));
        shapeDrawable2.getPaint().setColor(-16611745);
        this.C0 = shapeDrawable2;
        this.D0 = new ShapeDrawable(new RoundRectShape(fArr, null, null));
        this.E0 = new khe(new es3(13, this));
        this.F0 = new dd4(21, this);
        this.G0 = true;
    }

    @Override // one.me.sdk.bottomsheet.BottomSheetWidget
    public final View x0(LayoutInflater layoutInflater, FrameLayout frameLayout) {
        FrameLayout frameLayout2 = new FrameLayout(getContext());
        ConstraintLayout constraintLayout = new ConstraintLayout(getContext());
        constraintLayout.setId(wba.a);
        AppCompatImageView appCompatImageView = new AppCompatImageView(constraintLayout.getContext(), null);
        appCompatImageView.setId(wba.b);
        appCompatImageView.setImageDrawable(appCompatImageView.getContext().getPackageManager().getApplicationIcon(appCompatImageView.getContext().getApplicationInfo()));
        float f = 44;
        constraintLayout.addView(appCompatImageView, tu0.G(fk4.d().getDisplayMetrics().density * f), tu0.G(fk4.d().getDisplayMetrics().density * f));
        AppCompatTextView appCompatTextView = new AppCompatTextView(constraintLayout.getContext(), null);
        appCompatTextView.setId(wba.g);
        i4f.c.b(appCompatTextView, du4.b);
        appCompatTextView.setText(jpc.f3);
        pq9 pq9Var = qp4.u0;
        appCompatTextView.setTextColor(pq9Var.j(appCompatTextView).getText().e);
        constraintLayout.addView(appCompatTextView, -2, -2);
        AppCompatTextView appCompatTextView2 = new AppCompatTextView(constraintLayout.getContext(), null);
        appCompatTextView2.setId(wba.f);
        i4f.k.b(appCompatTextView2, du4.b);
        appCompatTextView2.setText(yba.d);
        appCompatTextView2.setTextColor(pq9Var.j(appCompatTextView2).getText().i);
        constraintLayout.addView(appCompatTextView2, -2, -2);
        AppCompatTextView appCompatTextView3 = new AppCompatTextView(constraintLayout.getContext(), null);
        appCompatTextView3.setId(wba.c);
        appCompatTextView3.setGravity(17);
        appCompatTextView3.setBackground(new RippleDrawable(ColorStateList.valueOf(pq9Var.j(appCompatTextView3).d().a.a.c), this.B0, this.A0));
        appCompatTextView3.setText(yba.b);
        appCompatTextView3.setTextColor(-16611745);
        tu0.K(appCompatTextView3, 300L, new kb5(this, 0));
        constraintLayout.addView(appCompatTextView3, 0, tu0.G(fk4.d().getDisplayMetrics().density * f));
        AppCompatTextView appCompatTextView4 = new AppCompatTextView(constraintLayout.getContext(), null);
        appCompatTextView4.setId(wba.e);
        appCompatTextView4.setGravity(17);
        appCompatTextView4.setBackground(this.D0);
        appCompatTextView4.setTextColor(pq9Var.j(appCompatTextView4).getText().i);
        appCompatTextView4.setText(yba.c);
        constraintLayout.addView(appCompatTextView4, 0, tu0.G(f * fk4.d().getDisplayMetrics().density));
        Context context = constraintLayout.getContext();
        g5c g5cVar = new g5c(context);
        g5cVar.G0 = -1;
        ArrayList arrayList = new ArrayList();
        int i = 0;
        while (i < 5) {
            ImageView imageView = new ImageView(context);
            imageView.setId(View.generateViewId());
            int i2 = i + 1;
            imageView.setContentDescription(imageView.getResources().getQuantityString(xba.b, i2, Integer.valueOf(i2)));
            imageView.setImageDrawable(new EnhancedVectorDrawable(context, vba.c));
            imageView.setOnClickListener(new kg3(i, 2, g5cVar));
            v3c.y(new ze2(3, null, 4), imageView);
            float f2 = 28;
            g5cVar.addView(imageView, tu0.G(fk4.d().getDisplayMetrics().density * f2), tu0.G(f2 * fk4.d().getDisplayMetrics().density));
            arrayList.add(imageView);
            i = i2;
            appCompatTextView3 = appCompatTextView3;
        }
        AppCompatTextView appCompatTextView5 = appCompatTextView3;
        dj3 dj3VarQ = fp3.q(g5cVar);
        Iterator it = arrayList.iterator();
        int i3 = 0;
        while (it.hasNext()) {
            Object next = it.next();
            int i4 = i3 + 1;
            if (i3 < 0) {
                y53.R();
                throw null;
            }
            ImageView imageView2 = (ImageView) next;
            if (i3 == 0) {
                int id = imageView2.getId();
                dj3VarQ.d(id, 6, 0, 6);
                dj3VarQ.d(id, 7, ((ImageView) arrayList.get(1)).getId(), 6);
                dj3VarQ.g(id).d.V = 1;
            } else if (i3 == arrayList.size() - 1) {
                int id2 = imageView2.getId();
                dj3VarQ.d(id2, 6, ((ImageView) arrayList.get(i3 - 1)).getId(), 7);
                dj3VarQ.d(id2, 7, 0, 7);
            } else {
                int id3 = imageView2.getId();
                dj3VarQ.d(id3, 6, ((ImageView) arrayList.get(i3 - 1)).getId(), 7);
                dj3VarQ.d(id3, 7, ((ImageView) arrayList.get(i4)).getId(), 6);
            }
            i3 = i4;
        }
        dj3VarQ.a(g5cVar);
        g5cVar.setContentDescription(g5cVar.getResources().getQuantityString(xba.a, 5, Integer.valueOf(g5cVar.getSelected()), 5));
        g5cVar.setId(wba.d);
        g5cVar.setOnSelectListener(new u00(appCompatTextView4, this, frameLayout2, 9));
        constraintLayout.addView(g5cVar, -1, -2);
        v3c.y(new lb5(this, appCompatTextView, appCompatTextView2, appCompatTextView4, g5cVar, null), constraintLayout);
        dj3 dj3VarQ2 = fp3.q(constraintLayout);
        int id4 = appCompatImageView.getId();
        dj3VarQ2.d(id4, 3, 0, 3);
        float f3 = 24;
        au1.p(f3, fk4.d().getDisplayMetrics().density, new l2a(dj3VarQ2, 3, id4, 4));
        dj3VarQ2.d(id4, 6, 0, 6);
        new l2a(dj3VarQ2, 6, id4, 4).e(tu0.G(fk4.d().getDisplayMetrics().density * f3));
        int id5 = appCompatTextView.getId();
        dj3VarQ2.d(id5, 3, appCompatImageView.getId(), 3);
        dj3VarQ2.d(id5, 6, appCompatImageView.getId(), 7);
        l2a l2aVar = new l2a(dj3VarQ2, 6, id5, 4);
        float f4 = 12;
        l2aVar.e(tu0.G(fk4.d().getDisplayMetrics().density * f4));
        int id6 = appCompatTextView2.getId();
        dj3VarQ2.d(id6, 3, appCompatTextView.getId(), 4);
        new l2a(dj3VarQ2, 3, id6, 4).e(tu0.G(4 * fk4.d().getDisplayMetrics().density));
        dj3VarQ2.d(id6, 6, appCompatImageView.getId(), 7);
        new l2a(dj3VarQ2, 6, id6, 4).e(tu0.G(fk4.d().getDisplayMetrics().density * f4));
        int id7 = g5cVar.getId();
        dj3VarQ2.d(id7, 3, appCompatTextView2.getId(), 4);
        float f5 = 40;
        au1.p(f5, fk4.d().getDisplayMetrics().density, new l2a(dj3VarQ2, 3, id7, 4));
        dj3VarQ2.d(id7, 6, 0, 6);
        float f6 = 20;
        au1.p(f6, fk4.d().getDisplayMetrics().density, new l2a(dj3VarQ2, 6, id7, 4));
        dj3VarQ2.d(id7, 7, 0, 7);
        new l2a(dj3VarQ2, 7, id7, 4).e(tu0.G(f6 * fk4.d().getDisplayMetrics().density));
        int id8 = appCompatTextView5.getId();
        dj3VarQ2.d(id8, 3, g5cVar.getId(), 4);
        au1.p(f5, fk4.d().getDisplayMetrics().density, new l2a(dj3VarQ2, 3, id8, 4));
        dj3VarQ2.d(id8, 6, 0, 6);
        new l2a(dj3VarQ2, 6, id8, 4).e(tu0.G(fk4.d().getDisplayMetrics().density * f4));
        dj3VarQ2.d(id8, 7, appCompatTextView4.getId(), 6);
        float f7 = 8;
        au1.p(f7, fk4.d().getDisplayMetrics().density, new l2a(dj3VarQ2, 7, id8, 4));
        dj3VarQ2.d(id8, 4, 0, 4);
        new l2a(dj3VarQ2, 4, id8, 4).e(tu0.G(fk4.d().getDisplayMetrics().density * f3));
        int id9 = appCompatTextView4.getId();
        dj3VarQ2.d(id9, 3, g5cVar.getId(), 4);
        new l2a(dj3VarQ2, 3, id9, 4).e(tu0.G(f5 * fk4.d().getDisplayMetrics().density));
        dj3VarQ2.d(id9, 6, appCompatTextView5.getId(), 7);
        au1.p(f7, fk4.d().getDisplayMetrics().density, new l2a(dj3VarQ2, 6, id9, 4));
        dj3VarQ2.d(id9, 7, 0, 7);
        au1.p(f4, fk4.d().getDisplayMetrics().density, new l2a(dj3VarQ2, 7, id9, 4));
        dj3VarQ2.d(id9, 4, 0, 4);
        new l2a(dj3VarQ2, 4, id9, 4).e(tu0.G(f3 * fk4.d().getDisplayMetrics().density));
        dj3VarQ2.a(constraintLayout);
        frameLayout2.addView(constraintLayout);
        kr0 kr0Var = new kr0(this, new yf3(frameLayout2, 9, this));
        if (getRouter() != null) {
            getRouter().a(kr0Var);
        } else {
            addLifecycleListener(new o9(this, kr0Var, 4));
        }
        return frameLayout2;
    }
}
