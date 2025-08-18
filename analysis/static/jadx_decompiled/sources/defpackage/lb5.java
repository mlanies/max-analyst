package defpackage;

import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.coroutines.Continuation;
import one.me.inappreview.ui.FakeInAppReviewBottomSheet;

/* loaded from: classes2.dex */
public final class lb5 extends ffe implements c66 {
    public /* synthetic */ ConstraintLayout X;
    public /* synthetic */ fka Y;
    public final /* synthetic */ FakeInAppReviewBottomSheet Z;
    public final /* synthetic */ AppCompatTextView s0;
    public final /* synthetic */ AppCompatTextView t0;
    public final /* synthetic */ AppCompatTextView u0;
    public final /* synthetic */ g5c v0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lb5(FakeInAppReviewBottomSheet fakeInAppReviewBottomSheet, AppCompatTextView appCompatTextView, AppCompatTextView appCompatTextView2, AppCompatTextView appCompatTextView3, g5c g5cVar, Continuation continuation) {
        super(3, continuation);
        this.Z = fakeInAppReviewBottomSheet;
        this.s0 = appCompatTextView;
        this.t0 = appCompatTextView2;
        this.u0 = appCompatTextView3;
        this.v0 = g5cVar;
    }

    @Override // defpackage.c66
    public final Object invoke(Object obj, Object obj2, Object obj3) throws Throwable {
        AppCompatTextView appCompatTextView = this.u0;
        g5c g5cVar = this.v0;
        lb5 lb5Var = new lb5(this.Z, this.s0, this.t0, appCompatTextView, g5cVar, (Continuation) obj3);
        lb5Var.X = (ConstraintLayout) obj;
        lb5Var.Y = (fka) obj2;
        e5f e5fVar = e5f.a;
        lb5Var.o(e5fVar);
        return e5fVar;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        od2.a0(obj);
        ConstraintLayout constraintLayout = this.X;
        fka fkaVar = this.Y;
        pq9 pq9Var = qp4.u0;
        boolean zJ = pq9Var.b(constraintLayout.getContext()).j();
        FakeInAppReviewBottomSheet fakeInAppReviewBottomSheet = this.Z;
        fakeInAppReviewBottomSheet.B0.getPaint().setColor(fkaVar.i().b.b);
        fakeInAppReviewBottomSheet.D0.getPaint().setColor(zJ ? -14860999 : -1969940);
        this.s0.setTextColor(fkaVar.getText().e);
        this.t0.setTextColor(fkaVar.getText().i);
        this.u0.setTextColor(this.v0.getSelected() != 0 ? -1 : pq9Var.j(constraintLayout).getText().i);
        constraintLayout.invalidate();
        return e5f.a;
    }
}
