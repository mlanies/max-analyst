package defpackage;

import android.net.Uri;

/* loaded from: classes2.dex */
public final class ln8 extends hqd {
    @Override // defpackage.hqd
    /* renamed from: E, reason: merged with bridge method [inline-methods] */
    public final void A(kn8 kn8Var) {
        String string;
        lk3 lk3Var = (lk3) this.a;
        long j = kn8Var.a;
        lk3Var.setId(Long.hashCode(j));
        lk3Var.setEnabled(kn8Var.u0);
        lk3Var.setName(kn8Var.b);
        lk3Var.setMessage(kn8Var.o.b(lk3Var.getContext()));
        lk3Var.setVerified(kn8Var.Z);
        jqe jqeVar = kn8Var.x0;
        lk3Var.setAlias(jqeVar != null ? jqeVar.b(lk3Var.getContext()) : null);
        lk3Var.N();
        lk3Var.setOnClickListener(null);
        Uri uri = kn8Var.X;
        if (uri == null || (string = uri.toString()) == null) {
            string = Uri.EMPTY.toString();
        }
        lk3Var.O(j, kn8Var.Y, string);
        lk3Var.setSelectionEnabled(false);
    }
}
