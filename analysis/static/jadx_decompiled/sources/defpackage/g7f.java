package defpackage;

import java.io.File;

/* loaded from: classes2.dex */
public final /* synthetic */ class g7f implements qj3 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ly8 b;

    public /* synthetic */ g7f(ly8 ly8Var, int i) {
        this.a = i;
        this.b = ly8Var;
    }

    @Override // defpackage.qj3
    public final void accept(Object obj) {
        Object njcVar;
        Object njcVar2;
        Object njcVar3;
        Object njcVar4;
        Object njcVar5;
        j10 j10Var = (j10) obj;
        switch (this.a) {
            case 0:
                j10Var.k = 100.0f;
                j10Var.i = d20.c;
                ly8 ly8Var = this.b;
                v6f v6fVar = ly8Var.a;
                String str = v6fVar.b;
                j10Var.m = str;
                j10Var.u = pag.u(str);
                g20 g20Var = j10Var.a;
                int i = g20Var == null ? -1 : h7f.$EnumSwitchMapping$0[g20Var.ordinal()];
                p8f p8fVar = v6fVar.h;
                if (i == 1) {
                    x10 x10Var = j10Var.b;
                    if (x10Var == null) {
                        x10Var = x10.w0;
                    }
                    w10 w10VarB = x10Var.b();
                    w10VarB.g = p8fVar.a;
                    j10Var.b = new x10(w10VarB);
                    break;
                } else if (i == 2) {
                    i10 i10Var = j10Var.e;
                    if (i10Var == null) {
                        i10Var = i10.j;
                    }
                    h10 h10VarA = i10Var.a();
                    h10VarA.e = p8fVar.a;
                    h10VarA.a = p8fVar.b;
                    j10Var.e = new i10(h10VarA);
                    break;
                } else if (i == 3) {
                    h20 h20VarA = j10Var.c().a();
                    h20VarA.a = p8fVar.b;
                    h20VarA.l = p8fVar.a;
                    j10Var.d = new k20(h20VarA);
                    break;
                } else if (i == 4) {
                    r10 r10VarA = j10Var.b().a();
                    r10VarA.a = p8fVar.b;
                    r10VarA.d = p8fVar.a;
                    j10Var.r = new s10(r10VarA);
                    break;
                } else if (i == 5) {
                    j10Var.f = iz7.s(ly8Var.b);
                    break;
                } else {
                    hm9.p("UploadDraftMediaWorker", "Unknown attach type " + j10Var.a, null);
                    break;
                }
            case 1:
                j10Var.i = d20.X;
                v6f v6fVar2 = this.b.a;
                d7f d7fVar = v6fVar2.a;
                j10Var.m = d7fVar.a;
                j10Var.u = d7fVar.b;
                j10Var.k = v6fVar2.e;
                j10Var.o = v6fVar2.f;
                break;
            default:
                j10Var.k = 100.0f;
                j10Var.i = d20.c;
                g20 g20Var2 = j10Var.a;
                int i2 = g20Var2 == null ? -1 : u7f.$EnumSwitchMapping$0[g20Var2.ordinal()];
                ly8 ly8Var2 = this.b;
                v6f v6fVar3 = ly8Var2.a;
                if (i2 == 1) {
                    String str2 = v6fVar3.h.a;
                    x10 x10Var2 = j10Var.b;
                    if (x10Var2 == null) {
                        x10Var2 = x10.w0;
                    }
                    w10 w10VarB2 = x10Var2.b();
                    w10VarB2.g = str2;
                    j10Var.b = new x10(w10VarB2);
                    String str3 = v6fVar3.b;
                    j10Var.m = str3;
                    try {
                        njcVar = Long.valueOf(new File(str3).lastModified());
                    } catch (Throwable th) {
                        njcVar = new njc(th);
                    }
                    if (njcVar instanceof njc) {
                        njcVar = 0L;
                    }
                    j10Var.u = ((Number) njcVar).longValue();
                    break;
                } else if (i2 == 2) {
                    p8f p8fVar2 = v6fVar3.h;
                    long j = p8fVar2.b;
                    i10 i10Var2 = j10Var.e;
                    if (i10Var2 == null) {
                        i10Var2 = i10.j;
                    }
                    h10 h10VarA2 = i10Var2.a();
                    h10VarA2.e = p8fVar2.a;
                    h10VarA2.a = j;
                    j10Var.e = new i10(h10VarA2);
                    String str4 = v6fVar3.b;
                    j10Var.m = str4;
                    try {
                        njcVar2 = Long.valueOf(new File(str4).lastModified());
                    } catch (Throwable th2) {
                        njcVar2 = new njc(th2);
                    }
                    if (njcVar2 instanceof njc) {
                        njcVar2 = 0L;
                    }
                    j10Var.u = ((Number) njcVar2).longValue();
                    break;
                } else if (i2 == 3) {
                    p8f p8fVar3 = v6fVar3.h;
                    long j2 = p8fVar3.b;
                    h20 h20VarA2 = j10Var.c().a();
                    h20VarA2.a = j2;
                    h20VarA2.l = p8fVar3.a;
                    j10Var.d = new k20(h20VarA2);
                    String str5 = v6fVar3.b;
                    j10Var.m = str5;
                    try {
                        njcVar3 = Long.valueOf(new File(str5).lastModified());
                    } catch (Throwable th3) {
                        njcVar3 = new njc(th3);
                    }
                    if (njcVar3 instanceof njc) {
                        njcVar3 = 0L;
                    }
                    j10Var.u = ((Number) njcVar3).longValue();
                    break;
                } else if (i2 == 4) {
                    p8f p8fVar4 = v6fVar3.h;
                    long j3 = p8fVar4.b;
                    r10 r10VarA2 = j10Var.b().a();
                    r10VarA2.a = j3;
                    r10VarA2.d = p8fVar4.a;
                    j10Var.r = new s10(r10VarA2);
                    String str6 = v6fVar3.b;
                    j10Var.m = str6;
                    try {
                        njcVar4 = Long.valueOf(new File(str6).lastModified());
                    } catch (Throwable th4) {
                        njcVar4 = new njc(th4);
                    }
                    if (njcVar4 instanceof njc) {
                        njcVar4 = 0L;
                    }
                    j10Var.u = ((Number) njcVar4).longValue();
                    break;
                } else if (i2 == 5) {
                    j10Var.f = iz7.s(ly8Var2.b);
                    String str7 = v6fVar3.b;
                    j10Var.m = str7;
                    try {
                        njcVar5 = Long.valueOf(new File(str7).lastModified());
                    } catch (Throwable th5) {
                        njcVar5 = new njc(th5);
                    }
                    if (njcVar5 instanceof njc) {
                        njcVar5 = 0L;
                    }
                    j10Var.u = ((Number) njcVar5).longValue();
                    break;
                }
                break;
        }
    }
}
