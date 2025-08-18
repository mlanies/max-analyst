package one.me.profileedit.screens.memberpermissions;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import defpackage.dy7;
import defpackage.eh2;
import defpackage.g43;
import defpackage.iba;
import defpackage.je7;
import defpackage.jjb;
import defpackage.jp8;
import defpackage.kjb;
import defpackage.kpa;
import defpackage.mjb;
import defpackage.neb;
import defpackage.njb;
import defpackage.o;
import defpackage.od2;
import defpackage.pnf;
import defpackage.shb;
import defpackage.v3c;
import defpackage.x27;
import defpackage.zjb;
import defpackage.zn5;
import kotlin.Metadata;
import one.me.sdk.arch.Widget;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006B\u0011\b\u0016\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u0005\u0010\t¨\u0006\n"}, d2 = {"Lone/me/profileedit/screens/memberpermissions/ProfileMemberPermissionsScreen;", "Lone/me/sdk/arch/Widget;", "Ljjb;", "Landroid/os/Bundle;", "args", "<init>", "(Landroid/os/Bundle;)V", "", "id", "(J)V", "profile-edit_release"}, k = 1, mv = {2, 0, 0})
@SuppressLint({"ValidController"})
/* loaded from: classes2.dex */
public final class ProfileMemberPermissionsScreen extends Widget implements jjb {
    public static final /* synthetic */ int o = 0;
    public final x27 a;
    public final je7 b;
    public final kjb c;

    public ProfileMemberPermissionsScreen(Bundle bundle) {
        super(bundle, 0, 2, null);
        this.a = x27.d;
        this.b = createViewModelLazy(zjb.class, new jp8(20, new eh2(bundle, 8)));
        this.c = new kjb(((iba) neb.a.getAccessor().c(iba.class)).a(), this);
    }

    @Override // one.me.sdk.arch.Widget
    /* renamed from: getInsetsConfig, reason: from getter */
    public final x27 getB() {
        return this.a;
    }

    @Override // defpackage.uu3
    public final boolean handleBack() {
        zjb zjbVarM0 = m0();
        zjbVarM0.getClass();
        pnf.o(zjbVarM0.x0, g43.b);
        return true;
    }

    public final zjb m0() {
        return (zjb) this.b.getValue();
    }

    @Override // one.me.sdk.arch.Widget, defpackage.uu3
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        mjb mjbVar = new mjb(this, 0);
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setOrientation(1);
        linearLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        v3c.y(new o(3, null, 10), linearLayout);
        mjbVar.invoke(linearLayout);
        return linearLayout;
    }

    @Override // one.me.sdk.arch.Widget
    public final void onViewCreated(View view) {
        od2.L(new zn5(m0().w0, new shb(2, this.c, kjb.class, "submitList", "submitList(Ljava/util/List;)V", 4, 2), 5), getViewLifecycleScope());
        od2.L(new zn5(m0().x0, new njb(2, null), 5), getViewLifecycleScope());
    }

    public ProfileMemberPermissionsScreen(long j) {
        this(dy7.g(new kpa("id", Long.valueOf(j))));
    }
}
