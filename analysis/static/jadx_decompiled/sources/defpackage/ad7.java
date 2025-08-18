package defpackage;

import android.os.Bundle;
import one.me.keyboardmedia.stickers.KeyboardStickersWidget;

/* loaded from: classes2.dex */
public final class ad7 {
    public final /* synthetic */ KeyboardStickersWidget a;
    public final /* synthetic */ Bundle b;

    public ad7(KeyboardStickersWidget keyboardStickersWidget, Bundle bundle) {
        this.a = keyboardStickersWidget;
        this.b = bundle;
    }

    public final void a(z2e z2eVar) {
        pnf.o(((cc8) this.a.b.getValue()).X, yb8.a);
        sc7 sc7Var = sc7.c;
        long j = this.b.getLong("arg_key_chat_id");
        sc7Var.P1().b(":stickers/preview?sticker_id=" + z2eVar.a + "&chat_id=" + j, null);
    }
}
