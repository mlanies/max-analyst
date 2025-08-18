package one.me.calls.ui.bottomsheet.raisehand;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import defpackage.au1;
import defpackage.b7a;
import defpackage.b8a;
import defpackage.bc7;
import defpackage.c7a;
import defpackage.dj3;
import defpackage.du4;
import defpackage.dy7;
import defpackage.eh2;
import defpackage.fk4;
import defpackage.fka;
import defpackage.fp3;
import defpackage.gg1;
import defpackage.h4c;
import defpackage.hob;
import defpackage.i4c;
import defpackage.i4f;
import defpackage.je7;
import defpackage.jp8;
import defpackage.kpa;
import defpackage.l2a;
import defpackage.nec;
import defpackage.od2;
import defpackage.oec;
import defpackage.pq9;
import defpackage.q7c;
import defpackage.qp4;
import defpackage.suc;
import defpackage.tu0;
import defpackage.y7a;
import defpackage.z6a;
import defpackage.z84;
import defpackage.zn5;
import defpackage.zr6;
import kotlin.Metadata;
import one.me.calls.ui.bottomsheet.raisehand.RaiseHandActionBottomSheet;
import one.me.sdk.arch.Widget;
import one.me.sdk.bottomsheet.BottomSheetWidget;
import one.me.sdk.uikit.common.button.OneMeButton;
import ru.ok.android.externcalls.sdk.participant.state.ParticipantStatesManager;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u0019\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0004\u0010\n¨\u0006\u000b"}, d2 = {"Lone/me/calls/ui/bottomsheet/raisehand/RaiseHandActionBottomSheet;", "Lone/me/sdk/bottomsheet/BottomSheetWidget;", "Landroid/os/Bundle;", "args", "<init>", "(Landroid/os/Bundle;)V", "Lsuc;", "scopeId", "Lgg1;", "opponentId", "(Ljava/lang/String;Lgg1;Lz84;)V", "calls-ui_release"}, k = 1, mv = {2, 0, 0})
/* loaded from: classes.dex */
public final class RaiseHandActionBottomSheet extends BottomSheetWidget {
    public static final /* synthetic */ bc7[] B0;
    public final q7c A0;
    public final je7 y0;
    public final q7c z0;

    static {
        hob hobVar = new hob(RaiseHandActionBottomSheet.class, "titleView", "getTitleView()Landroid/widget/TextView;", 0);
        oec oecVar = nec.a;
        B0 = new bc7[]{hobVar, zr6.e(oecVar, RaiseHandActionBottomSheet.class, "subtitleView", "getSubtitleView()Landroid/widget/TextView;", 0), zr6.f(RaiseHandActionBottomSheet.class, "positiveBtn", "getPositiveBtn()Lone/me/sdk/uikit/common/button/OneMeButton;", 0, oecVar), zr6.f(RaiseHandActionBottomSheet.class, "negativeBtn", "getNegativeBtn()Lone/me/sdk/uikit/common/button/OneMeButton;", 0, oecVar)};
    }

    public RaiseHandActionBottomSheet(String str, gg1 gg1Var, z84 z84Var) {
        this(dy7.g(new kpa(Widget.ARG_SCOPE_ID, new suc(str)), new kpa("opponent_id", gg1Var)));
    }

