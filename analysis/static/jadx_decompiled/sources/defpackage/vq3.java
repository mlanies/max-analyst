package defpackage;

import androidx.fragment.app.a;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.List;
import ru.ok.messages.contacts.profile.FrgContactAvatar;

/* loaded from: classes2.dex */
public final class vq3 extends cm5 {
    public final List i;
    public final boolean j;
    public int k;

    public vq3(n16 n16Var, ArrayList arrayList, boolean z, int i) {
        super(n16Var);
        this.i = arrayList;
        this.j = z;
        this.k = i;
    }

    @Override // defpackage.hpa
    public final int b() {
        List list = this.i;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    @Override // defpackage.hpa
    public final int c(a aVar) {
        if (!(aVar instanceof FrgContactAvatar)) {
            return -2;
        }
        FrgContactAvatar frgContactAvatar = (FrgContactAvatar) aVar;
        int i = 0;
        while (true) {
            List list = this.i;
            if (i >= list.size()) {
                return -2;
            }
            if (((List) ((AbstractMap.SimpleEntry) list.get(i)).getKey()).equals(frgContactAvatar.C1)) {
                return i;
            }
            i++;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x001a  */
    @Override // defpackage.cm5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final androidx.fragment.app.a g(int r7) {
        /*
            r6 = this;
            java.util.List r0 = r6.i
            java.lang.Object r1 = r0.get(r7)
            java.util.AbstractMap$SimpleEntry r1 = (java.util.AbstractMap.SimpleEntry) r1
            int r2 = r6.k
            if (r2 == r7) goto L1a
            boolean r7 = r0.isEmpty()
            if (r7 != 0) goto L1a
            int r7 = r0.size()
            r0 = 1
            if (r7 == r0) goto L1a
            goto L1b
        L1a:
            r0 = 0
        L1b:
            java.lang.Object r7 = r1.getKey()
            java.util.List r7 = (java.util.List) r7
            java.lang.Object r1 = r1.getValue()
            java.lang.Long r1 = (java.lang.Long) r1
            ru.ok.messages.contacts.profile.FrgContactAvatar r2 = new ru.ok.messages.contacts.profile.FrgContactAvatar
            r2.<init>()
            android.os.Bundle r3 = new android.os.Bundle
            r3.<init>()
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>(r7)
            java.lang.String r7 = "ru.ok.tamtam.extra.AVATAR_URL"
            r3.putStringArrayList(r7, r4)
            java.lang.String r7 = "ru.ok.tamtam.extra.AVATAR_ID"
            long r4 = r1.longValue()
            r3.putLong(r7, r4)
            java.lang.String r7 = "ru.ok.tamtam.extra.DELETE_OPTION"
            boolean r6 = r6.j
            r3.putBoolean(r7, r6)
            java.lang.String r6 = "ru.ok.tamtam.extra.MAKE_MAIN_OPTION"
            r3.putBoolean(r6, r0)
            r2.X0(r3)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vq3.g(int):androidx.fragment.app.a");
    }

    @Override // defpackage.cm5
    public final String h(int i) {
        Iterable iterable = (Iterable) ((AbstractMap.SimpleEntry) this.i.get(i)).getKey();
        jy2 jy2Var = new jy2(28, new kp7(2));
        StringBuilder sb = new StringBuilder();
        x53.l0(iterable, sb, ",", "[", "]", -1, "", jy2Var);
        return sb.toString();
    }
}
