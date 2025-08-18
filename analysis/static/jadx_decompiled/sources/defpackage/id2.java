package defpackage;

import android.content.Context;

/* loaded from: classes.dex */
public final class id2 extends mw7 {
    public final /* synthetic */ int g;
    public final /* synthetic */ Object h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ id2(int i, int i2, Object obj) {
        super(i);
        this.g = i2;
        this.h = obj;
    }

    @Override // defpackage.mw7
    public final Object a(Object obj) {
        switch (this.g) {
            case 0:
                e52 e52Var = ((gd2) obj).a;
                es8 es8Var = e52Var.c;
                if (es8Var == null) {
                    return null;
                }
                return ((ld2) this.h).e(e52Var, es8Var, 2, false);
            case 1:
                kpa kpaVar = (kpa) obj;
                return new tc0(j5a.a, oag.a((CharSequence) kpaVar.a, (Long) kpaVar.b), qp4.u0.b((Context) this.h).i());
            default:
                return null;
        }
    }

    @Override // defpackage.mw7
    public void b(boolean z, Object obj, Object obj2, Object obj3) {
        switch (this.g) {
            case 2:
                fdf fdfVar = (fdf) obj2;
                gdf gdfVar = (gdf) this.h;
                if (!z) {
                    gdfVar.getClass();
                    break;
                } else {
                    String str = gdfVar.e;
                    ir6 ir6Var = hm9.m;
                    if (ir6Var != null && ir6Var.c()) {
                        us7 us7Var = us7.X;
                        long j = fdfVar.b;
                        String str2 = fdfVar.a;
                        int iG = gdfVar.s.g();
                        boolean zB = fdfVar.c.b();
                        StringBuilder sbJ = z7b.j("Player autoplay. State evicted, should free player, \n                                |msgId:", j, ", \n                                |attachId:", str2);
                        sbJ.append("\n                                |states count:");
                        sbJ.append(iG);
                        sbJ.append("\n                                |playing:");
                        sbJ.append(zB);
                        ir6Var.d(us7Var, str, x9e.c0(sbJ.toString()), null);
                    }
                    fdfVar.o.a(fdfVar.c);
                    cmf cmfVar = (cmf) fdfVar.Y.get();
                    if (cmfVar != null) {
                        cmfVar.u();
                        break;
                    }
                }
                break;
        }
    }

    @Override // defpackage.mw7
    public int h(Object obj) {
        switch (this.g) {
            case 2:
                return 1;
            default:
                return super.h(obj);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public id2(ld2 ld2Var) {
        super(500);
        this.g = 0;
        this.h = ld2Var;
    }
}
