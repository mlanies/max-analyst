package defpackage;

import java.util.Collection;

/* loaded from: classes2.dex */
public final class y34 extends ema {
    public static final y34 e = new y34(0);
    public static final y34 f = new y34(1);
    public static final y34 g = new y34(2);
    public static final y34 h = new y34(3);
    public final /* synthetic */ int d;

    public /* synthetic */ y34(int i) {
        this.d = i;
    }

    @Override // defpackage.ema
    public final boolean d(Object obj, Object obj2) {
        switch (this.d) {
            case 0:
                return ((x34) obj).equals((x34) obj2);
            case 1:
                return ((v86) obj).equals((v86) obj2);
            case 2:
                return ((qte) obj).equals((qte) obj2);
            case 3:
                return ((q4d) obj).equals((q4d) obj2);
            case 4:
                return ((sb8) obj).equals((sb8) obj2);
            case 5:
                return ((yq3) obj).equals((yq3) obj2);
            case 6:
                y5a y5aVar = (y5a) obj;
                y5a y5aVar2 = (y5a) obj2;
                return tpa.f(y5aVar.a, y5aVar2.a) && tpa.f(y5aVar.d, y5aVar2.d) && eae.h0(y5aVar.b, y5aVar2.b);
            case 7:
                return false;
            case 8:
                izc izcVar = (izc) obj;
                izc izcVar2 = (izc) obj2;
                if (new xs((Collection) izcVar.b).equals(new xs((Collection) izcVar2.b))) {
                    return izcVar.k(izcVar2);
                }
                return false;
            default:
                return ((ol7) obj).t((ol7) obj2);
        }
    }

    @Override // defpackage.ema
    public final boolean e(Object obj, Object obj2) {
        switch (this.d) {
            case 0:
                return ((x34) obj).a == ((x34) obj2).a;
            case 1:
                return tpa.f(((v86) obj).a(), ((v86) obj2).a());
            case 2:
                return ((qte) obj).a == ((qte) obj2).a;
            case 3:
                return ((q4d) obj).a.a == ((q4d) obj2).a.a;
            case 4:
                return ((sb8) obj).h((sb8) obj2);
            case 5:
                return ((yq3) obj).a == ((yq3) obj2).a;
            case 6:
                return tpa.f(((y5a) obj).a, ((y5a) obj2).a);
            case 7:
                return false;
            case 8:
                izc izcVar = (izc) obj;
                izc izcVar2 = (izc) obj2;
                if (izcVar.a != izcVar2.a) {
                    return false;
                }
                return izcVar.m(izcVar2);
            default:
                return ((ol7) obj).h((ol7) obj2);
        }
    }

    @Override // defpackage.ema
    public Object r(Object obj, Object obj2) {
        switch (this.d) {
            case 9:
                return ((ol7) obj).n((ol7) obj2);
            default:
                return super.r(obj, obj2);
        }
    }
}
