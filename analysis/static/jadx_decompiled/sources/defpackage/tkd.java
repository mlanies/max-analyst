package defpackage;

import android.os.Bundle;
import one.me.dialogs.share.media.ChatMediaDownloadBottomSheet;

/* loaded from: classes.dex */
public final class tkd extends vrd {
    public static final tkd b = new tkd();

    @Override // defpackage.vrd
    public final j64 c() {
        j64 j64Var = j64.c;
        return j64.c;
    }

    @Override // defpackage.vrd
    public final k64 d(Bundle bundle) {
        final long jD = i24.D("msg_id", bundle);
        final long jD2 = i24.D("attach_id", bundle);
        final String strF = i24.F("local_attach_id", bundle);
        final int iC = i24.C("cause_ordinal", bundle);
        String string = bundle.getString("snack_bot_margin");
        final Integer numValueOf = string != null ? Integer.valueOf(Integer.parseInt(string)) : null;
        final Boolean boolU = i24.u("force_dark", bundle);
        return new k64() { // from class: skd
            @Override // defpackage.k64
            public final Object a() {
                return new ChatMediaDownloadBottomSheet(jD, jD2, strF, iC, numValueOf, boolU);
            }
        };
    }

    @Override // defpackage.vrd
    public final void e(urd urdVar) {
        i64.a(urdVar, ":dialogs/share-media", new String[]{"msg_id", "attach_id", "local_attach_id", "cause_ordinal"}, null, 0, 14);
    }
}
