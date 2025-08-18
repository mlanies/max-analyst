package defpackage;

import java.io.File;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import one.me.common.drawable.SavedMessagesIconDrawable;
import org.apache.http.util.LangUtils;
import ru.ok.tamtam.nano.Protos;

/* loaded from: classes2.dex */
public final /* synthetic */ class v00 implements Comparator {
    public final /* synthetic */ int a;

    public /* synthetic */ v00(int i) {
        this.a = i;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        int i = 28;
        int i2 = 29;
        int i3 = 1;
        int i4 = 0;
        switch (this.a) {
            case 0:
                return Long.compare(((File) obj).lastModified(), ((File) obj2).lastModified());
            case 1:
                return ((oy5) obj2).s0 - ((oy5) obj).s0;
            case 2:
                return ((qy5) obj2).i - ((qy5) obj).i;
            case 3:
                lk0 lk0Var = (lk0) obj;
                lk0 lk0Var2 = (lk0) obj2;
                int iCompare = Integer.compare(lk0Var.c, lk0Var2.c);
                return iCompare != 0 ? iCompare : lk0Var.b.compareTo(lk0Var2.b);
            case 4:
                mk0 mk0Var = (mk0) obj;
                mk0 mk0Var2 = (mk0) obj2;
                int iCompare2 = Integer.compare(mk0Var.c, mk0Var2.c);
                return iCompare2 != 0 ? iCompare2 : mk0Var.b.compareTo(mk0Var2.b);
            case 5:
                long j = ((es1) obj).d.c;
                long j2 = ((es1) obj2).d.c;
                if (j < j2) {
                    return 1;
                }
                return j == j2 ? 0 : -1;
            case 6:
                return Long.compare(((es8) obj2).getC(), ((es8) obj).getC());
            case 7:
                return Integer.compare(((o02) obj2).b, ((o02) obj).b);
            case 8:
                return Integer.compare(((p02) obj2).b, ((p02) obj).b);
            case 9:
                e52 e52Var = (e52) obj;
                e52Var.getClass();
                return np8.j(((e52) obj2).o(), e52Var.o());
            case 10:
                e52 e52Var2 = (e52) obj;
                e52 e52Var3 = (e52) obj2;
                int iJ = np8.j(e52Var3.b.a().e, e52Var2.b.a().e);
                return iJ != 0 ? iJ : np8.j(e52Var3.o(), e52Var2.o());
            case 11:
                long j3 = ((cu8) obj).b;
                long j4 = ((cu8) obj2).b;
                if (j3 < j4) {
                    return -1;
                }
                return j3 == j4 ? 0 : 1;
            case Protos.Attaches.Attach.PRESENT /* 12 */:
                long j5 = ((cu8) obj2).o;
                long j6 = ((cu8) obj).o;
                if (j5 < j6) {
                    return -1;
                }
                return j6 == j5 ? 0 : 1;
            case 13:
                vk6 vk6Var = (vk6) obj;
                vk6 vk6Var2 = (vk6) obj2;
                int iF = xfg.f(Long.valueOf(vk6Var2.getC()), Long.valueOf(vk6Var.getC()));
                return iF != 0 ? iF : xfg.f(Long.valueOf(vk6Var.getA()), Long.valueOf(vk6Var2.getA()));
            case Protos.Attaches.Attach.LOCATION /* 14 */:
                return tpa.n(((Long) obj2).longValue(), ((Long) obj).longValue());
            case Protos.Attaches.Attach.DAILY_MEDIA /* 15 */:
                return 0;
            case 16:
                return Long.compare(((d92) obj).a, ((d92) obj2).a);
            case LangUtils.HASH_SEED /* 17 */:
                return ((coc) obj2).f - ((coc) obj).f;
            case 18:
                Integer num = (Integer) obj;
                Integer num2 = (Integer) obj2;
                if (num.intValue() == -1) {
                    return num2.intValue() == -1 ? 0 : -1;
                }
                if (num2.intValue() == -1) {
                    return 1;
                }
                return num.intValue() - num2.intValue();
            case 19:
                Integer num3 = (Integer) obj;
                Integer num4 = (Integer) obj2;
                if (num3.intValue() == -1) {
                    return num4.intValue() == -1 ? 0 : -1;
                }
                if (num4.intValue() == -1) {
                    return 1;
                }
                return num3.intValue() - num4.intValue();
            case 20:
                zma zmaVar = bf4.f;
                return 0;
            case 21:
                return Integer.compare(((je4) ((List) obj).get(0)).Y, ((je4) ((List) obj2).get(0)).Y);
            case 22:
                List list = (List) obj;
                List list2 = (List) obj2;
                return y93.g(ze4.c((ze4) Collections.max(list, new v00(i)), (ze4) Collections.max(list2, new v00(i)))).a(list.size(), list2.size()).c((ze4) Collections.max(list, new ye4(i4)), (ze4) Collections.max(list2, new ye4(i4)), new ye4(i4)).f();
            case 23:
                return ((ie4) Collections.max((List) obj)).compareTo((ie4) Collections.max((List) obj2));
            case SavedMessagesIconDrawable.NORMAL_ICON_SIZE /* 24 */:
                return ((he4) Collections.max((List) obj)).compareTo((he4) Collections.max((List) obj2));
            case 25:
                List list3 = (List) obj;
                List list4 = (List) obj2;
                return y93.g(af4.c((af4) Collections.max(list3, new v00(i2)), (af4) Collections.max(list4, new v00(i2)))).a(list3.size(), list4.size()).c((af4) Collections.max(list3, new ye4(i3)), (af4) Collections.max(list4, new ye4(i3)), new ye4(i3)).f();
            case 26:
                return ((se4) ((List) obj).get(0)).compareTo((se4) ((List) obj2).get(0));
            case 27:
                return ((te4) ((List) obj).get(0)).compareTo((te4) ((List) obj2).get(0));
            case 28:
                return ze4.c((ze4) obj, (ze4) obj2);
            default:
                return af4.c((af4) obj, (af4) obj2);
        }
    }
}
