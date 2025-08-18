package defpackage;

import android.os.Bundle;
import java.util.Iterator;
import java.util.NoSuchElementException;
import one.me.webapp.rootscreen.WebAppRootScreen;

/* loaded from: classes2.dex */
public final class jid implements b64 {
    public final /* synthetic */ int a;
    public final je7 b;
    public final i64 c;

    public jid(int i, je7 je7Var) {
        this.a = i;
        switch (i) {
            case 1:
                this.c = lwf.b;
                this.b = je7Var;
                break;
            default:
                this.b = je7Var;
                this.c = kid.b;
                break;
        }
    }

    @Override // defpackage.b64
    public final i64 a() {
        switch (this.a) {
            case 0:
                return (kid) this.c;
            default:
                return (lwf) this.c;
        }
    }

    @Override // defpackage.b64
    public final l64 b(String str, e64 e64Var, Bundle bundle) {
        k64 ka3Var;
        final osf osfVar;
        switch (this.a) {
            case 0:
                if (!((kid) this.c).a.contains(e64Var)) {
                    return null;
                }
                kid.b.getClass();
                if (e64Var.equals(kid.c)) {
                    return new l64(str, e64Var, bundle, 0, null, new lq(2, this), 24);
                }
                hm9.p(jid.class.getName(), "invalid route " + e64Var, new IllegalArgumentException("invalid route " + e64Var));
                return null;
            default:
                if (!((lwf) this.c).a.contains(e64Var)) {
                    return null;
                }
                j64 j64Var = new j64();
                lwf.b.getClass();
                if (e64Var.equals(lwf.c)) {
                    j64Var = new j64(new bse(17), new bse(18));
                    final long jD = i24.D("bot_id", bundle);
                    b46 b46Var = osf.c;
                    String strF = i24.F("entry_point", bundle);
                    b46Var.getClass();
                    Iterator it = osf.u0.iterator();
                    do {
                        u1 u1Var = (u1) it;
                        if (!u1Var.hasNext()) {
                            throw new NoSuchElementException("Collection contains no element matching the predicate.");
                        }
                        osfVar = (osf) u1Var.next();
                    } while (!tpa.f(osfVar.a, strF));
                    final Long lV = i24.v("chat_id", bundle);
                    final String string = bundle.getString("start_param");
                    Boolean boolU = i24.u("is_fullscreen", bundle);
                    final boolean zBooleanValue = boolU != null ? boolU.booleanValue() : ((t33) ((q33) this.b.getValue())).g.getBoolean("app.toggle.webapp_fullscreen", false);
                    String string2 = bundle.getString("request_code");
                    Integer numValueOf = string2 != null ? Integer.valueOf(Integer.parseInt(string2)) : null;
                    final int iIntValue = numValueOf != null ? numValueOf.intValue() : 0;
                    ka3Var = new k64() { // from class: kwf
                        @Override // defpackage.k64
                        public final Object a() {
                            return new WebAppRootScreen(jD, osfVar, lV, string, zBooleanValue, iIntValue);
                        }
                    };
                } else if (e64Var.equals(lwf.d)) {
                    ka3Var = new ngd(7);
                } else {
                    if (!e64Var.equals(lwf.e)) {
                        throw new IllegalStateException(au1.f("invalid route ", e64Var));
                    }
                    ka3Var = new ka3(i24.D("bot_id", bundle), 11);
                }
                return new l64(str, e64Var, bundle, 1, j64Var, ka3Var);
        }
    }
}
