package defpackage;

import android.net.Uri;
import java.util.List;

/* loaded from: classes.dex */
public final class sd6 extends hqd {
    @Override // defpackage.hqd
    /* renamed from: E, reason: merged with bridge method [inline-methods] */
    public final void A(rd6 rd6Var) {
        String string;
        lk3 lk3Var = (lk3) this.a;
        lk3Var.setId(Long.hashCode(rd6Var.u0));
        w6b w6bVar = rd6Var.c;
        boolean zM = lk3Var.M(w6bVar.a.toString());
        CharSequence charSequenceD = w6bVar.a;
        List list = rd6Var.Z;
        if (zM) {
            charSequenceD = ema.D(charSequenceD, list, w6bVar.b);
        }
        lk3Var.setName(charSequenceD);
        w6b w6bVar2 = rd6Var.o;
        boolean zK = lk3Var.K(w6bVar2.a.toString());
        CharSequence charSequenceD2 = w6bVar2.a;
        if (zK) {
            charSequenceD2 = ema.D(charSequenceD2, list, w6bVar2.b);
        }
        lk3Var.setMessage(charSequenceD2);
        Uri uri = rd6Var.X;
        if (uri == null || (string = uri.toString()) == null) {
            string = Uri.EMPTY.toString();
        }
        lk3Var.O(rd6Var.a, rd6Var.b, string);
    }
}
