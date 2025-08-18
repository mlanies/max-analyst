package defpackage;

import androidx.camera.video.internal.encoder.InvalidConfigException;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import ru.ok.tamtam.nano.Protos;

/* loaded from: classes.dex */
public final /* synthetic */ class mu1 implements l66 {
    public final /* synthetic */ int a;

    public /* synthetic */ mu1(int i) {
        this.a = i;
    }

    @Override // defpackage.l66
    public final Object apply(Object obj) {
        ArrayList arrayList = null;
        switch (this.a) {
            case 0:
                return Boolean.TRUE;
            case 1:
                return null;
            case 2:
                return Boolean.valueOf(((List) obj).contains(Boolean.TRUE));
            case 3:
                int i = xu1.g;
                return Boolean.FALSE;
            case 4:
                int i2 = zu1.h;
                return Boolean.FALSE;
            case 5:
                return new l9b((k9b) obj);
            case 6:
                du6 du6Var = fu6.A;
                return null;
            case 7:
                oq7 oq7Var = (oq7) obj;
                oq7Var.g = false;
                oq7Var.h = false;
                return oq7Var;
            case 8:
                oq7 oq7Var2 = (oq7) obj;
                oq7Var2.e = false;
                return oq7Var2;
            case 9:
                oq7 oq7Var3 = (oq7) obj;
                oq7Var3.g = true;
                oq7Var3.h = true;
                return oq7Var3;
            case 10:
                oq7 oq7Var4 = (oq7) obj;
                oq7Var4.e = true;
                return oq7Var4;
            case 11:
                oq7 oq7Var5 = (oq7) obj;
                oq7Var5.e = false;
                oq7Var5.g = false;
                oq7Var5.h = false;
                return oq7Var5;
            case Protos.Attaches.Attach.PRESENT /* 12 */:
                oq7 oq7Var6 = (oq7) obj;
                oq7Var6.g = false;
                oq7Var6.h = false;
                oq7Var6.e = false;
                return oq7Var6;
            case 13:
                oq7 oq7Var7 = (oq7) obj;
                oq7Var7.e = false;
                oq7Var7.g = false;
                oq7Var7.h = false;
                return oq7Var7;
            case Protos.Attaches.Attach.LOCATION /* 14 */:
                oq7 oq7Var8 = (oq7) obj;
                oq7Var8.a = true;
                oq7Var8.c = true;
                oq7Var8.b = false;
                return oq7Var8;
            case Protos.Attaches.Attach.DAILY_MEDIA /* 15 */:
                return null;
            case 16:
                try {
                    return fff.a(eff.Z1((ic0) obj), null);
                } catch (InvalidConfigException unused) {
                    return null;
                }
            default:
                List<g8g> list = (List) obj;
                if (list != null) {
                    arrayList = new ArrayList(z53.S(list, 10));
                    for (g8g g8gVar : list) {
                        List list2 = g8gVar.g;
                        arrayList.add(new n7g(UUID.fromString(g8gVar.a), g8gVar.b, g8gVar.c, (ArrayList) g8gVar.f, list2.isEmpty() ^ true ? (d24) list2.get(0) : d24.b, g8gVar.d, g8gVar.e));
                    }
                }
                return arrayList;
        }
    }
}
