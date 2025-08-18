package one.me.mediapicker.permissions;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import defpackage.bc7;
import defpackage.dda;
import defpackage.du4;
import defpackage.dy7;
import defpackage.eua;
import defpackage.fk4;
import defpackage.fs;
import defpackage.fua;
import defpackage.hob;
import defpackage.i4f;
import defpackage.je7;
import defpackage.kpa;
import defpackage.l5g;
import defpackage.nec;
import defpackage.suc;
import defpackage.te8;
import defpackage.tu0;
import defpackage.v3c;
import defpackage.xx5;
import defpackage.yx5;
import defpackage.z84;
import kotlin.Metadata;
import one.me.sdk.arch.Widget;
import one.me.sdk.uikit.common.button.OneMeButton;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u0011\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0004\u0010\b¨\u0006\t"}, d2 = {"Lone/me/mediapicker/permissions/MediaPickerPermissionWidget;", "Lone/me/sdk/arch/Widget;", "Landroid/os/Bundle;", "args", "<init>", "(Landroid/os/Bundle;)V", "Lsuc;", "scopeId", "(Ljava/lang/String;Lz84;)V", "media-picker_release"}, k = 1, mv = {2, 0, 0})
@SuppressLint({"ValidController"})
/* loaded from: classes2.dex */
public final class MediaPickerPermissionWidget extends Widget {
    public static final /* synthetic */ bc7[] o;
    public final fs a;
    public final je7 b;
    public final je7 c;

    static {
        hob hobVar = new hob(MediaPickerPermissionWidget.class, "scopeId", "getScopeId-IluPPks()Ljava/lang/String;", 0);
        nec.a.getClass();
        o = new bc7[]{hobVar};
    }

    public MediaPickerPermissionWidget(String str, z84 z84Var) {
        this(dy7.g(new kpa(Widget.ARG_SCOPE_ID, new suc(str))));
    }

    @Override // one.me.sdk.arch.Widget
    /* renamed from: getScopeId-IluPPks */
    public final String getB() {
        bc7 bc7Var = o[0];
        return ((suc) this.a.a(this)).a;
    }

    @Override // one.me.sdk.arch.Widget, defpackage.uu3
    public final void onActivityResumed(Activity activity) {
        te8 te8Var = (te8) this.b.getValue();
        te8Var.t0.h();
        te8Var.u0.h();
        super.onActivityResumed(activity);
    }

    @Override // one.me.sdk.arch.Widget, defpackage.uu3
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setOrientation(1);
        linearLayout.setGravity(17);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        float f = 20;
        float f2 = 0;
        layoutParams.setMargins(tu0.G(fk4.d().getDisplayMetrics().density * f), tu0.G(fk4.d().getDisplayMetrics().density * f2), tu0.G(f * fk4.d().getDisplayMetrics().density), tu0.G(f2 * fk4.d().getDisplayMetrics().density));
        linearLayout.setLayoutParams(layoutParams);
        TextView textView = new TextView(linearLayout.getContext());
        textView.setText(dda.j);
        i4f.o.b(textView, du4.b);
        textView.setGravity(17);
        TextView textView2 = new TextView(linearLayout.getContext());
        textView2.setText(dda.i);
        i4f.s.b(textView2, du4.b);
        textView2.setPadding(textView2.getPaddingLeft(), tu0.G(4 * fk4.d().getDisplayMetrics().density), textView2.getPaddingRight(), tu0.G(16 * fk4.d().getDisplayMetrics().density));
        textView2.setGravity(17);
        OneMeButton oneMeButton = new OneMeButton(linearLayout.getContext(), null);
        oneMeButton.setText(dda.d);
        oneMeButton.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        tu0.K(oneMeButton, 300L, new xx5(13, this));
        v3c.y(new yx5(textView, textView2, null, 1), linearLayout);
        linearLayout.addView(textView);
        linearLayout.addView(textView2);
        linearLayout.addView(oneMeButton);
        return linearLayout;
    }

    @Override // defpackage.uu3
    public final void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        je7 je7Var = this.c;
        int i2 = 0;
        if (i != 157) {
            if (i != 162) {
                return;
            }
            int length = iArr.length;
            while (i2 < length) {
                if (iArr[i2] != -1) {
                    return;
                } else {
                    i2++;
                }
            }
            eua.l((eua) je7Var.getValue(), new l5g(this, 1), strArr, iArr, eua.n, dda.f, dda.e);
            return;
        }
        int length2 = iArr.length;
        while (i2 < length2) {
            if (iArr[i2] != -1) {
                return;
            } else {
                i2++;
            }
        }
        eua euaVar = (eua) je7Var.getValue();
        l5g l5gVar = new l5g(this, 1);
        int i3 = dda.h;
        int i4 = dda.g;
        euaVar.getClass();
        eua.j(l5gVar, strArr, iArr, i3, i4);
    }

    public MediaPickerPermissionWidget(Bundle bundle) {
        super(bundle, 0, 2, null);
        this.a = new fs(suc.class, new suc("default"), Widget.ARG_SCOPE_ID);
        this.b = m41getSharedViewModelcp94BC8(getB(), te8.class, null);
        this.c = fua.a.b();
    }
}
