package defpackage;

import android.os.Bundle;
import java.util.Iterator;
import java.util.NoSuchElementException;
import one.me.chatmedia.viewer.ChatMediaViewerScreen;
import one.me.profileedit.screens.adminpermissions.ProfileEditAdminPermissionsWidget;
import ru.ok.tamtam.android.prefs.PmsKey;

/* loaded from: classes2.dex */
public final class peb implements b64 {
    public final /* synthetic */ int a;
    public final je7 b;
    public final i64 c;

    public peb(int i, je7 je7Var) {
        this.a = i;
        switch (i) {
            case 1:
                this.b = je7Var;
                this.c = ie2.b;
                break;
            default:
                this.b = je7Var;
                this.c = seb.b;
                break;
        }
    }

    @Override // defpackage.b64
    public final i64 a() {
        switch (this.a) {
            case 0:
                return (seb) this.c;
            default:
                return (ie2) this.c;
        }
    }

    @Override // defpackage.b64
    public final l64 b(String str, e64 e64Var, Bundle bundle) {
        k64 cdbVar;
        k64 ka3Var;
        qeb qebVar;
        switch (this.a) {
            case 0:
                if (!((seb) this.c).a.contains(e64Var)) {
                    return null;
                }
                seb.b.getClass();
                if (e64Var.equals(seb.c)) {
                    long jD = i24.D("id", bundle);
                    vu4 vu4Var = reb.b;
                    String strF = i24.F("type", bundle);
                    vu4Var.getClass();
                    ka3Var = new edb(jD, vu4.s(strF), 1);
                } else if (e64Var.equals(seb.d)) {
                    ka3Var = new ka3(i24.D("id", bundle), 8);
                } else {
                    if (e64Var.equals(seb.e)) {
                        long jD2 = i24.D("id", bundle);
                        vu4 vu4Var2 = reb.b;
                        String strF2 = i24.F("type", bundle);
                        vu4Var2.getClass();
                        reb rebVarS = vu4.s(strF2);
                        if (rebVarS == reb.o) {
                            qyc qycVar = (qyc) ((y7d) this.b.getValue());
                            qycVar.getClass();
                            if (!qycVar.n(PmsKey.f2accountnicknameenabled, false)) {
                                return null;
                            }
                        }
                        o84 o84Var = qeb.b;
                        String strF3 = i24.F("flow", bundle);
                        o84Var.getClass();
                        Iterator it = qeb.X.iterator();
                        do {
                            u1 u1Var = (u1) it;
                            if (!u1Var.hasNext()) {
                                throw new NoSuchElementException("Collection contains no element matching the predicate.");
                            }
                            qebVar = (qeb) u1Var.next();
                        } while (!tpa.f(qebVar.a, strF3));
                        cdbVar = new cdb(jD2, rebVarS, qebVar);
                    } else {
                        if (!e64Var.equals(seb.f)) {
                            hm9.p(peb.class.getName(), "invalid route " + e64Var, new IllegalArgumentException("invalid route " + e64Var));
                            return null;
                        }
                        final long jD3 = i24.D("chat_id", bundle);
                        final long jD4 = i24.D("contact_id", bundle);
                        final String strF4 = i24.F("permissions_type", bundle);
                        cdbVar = new k64() { // from class: oeb
                            @Override // defpackage.k64
                            public final Object a() {
                                rdb rdbVar;
                                rdb.b.getClass();
                                Iterator it2 = rdb.Y.iterator();
                                do {
                                    u1 u1Var2 = (u1) it2;
                                    if (!u1Var2.hasNext()) {
                                        throw new NoSuchElementException("Collection contains no element matching the predicate.");
                                    }
                                    rdbVar = (rdb) u1Var2.next();
                                } while (!tpa.f(rdbVar.a, strF4));
                                return new ProfileEditAdminPermissionsWidget(jD3, jD4, rdbVar);
                            }
                        };
                    }
                    ka3Var = cdbVar;
                }
                return new l64(str, e64Var, bundle, 1, null, ka3Var, 16);
            default:
                if (!((ie2) this.c).a.contains(e64Var)) {
                    return null;
                }
                if (!e64Var.equals(ie2.c)) {
                    throw new IllegalStateException(au1.f("unknown route ", e64Var));
                }
                final long jD5 = i24.D("chat_id", bundle);
                final String strF5 = i24.F("attach_id", bundle);
                final long jD6 = i24.D("msg_id", bundle);
                Boolean boolU = i24.u("single", bundle);
                final boolean zBooleanValue = boolU != null ? boolU.booleanValue() : false;
                Boolean boolU2 = i24.u("desc", bundle);
                final boolean zBooleanValue2 = boolU2 != null ? boolU2.booleanValue() : false;
                return new l64(str, e64Var, bundle, 0, ((se5) ((qe5) this.b.getValue())).u() ? new j64(new m52(9), new m52(10)) : new j64(), new k64() { // from class: he2
                    @Override // defpackage.k64
                    public final Object a() {
                        return new ChatMediaViewerScreen(jD5, strF5, jD6, zBooleanValue, zBooleanValue2);
                    }
                }, 8);
        }
    }
}
