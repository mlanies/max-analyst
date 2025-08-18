package defpackage;

import android.net.Uri;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.apache.http.protocol.HTTP;
import org.apache.http.util.LangUtils;
import ru.ok.tamtam.nano.Protos;

/* loaded from: classes.dex */
public final class va4 implements ra5 {
    public static final int[] s0 = {5, 4, 12, 8, 3, 10, 9, 11, 6, 2, 0, 1, 7, 16, 15, 14, 17, 18, 19, 20, 21};
    public static final ph4 t0 = new ph4(new ta4(0));
    public static final ph4 u0 = new ph4(new ta4(1));
    public int Z;
    public boolean a;
    public int b;
    public int c;
    public ffc o;
    public mbe Y = new b46();
    public boolean X = true;

    @Override // defpackage.ra5
    /* renamed from: a */
    public final synchronized la5[] mo8a() {
        return b(Uri.EMPTY, new HashMap());
    }

    @Override // defpackage.ra5
    public final synchronized la5[] b(Uri uri, Map map) {
        la5[] la5VarArr;
        try {
            int[] iArr = s0;
            ArrayList arrayList = new ArrayList(21);
            List list = (List) map.get(HTTP.CONTENT_TYPE);
            int iA = ote.A((list == null || list.isEmpty()) ? null : (String) list.get(0));
            if (iA != -1) {
                c(arrayList, iA);
            }
            int iB = ote.B(uri);
            if (iB != -1 && iB != iA) {
                c(arrayList, iB);
            }
            for (int i = 0; i < 21; i++) {
                int i2 = iArr[i];
                if (i2 != iA && i2 != iB) {
                    c(arrayList, i2);
                }
            }
            la5VarArr = new la5[arrayList.size()];
            for (int i3 = 0; i3 < arrayList.size(); i3++) {
                la5 pbeVar = (la5) arrayList.get(i3);
                if (this.X && !(pbeVar.m() instanceof f26) && !(pbeVar.m() instanceof wd9) && !(pbeVar.m() instanceof i3f) && !(pbeVar.m() instanceof xd0) && !(pbeVar.m() instanceof d28)) {
                    pbeVar = new pbe(pbeVar, this.Y);
                }
                la5VarArr[i3] = pbeVar;
            }
        } catch (Throwable th) {
            throw th;
        }
        return la5VarArr;
    }

    public final void c(ArrayList arrayList, int i) {
        int i2 = 1;
        switch (i) {
            case 0:
                arrayList.add(new r3());
                break;
            case 1:
                arrayList.add(new v3());
                break;
            case 2:
                arrayList.add(new ec(this.a ? 1 : 0));
                break;
            case 3:
                arrayList.add(new zc(this.a ? 1 : 0));
                break;
            case 4:
                la5 la5VarO = t0.o(0);
                if (la5VarO == null) {
                    arrayList.add(new mm5());
                    break;
                } else {
                    arrayList.add(la5VarO);
                    break;
                }
            case 5:
                arrayList.add(new qs5());
                break;
            case 6:
                arrayList.add(new d28(this.b | (this.X ? 0 : 2), this.Y));
                break;
            case 7:
                arrayList.add(new sd9(this.a ? 1 : 0));
                break;
            case 8:
                arrayList.add(new f26(this.X ? 0 : 32, this.Y));
                arrayList.add(new wd9(this.c | (this.X ? 0 : 16), this.Y));
                break;
            case 9:
                arrayList.add(new k2a());
                break;
            case 10:
                arrayList.add(new spb());
                break;
            case 11:
                if (this.o == null) {
                    ls5 ls5Var = zw6.b;
                    this.o = ffc.X;
                }
                arrayList.add(new i3f(1, !this.X ? 1 : 0, this.Y, new tue(0L), new df4(this.o, i, i2)));
                break;
            case Protos.Attaches.Attach.PRESENT /* 12 */:
                arrayList.add(new asf());
                break;
            case Protos.Attaches.Attach.LOCATION /* 14 */:
                arrayList.add(new mc4(this.Z));
                break;
            case Protos.Attaches.Attach.DAILY_MEDIA /* 15 */:
                la5 la5VarO2 = u0.o(new Object[0]);
                if (la5VarO2 != null) {
                    arrayList.add(la5VarO2);
                    break;
                }
                break;
            case 16:
                arrayList.add(new xd0(!this.X ? 1 : 0, this.Y));
                break;
            case LangUtils.HASH_SEED /* 17 */:
                arrayList.add(new vp0(1));
                break;
            case 18:
                arrayList.add(new ae0(2));
                break;
            case 19:
                arrayList.add(new vp0(0));
                break;
            case 20:
                int i3 = this.c;
                if ((i3 & 2) == 0 && (i3 & 4) == 0) {
                    arrayList.add(new ae0(1));
                    break;
                }
                break;
            case 21:
                arrayList.add(new ae0(0));
                break;
        }
    }

    @Override // defpackage.ra5
    public final void d(b46 b46Var) {
        synchronized (this) {
            this.Y = b46Var;
        }
    }

    @Override // defpackage.ra5
    public final void h(boolean z) {
        synchronized (this) {
            this.X = z;
        }
    }
}
