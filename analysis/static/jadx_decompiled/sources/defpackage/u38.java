package defpackage;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes2.dex */
public final class u38 implements pn9 {
    public final b0e a;
    public final d4c b;
    public final vte c;
    public final a4c d;
    public final gw3 e;
    public long f;
    public int g;
    public int h;
    public final r38 i;
    public ssa j;
    public int k;
    public final CopyOnWriteArrayList l;

    public u38(b0e b0eVar, r38 r38Var, d4c d4cVar, vte vteVar, a4c a4cVar, gw3 gw3Var) {
        r38 r38Var2;
        this.a = b0eVar;
        this.b = d4cVar;
        this.c = vteVar;
        this.d = a4cVar;
        this.e = gw3Var;
        if (r38Var != null) {
            p38 p38Var = r38Var.a;
            double d = p38Var.e;
            if (d <= 0.0d) {
                String str = "Invalid badNetwork.rttLeaveLevel2Mode: " + d + " Must be >= 0";
                a4cVar.reportException("MediaAdaptation", str, new RuntimeException(str));
            } else {
                double d2 = p38Var.d;
                if (d2 <= 0.0d) {
                    String str2 = "Invalid badNetwork.rttEnterLevel2Mode: " + d2 + " Must be >= 0";
                    a4cVar.reportException("MediaAdaptation", str2, new RuntimeException(str2));
                } else {
                    double d3 = p38Var.a;
                    if (d3 <= 0.0d) {
                        String str3 = "Invalid badNetwork.rttThreshold: " + d3 + " Must be >= 0";
                        a4cVar.reportException("MediaAdaptation", str3, new RuntimeException(str3));
                    } else if (d3 >= d2) {
                        String str4 = "Invalid badNetwork.rttThreshold: " + d3 + " Must be < badNetwork.rttEnterLevel2Mode (" + d2 + ")";
                        a4cVar.reportException("MediaAdaptation", str4, new RuntimeException(str4));
                    } else if (d >= d2) {
                        String str5 = "Invalid badNetwork.rttLeaveLevel2Mode: " + d + " Must be < badNetwork.rttEnterLevel2Mode (" + d2 + ")";
                        a4cVar.reportException("MediaAdaptation", str5, new RuntimeException(str5));
                    } else {
                        double d4 = p38Var.b;
                        if (d4 <= 0.0d) {
                            String str6 = "Invalid badNetwork.lostPacketsLimitForRttBelowLowBound: " + d4 + " Must be >= 0";
                            a4cVar.reportException("MediaAdaptation", str6, new RuntimeException(str6));
                        } else {
                            double d5 = p38Var.c;
                            if (d5 <= 0.0d) {
                                String str7 = "Invalid badNetwork.lostPacketsLimitForRttAboveLowBound: " + d5 + " Must be >= 0";
                                a4cVar.reportException("MediaAdaptation", str7, new RuntimeException(str7));
                            } else {
                                r38Var2 = r38Var;
                                q38 q38Var = r38Var2.b;
                                double d6 = q38Var.a;
                                double d7 = q38Var.c;
                                if (d6 >= d7) {
                                    String str8 = "Invalid goodNetwork.rttLowBound: " + d6 + " Must be < goodNetwork.rttHighBound (" + d7 + ")";
                                    a4cVar.reportException("MediaAdaptation", str8, new RuntimeException(str8));
                                } else {
                                    double d8 = q38Var.b;
                                    if (d8 <= 0.0d) {
                                        String str9 = "Invalid badNetwork.lostPacketsLimitForRttLowBound: " + d8 + " Must be >= 0";
                                        a4cVar.reportException("MediaAdaptation", str9, new RuntimeException(str9));
                                    } else {
                                        double d9 = q38Var.d;
                                        if (d9 <= 0.0d) {
                                            String str10 = "Invalid badNetwork.lostPacketsLimitForRttHighBound: " + d9 + " Must be >= 0";
                                            a4cVar.reportException("MediaAdaptation", str10, new RuntimeException(str10));
                                        } else {
                                            long j = q38Var.e;
                                            if (j <= 0) {
                                                String strI = ey8.i(j, "Invalid badNetwork.recoveryTimeoutMs: ", " Must be >= 0");
                                                a4cVar.reportException("MediaAdaptation", strI, new RuntimeException(strI));
                                            } else {
                                                int i = p38Var.f;
                                                if (i < 0) {
                                                    String str11 = "Invalid badNetwork.videoBitrateLevel1K : " + i + " Must be >= 0 (" + d + ")";
                                                    a4cVar.reportException("MediaAdaptation", str11, new RuntimeException(str11));
                                                } else {
                                                    int i2 = p38Var.g;
                                                    if (i2 > i) {
                                                        String strH = wg0.h("Invalid badNetwork.videoBitrateLevel2K : ", i2, " Must be <= (", i, ")");
                                                        a4cVar.reportException("MediaAdaptation", strH, new RuntimeException(strH));
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            r38Var2 = new r38();
        } else {
            r38Var2 = new r38();
        }
        this.i = r38Var2;
        this.k = 1;
        this.l = new CopyOnWriteArrayList();
        a4cVar.log("MediaAdaptation", "Media adaptation control enabled. Configuration is " + r38Var2);
        CopyOnWriteArrayList copyOnWriteArrayList = b0eVar.j;
        if (!copyOnWriteArrayList.contains(this)) {
            copyOnWriteArrayList.add(this);
        }
        int i3 = this.h + 1;
        this.h = i3;
        d4cVar.logSimple(e0e.switches_to_good_net, ((hw3) gw3Var).a, String.valueOf(i3));
    }

    @Override // defpackage.pn9
    public final void a(n38 n38Var) {
        this.l.remove(n38Var);
    }

    public final ssa b(int i) {
        String str;
        int i2;
        int i3;
        int i4;
        int i5;
        usa usaVar;
        ssa ssaVar;
        ssa ssaVar2 = this.j;
        if (ssaVar2 == null) {
            i2 = 1280;
            i3 = 1280;
            str = "maintain-framerate";
            i4 = 1000;
            i5 = 30;
            usaVar = null;
        } else {
            int i6 = ssaVar2.a;
            int i7 = ssaVar2.b;
            int i8 = ssaVar2.c;
            int i9 = ssaVar2.d;
            usa usaVar2 = ssaVar2.f;
            String str2 = ssaVar2.e;
            str = str2 == null ? "maintain-framerate" : str2;
            i2 = i6;
            i3 = i7;
            i4 = i8;
            i5 = i9;
            usaVar = usaVar2;
        }
        int i10 = t38.$EnumSwitchMapping$0[au1.s(i)];
        r38 r38Var = this.i;
        if (i10 == 1) {
            p38 p38Var = r38Var.a;
            if (p38Var.i) {
                i2 = 320;
            }
            ssaVar = new ssa(i2, i3, p38Var.j ? p38Var.g : i4, i5, str, usaVar, 4, p38Var.k ? 3 : 0, zr6.p(i));
        } else {
            if (i10 != 2) {
                ssa ssaVar3 = this.j;
                if (ssaVar3 == null) {
                    return new ssa(i2, i3, i4, i5, str, usaVar, 1, 0, zr6.p(i));
                }
                return new ssa(ssaVar3.a, ssaVar3.b, ssaVar3.c, ssaVar3.d, "maintain-framerate", ssaVar3.f, 1, ssaVar3.h, zr6.p(i));
            }
            p38 p38Var2 = r38Var.a;
            if (p38Var2.i) {
                i2 = 640;
            }
            ssaVar = new ssa(i2, i3, p38Var2.j ? p38Var2.f : i4, i5, str, usaVar, 2, p38Var2.k ? 2 : 0, zr6.p(i));
        }
        return ssaVar;
    }

    public final void c(int i, s38 s38Var) {
        this.d.log("MediaAdaptation", "Update network condition. Current condition is " + zr6.s(this.k) + ", new one is " + zr6.s(i) + ", state is " + s38Var);
        int i2 = t38.$EnumSwitchMapping$0[au1.s(i)];
        e0e e0eVar = e0e.switches_to_bad_net;
        gw3 gw3Var = this.e;
        d4c d4cVar = this.b;
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 == 3) {
                    int i3 = this.h + 1;
                    this.h = i3;
                    d4cVar.logSimple(e0e.switches_to_good_net, ((hw3) gw3Var).a, String.valueOf(i3));
                }
            } else if (this.k == 1) {
                int i4 = this.g + 1;
                this.g = i4;
                d4cVar.logSimple(e0eVar, ((hw3) gw3Var).a, String.valueOf(i4));
            }
        } else if (this.k == 1) {
            int i5 = this.g + 1;
            this.g = i5;
            d4cVar.logSimple(e0eVar, ((hw3) gw3Var).a, String.valueOf(i5));
        }
        this.k = i;
        o38 o38Var = new o38(i, b(i), i != 1 && this.i.a.h);
        Iterator it = this.l.iterator();
        while (it.hasNext()) {
            ((n38) it.next()).p(o38Var);
        }
    }

    public final void d(n38 n38Var) {
        this.l.add(n38Var);
        int i = this.k;
        o38 o38Var = new o38(i, b(i), this.k != 1 && this.i.a.h);
        this.d.log("MediaAdaptation", "Got new subscriber, trigger my state event: " + o38Var);
        n38Var.p(o38Var);
    }

    public final void e(ssa ssaVar) {
        this.j = ssaVar;
        int i = this.k;
        o38 o38Var = new o38(i, b(i), i != 1 && this.i.a.h);
        Iterator it = this.l.iterator();
        while (it.hasNext()) {
            ((n38) it.next()).p(o38Var);
        }
    }
}
