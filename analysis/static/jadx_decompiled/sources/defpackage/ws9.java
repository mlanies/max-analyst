package defpackage;

import java.util.List;
import ru.ok.android.externcalls.sdk.api.ApiProtocol;

/* loaded from: classes2.dex */
public final class ws9 extends gle {
    public fx8 X;
    public long c;
    public long o;

    public ws9(gy8 gy8Var) {
        super(gy8Var);
    }

    @Override // defpackage.gle
    public final void b(gy8 gy8Var, String str) {
        int iHashCode = str.hashCode();
        if (iHashCode != -1716357513) {
            if (iHashCode != -1440013438) {
                if (iHashCode == -1361631597 && str.equals(ApiProtocol.PARAM_CHAT_ID)) {
                    this.c = lz7.M(gy8Var, 0L);
                    return;
                }
            } else if (str.equals("messageId")) {
                this.o = lz7.M(gy8Var, 0L);
                return;
            }
        } else if (str.equals("reactionInfo")) {
            this.X = ote.F(gy8Var);
            return;
        }
        gy8Var.z();
    }

    @Override // defpackage.zje
    public final String toString() {
        List list;
        long j = this.c;
        long j2 = this.o;
        fx8 fx8Var = this.X;
        Integer numValueOf = (fx8Var == null || (list = fx8Var.a) == null) ? null : Integer.valueOf(list.size());
        StringBuilder sbK = au1.k(j, "{chatId=", ", messageId=");
        sbK.append(j2);
        sbK.append(", reactionInfo = ");
        sbK.append(numValueOf);
        sbK.append(" }");
        return sbK.toString();
    }
}
