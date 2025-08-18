package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import kotlin.NoWhenBranchMatchedException;

/* loaded from: classes2.dex */
public final class ye9 extends gle {
    public dx8 X;
    public Long Y;
    public ArrayList c;
    public fx8 o;

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // defpackage.gle
    public final void b(gy8 gy8Var, String str) {
        int iG;
        if (str != null) {
            Long lValueOf = null;
            dx8 dx8VarC = null;
            switch (str.hashCode()) {
                case -1716357513:
                    if (str.equals("reactionInfo")) {
                        this.o = ote.F(gy8Var);
                        return;
                    }
                    break;
                case -1370485892:
                    if (str.equals("yourReaction")) {
                        try {
                            dx8VarC = j1e.C(gy8Var);
                        } catch (Throwable th) {
                            hm9.l0("ServerPayload/PayloadCatching", "payloadCatching catch error", th);
                            Iterator it = u7d.a.iterator();
                            while (it.hasNext()) {
                                ((r4a) it.next()).getClass();
                                r4a.a(th);
                            }
                            int iS = au1.s(k7d.a);
                            if (iS != 0) {
                                if (iS == 1) {
                                    throw th;
                                }
                                throw new NoWhenBranchMatchedException();
                            }
                        }
                        this.X = dx8VarC;
                        return;
                    }
                    break;
                case -1122997398:
                    if (str.equals("reactions")) {
                        try {
                            iG = lz7.G(gy8Var);
                        } catch (Throwable th2) {
                            hm9.l0("ServerPayload/PayloadCatching", "payloadCatching catch error", th2);
                            Iterator it2 = u7d.a.iterator();
                            while (it2.hasNext()) {
                                ((r4a) it2.next()).getClass();
                                r4a.a(th2);
                            }
                            int iS2 = au1.s(k7d.a);
                            if (iS2 != 0) {
                                if (iS2 == 1) {
                                    throw th2;
                                }
                                throw new NoWhenBranchMatchedException();
                            }
                            iG = 0;
                        }
                        if (iG == 0) {
                            return;
                        }
                        ArrayList arrayList = new ArrayList();
                        for (int i = 0; i < iG; i++) {
                            arrayList.add(j1e.C(gy8Var));
                        }
                        this.c = arrayList;
                        return;
                    }
                    break;
                case -1081306054:
                    if (str.equals("marker")) {
                        try {
                            lValueOf = Long.valueOf(lz7.M(gy8Var, 0L));
                        } catch (Throwable th3) {
                            hm9.l0("ServerPayload/PayloadCatching", "payloadCatching catch error", th3);
                            Iterator it3 = u7d.a.iterator();
                            while (it3.hasNext()) {
                                ((r4a) it3.next()).getClass();
                                r4a.a(th3);
                            }
                            int iS3 = au1.s(k7d.a);
                            if (iS3 != 0) {
                                if (iS3 == 1) {
                                    throw th3;
                                }
                                throw new NoWhenBranchMatchedException();
                            }
                        }
                        this.Y = lValueOf;
                        return;
                    }
                    break;
            }
        }
        gy8Var.z();
    }

    @Override // defpackage.zje
    public final String toString() {
        ArrayList arrayList = this.c;
        return "MsgGetDetailedReactionsCmd, reactions = " + (arrayList != null ? x53.n0(arrayList, null, null, null, new g27(28), 31) : null) + " + " + this.o + " + " + this.X + " + " + this.Y;
    }
}
