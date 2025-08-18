package defpackage;

import ru.ok.tamtam.android.prefs.PmsKey;

/* loaded from: classes2.dex */
public final class se5 extends oyc implements qe5, w7d {
    public je7 i;

    @Override // defpackage.w7d
    public final void a() {
        je7 je7Var = this.i;
        eic eicVar = je7Var instanceof eic ? (eic) je7Var : null;
        if (eicVar != null) {
            eicVar.reset();
        }
    }

    public final boolean p() {
        return n(PmsKey.f22chatinvitelinkpermissionsenabled, false);
    }

    public final boolean q() {
        return n(PmsKey.gcas, false);
    }

    public final boolean r() {
        return n(PmsKey.gce, false);
    }

    public final boolean s() {
        return n(PmsKey.lgce, false);
    }

    public final boolean t() {
        return n(PmsKey.f91newadminpermissions, false);
    }

    public final boolean u() {
        return n(PmsKey.f19chatanim, false);
    }

    public final boolean v() {
        return n(PmsKey.f128videomsgenabled, false);
    }

    public final boolean w() {
        return n(PmsKey.f134webmstickersenabled, true);
    }
}
