package defpackage;

import android.view.View;

/* loaded from: classes.dex */
public final class y8c extends hqd {
    @Override // defpackage.hqd
    /* renamed from: E, reason: merged with bridge method [inline-methods] */
    public final void A(v8c v8cVar) {
        boolean z = v8cVar.Z;
        View view = this.a;
        if (z) {
            ((x8c) view).setAvatarShape(l5a.a);
        }
        ((x8c) view).setAvatar(v8cVar.c);
        ((x8c) view).setAbbreviation(oag.a(v8cVar.o, Long.valueOf(this.X)));
        ((x8c) view).setName(v8cVar.b);
        ((x8c) view).setVerified(v8cVar.Y);
        ((x8c) view).setOnline(v8cVar.X);
    }
}
