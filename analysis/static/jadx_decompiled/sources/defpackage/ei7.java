package defpackage;

import java.util.Collections;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Objects;
import ru.ok.android.externcalls.sdk.api.ApiProtocol;
import ru.ok.tamtam.errors.TamErrorException;

/* loaded from: classes2.dex */
public final class ei7 extends ol implements lme {
    public final String X;
    public final boolean Y;
    public final String Z;
    public final /* synthetic */ int o = 1;

    public ei7(long j, String str) {
        super(j);
        this.X = str;
        this.Y = false;
        this.Z = null;
    }

    @Override // defpackage.lme
    public final void e(gle gleVar) throws Throwable {
        String str;
        Object njcVar;
        int i = 15;
        int i2 = 2;
        int i3 = 0;
        switch (this.o) {
            case 0:
                gi7 gi7Var = (gi7) gleVar;
                String str2 = gi7Var.Y;
                f52 f52Var = gi7Var.c;
                if (f52Var != null) {
                    try {
                        q().k(f52Var);
                    } catch (TamErrorException unused) {
                    }
                    gi9 gi9VarC0 = m().c0(Collections.singletonList(f52Var));
                    if (gi9VarC0.d > 0) {
                        long[] jArr = gi9VarC0.b;
                        long[] jArr2 = gi9VarC0.a;
                        int length = jArr2.length - 2;
                        if (length >= 0) {
                            int i4 = 0;
                            while (true) {
                                long j = jArr2[i4];
                                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                                    int i5 = 8 - ((~(i4 - length)) >>> 31);
                                    for (int i6 = 0; i6 < i5; i6++) {
                                        if ((255 & j) < 128) {
                                            long j2 = jArr[(i4 << 3) + i6];
                                            l().c(new hi7(this.a, Long.valueOf(j2), gi7Var.X != null ? p().f(j2, ((p7b) r()).a.t(), gi7Var.X) : -1L, null, null, null, null, str2));
                                            return;
                                        }
                                        j >>= 8;
                                    }
                                    str = str2;
                                    if (i5 == 8) {
                                    }
                                } else {
                                    str = str2;
                                }
                                if (i4 != length) {
                                    i4++;
                                    str2 = str;
                                }
                            }
                        }
                        throw new NoSuchElementException("The LongSet is empty");
                    }
                    return;
                }
                def defVar = gi7Var.s0;
                if (defVar != null) {
                    try {
                        q().u(defVar);
                        njcVar = e5f.a;
                    } catch (Throwable th) {
                        njcVar = new njc(th);
                    }
                    Throwable thA = pjc.a(njcVar);
                    if (thA != null) {
                        hm9.p(ei7.class.getName(), "fail to fetch video conference missed ids", thA);
                    }
                    l().c(new hi7(this.a, null, -1L, null, null, defVar, null, str2));
                    return;
                }
                n3e n3eVar = gi7Var.t0;
                if (n3eVar != null) {
                    pl plVar = this.c;
                    if (plVar == null) {
                        plVar = null;
                    }
                    a4e a4eVar = (a4e) plVar.o.getValue();
                    List listSingletonList = Collections.singletonList(n3eVar);
                    a4eVar.getClass();
                    hm9.m("a4e", "storeStickerSetsFromServer: sticker sets: %s", listSingletonList);
                    vy9 vy9VarV = new e0a(qy9.j(listSingletonList), new x3e(a4eVar, 0), 3).v();
                    c4e c4eVar = a4eVar.a;
                    Objects.requireNonNull(c4eVar);
                    nd7.U(new qa3(vy9VarV, i2, new z3e(c4eVar, i3)).f(new e5(i, listSingletonList)).g(new bqc(i, listSingletonList)).k(a4eVar.X).l(), ft.e, new ey1(19, this), ft.d);
                    l().c(new hi7(this.a, null, -1L, null, null, null, Long.valueOf(n3eVar.a), str2));
                    return;
                }
                kq3 kq3Var = gi7Var.o;
                if (kq3Var != null) {
                    el3 el3VarN = n();
                    wm3 wm3Var = kq3Var.a;
                    if (el3VarN.g(wm3Var.a)) {
                        n().u(Collections.singletonList(wm3Var));
                    } else {
                        el3 el3VarN2 = n();
                        ol3 ol3Var = ol3.b;
                        el3VarN2.getClass();
                        el3VarN2.t(Collections.singletonList(wm3Var), ol3Var);
                        w7b w7bVar = (w7b) el3VarN2.k.get();
                        r7b r7bVarL = iz7.l(kq3Var.o);
                        w7bVar.getClass();
                        w7bVar.k(Collections.singletonMap(Long.valueOf(wm3Var.a), r7bVarL));
                    }
                    l().c(new hi7(this.a, null, -1L, kq3Var, null, null, null, str2));
                }
                dh6 dh6Var = gi7Var.Z;
                if (dh6Var != null) {
                    l().c(new hi7(this.a, null, -1L, null, dh6Var, null, null, str2));
                    return;
                }
                return;
            default:
                pm1 pm1Var = (pm1) gleVar;
                l().c(new b41(pm1Var.c, pm1Var.Y, this.a, pm1Var.o));
                return;
        }
    }

    @Override // defpackage.lme
    public final void g(pke pkeVar) {
        switch (this.o) {
            case 0:
                l().c(new oi0(this.a, pkeVar));
                break;
            default:
                l().c(new oi0(this.a, pkeVar));
                break;
        }
    }

    @Override // defpackage.ol
    public final dle i() {
        switch (this.o) {
            case 0:
                return new fi7(this.X, this.Y);
            default:
                au auVar = new au((sla) null, 10);
                auVar.d("withJoinLink", true);
                auVar.p(ApiProtocol.PARAM_CONVERSATION_ID, this.X);
                auVar.p("type", this.Y ? "VIDEO" : "AUDIO");
                String str = this.Z;
                if (!oag.t(str)) {
                    auVar.p("sdpOffer", str);
                }
                return auVar;
        }
    }

    public ei7(long j, String str, boolean z) {
        super(j);
        this.X = str;
        this.Y = z;
        this.Z = ei7.class.getName();
    }
}
