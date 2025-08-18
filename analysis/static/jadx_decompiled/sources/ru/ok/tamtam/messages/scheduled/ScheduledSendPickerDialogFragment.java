package ru.ok.tamtam.messages.scheduled;

import android.app.Dialog;
import android.content.DialogInterface;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.KeyEvent;
import android.view.View;
import androidx.appcompat.widget.AppCompatCheckBox;
import com.google.android.material.appbar.MaterialToolbar;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import defpackage.ake;
import defpackage.bc7;
import defpackage.bke;
import defpackage.dy7;
import defpackage.e44;
import defpackage.eh7;
import defpackage.ei6;
import defpackage.f46;
import defpackage.fdc;
import defpackage.ga;
import defpackage.hbc;
import defpackage.ie;
import defpackage.j16;
import defpackage.je7;
import defpackage.ju0;
import defpackage.k56;
import defpackage.kpa;
import defpackage.ktc;
import defpackage.ltc;
import defpackage.mtc;
import defpackage.n16;
import defpackage.nec;
import defpackage.ntc;
import defpackage.od2;
import defpackage.otc;
import defpackage.ptc;
import defpackage.pyb;
import defpackage.qtc;
import defpackage.r2c;
import defpackage.rtc;
import defpackage.sj3;
import defpackage.sme;
import defpackage.t03;
import defpackage.tnf;
import defpackage.tu0;
import defpackage.v2b;
import defpackage.wp;
import defpackage.wz2;
import defpackage.x16;
import defpackage.zn5;
import defpackage.zr6;
import java.io.Serializable;
import kotlin.Metadata;
import ru.ok.TamBottomSheetDialogFragment;
import ru.ok.tamtam.messages.scheduled.ScheduledSendPickerDialogFragment;
import ru.ok.tamtam.messages.scheduled.ScheduledSendPickerViewModel;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0007"}, d2 = {"Lru/ok/tamtam/messages/scheduled/ScheduledSendPickerDialogFragment;", "Lru/ok/TamBottomSheetDialogFragment;", "<init>", "()V", "mtc", "ktc", "ltc", "scheduled-send-picker-dialog_release"}, k = 1, mv = {2, 0, 0})
/* loaded from: classes2.dex */
public final class ScheduledSendPickerDialogFragment extends TamBottomSheetDialogFragment {
    public final je7 D1;
    public final je7 E1;
    public final je7 F1;
    public final tnf G1;
    public final je7 H1;

