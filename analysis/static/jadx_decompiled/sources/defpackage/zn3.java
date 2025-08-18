package defpackage;

import android.net.Uri;

/* loaded from: classes.dex */
public final class zn3 extends hqd {
    @Override // defpackage.hqd
    /* renamed from: E, reason: merged with bridge method [inline-methods] */
    public final void A(nn3 nn3Var) {
        lk3 lk3Var = (lk3) this.a;
        long j = nn3Var.a;
        lk3Var.setId(Long.hashCode(j));
        lk3Var.setName(nn3Var.b);
        lk3Var.setMessage(nn3Var.X);
        lk3Var.setVerified(nn3Var.t0);
        lk3Var.N();
        lk3Var.setOnClickListener(null);
        Uri uri = nn3Var.Z;
        lk3Var.O(j, nn3Var.u0, uri != null ? uri.toString() : null);
        lk3Var.setSelectionEnabled(false);
    }
}
