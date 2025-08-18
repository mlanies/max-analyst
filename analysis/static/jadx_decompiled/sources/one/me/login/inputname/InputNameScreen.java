package one.me.login.inputname;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.text.InputFilter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import defpackage.au1;
import defpackage.bc7;
import defpackage.bvc;
import defpackage.cka;
import defpackage.cla;
import defpackage.coc;
import defpackage.d80;
import defpackage.dj3;
import defpackage.dp3;
import defpackage.du4;
import defpackage.dy7;
import defpackage.e8b;
import defpackage.eqe;
import defpackage.eua;
import defpackage.fg7;
import defpackage.fh5;
import defpackage.fk4;
import defpackage.fkc;
import defpackage.foc;
import defpackage.fp3;
import defpackage.fs;
import defpackage.gkc;
import defpackage.glc;
import defpackage.gqe;
import defpackage.gv8;
import defpackage.hob;
import defpackage.hwb;
import defpackage.i3a;
import defpackage.i4f;
import defpackage.iu7;
import defpackage.je7;
import defpackage.kka;
import defpackage.kpa;
import defpackage.kre;
import defpackage.l2a;
import defpackage.lg3;
import defpackage.lnd;
import defpackage.lt7;
import defpackage.m32;
import defpackage.nec;
import defpackage.nf;
import defpackage.ng3;
import defpackage.nj4;
import defpackage.nta;
import defpackage.od2;
import defpackage.oi9;
import defpackage.p17;
import defpackage.pnf;
import defpackage.pz2;
import defpackage.q17;
import defpackage.q33;
import defpackage.q7c;
import defpackage.qp4;
import defpackage.r17;
import defpackage.ru3;
import defpackage.t03;
import defpackage.t17;
import defpackage.ti3;
import defpackage.tpa;
import defpackage.tu0;
import defpackage.u17;
import defpackage.uka;
import defpackage.uu3;
import defpackage.v0c;
import defpackage.v3c;
import defpackage.v9;
import defpackage.w17;
import defpackage.wfa;
import defpackage.wg0;
import defpackage.x27;
import defpackage.x37;
import defpackage.xr2;
import defpackage.ys;
import defpackage.z7;
import defpackage.z7b;
import defpackage.zn5;
import defpackage.znc;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.ListIterator;
import kotlin.Metadata;
import one.me.sdk.arch.Widget;
import one.me.sdk.bottomsheet.BottomSheetWidget;
import one.me.sdk.bottomsheet.ConfirmationBottomSheet;
import ru.ok.android.externcalls.sdk.api.ApiProtocol;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004B\u000f\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bB!\b\u0016\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\t\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u0007\u0010\u000e¨\u0006\u000f"}, d2 = {"Lone/me/login/inputname/InputNameScreen;", "Lone/me/sdk/arch/Widget;", "", "Lnta;", "Lng3;", "Landroid/os/Bundle;", "args", "<init>", "(Landroid/os/Bundle;)V", "", ApiProtocol.KEY_TOKEN, "phone", "Le8b;", "presetAvatars", "(Ljava/lang/String;Ljava/lang/String;Le8b;)V", "login_playGoogleRelease"}, k = 1, mv = {2, 0, 0})
@SuppressLint({"ValidController"})
/* loaded from: classes2.dex */
public final class InputNameScreen extends Widget implements nta, ng3 {
    public static final /* synthetic */ bc7[] B0 = {new hob(InputNameScreen.class, ApiProtocol.KEY_TOKEN, "getToken()Ljava/lang/String;", 0), z7b.g(nec.a, InputNameScreen.class, "phone", "getPhone()Ljava/lang/String;", 0), new hob(InputNameScreen.class, "nameInput", "getNameInput()Lone/me/sdk/uikit/common/views/OneMeTextInput;", 0), new hob(InputNameScreen.class, "surnameInput", "getSurnameInput()Lone/me/sdk/uikit/common/views/OneMeTextInput;", 0), new hob(InputNameScreen.class, "buttonsContainer", "getButtonsContainer()Lone/me/login/inputname/AnimatedOneMeButton;", 0), new oi9(InputNameScreen.class, "nameText", "getNameText()Ljava/lang/String;"), new oi9(InputNameScreen.class, "surnameText", "getSurnameText()Ljava/lang/String;")};
    public final fs A0;
    public final x27 X;
    public final je7 Y;
    public final je7 Z;
    public final /* synthetic */ dp3 a;
    public final fs b;
    public final fs c;
    public final glc o;
    public final je7 s0;
    public final je7 t0;
    public final je7 u0;
    public final je7 v0;
    public final q7c w0;
    public final q7c x0;
    public final q7c y0;
    public final fs z0;

