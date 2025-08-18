package defpackage;

import android.view.View;
import one.me.inappreview.ui.FakeInAppReviewBottomSheet;

/* loaded from: classes2.dex */
public final /* synthetic */ class kb5 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ FakeInAppReviewBottomSheet b;

    public /* synthetic */ kb5(FakeInAppReviewBottomSheet fakeInAppReviewBottomSheet, int i) {
        this.a = i;
        this.b = fakeInAppReviewBottomSheet;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        FakeInAppReviewBottomSheet fakeInAppReviewBottomSheet = this.b;
        switch (this.a) {
            case 0:
                fakeInAppReviewBottomSheet.G0 = false;
                xx6 xx6Var = (xx6) tx6.a.getAccessor().e();
                if (xx6Var != null) {
                    xx6Var.b(4);
                }
                fakeInAppReviewBottomSheet.s0(true);
                break;
            default:
                bc7[] bc7VarArr = FakeInAppReviewBottomSheet.H0;
                fakeInAppReviewBottomSheet.s0(true);
                break;
        }
    }
}
