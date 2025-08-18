package defpackage;

import android.net.Uri;

/* loaded from: classes.dex */
public final class qxa extends hqd {
    @Override // defpackage.hqd
    /* renamed from: E, reason: merged with bridge method [inline-methods] */
    public final void A(pxa pxaVar) {
        String string;
        lk3 lk3Var = (lk3) this.a;
        lk3Var.setId(Long.hashCode(pxaVar.v0));
        lk3Var.setEnabled(pxaVar.u0);
        lk3Var.setName(pxaVar.c);
        jqe jqeVar = pxaVar.o;
        lk3Var.setMessage(jqeVar != null ? jqeVar.b(lk3Var.getContext()) : null);
        lk3Var.setOnClickListener(null);
        Uri uri = pxaVar.X;
        if (uri == null || (string = uri.toString()) == null) {
            string = Uri.EMPTY.toString();
        }
        lk3Var.O(pxaVar.b, pxaVar.t0, string);
        lk3Var.setVerified(pxaVar.Z);
    }
}