    public InputNameScreen(String str, String str2, e8b e8bVar) {
        this(dy7.g(new kpa("screen:input_name:token", str), new kpa("screen:input_name:phone", str2), new kpa("screen:input_name:avatars", e8bVar)));
    }

    @Override // defpackage.nta
    public final void Y(boolean z) {
        ((iu7) this.u0.getValue()).b.m(null, Boolean.FALSE);
    }

    @Override // one.me.sdk.arch.Widget
    /* renamed from: getInsetsConfig, reason: from getter */
    public final x27 getX() {
        return this.X;
    }

    @Override // one.me.sdk.arch.Widget
    /* renamed from: getScreenDelegate */
    public final bvc getF0() {
        return this.o;
    }

    @Override // defpackage.ng3
    public final void h(int i, Bundle bundle) {
        Object objPrevious;
        uu3 uu3Var;
        if (i == hwb.oneme_login_input_name_confirmation_return) {
            x37 x37Var = (x37) this.s0.getValue();
            x37Var.getClass();
            Bundle bundle2 = new Bundle();
            bundle2.putString("screen:input_phone:phone", "");
            znc zncVar = x37Var.a;
            ArrayList arrayListE = zncVar.e();
            HashSet hashSet = new HashSet();
            Iterator it = new gkc(zncVar.e()).iterator();
            while (true) {
                ListIterator listIterator = ((fkc) it).b;
                if (!listIterator.hasPrevious()) {
                    break;
                }
                coc cocVar = (coc) listIterator.previous();
                if (tpa.f(cocVar.b, "InputPhoneScreen")) {
                    break;
                } else {
                    hashSet.add(cocVar);
                }
            }
            ListIterator listIterator2 = arrayListE.listIterator(arrayListE.size());
            while (true) {
                if (!listIterator2.hasPrevious()) {
                    objPrevious = null;
                    break;
                } else {
                    objPrevious = listIterator2.previous();
                    if (tpa.f(((coc) objPrevious).b, "InputPhoneScreen")) {
                        break;
                    }
                }
            }
            coc cocVar2 = (coc) objPrevious;
            if (cocVar2 == null || (uu3Var = cocVar2.a) == null) {
                return;
            }
            uu3Var.getArgs().clear();
            uu3Var.getArgs().putAll(bundle2);
            arrayListE.removeAll(hashSet);
            zncVar.P(arrayListE, null);
        }
    }

    public final nf m0() {
        return (nf) this.y0.T0(this, B0[4]);
    }

    public final cka n0() {
        return (cka) this.w0.T0(this, B0[2]);
    }

    public final cka o0() {
        return (cka) this.x0.T0(this, B0[3]);
    }

