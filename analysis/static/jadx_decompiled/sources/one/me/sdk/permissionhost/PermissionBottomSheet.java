package one.me.sdk.permissionhost;

import android.annotation.SuppressLint;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatTextView;
import defpackage.b7a;
import defpackage.bc7;
import defpackage.c7a;
import defpackage.du4;
import defpackage.e0d;
import defpackage.fk4;
import defpackage.fs;
import defpackage.fua;
import defpackage.hq;
import defpackage.i4f;
import defpackage.je7;
import defpackage.kr0;
import defpackage.nec;
import defpackage.nga;
import defpackage.o9;
import defpackage.oga;
import defpackage.oi9;
import defpackage.pq9;
import defpackage.qp4;
import defpackage.rh4;
import defpackage.tu0;
import defpackage.z6a;
import defpackage.zj7;
import kotlin.Metadata;
import one.me.sdk.bottomsheet.BottomSheetWidget;
import one.me.sdk.uikit.common.button.OneMeButton;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003B=\b\u0016\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\b\u0001\u0010\t\u001a\u00020\u0007\u0012\b\b\u0001\u0010\n\u001a\u00020\u0007\u0012\b\b\u0001\u0010\u000b\u001a\u00020\u0007¢\u0006\u0004\b\u0002\u0010\fB\u001d\b\u0016\u0012\b\b\u0001\u0010\t\u001a\u00020\u0007\u0012\b\b\u0001\u0010\n\u001a\u00020\u0007¢\u0006\u0004\b\u0002\u0010\r¨\u0006\u000e"}, d2 = {"Lone/me/sdk/permissionhost/PermissionBottomSheet;", "Lone/me/sdk/bottomsheet/BottomSheetWidget;", "<init>", "()V", "", "", "permissions", "", "requestCode", "titleId", "rationaleId", "positiveButtonId", "([Ljava/lang/String;IIII)V", "(II)V", "permission-host_release"}, k = 1, mv = {2, 0, 0})
@SuppressLint({"ValidController"})
/* loaded from: classes2.dex */
public final class PermissionBottomSheet extends BottomSheetWidget {
    public static final /* synthetic */ bc7[] H0 = {new oi9(PermissionBottomSheet.class, "settingsMode", "getSettingsMode()Z"), rh4.g(nec.a, PermissionBottomSheet.class, "titleId", "getTitleId()I"), new oi9(PermissionBottomSheet.class, "rationaleId", "getRationaleId()I"), new oi9(PermissionBottomSheet.class, "positiveButtonId", "getPositiveButtonId()I"), new oi9(PermissionBottomSheet.class, "requestedPermissions", "getRequestedPermissions()[Ljava/lang/String;"), new oi9(PermissionBottomSheet.class, "requestCode", "getRequestCode()I"), new oi9(PermissionBottomSheet.class, "isCallbackSent", "isCallbackSent()Z")};
    public final fs A0;
    public final fs B0;
    public final fs C0;
    public final fs D0;
    public final fs E0;
    public final fs F0;
    public boolean G0;
    public final je7 y0;
    public final fs z0;

    public PermissionBottomSheet() {
        super(null, 1, null);
        this.y0 = fua.a.b();
        this.z0 = new fs(Boolean.class, Boolean.TRUE, "PermissionBottomSheet.settings_mode");
        this.A0 = new fs(Integer.class, "PermissionBottomSheet.title_res");
        this.B0 = new fs(Integer.class, "PermissionBottomSheet.rationale_res");
        this.C0 = new fs(Integer.class, "PermissionBottomSheet.positive_button_res");
        this.D0 = new fs(String[].class, "PermissionBottomSheet.permissions");
        this.E0 = new fs(Integer.class, "PermissionBottomSheet.request_code");
        this.F0 = new fs(Boolean.class, Boolean.FALSE, "callback_sent");
    }

    @Override // one.me.sdk.bottomsheet.BaseBottomSheetWidget, defpackage.uu3
    public final void onAttach(View view) {
        super.onAttach(view);
        kr0 kr0Var = new kr0(this, new zj7(26, this));
        if (getRouter() != null) {
            getRouter().a(kr0Var);
        } else {
            addLifecycleListener(new o9(this, kr0Var, 9));
        }
    }

    @Override // one.me.sdk.bottomsheet.BottomSheetWidget
    public final View x0(LayoutInflater layoutInflater, FrameLayout frameLayout) {
        LinearLayout linearLayout = new LinearLayout(layoutInflater.getContext());
        linearLayout.setOrientation(1);
        AppCompatTextView appCompatTextView = new AppCompatTextView(linearLayout.getContext(), null);
        appCompatTextView.setId(nga.e);
        bc7[] bc7VarArr = H0;
        bc7 bc7Var = bc7VarArr[1];
        appCompatTextView.setText(((Number) this.A0.a(this)).intValue());
        appCompatTextView.setGravity(1);
        appCompatTextView.setTextAlignment(4);
        i4f.c.b(appCompatTextView, du4.b);
        pq9 pq9Var = qp4.u0;
        appCompatTextView.setTextColor(pq9Var.j(appCompatTextView).getText().e);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.topMargin = tu0.G(16 * fk4.d().getDisplayMetrics().density);
        linearLayout.addView(appCompatTextView, layoutParams);
        AppCompatTextView appCompatTextView2 = new AppCompatTextView(linearLayout.getContext(), null);
        appCompatTextView2.setId(nga.d);
        bc7 bc7Var2 = bc7VarArr[2];
        appCompatTextView2.setText(((Number) this.B0.a(this)).intValue());
        appCompatTextView2.setGravity(1);
        appCompatTextView2.setTextAlignment(4);
        i4f.n.b(appCompatTextView2, du4.b);
        appCompatTextView2.setTextColor(pq9Var.j(appCompatTextView2).getText().h);
        float f = 12;
        appCompatTextView2.setPadding(appCompatTextView2.getPaddingLeft(), tu0.G(fk4.d().getDisplayMetrics().density * f), appCompatTextView2.getPaddingRight(), tu0.G(f * fk4.d().getDisplayMetrics().density));
        linearLayout.addView(appCompatTextView2, new LinearLayout.LayoutParams(-1, -2));
        bc7 bc7Var3 = bc7VarArr[0];
        boolean zBooleanValue = ((Boolean) this.z0.a(this)).booleanValue();
        z6a z6aVar = z6a.o;
        c7a c7aVar = c7a.c;
        b7a b7aVar = b7a.o;
        if (zBooleanValue) {
            OneMeButton oneMeButton = new OneMeButton(linearLayout.getContext(), null);
            oneMeButton.setId(nga.b);
            oneMeButton.setMode(b7aVar);
            oneMeButton.setSize(c7aVar);
            oneMeButton.setAppearance(z6aVar);
            oneMeButton.setText(oga.f);
            oneMeButton.setOnClickListener(new hq(linearLayout, 3, this));
            LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
            layoutParams2.gravity = 1;
            linearLayout.addView(oneMeButton, layoutParams2);
        } else {
            OneMeButton oneMeButton2 = new OneMeButton(linearLayout.getContext(), null);
            oneMeButton2.setId(nga.c);
            oneMeButton2.setMode(b7aVar);
            oneMeButton2.setSize(c7aVar);
            oneMeButton2.setAppearance(z6aVar);
            bc7 bc7Var4 = bc7VarArr[3];
            oneMeButton2.setText(((Number) this.C0.a(this)).intValue());
            oneMeButton2.setOnClickListener(new hq(this, 4, this));
            LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-2, -2);
            layoutParams3.gravity = 1;
            linearLayout.addView(oneMeButton2, layoutParams3);
            OneMeButton oneMeButton3 = new OneMeButton(linearLayout.getContext(), null);
            oneMeButton3.setId(nga.a);
            oneMeButton3.setMode(b7aVar);
            oneMeButton3.setSize(c7aVar);
            oneMeButton3.setAppearance(z6aVar);
            oneMeButton3.setText(oga.e);
            oneMeButton3.setOnClickListener(new e0d(10, this));
            LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(-2, -2);
            layoutParams4.gravity = 1;
            linearLayout.addView(oneMeButton3, layoutParams4);
        }
        return linearLayout;
    }

    public PermissionBottomSheet(String[] strArr, int i, int i2, int i3, int i4) {
        this(i2, i3);
        bc7[] bc7VarArr = H0;
        bc7 bc7Var = bc7VarArr[4];
        this.D0.b(this, strArr);
        bc7 bc7Var2 = bc7VarArr[5];
        this.E0.b(this, Integer.valueOf(i));
        bc7 bc7Var3 = bc7VarArr[3];
        this.C0.b(this, Integer.valueOf(i4));
        bc7 bc7Var4 = bc7VarArr[0];
        this.z0.b(this, Boolean.FALSE);
    }

    public PermissionBottomSheet(int i, int i2) {
        this();
        bc7[] bc7VarArr = H0;
        bc7 bc7Var = bc7VarArr[1];
        this.A0.b(this, Integer.valueOf(i));
        bc7 bc7Var2 = bc7VarArr[2];
        this.B0.b(this, Integer.valueOf(i2));
    }
}
