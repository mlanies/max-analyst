package defpackage;

import android.util.Size;
import java.util.Comparator;
import one.me.common.drawable.SavedMessagesIconDrawable;
import org.apache.http.util.LangUtils;
import ru.ok.tamtam.nano.Protos;

/* loaded from: classes.dex */
public final /* synthetic */ class ye4 implements Comparator {
    public final /* synthetic */ int a;

    public /* synthetic */ ye4(int i) {
        this.a = i;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        aa3 aa3VarC = aa3.a;
        switch (this.a) {
            case 0:
                ze4 ze4Var = (ze4) obj;
                ze4 ze4Var2 = (ze4) obj2;
                zma zmaVarB = (ze4Var.X && ze4Var.s0) ? bf4.f : bf4.f.b();
                int i = ze4Var.t0;
                return aa3VarC.c(Integer.valueOf(i), Integer.valueOf(ze4Var2.t0), ze4Var.Y.G0 ? bf4.f.b() : bf4.g).c(Integer.valueOf(ze4Var.u0), Integer.valueOf(ze4Var2.u0), zmaVarB).c(Integer.valueOf(i), Integer.valueOf(ze4Var2.t0), zmaVarB).f();
            case 1:
                af4 af4Var = (af4) obj;
                af4 af4Var2 = (af4) obj2;
                zma zmaVarB2 = (af4Var.X && af4Var.s0) ? cf4.j : cf4.j.b();
                boolean z = af4Var.Y.y;
                int i2 = af4Var.u0;
                if (z) {
                    aa3VarC = aa3VarC.c(Integer.valueOf(i2), Integer.valueOf(af4Var2.u0), cf4.j.b());
                }
                return aa3VarC.c(Integer.valueOf(af4Var.v0), Integer.valueOf(af4Var2.v0), zmaVarB2).c(Integer.valueOf(i2), Integer.valueOf(af4Var2.u0), zmaVarB2).f();
            case 2:
                long j = ((dn4) obj).c;
                long j2 = ((dn4) obj2).c;
                int i3 = oaf.a;
                if (j < j2) {
                    return -1;
                }
                return j == j2 ? 0 : 1;
            case 3:
                return np8.j(((pw0) obj).c, ((pw0) obj2).c);
            case 4:
                byte[] bArr = (byte[]) obj;
                byte[] bArr2 = (byte[]) obj2;
                if (bArr.length != bArr2.length) {
                    return bArr.length - bArr2.length;
                }
                for (int i4 = 0; i4 < bArr.length; i4++) {
                    byte b = bArr[i4];
                    byte b2 = bArr2[i4];
                    if (b != b2) {
                        return b - b2;
                    }
                }
                return 0;
            case 5:
                return tpa.n(((Long) obj).longValue(), ((Long) obj2).longValue());
            case 6:
                dx0 dx0Var = (dx0) obj;
                dx0 dx0Var2 = (dx0) obj2;
                long j3 = dx0Var.Y;
                long j4 = dx0Var2.Y;
                if (j3 - j4 == 0) {
                    return dx0Var.compareTo(dx0Var2);
                }
                return j3 >= j4 ? 1 : -1;
            case 7:
                ex0 ex0Var = (ex0) obj;
                ex0 ex0Var2 = (ex0) obj2;
                long j5 = ex0Var.Y;
                long j6 = ex0Var2.Y;
                if (j5 - j6 == 0) {
                    return ex0Var.compareTo(ex0Var2);
                }
                return j5 >= j6 ? 1 : -1;
            case 8:
                hx8 hx8Var = (hx8) obj;
                hx8 hx8Var2 = (hx8) obj2;
                int iM = tpa.m(hx8Var2.b, hx8Var.b);
                if (iM == 0) {
                    return hx8Var.a.b.a.toString().compareTo(hx8Var2.a.b.a.toString());
                }
                return iM;
            case 9:
                Size size = (Size) obj;
                Size size2 = (Size) obj2;
                return Long.signum((size.getWidth() * size.getHeight()) - (size2.getWidth() * size2.getHeight()));
            case 10:
                return tpa.n(((Long) obj2).longValue(), ((Long) obj).longValue());
            case 11:
                vk6 vk6Var = (vk6) obj;
                vk6 vk6Var2 = (vk6) obj2;
                int iF = xfg.f(Long.valueOf(vk6Var2.getC()), Long.valueOf(vk6Var.getC()));
                return iF != 0 ? iF : xfg.f(Long.valueOf(vk6Var.getA()), Long.valueOf(vk6Var2.getA()));
            case Protos.Attaches.Attach.PRESENT /* 12 */:
                return ((aa0) obj).a.compareTo(((aa0) obj2).a);
            case 13:
                return tpa.m(((nqb) obj).a.ordinal(), ((nqb) obj2).a.ordinal());
            case Protos.Attaches.Attach.LOCATION /* 14 */:
                z5c z5cVar = (z5c) obj;
                z5c z5cVar2 = (z5c) obj2;
                if (z5cVar == null || z5cVar2 == null) {
                    return 0;
                }
                return z5cVar2.getCount() - z5cVar.getCount();
            case Protos.Attaches.Attach.DAILY_MEDIA /* 15 */:
                return np8.j(((e52) obj2).b.Z, ((e52) obj).b.Z);
            case 16:
                l92 l92Var = (l92) obj;
                l92 l92Var2 = (l92) obj2;
                long j7 = l92Var.c.a().e;
                long j8 = l92Var2.c.a().e;
                if (j7 == 0) {
                    j7 = Long.MAX_VALUE;
                }
                if (j8 == 0) {
                    j8 = Long.MAX_VALUE;
                }
                int iN = tpa.n(j8, j7);
                if (iN != 0) {
                    return iN;
                }
                int iN2 = tpa.n(l92Var2.c.k, l92Var.c.k);
                if (iN2 != 0) {
                    return iN2;
                }
                int iN3 = tpa.n(l92Var2.b, l92Var.b);
                return iN3 != 0 ? iN3 : tpa.m(l92Var2.hashCode(), l92Var.hashCode());
            case LangUtils.HASH_SEED /* 17 */:
                return ((zsd) obj).a - ((zsd) obj2).a;
            case 18:
                return ((atd) obj).a - ((atd) obj2).a;
            case 19:
                return Float.compare(((zsd) obj).c, ((zsd) obj2).c);
            case 20:
                return Float.compare(((atd) obj).c, ((atd) obj2).c);
            case 21:
                gtd gtdVar = (gtd) obj;
                gtd gtdVar2 = (gtd) obj2;
                return aa3VarC.b(gtdVar.a, gtdVar2.a).b(gtdVar.b, gtdVar2.b).a(gtdVar.c, gtdVar2.c).f();
            case 22:
                hvd hvdVar = (hvd) obj;
                hvd hvdVar2 = (hvd) obj2;
                int iCompare = Integer.compare(hvdVar2.b, hvdVar.b);
                if (iCompare != 0) {
                    return iCompare;
                }
                int iCompareTo = hvdVar.c.compareTo(hvdVar2.c);
                return iCompareTo != 0 ? iCompareTo : hvdVar.d.compareTo(hvdVar2.d);
            case 23:
                hvd hvdVar3 = (hvd) obj;
                hvd hvdVar4 = (hvd) obj2;
                int iCompare2 = Integer.compare(hvdVar4.a, hvdVar3.a);
                if (iCompare2 != 0) {
                    return iCompare2;
                }
                int iCompareTo2 = hvdVar4.c.compareTo(hvdVar3.c);
                return iCompareTo2 != 0 ? iCompareTo2 : hvdVar4.d.compareTo(hvdVar3.d);
            case SavedMessagesIconDrawable.NORMAL_ICON_SIZE /* 24 */:
                return ((wua) obj2).a().compareTo(((wua) obj).a());
            case 25:
                return Integer.compare(((lze) obj).Y, ((lze) obj2).Y);
            case 26:
                return Integer.compare(((i4g) obj).a.b, ((i4g) obj2).a.b);
            case 27:
                return Integer.compare(((j4g) obj).a.b, ((j4g) obj2).a.b);
            case 28:
                return Long.compare(((g4g) obj).b, ((g4g) obj2).b);
            default:
                return Long.compare(((h4g) obj).b, ((h4g) obj2).b);
        }
    }
}