    @Override // one.me.sdk.arch.Widget, defpackage.uu3
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        ConstraintLayout constraintLayout = new ConstraintLayout(getContext());
        constraintLayout.setLayoutParams(new ti3(-1, -1));
        cla claVar = new cla(constraintLayout.getContext(), 6);
        claVar.setId(hwb.oneme_login_input_name_toolbar);
        claVar.setForm(uka.a);
        claVar.setLeftActions(new kka(new q17(this, 0)));
        constraintLayout.addView(claVar);
        TextView textView = new TextView(constraintLayout.getContext());
        textView.setId(hwb.oneme_login_input_name_title);
        textView.setLayoutParams(new ti3(-1, -2));
        textView.setGravity(17);
        i4f.c.b(textView, du4.b);
        v3c.y(new v9(3, null, 12), textView);
        textView.setText(z7.B(getContext(), v0c.oneme_login_input_name_title));
        constraintLayout.addView(textView);
        TextView textView2 = new TextView(constraintLayout.getContext());
        textView2.setId(hwb.oneme_login_input_name_description);
        textView2.setLayoutParams(new ti3(-1, -2));
        textView2.setGravity(17);
        i4f.m.b(textView2, du4.b);
        v3c.y(new v9(3, null, 13), textView2);
        textView2.setText(z7.B(getContext(), v0c.oneme_login_input_name_description));
        constraintLayout.addView(textView2);
        cka ckaVar = new cka(constraintLayout.getContext());
        ckaVar.setId(hwb.oneme_login_input_name);
        ckaVar.setLayoutParams(new ti3(-1, -2));
        float f = 76;
        ckaVar.setMinimumHeight(tu0.G(fk4.d().getDisplayMetrics().density * f));
        ckaVar.setHint(z7.B(getContext(), v0c.oneme_login_input_name_hint_name));
        bc7 bc7Var = B0[5];
        ckaVar.setText((String) this.z0.a(this));
        ckaVar.setFilters(new InputFilter[]{new InputFilter.LengthFilter(60)});
        int i = wfa.L;
        ckaVar.setBackgroundColorAttr(Integer.valueOf(i));
        v3c.y(new xr2(3, null, 1), ckaVar);
        constraintLayout.addView(ckaVar);
        cka ckaVar2 = new cka(constraintLayout.getContext());
        ckaVar2.setId(hwb.oneme_login_input_surname);
        ckaVar2.setLayoutParams(new ti3(-1, -2));
        ckaVar2.setBackgroundColorAttr(Integer.valueOf(i));
        ckaVar2.setMinimumHeight(tu0.G(f * fk4.d().getDisplayMetrics().density));
        ckaVar2.setHint(z7.B(getContext(), v0c.oneme_login_input_name_hint_surname));
        ckaVar2.setText(p0());
        ckaVar2.setFilters(new InputFilter[]{new InputFilter.LengthFilter(60)});
        v3c.y(new xr2(3, null, 2), ckaVar2);
        constraintLayout.addView(ckaVar2);
        nf nfVar = new nf(constraintLayout.getContext());
        nfVar.setClipToOutline(true);
        nfVar.setId(hwb.oneme_login_input_name_btn_container);
        nfVar.setLayoutParams(new ti3(-1, -2));
        nfVar.setupDisabledButton(new pz2(27));
        nfVar.setupActiveButton(new pz2(28));
        constraintLayout.addView(nfVar);
        dj3 dj3VarQ = fp3.q(constraintLayout);
        int i2 = hwb.oneme_login_input_name_toolbar;
        dj3VarQ.d(i2, 6, 0, 6);
        dj3VarQ.d(i2, 3, 0, 3);
        dj3VarQ.d(i2, 7, 0, 7);
        int i3 = hwb.oneme_login_input_name_title;
        dj3VarQ.d(i3, 6, 0, 6);
        float f2 = 12;
        au1.p(f2, fk4.d().getDisplayMetrics().density, new l2a(dj3VarQ, 6, i3, 4));
        dj3VarQ.d(i3, 3, hwb.oneme_login_input_name_toolbar, 4);
        float f3 = 24;
        au1.p(f3, fk4.d().getDisplayMetrics().density, new l2a(dj3VarQ, 3, i3, 4));
        dj3VarQ.d(i3, 7, 0, 7);
        au1.p(f2, fk4.d().getDisplayMetrics().density, new l2a(dj3VarQ, 7, i3, 4));
        int i4 = hwb.oneme_login_input_name_description;
        dj3VarQ.d(i4, 6, 0, 6);
        au1.p(f2, fk4.d().getDisplayMetrics().density, new l2a(dj3VarQ, 6, i4, 4));
        dj3VarQ.d(i4, 3, hwb.oneme_login_input_name_title, 4);
        au1.p(f2, fk4.d().getDisplayMetrics().density, new l2a(dj3VarQ, 3, i4, 4));
        dj3VarQ.d(i4, 7, 0, 7);
        au1.p(f2, fk4.d().getDisplayMetrics().density, new l2a(dj3VarQ, 7, i4, 4));
        int i5 = hwb.oneme_login_input_name;
        dj3VarQ.d(i5, 6, 0, 6);
        au1.p(f2, fk4.d().getDisplayMetrics().density, new l2a(dj3VarQ, 6, i5, 4));
        dj3VarQ.d(i5, 3, hwb.oneme_login_input_name_description, 4);
        au1.p(f3, fk4.d().getDisplayMetrics().density, new l2a(dj3VarQ, 3, i5, 4));
        dj3VarQ.d(i5, 7, 0, 7);
        au1.p(f2, fk4.d().getDisplayMetrics().density, new l2a(dj3VarQ, 7, i5, 4));
        int i6 = hwb.oneme_login_input_surname;
        dj3VarQ.d(i6, 6, 0, 6);
        au1.p(f2, fk4.d().getDisplayMetrics().density, new l2a(dj3VarQ, 6, i6, 4));
        dj3VarQ.d(i6, 3, hwb.oneme_login_input_name, 4);
        au1.p(8, fk4.d().getDisplayMetrics().density, new l2a(dj3VarQ, 3, i6, 4));
        dj3VarQ.d(i6, 7, 0, 7);
        au1.p(f2, fk4.d().getDisplayMetrics().density, new l2a(dj3VarQ, 7, i6, 4));
        int i7 = hwb.oneme_login_input_name_btn_container;
        dj3VarQ.d(i7, 6, 0, 6);
        au1.p(f2, fk4.d().getDisplayMetrics().density, new l2a(dj3VarQ, 6, i7, 4));
        dj3VarQ.d(i7, 4, 0, 4);
        au1.p(f2, fk4.d().getDisplayMetrics().density, new l2a(dj3VarQ, 4, i7, 4));
        dj3VarQ.d(i7, 7, 0, 7);
        new l2a(dj3VarQ, 7, i7, 4).e(tu0.G(f2 * fk4.d().getDisplayMetrics().density));
        dj3VarQ.a(constraintLayout);
        return constraintLayout;
    }

    @Override // defpackage.uu3
    public final void onDestroyView(View view) {
        super.onDestroyView(view);
        o0().a.setOnFocusChangeListener(null);
    }

    @Override // defpackage.uu3
    public final void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        if (i != 156 || getView() == null) {
            return;
        }
        w17 w17VarQ0 = q0();
        pnf.o(w17VarQ0.s0, lnd.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // one.me.sdk.arch.Widget
    public final void onViewCreated(View view) {
        kre kreVar = view instanceof kre ? (kre) view : null;
        if (kreVar != null) {
            kreVar.onThemeChanged(qp4.u0.j(view));
        }
        m0().setActiveButtonClickListener(new p17(this, 2));
        nf nfVarM0 = m0();
        bc7 bc7Var = B0[5];
        nfVarM0.setEnabled(((String) this.z0.a(this)).length() > 0);
        n0().b(new q17(this, 1));
        o0().b(new q17(this, 2));
        q0().q(p0(), o0().a.isFocused());
        o0().a.setOnFocusChangeListener(new gv8(1, new q17(this, 3)));
        i3a i3aVarH = getRouter().h();
        if (i3aVarH != null) {
            i3aVarH.a(this.lifecycleOwner, new ru3(6, this));
        }
        m32 m32Var = q0().t0;
        fg7 fg7Var = fg7.o;
        od2.L(new zn5(tu0.g(m32Var, getViewLifecycleOwner().Q(), fg7Var), new u17(null, this), 5), getViewLifecycleScope());
        od2.L(new zn5(new t03(tu0.g(q0().Y, getViewLifecycleOwner().Q(), fg7Var), 17), new t17(null, this), 5), getViewLifecycleScope());
        od2.L(new zn5(tu0.g(((iu7) this.u0.getValue()).c, getViewLifecycleOwner().Q(), fg7Var), new r17(null, this), 5), getViewLifecycleScope());
    }

    public final String p0() {
        bc7 bc7Var = B0[6];
        return (String) this.A0.a(this);
    }

    public final w17 q0() {
        return (w17) this.v0.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void r0() {
        bc7[] bc7VarArr = BottomSheetWidget.x0;
        lg3 lg3VarE = wg0.e(v0c.oneme_login_input_name_confirmation_title, 6, null);
        int i = v0c.oneme_login_input_name_confirmation_description;
        bc7 bc7Var = B0[1];
        lg3VarE.f(new gqe(i, ys.m0(new Object[]{(String) this.c.a(this)})));
        lg3VarE.d(hwb.oneme_login_input_name_confirmation_cancel, new eqe(v0c.oneme_login_input_name_confirmation_cancel));
        lg3VarE.b(hwb.oneme_login_input_name_confirmation_return, new eqe(v0c.oneme_login_input_name_confirmation_return));
        ConfirmationBottomSheet confirmationBottomSheetE = lg3VarE.e();
        confirmationBottomSheetE.setTargetController(this);
        uu3 parentController = this;
        while (parentController.getParentController() != null) {
            parentController = parentController.getParentController();
        }
        foc focVar = parentController instanceof foc ? (foc) parentController : null;
        znc zncVarT = focVar != null ? focVar.T() : null;
        confirmationBottomSheetE.z0(this);
        if (zncVarT != null) {
            coc cocVar = new coc(confirmationBottomSheetE, null, null, null, false, -1);
            wg0.l(false, cocVar, true, "BottomSheetWidget");
            zncVarT.G(cocVar);
        }
    }

    public InputNameScreen(Bundle bundle) {
        super(bundle, 0, 2, null);
        this.a = new dp3();
        this.b = new fs(String.class, "screen:input_name:token");
        this.c = new fs(String.class, "screen:input_name:phone");
        this.o = new glc(new fh5(20), null, 6);
        this.X = x27.d;
        lt7 lt7Var = lt7.a;
        this.Y = lt7Var.getAccessor().d(eua.class);
        this.Z = lt7Var.getAccessor().d(q33.class);
        this.s0 = tu0.r(3, new p17(this, 0));
        this.t0 = lt7Var.getAccessor().d(d80.class);
        this.u0 = m41getSharedViewModelcp94BC8("LoginScope", iu7.class, null);
        this.v0 = createViewModelLazy(w17.class, new nj4(8, new p17(this, 1)));
        this.w0 = viewBinding(hwb.oneme_login_input_name);
        this.x0 = viewBinding(hwb.oneme_login_input_surname);
        this.y0 = viewBinding(hwb.oneme_login_input_name_btn_container);
        this.z0 = new fs(String.class, "", "screen:input_name:name");
        this.A0 = new fs(String.class, "", "screen:input_name:surname");
    }
}
