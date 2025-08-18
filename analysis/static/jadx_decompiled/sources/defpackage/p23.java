package defpackage;

import android.animation.ValueAnimator;
import android.view.View;
import android.widget.FrameLayout;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import one.me.inappreview.ui.FakeInAppReviewBottomSheet;

/* loaded from: classes2.dex */
public final /* synthetic */ class p23 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object o;

    public /* synthetic */ p23(Object obj, int i, Object obj2, int i2) {
        this.a = i2;
        this.c = obj;
        this.b = i;
        this.o = obj2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.b;
        Object obj = this.o;
        Object obj2 = this.c;
        switch (this.a) {
            case 0:
                r23 r23Var = (r23) obj2;
                r23Var.getClass();
                iw0 iw0Var = (iw0) obj;
                r23Var.Z.set(i, new iw0(iw0Var.a, iw0Var.b, iw0Var.c, !iw0Var.d));
                break;
            case 1:
                FakeInAppReviewBottomSheet fakeInAppReviewBottomSheet = (FakeInAppReviewBottomSheet) obj2;
                fakeInAppReviewBottomSheet.G0 = false;
                xx6 xx6Var = (xx6) tx6.a.getAccessor().e();
                if (xx6Var != null) {
                    xx6Var.c(4, Integer.valueOf(i));
                }
                FrameLayout frameLayout = (FrameLayout) obj;
                int height = frameLayout.getHeight();
                FrameLayout frameLayout2 = new FrameLayout(fakeInAppReviewBottomSheet.getContext());
                frameLayout2.setId(wba.h);
                frameLayout2.setLayoutParams(new FrameLayout.LayoutParams(-1, height));
                AppCompatTextView appCompatTextView = new AppCompatTextView(frameLayout2.getContext(), null);
                appCompatTextView.setId(wba.k);
                FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
                layoutParams.topMargin = tu0.G(24 * fk4.d().getDisplayMetrics().density);
                layoutParams.gravity = 49;
                appCompatTextView.setLayoutParams(layoutParams);
                i4f.c.b(appCompatTextView, du4.b);
                appCompatTextView.setText(yba.e);
                appCompatTextView.setTextColor(qp4.u0.j(appCompatTextView).getText().e);
                frameLayout2.addView(appCompatTextView);
                AppCompatImageView appCompatImageView = new AppCompatImageView(frameLayout2.getContext(), null);
                appCompatImageView.setId(wba.j);
                float f = 77;
                FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(tu0.G(fk4.d().getDisplayMetrics().density * f), tu0.G(f * fk4.d().getDisplayMetrics().density));
                layoutParams2.gravity = 17;
                appCompatImageView.setLayoutParams(layoutParams2);
                appCompatImageView.setImageResource(vba.a);
                frameLayout2.addView(appCompatImageView);
                AppCompatTextView appCompatTextView2 = new AppCompatTextView(frameLayout2.getContext(), null);
                appCompatTextView2.setId(wba.i);
                FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(-2, -2);
                layoutParams3.bottomMargin = tu0.G(35 * fk4.d().getDisplayMetrics().density);
                layoutParams3.gravity = 81;
                appCompatTextView2.setLayoutParams(layoutParams3);
                i4f.e.b(appCompatTextView2, du4.b);
                appCompatTextView2.setText(yba.a);
                appCompatTextView2.setTextColor(-16611745);
                tu0.K(appCompatTextView2, 300L, new kb5(fakeInAppReviewBottomSheet, 1));
                frameLayout2.addView(appCompatTextView2);
                v3c.y(new mb5(appCompatTextView, null), frameLayout2);
                frameLayout.addView(frameLayout2);
                ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                valueAnimatorOfFloat.setDuration(200L);
                valueAnimatorOfFloat.addUpdateListener(new yl(fakeInAppReviewBottomSheet, 3, valueAnimatorOfFloat));
                valueAnimatorOfFloat.addListener(new lf(fakeInAppReviewBottomSheet, 2, frameLayout));
                valueAnimatorOfFloat.start();
                break;
            default:
                z96 z96Var = ((p76) obj2).X;
                z96Var.getClass();
                StringBuilder sb = new StringBuilder("onItemClicked: ");
                v86 v86Var = (v86) obj;
                sb.append(v86Var);
                hm9.n("z96", sb.toString());
                pnf.o(z96Var.Q0, new kpa(Integer.valueOf(i), v86Var));
                break;
        }
    }
}