    @Override // one.me.sdk.arch.Widget
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        od2.L(new zn5(((i4c) this.y0.getValue()).o, new h4c(this, null), 5), getViewLifecycleScope());
    }

    @Override // one.me.sdk.bottomsheet.BaseBottomSheetWidget
    public final fka q0() {
        return qp4.u0.o(getContext()).c;
    }

    @Override // one.me.sdk.bottomsheet.BottomSheetWidget
    public final View x0(LayoutInflater layoutInflater, FrameLayout frameLayout) {
        ConstraintLayout constraintLayout = new ConstraintLayout(layoutInflater.getContext());
        TextView textView = new TextView(constraintLayout.getContext());
        textView.setId(y7a.j1);
        i4f.c.b(textView, du4.b);
        pq9 pq9Var = qp4.u0;
        textView.setTextColor(pq9Var.p(textView).c.getText().e);
        textView.setGravity(17);
        float f = 24;
        textView.setPadding(0, tu0.G(fk4.d().getDisplayMetrics().density * f), 0, 0);
        TextView textView2 = new TextView(constraintLayout.getContext());
        textView2.setId(y7a.i1);
        i4f.p.b(textView2, du4.b);
        textView2.setTextColor(pq9Var.p(textView2).c.getText().g);
        textView2.setGravity(17);
        OneMeButton oneMeButton = new OneMeButton(constraintLayout.getContext(), null);
        oneMeButton.setId(y7a.g1);
        z6a z6aVar = z6a.c;
        oneMeButton.setAppearance(z6aVar);
        c7a c7aVar = c7a.c;
        oneMeButton.setSize(c7aVar);
        oneMeButton.setMode(b7a.b);
        oneMeButton.setCustomTheme(pq9Var.p(oneMeButton).c);
        oneMeButton.setText(b8a.r1);
        final int i = 0;
        tu0.K(oneMeButton, 300L, new View.OnClickListener(this) { // from class: g4c
            public final /* synthetic */ RaiseHandActionBottomSheet b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                RaiseHandActionBottomSheet raiseHandActionBottomSheet = this.b;
                switch (i) {
                    case 0:
                        bc7[] bc7VarArr = RaiseHandActionBottomSheet.B0;
                        raiseHandActionBottomSheet.s0(true);
                        break;
                    default:
                        bc7[] bc7VarArr2 = RaiseHandActionBottomSheet.B0;
                        i4c i4cVar = (i4c) raiseHandActionBottomSheet.y0.getValue();
                        ir1 ir1Var = i4cVar.c;
                        gg1 id = ir1Var.d().a.getId();
                        gg1 gg1Var = i4cVar.b;
                        boolean zF = tpa.f(gg1Var, id);
                        ez0 ez0Var = ir1Var.l;
                        if (zF) {
                            yz0 yz0Var = (yz0) ez0Var;
                            ParticipantStatesManager participantStatesManagerF = yz0Var.f();
                            if (participantStatesManagerF != null) {
                                participantStatesManagerF.setOwnHandRaised(false);
                            }
                            yz0Var.x0.set(false);
                        } else {
                            yz0 yz0Var2 = (yz0) ez0Var;
                            ParticipantStatesManager participantStatesManagerF2 = yz0Var2.f();
                            if (participantStatesManagerF2 != null) {
                                participantStatesManagerF2.lowerHandParticipant(mqa.d(gg1Var));
                            }
                            yz0Var2.C0.g(gb.a);
                        }
                        raiseHandActionBottomSheet.s0(true);
                        break;
                }
            }
        });
        OneMeButton oneMeButton2 = new OneMeButton(constraintLayout.getContext(), null);
        oneMeButton2.setId(y7a.h1);
        oneMeButton2.setAppearance(z6aVar);
        oneMeButton2.setSize(c7aVar);
        oneMeButton2.setMode(b7a.a);
        oneMeButton2.setCustomTheme(pq9Var.p(oneMeButton2).c);
        oneMeButton2.setText(b8a.s1);
        final int i2 = 1;
        tu0.K(oneMeButton2, 300L, new View.OnClickListener(this) { // from class: g4c
            public final /* synthetic */ RaiseHandActionBottomSheet b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                RaiseHandActionBottomSheet raiseHandActionBottomSheet = this.b;
                switch (i2) {
                    case 0:
                        bc7[] bc7VarArr = RaiseHandActionBottomSheet.B0;
                        raiseHandActionBottomSheet.s0(true);
                        break;
                    default:
                        bc7[] bc7VarArr2 = RaiseHandActionBottomSheet.B0;
                        i4c i4cVar = (i4c) raiseHandActionBottomSheet.y0.getValue();
                        ir1 ir1Var = i4cVar.c;
                        gg1 id = ir1Var.d().a.getId();
                        gg1 gg1Var = i4cVar.b;
                        boolean zF = tpa.f(gg1Var, id);
                        ez0 ez0Var = ir1Var.l;
                        if (zF) {
                            yz0 yz0Var = (yz0) ez0Var;
                            ParticipantStatesManager participantStatesManagerF = yz0Var.f();
                            if (participantStatesManagerF != null) {
                                participantStatesManagerF.setOwnHandRaised(false);
                            }
                            yz0Var.x0.set(false);
                        } else {
                            yz0 yz0Var2 = (yz0) ez0Var;
                            ParticipantStatesManager participantStatesManagerF2 = yz0Var2.f();
                            if (participantStatesManagerF2 != null) {
                                participantStatesManagerF2.lowerHandParticipant(mqa.d(gg1Var));
                            }
                            yz0Var2.C0.g(gb.a);
                        }
                        raiseHandActionBottomSheet.s0(true);
                        break;
                }
            }
        });
        constraintLayout.addView(textView, -1, -2);
        constraintLayout.addView(textView2, -1, -2);
        constraintLayout.addView(oneMeButton2, 0, -2);
        constraintLayout.addView(oneMeButton, 0, -2);
        dj3 dj3VarQ = fp3.q(constraintLayout);
        int id = textView.getId();
        dj3VarQ.d(id, 3, 0, 3);
        au1.p(16, fk4.d().getDisplayMetrics().density, new l2a(dj3VarQ, 3, id, 4));
        dj3VarQ.d(id, 7, 0, 7);
        dj3VarQ.d(id, 6, 0, 6);
        dj3VarQ.d(id, 4, textView2.getId(), 3);
        dj3VarQ.g(id).d.W = 2;
        int id2 = textView2.getId();
        dj3VarQ.d(id2, 3, textView.getId(), 4);
        float f2 = 4;
        au1.p(f2, fk4.d().getDisplayMetrics().density, new l2a(dj3VarQ, 3, id2, 4));
        dj3VarQ.d(id2, 7, 0, 7);
        dj3VarQ.d(id2, 6, 0, 6);
        dj3VarQ.d(id2, 4, oneMeButton2.getId(), 3);
        int id3 = oneMeButton2.getId();
        dj3VarQ.d(id3, 3, textView2.getId(), 4);
        new l2a(dj3VarQ, 3, id3, 4).e(tu0.G(f * fk4.d().getDisplayMetrics().density));
        dj3VarQ.d(id3, 7, oneMeButton.getId(), 6);
        au1.p(f2, fk4.d().getDisplayMetrics().density, new l2a(dj3VarQ, 7, id3, 4));
        dj3VarQ.d(id3, 6, 0, 6);
        dj3VarQ.d(id3, 4, 0, 3);
        int id4 = oneMeButton.getId();
        dj3VarQ.d(id4, 3, oneMeButton2.getId(), 3);
        dj3VarQ.d(id4, 7, 0, 7);
        dj3VarQ.d(id4, 6, oneMeButton2.getId(), 7);
        new l2a(dj3VarQ, 6, id4, 4).e(tu0.G(f2 * fk4.d().getDisplayMetrics().density));
        dj3VarQ.d(id4, 4, oneMeButton2.getId(), 4);
        dj3VarQ.a(constraintLayout);
        return constraintLayout;
    }

    public RaiseHandActionBottomSheet(Bundle bundle) {
        super(bundle);
        this.y0 = createViewModelLazy(i4c.class, new jp8(22, new eh2(bundle, 9)));
        this.z0 = viewBinding(y7a.j1);
        this.A0 = viewBinding(y7a.i1);
        viewBinding(y7a.h1);
        viewBinding(y7a.g1);
    }
}