    public ScheduledSendPickerDialogFragment() {
        super(pyb.scheduled_send_picker_fragment);
        final int i = 0;
        this.D1 = tu0.r(2, new k56(this) { // from class: ftc
            public final /* synthetic */ ScheduledSendPickerDialogFragment b;

            {
                this.b = this;
            }

            @Override // defpackage.k56
            public final Object invoke() {
                switch (i) {
                    case 0:
                        Bundle bundleT0 = this.b.T0();
                        Serializable serializable = bundleT0.getSerializable("ScheduledSendPickerViewModel:delayed_attrs");
                        ng4 ng4Var = serializable instanceof ng4 ? (ng4) serializable : null;
                        return Boolean.valueOf(ng4Var != null ? ng4Var.b : bundleT0.getBoolean("ScheduledSendPickerDialogFragment:send_with_notification"));
                    case 1:
                        return this.b.T0().getString("ScheduledSendPickerDialogFragment:who", null);
                    default:
                        return this.b.T0().getParcelable("ScheduledSendPickerDialogFragment:arg_input");
                }
            }
        });
        final int i2 = 1;
        this.E1 = tu0.r(2, new k56(this) { // from class: ftc
            public final /* synthetic */ ScheduledSendPickerDialogFragment b;

            {
                this.b = this;
            }

            @Override // defpackage.k56
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        Bundle bundleT0 = this.b.T0();
                        Serializable serializable = bundleT0.getSerializable("ScheduledSendPickerViewModel:delayed_attrs");
                        ng4 ng4Var = serializable instanceof ng4 ? (ng4) serializable : null;
                        return Boolean.valueOf(ng4Var != null ? ng4Var.b : bundleT0.getBoolean("ScheduledSendPickerDialogFragment:send_with_notification"));
                    case 1:
                        return this.b.T0().getString("ScheduledSendPickerDialogFragment:who", null);
                    default:
                        return this.b.T0().getParcelable("ScheduledSendPickerDialogFragment:arg_input");
                }
            }
        });
        final int i3 = 2;
        this.F1 = tu0.r(2, new k56(this) { // from class: ftc
            public final /* synthetic */ ScheduledSendPickerDialogFragment b;

            {
                this.b = this;
            }

            @Override // defpackage.k56
            public final Object invoke() {
                switch (i3) {
                    case 0:
                        Bundle bundleT0 = this.b.T0();
                        Serializable serializable = bundleT0.getSerializable("ScheduledSendPickerViewModel:delayed_attrs");
                        ng4 ng4Var = serializable instanceof ng4 ? (ng4) serializable : null;
                        return Boolean.valueOf(ng4Var != null ? ng4Var.b : bundleT0.getBoolean("ScheduledSendPickerDialogFragment:send_with_notification"));
                    case 1:
                        return this.b.T0().getString("ScheduledSendPickerDialogFragment:who", null);
                    default:
                        return this.b.T0().getParcelable("ScheduledSendPickerDialogFragment:arg_input");
                }
            }
        });
        je7 je7VarR = tu0.r(3, new ei6(1, new ie(5, this)));
        this.G1 = new tnf(nec.a(ScheduledSendPickerViewModel.class), new rtc(0, je7VarR), new v2b(this, 2, je7VarR), new rtc(1, je7VarR));
        this.H1 = tu0.r(2, new hbc(this));
    }

    public static final void p1(String str, n16 n16Var, eh7 eh7Var, sj3 sj3Var) {
        ga gaVar = new ga(null, 27, sj3Var);
        String strI = zr6.i("ScheduledSendPickerDialogFragment:", str, ":result");
        j16 j16Var = (j16) n16Var.m.remove(strI);
        if (j16Var != null) {
            j16Var.a.f(j16Var.c);
        }
        n16Var.f0(strI, eh7Var, new wp(7, gaVar));
    }

    public static final void q1(String str, n16 n16Var) {
        ScheduledSendPickerDialogFragment scheduledSendPickerDialogFragment = new ScheduledSendPickerDialogFragment();
        scheduledSendPickerDialogFragment.X0(dy7.g(new kpa("ScheduledSendPickerDialogFragment:who", str), new kpa("ScheduledSendPickerDialogFragment:send_with_notification", Boolean.TRUE), new kpa("ScheduledSendPickerDialogFragment:arg_input", null), new kpa("ScheduledSendPickerViewModel:delayed_attrs", null)));
        scheduledSendPickerDialogFragment.k1(n16Var, "ScheduledSendPickerDialogFragment");
    }

    @Override // androidx.fragment.app.a
    public final void O0(View view, Bundle bundle) {
        mtc mtcVarM1 = m1();
        eh7 eh7VarL0 = l0();
        mtcVarM1.a = view;
        x16 x16Var = (x16) eh7VarL0;
        x16Var.b();
        x16Var.X.a(new fdc(3, mtcVarM1));
        od2.L(new zn5(od2.u(new t03(new zn5(sme.d0, new ake(2, null)), 11), 100L), new bke(this, null), 5), f46.J(l0()));
        od2.L(new zn5(new t03(n1().d, 11), new ntc(this, null), 5), f46.J(l0()));
        od2.L(new zn5(n1().l, new otc(view, this, null), 5), f46.J(l0()));
        od2.L(new zn5(new t03(new t03(n1().n, 11), 21), new ptc(this, null), 5), f46.J(l0()));
        m1().b().setListener$scheduled_send_picker_dialog_release(n1());
        final int i = 0;
        tu0.K(m1().c(), 300L, new View.OnClickListener(this) { // from class: htc
            public final /* synthetic */ ScheduledSendPickerDialogFragment b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) throws Resources.NotFoundException {
                switch (i) {
                    case 0:
                        ScheduledSendPickerViewModel scheduledSendPickerViewModelN1 = this.b.n1();
                        scheduledSendPickerViewModelN1.getClass();
                        hm9.n("ScheduledSendPickerViewModel", "onSendClick");
                        if (scheduledSendPickerViewModelN1.h()) {
                            scheduledSendPickerViewModelN1.m.m(null, new tm9());
                            break;
                        }
                        break;
                    default:
                        hm9.n("ScheduledSendPickerDialogFragment", "handle nav click");
                        ScheduledSendPickerDialogFragment scheduledSendPickerDialogFragment = this.b;
                        scheduledSendPickerDialogFragment.o1(new itc((Parcelable) scheduledSendPickerDialogFragment.F1.getValue()));
                        scheduledSendPickerDialogFragment.e1();
                        break;
                }
            }
        });
        mtc mtcVarM12 = m1();
        mtcVarM12.getClass();
        bc7[] bc7VarArr = mtc.t0;
        MaterialToolbar materialToolbar = (MaterialToolbar) mtcVarM12.c.T0(mtcVarM12, bc7VarArr[0]);
        materialToolbar.setBackground(null);
        final int i2 = 1;
        materialToolbar.setNavigationOnClickListener(new e44(new View.OnClickListener(this) { // from class: htc
            public final /* synthetic */ ScheduledSendPickerDialogFragment b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) throws Resources.NotFoundException {
                switch (i2) {
                    case 0:
                        ScheduledSendPickerViewModel scheduledSendPickerViewModelN1 = this.b.n1();
                        scheduledSendPickerViewModelN1.getClass();
                        hm9.n("ScheduledSendPickerViewModel", "onSendClick");
                        if (scheduledSendPickerViewModelN1.h()) {
                            scheduledSendPickerViewModelN1.m.m(null, new tm9());
                            break;
                        }
                        break;
                    default:
                        hm9.n("ScheduledSendPickerDialogFragment", "handle nav click");
                        ScheduledSendPickerDialogFragment scheduledSendPickerDialogFragment = this.b;
                        scheduledSendPickerDialogFragment.o1(new itc((Parcelable) scheduledSendPickerDialogFragment.F1.getValue()));
                        scheduledSendPickerDialogFragment.e1();
                        break;
                }
            }
        }, 0));
        mtc mtcVarM13 = m1();
        mtcVarM13.getClass();
        AppCompatCheckBox appCompatCheckBox = (AppCompatCheckBox) mtcVarM13.Y.T0(mtcVarM13, bc7VarArr[3]);
        appCompatCheckBox.setVisibility(((Boolean) this.D1.getValue()).booleanValue() ? 0 : 8);
        appCompatCheckBox.setOnCheckedChangeListener(new wz2(3, this));
        od2.L(new zn5(new t03(n1().f, 11), new qtc(this, null), 5), f46.J(l0()));
    }

    @Override // com.google.android.material.bottomsheet.BottomSheetDialogFragment, androidx.appcompat.app.AppCompatDialogFragment, androidx.fragment.app.DialogFragment
    public final Dialog h1() throws Resources.NotFoundException {
        ltc ltcVar = new ltc(U0(), r2c.UiUtils_LightBottomSheetDialog);
        ltcVar.u0 = true;
        ltcVar.h().K(3);
        ltcVar.h().I(true);
        ltcVar.h().J = true;
        BottomSheetBehavior bottomSheetBehaviorH = ltcVar.h();
        bottomSheetBehaviorH.K = false;
        bottomSheetBehaviorH.H(true);
        ltcVar.setOnKeyListener(new DialogInterface.OnKeyListener() { // from class: gtc
            @Override // android.content.DialogInterface.OnKeyListener
            public final boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
                if (i != 4 || keyEvent.getAction() != 1) {
                    return false;
                }
                ScheduledSendPickerDialogFragment scheduledSendPickerDialogFragment = this.a;
                scheduledSendPickerDialogFragment.o1(new itc((Parcelable) scheduledSendPickerDialogFragment.F1.getValue()));
                return false;
            }
        });
        return ltcVar;
    }

    public final mtc m1() {
        return (mtc) this.H1.getValue();
    }

    public final ScheduledSendPickerViewModel n1() {
        return (ScheduledSendPickerViewModel) this.G1.getValue();
    }

    public final void o1(ktc ktcVar) {
        je7 je7Var = this.E1;
        f0().e0(zr6.i("ScheduledSendPickerDialogFragment:", (String) je7Var.getValue(), ":result"), dy7.g(new kpa(zr6.i("ScheduledSendPickerDialogFragment:", (String) je7Var.getValue(), ":result"), ktcVar)));
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.a
    public final void v0(Bundle bundle) {
        super.v0(bundle);
        ju0.v(S0());
    }

    @Override // defpackage.wme
    public final void z(sme smeVar) {
        m1().z(smeVar);
    }
}
