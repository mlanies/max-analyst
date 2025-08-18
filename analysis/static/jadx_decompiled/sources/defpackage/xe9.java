package defpackage;

import java.util.Collections;
import java.util.List;
import ru.ok.android.externcalls.sdk.api.ApiProtocol;

/* loaded from: classes2.dex */
public final class xe9 extends gle {
    public long c;
    public List o;

    public xe9(gy8 gy8Var) {
        super(gy8Var);
        if (this.o == null) {
            this.o = Collections.emptyList();
        }
    }

    @Override // defpackage.gle
    public final void b(gy8 gy8Var, String str) {
        str.getClass();
        if (str.equals(ApiProtocol.PARAM_CHAT_ID)) {
            this.c = gy8Var.w0();
        } else if (str.equals("messages")) {
            this.o = wz.e(gy8Var);
        } else {
            gy8Var.z();
        }
    }

    @Override // defpackage.zje
    public final String toString() {
        return "{chatId=" + this.c + ", messages=" + s5c.o(this.o) + "}";
    }
}
