package one.me.calls.ui.bottomsheet.opponent;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import defpackage.ag3;
import defpackage.au1;
import defpackage.b7a;
import defpackage.b8a;
import defpackage.c7a;
import defpackage.cg3;
import defpackage.dj3;
import defpackage.du4;
import defpackage.dy7;
import defpackage.eh2;
import defpackage.fg7;
import defpackage.fk4;
import defpackage.fka;
import defpackage.fp3;
import defpackage.fqa;
import defpackage.gg1;
import defpackage.i4f;
import defpackage.je7;
import defpackage.kpa;
import defpackage.l2a;
import defpackage.od2;
import defpackage.pq9;
import defpackage.pqa;
import defpackage.qp4;
import defpackage.ti2;
import defpackage.tu0;
import defpackage.w7c;
import defpackage.y7a;
import defpackage.yf3;
import defpackage.z6a;
import defpackage.z84;
import defpackage.zf3;
import defpackage.zn5;
import kotlin.Metadata;
import one.me.calls.ui.bottomsheet.opponent.ConfirmRemoveOpponentToCallBottomSheet;
import one.me.sdk.bottomsheet.BottomSheetWidget;
import one.me.sdk.uikit.common.button.OneMeButton;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u001b\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0004\u0010\n¨\u0006\u000b"}, d2 = {"Lone/me/calls/ui/bottomsheet/opponent/ConfirmRemoveOpponentToCallBottomSheet;", "Lone/me/sdk/bottomsheet/BottomSheetWidget;", "Landroid/os/Bundle;", "args", "<init>", "(Landroid/os/Bundle;)V", "Lgg1;", "opponentId", "", "bottomSnackbarMargin", "(Lgg1;I)V", "calls-ui_release"}, k = 1, mv = {2, 0, 0})
/* loaded from: classes.dex */
public final class ConfirmRemoveOpponentToCallBottomSheet extends BottomSheetWidget {
    public static final /* synthetic */ int B0 = 0;
    public final je7 A0;
    public final je7 y0;
    public final je7 z0;

    public ConfirmRemoveOpponentToCallBottomSheet(Bundle bundle) {
        super(null, 1, null);
        this.y0 = createViewModelLazy(cg3.class, new ti2(27, new yf3(bundle, 0, this)));
        this.z0 = tu0.r(3, new zf3(0));
        this.A0 = tu0.r(3, new eh2(bundle, 1));
    }

