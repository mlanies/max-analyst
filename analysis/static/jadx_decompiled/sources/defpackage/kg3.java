package defpackage;

import android.graphics.drawable.RippleDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatTextView;
import one.me.inappreview.ui.FakeInAppReviewBottomSheet;
import one.me.sdk.bottomsheet.ConfirmationBottomSheet;
import one.me.sdk.richvector.EnhancedVectorDrawable;
import one.me.sdk.richvector.VectorPath;

/* loaded from: classes2.dex */
public final /* synthetic */ class kg3 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ int c;

    public /* synthetic */ kg3(int i, int i2, Object obj) {
        this.a = i2;
        this.b = obj;
        this.c = i;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        ng3 ng3Var;
        int i = this.c;
        Object obj = this.b;
        int i2 = 1;
        switch (this.a) {
            case 0:
                bc7[] bc7VarArr = ConfirmationBottomSheet.G0;
                ConfirmationBottomSheet confirmationBottomSheet = (ConfirmationBottomSheet) obj;
                confirmationBottomSheet.getClass();
                bc7[] bc7VarArr2 = ConfirmationBottomSheet.G0;
                bc7 bc7Var = bc7VarArr2[5];
                fs fsVar = confirmationBottomSheet.E0;
                if (!((Boolean) fsVar.a(confirmationBottomSheet)).booleanValue()) {
                    bc7 bc7Var2 = bc7VarArr2[5];
                    fsVar.b(confirmationBottomSheet, Boolean.TRUE);
                    Object targetController = confirmationBottomSheet.getTargetController();
                    ng3Var = targetController instanceof ng3 ? (ng3) targetController : null;
                    if (ng3Var != null) {
                        bc7 bc7Var3 = bc7VarArr2[4];
                        ng3Var.h(i, (Bundle) confirmationBottomSheet.C0.a(confirmationBottomSheet));
                    }
                }
                confirmationBottomSheet.s0(true);
                break;
            case 1:
                bc7[] bc7VarArr3 = ConfirmationBottomSheet.G0;
                ConfirmationBottomSheet confirmationBottomSheet2 = (ConfirmationBottomSheet) obj;
                confirmationBottomSheet2.getClass();
                bc7[] bc7VarArr4 = ConfirmationBottomSheet.G0;
                bc7 bc7Var4 = bc7VarArr4[5];
                fs fsVar2 = confirmationBottomSheet2.E0;
                if (!((Boolean) fsVar2.a(confirmationBottomSheet2)).booleanValue()) {
                    bc7 bc7Var5 = bc7VarArr4[5];
                    fsVar2.b(confirmationBottomSheet2, Boolean.TRUE);
                    Object targetController2 = confirmationBottomSheet2.getTargetController();
                    ng3Var = targetController2 instanceof ng3 ? (ng3) targetController2 : null;
                    if (ng3Var != null) {
                        bc7 bc7Var6 = bc7VarArr4[4];
                        ng3Var.h(i, (Bundle) confirmationBottomSheet2.C0.a(confirmationBottomSheet2));
                    }
                }
                confirmationBottomSheet2.s0(true);
                break;
            default:
                g5c g5cVar = (g5c) obj;
                g5cVar.G0 = i;
                for (int i3 = 0; i3 < 5; i3++) {
                    ImageView imageView = (ImageView) g5cVar.getChildAt(i3);
                    if (i3 <= i) {
                        imageView.setImageResource(vba.b);
                    } else {
                        EnhancedVectorDrawable enhancedVectorDrawable = new EnhancedVectorDrawable(g5cVar.getContext(), vba.c);
                        int i4 = qp4.u0.j(g5cVar).i().b.b;
                        VectorPath vectorPathFindPath = enhancedVectorDrawable.findPath("stroke");
                        if (vectorPathFindPath != null) {
                            vectorPathFindPath.setStrokeColor(i4);
                            enhancedVectorDrawable.invalidatePath();
                        }
                        imageView.setImageDrawable(enhancedVectorDrawable);
                    }
                }
                g5cVar.setContentDescription(g5cVar.getResources().getQuantityString(xba.a, 5, Integer.valueOf(g5cVar.getSelected()), 5));
                f5c f5cVar = g5cVar.H0;
                if (f5cVar != null) {
                    int selected = g5cVar.getSelected();
                    u00 u00Var = (u00) f5cVar;
                    bc7[] bc7VarArr5 = FakeInAppReviewBottomSheet.H0;
                    AppCompatTextView appCompatTextView = (AppCompatTextView) u00Var.b;
                    appCompatTextView.setPressed(false);
                    FakeInAppReviewBottomSheet fakeInAppReviewBottomSheet = (FakeInAppReviewBottomSheet) u00Var.c;
                    appCompatTextView.setBackground((RippleDrawable) fakeInAppReviewBottomSheet.E0.getValue());
                    appCompatTextView.setTextColor(-1);
                    tu0.K(appCompatTextView, 300L, new p23(fakeInAppReviewBottomSheet, selected, (FrameLayout) u00Var.o, i2));
                    break;
                }
                break;
        }
    }
}
