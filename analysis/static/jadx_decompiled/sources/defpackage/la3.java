package defpackage;

import android.os.Bundle;

/* loaded from: classes.dex */
public final class la3 extends vrd {
    public static final la3 b = new la3();

    @Override // defpackage.vrd
    public final j64 c() {
        return new j64(new hn2(16), new hn2(17));
    }

    @Override // defpackage.vrd
    public final k64 d(Bundle bundle) {
        return new ka3(i24.D("chat_id", bundle), 0);
    }

    @Override // defpackage.vrd
    public final void e(urd urdVar) {
        i64.a(urdVar, ":complaint", new String[]{"chat_id"}, null, 0, 14);
    }
}