    @Override // one.me.sdk.arch.Widget
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        od2.L(new zn5(tu0.g(((cg3) this.y0.getValue()).X, getViewLifecycleOwner().Q(), fg7.o), new ag3(null, this), 5), getViewLifecycleScope());
    }

    @Override // one.me.sdk.bottomsheet.BaseBottomSheetWidget
    public final fka q0() {
        return qp4.u0.o(getContext()).c;
    }

    @Override // one.me.sdk.bottomsheet.BottomSheetWidget
    public final View x0(LayoutInflater layoutInflater, FrameLayout frameLayout) {
        ConstraintLayout constraintLayout = new ConstraintLayout(layoutInflater.getContext());
        TextView textView = new TextView(constraintLayout.getContext());
        textView.setId(y7a.N0);
        textView.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        i4f.c.b(textView, du4.b);
        pq9 pq9Var = qp4.u0;
        textView.setTextColor(pq9Var.p(textView).c.getText().e);
        textView.setGravity(17);
        textView.setPadding(0, tu0.G(24 * fk4.d().getDisplayMetrics().density), 0, 0);
        textView.setText(b8a.Q0);
        constraintLayout.addView(textView);
        TextView textView2 = new TextView(constraintLayout.getContext());
        textView2.setId(y7a.M0);
        textView2.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        i4f.p.b(textView2, du4.b);
        textView2.setTextColor(pq9Var.p(textView2).c.getText().g);
        textView2.setGravity(17);
        Context context = textView2.getContext();
        int i = b8a.P0;
        cg3 cg3Var = (cg3) this.y0.getValue();
        fqa fqaVar = (fqa) ((pqa) ((w7c) cg3Var.c.e()).a.getValue()).c.get(cg3Var.b);
        String name = fqaVar != null ? fqaVar.b.getName() : null;
        if (name == null) {
            name = "";
        }
        textView2.setText(context.getString(i, name));
        constraintLayout.addView(textView2);
        OneMeButton oneMeButton = new OneMeButton(constraintLayout.getContext(), null);
        oneMeButton.setId(y7a.L0);
        oneMeButton.setLayoutParams(new ViewGroup.LayoutParams(0, -2));
        z6a z6aVar = z6a.c;
        oneMeButton.setAppearance(z6aVar);
        c7a c7aVar = c7a.c;
        oneMeButton.setSize(c7aVar);
        oneMeButton.setMode(b7a.a);
        oneMeButton.setCustomTheme(pq9Var.p(oneMeButton).c);
        oneMeButton.setText(b8a.O0);
        final int i2 = 0;
        tu0.K(oneMeButton, 300L, new View.OnClickListener(this) { // from class: xf3
            public final /* synthetic */ ConfirmRemoveOpponentToCallBottomSheet b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ConfirmRemoveOpponentToCallBottomSheet confirmRemoveOpponentToCallBottomSheet = this.b;
                switch (i2) {
                    case 0:
                        int i3 = ConfirmRemoveOpponentToCallBottomSheet.B0;
                        cg3 cg3Var2 = (cg3) confirmRemoveOpponentToCallBottomSheet.y0.getValue();
                        cg3Var2.o.d(cg3Var2.b);
                        break;
                    default:
                        int i4 = ConfirmRemoveOpponentToCallBottomSheet.B0;
                        confirmRemoveOpponentToCallBottomSheet.s0(true);
                        break;
                }
            }
        });
        constraintLayout.addView(oneMeButton);
        OneMeButton oneMeButton2 = new OneMeButton(constraintLayout.getContext(), null);
        oneMeButton2.setId(y7a.K0);
        oneMeButton2.setLayoutParams(new ViewGroup.LayoutParams(0, -2));
        oneMeButton2.setAppearance(z6aVar);
        oneMeButton2.setSize(c7aVar);
        oneMeButton2.setMode(b7a.b);
        oneMeButton2.setCustomTheme(pq9Var.p(oneMeButton2).c);
        oneMeButton2.setText(b8a.N0);
        final int i3 = 1;
        tu0.K(oneMeButton2, 300L, new View.OnClickListener(this) { // from class: xf3
            public final /* synthetic */ ConfirmRemoveOpponentToCallBottomSheet b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ConfirmRemoveOpponentToCallBottomSheet confirmRemoveOpponentToCallBottomSheet = this.b;
                switch (i3) {
                    case 0:
                        int i32 = ConfirmRemoveOpponentToCallBottomSheet.B0;
                        cg3 cg3Var2 = (cg3) confirmRemoveOpponentToCallBottomSheet.y0.getValue();
                        cg3Var2.o.d(cg3Var2.b);
                        break;
                    default:
                        int i4 = ConfirmRemoveOpponentToCallBottomSheet.B0;
                        confirmRemoveOpponentToCallBottomSheet.s0(true);
                        break;
                }
            }
        });
        constraintLayout.addView(oneMeButton2);
        dj3 dj3VarQ = fp3.q(constraintLayout);
        int id = textView.getId();
        dj3VarQ.d(id, 3, 0, 3);
        dj3VarQ.d(id, 7, 0, 7);
        dj3VarQ.d(id, 6, 0, 6);
        dj3VarQ.d(id, 4, textView2.getId(), 3);
        new l2a(dj3VarQ, 4, id, 4).e(tu0.G(16 * fk4.d().getDisplayMetrics().density));
        dj3VarQ.g(id).d.W = 2;
        int id2 = textView2.getId();
        dj3VarQ.d(id2, 3, textView.getId(), 4);
        dj3VarQ.d(id2, 7, 0, 7);
        dj3VarQ.d(id2, 6, 0, 6);
        dj3VarQ.d(id2, 4, oneMeButton2.getId(), 3);
        new l2a(dj3VarQ, 4, id2, 4).e(tu0.G(28 * fk4.d().getDisplayMetrics().density));
        int id3 = oneMeButton.getId();
        dj3VarQ.d(id3, 3, textView2.getId(), 4);
        dj3VarQ.d(id3, 7, oneMeButton2.getId(), 6);
        float f = 4;
        au1.p(f, fk4.d().getDisplayMetrics().density, new l2a(dj3VarQ, 7, id3, 4));
        dj3VarQ.d(id3, 6, 0, 6);
        dj3VarQ.d(id3, 4, 0, 3);
        int id4 = oneMeButton2.getId();
        dj3VarQ.d(id4, 3, oneMeButton.getId(), 3);
        dj3VarQ.d(id4, 7, 0, 7);
        dj3VarQ.d(id4, 6, oneMeButton.getId(), 7);
        new l2a(dj3VarQ, 6, id4, 4).e(tu0.G(f * fk4.d().getDisplayMetrics().density));
        dj3VarQ.d(id4, 4, oneMeButton.getId(), 4);
        dj3VarQ.a(constraintLayout);
        return constraintLayout;
    }

    public ConfirmRemoveOpponentToCallBottomSheet(gg1 gg1Var, int i) {
        this(dy7.g(new kpa("opponent_id", gg1Var), new kpa("bottom_snackbar_margin", Integer.valueOf(i))));
    }

    public /* synthetic */ ConfirmRemoveOpponentToCallBottomSheet(gg1 gg1Var, int i, int i2, z84 z84Var) {
        this(gg1Var, (i2 & 2) != 0 ? 0 : i);
    }
}
