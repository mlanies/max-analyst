package defpackage;

import java.util.List;
import one.me.profile.screens.avatars.ProfileAvatarWidget;

/* loaded from: classes2.dex */
public final class gbb extends p04 {
    public List w0;

    @Override // defpackage.p04
    public final void E(znc zncVar, int i) {
        uab uabVar = (uab) x53.j0(i, this.w0);
        if (uabVar == null) {
            return;
        }
        zncVar.R(new coc(new ProfileAvatarWidget(uabVar), null, null, null, false, -1));
    }

    @Override // defpackage.hdc
    public final int j() {
        return this.w0.size();
    }

    @Override // defpackage.p04, defpackage.hdc
    public final long k(int i) {
        uab uabVar = (uab) x53.j0(i, this.w0);
        return (uabVar != null ? Long.valueOf(uabVar.a) : null) != null ? r0.hashCode() : 0;
    }
}
