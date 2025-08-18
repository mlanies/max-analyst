package defpackage;

import ru.ok.android.externcalls.sdk.api.ApiProtocol;

/* loaded from: classes2.dex */
public final class pr9 extends gle {
    public String c;
    public long o;

    public pr9(gy8 gy8Var) {
        super(gy8Var);
    }

    @Override // defpackage.gle
    public final void b(gy8 gy8Var, String str) {
        str.getClass();
        if (str.equals(ApiProtocol.PARAM_CHAT_ID)) {
            this.o = lz7.M(gy8Var, 0L);
        } else if (str.equals("text")) {
            this.c = lz7.P(gy8Var);
        } else {
            gy8Var.z();
        }
    }

    @Override // defpackage.zje
    public final String toString() {
        StringBuilder sbJ = z7b.j("{chatId='", this.o, ", text='", this.c);
        sbJ.append("'}");
        return sbJ.toString();
    }
}
