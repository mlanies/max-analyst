package defpackage;

import android.view.View;
import one.me.profileedit.ProfileEditScreen;

/* loaded from: classes2.dex */
public final /* synthetic */ class agb implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ ProfileEditScreen b;

    public /* synthetic */ agb(ProfileEditScreen profileEditScreen, int i) {
        this.a = i;
        this.b = profileEditScreen;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        ProfileEditScreen profileEditScreen = this.b;
        switch (this.a) {
            case 0:
                bc7[] bc7VarArr = ProfileEditScreen.y0;
                gv4 gv4Var = profileEditScreen.n0().b;
                if (gv4Var.d()) {
                    gv4Var.k();
                    break;
                }
                break;
            default:
                bc7[] bc7VarArr2 = ProfileEditScreen.y0;
                profileEditScreen.n0().u();
                break;
        }
    }
}
